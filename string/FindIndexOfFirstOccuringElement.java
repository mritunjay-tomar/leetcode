package string;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FindIndexOfFirstOccuringElement {
    public int strStr(String haystack, String needle) {
        int size = needle.length(), n = haystack.length();
        StringBuilder builder = new StringBuilder(haystack.substring(0, size));
        int i = 0;

        while(i<=n-size) {
            if(builder.toString().equals(needle)) {
                return i;
            } else {
                if(i == n-size) {
                    break;
                } else {
                    builder.deleteCharAt(0);
                    builder.append(haystack.charAt(i + size));
                }
            }
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        FindIndexOfFirstOccuringElement object = new FindIndexOfFirstOccuringElement();

        System.out.println(object.strStr("sadbutsad", "sad"));
        System.out.println(object.strStr("leetcode", "leeto"));
        System.out.println(object.strStr("abcdefgh", "fgh"));
    }
}
