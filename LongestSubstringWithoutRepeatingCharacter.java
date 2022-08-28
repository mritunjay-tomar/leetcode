/*
* Find the longest substring with non-repeating characters
* */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcabcb";
        s = s.toLowerCase();

        Set<String> uniqueSubstrings = new HashSet<>();
        String substring = "";
        int start=0, end=s.length();

        while (substring.indexOf(s.charAt(start)) < 0) {
            substring = substring.concat(String.valueOf(s.charAt(start)));
            start++;
        }
        int substrLength = substring.length();

        while(start != end) {
            substring = "";
            if(substring.indexOf(s.charAt(start+1)) < 0) {
                System.out.println("do nothing");
            }
            uniqueSubstrings.add(substring);
            start++;
        }

        System.out.println(uniqueSubstrings);
    }
}
