package com.davih.tst.alogrithm.t2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagramsTest {

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        List<Integer> anagrams = new FindAnagramsTest().findAnagrams(s, p);
        System.out.println(anagrams);
    }

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> anagrams = new ArrayList<>();

        int sLen = s.length();
        int pLen = p.length();

        if (sLen < pLen) {
            return anagrams;
        }
        int[] schars = new int[26];
        int[] pchars = new int[26];
        for (int i = 0; i < pLen; i++) {
            ++schars[s.charAt(i) - 'a'];
            ++pchars[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(schars, pchars)) {
            anagrams.add(0);
        }

        for (int i = 0; i < (sLen - pLen); i++) {
            --schars[s.charAt(i) - 'a'];
            ++schars[s.charAt(i + pLen) - 'a'];

            if (Arrays.equals(schars, pchars)) {
                anagrams.add(i + 1);
            }
        }

        return anagrams;

    }

    public List<Integer> findAnagramsV1(String s, String p){
        return null;
    }
}
