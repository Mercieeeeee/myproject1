package com.Mercieeeeee.practice;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

public class CountAndSay {
    public static void main(String[] args) {
        HashMap<String, String> count = new HashMap<>();
        int n = 1;
        String s = "a1";
        count.put("" + n, s);
        for (n=2; n<=4; n++) {
            StringReader sr = new StringReader(s);
            try {
                String a = Integer.toString(sr.read());

            } catch (IOException e) {
                e.printStackTrace();
            }
            count.put("" + n, "");
        }
    }
}
