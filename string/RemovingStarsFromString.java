package string;

// https://leetcode.com/problems/removing-stars-from-a-string/

public class RemovingStarsFromString {

    public String removeStars(String s) {
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            if(i > 0 && s.charAt(i) == '*') {
                builder.setLength(builder.length()-1);
            } else {
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        RemovingStarsFromString object = new RemovingStarsFromString();

        System.out.println(object.removeStars("leet**cod*e"));
        System.out.println(object.removeStars("erase*****"));
    }
}
