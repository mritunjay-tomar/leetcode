package String;

// https://leetcode.com/problems/removing-stars-from-a-string/

public class RemovingStarsFromString {
    public String removeStars(String s) {
        StringBuilder builder = new StringBuilder(s);
        while(s.contains("*") && s.length() != 0) {
            int i = s.indexOf("*");
            if (i != 0) {
                builder.deleteCharAt(i);
                builder.deleteCharAt(i - 1);
                s = builder.toString();
            } else {
                builder.deleteCharAt(i);
                s = builder.toString();
            }
        }

        return s;
    }

    public String removeStars2(String s) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '*') {
                builder.deleteCharAt(counter--);
            } else {
                builder.append(s.charAt(i));
                counter++;
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        RemovingStarsFromString object = new RemovingStarsFromString();

        System.out.println(object.removeStars2("leet**cod*e"));
        System.out.println(object.removeStars("erase******"));
    }
}
