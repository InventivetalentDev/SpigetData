package org.spiget.data.test;

import org.junit.Test;
import org.spiget.data.resource.version.ResourceVersion;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UuidTest {

    @Test
    public void specificVersionUuidTest() {
        int resourceId = 18687;
        int authorId = 49741;
        String version = "1.8.6-SNAPSHOT";
        int updateCount = 5;
        Date date = new Date(1591726681000L);
        UUID uuid = ResourceVersion.makeUuid(resourceId, authorId, version, updateCount, date);
        String uuidStr = uuid.toString();
        System.out.println(uuidStr);

        test(uuidStr, resourceId, authorId, version, updateCount, date);
    }

    @Test
    public void randomVersionUuidTest() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int resourceId = random.nextInt(999999);
            int authorId = random.nextInt(999999);
            String version = random.nextInt(9)+"."+random.nextInt(20)+"."+random.nextInt(20)+"-SNAPSHOT";
            int updateCount = random.nextInt(50);
            Date date = new Date();
            date.setDate(random.nextInt(30));
            date.setMonth(random.nextInt(12));
            date.setYear(random.nextInt(50)+2000);
            UUID uuid = ResourceVersion.makeUuid(resourceId, authorId, version, updateCount, date);
            String uuidStr = uuid.toString();
            System.out.println(uuidStr);

            test(uuidStr, resourceId, authorId, version, updateCount, date);
        }
    }


    void test(String uuidStr, int resourceId, int authorId, String version, int updateCount, Date date) {
        UUID parsed = UUID.fromString(uuidStr);
        String least = "" + parsed.getLeastSignificantBits();
        String most = "" + parsed.getMostSignificantBits();
        System.out.println(least);
        System.out.println(most);

        assertTrue(least.startsWith("16"));
        assertTrue(most.startsWith("16"));
        least = least.substring(2);
        most = most.substring(2);

        assertTrue(least.startsWith("" + resourceId));
        assertTrue(most.startsWith("" + authorId));

        assertTrue(least.endsWith("" + updateCount));
        String versionStr = version.replaceAll("[^\\d]", "");
        assertTrue(most.endsWith(versionStr));

        int ucl = Math.max(2, Math.min(("" + updateCount).length(), 3));
        assertEquals(date.getDate(), Integer.parseInt(least.substring(least.length() - ucl - 2, least.length() - ucl)));
        assertEquals(date.getMonth() + 1/*fair enough*/, Integer.parseInt(least.substring(least.length() - ucl - 2 - 2, least.length() - ucl - 2)));
        assertEquals(date.getYear() + 1900/*wtf*/, Integer.parseInt(least.substring(least.length() - ucl - 2 - 2 - 4, least.length() - ucl - 2 - 2)));
    }

}
