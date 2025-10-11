package com.davih.tst.alogrithm.t2025;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringTest {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = new LengthOfLongestSubstringTest().lengthOfLongestSubstring(s);
        System.out.println(length);
    }


    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        }

        Set<Character> charSet = new HashSet<>();
        int r = -1;
        int length = s.length();
        int lengthOfSubstring = 0;
        for (int i = 0; i < length; i++) {
            // remove
            if (i != 0) {
                charSet.remove(s.charAt(i - 1));
            }
            while (r + 1 < length && !charSet.contains(s.charAt(r + 1))) {
                charSet.add(s.charAt(r + 1));
                r++;
            }
            lengthOfSubstring = Math.max(lengthOfSubstring, (r - i + 1));
        }

        return lengthOfSubstring;
    }
}
