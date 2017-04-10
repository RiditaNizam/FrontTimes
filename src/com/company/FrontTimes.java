package com.company;

/**
 * Created by ridita on 4/10/17.
 */
public class FrontTimes {

    public String frontTimes(String str, int n) {
        String s = "";
        String T = str;
        if (T.length() > 3) {
            T = str.substring(0, 3);
        }
        for (int i = 0; i < n; i++) {
            s += T;
        }
        return s;
    }

}
