package org.spiget.data;

public class Util {

    public static String pad(Number n, int l) {
        return pad("" + n, l);
    }

    public static String pad(String s, int l) {
        while (s.length() < l) {
            s = "0" + s;
        }
        return s;
    }

}
