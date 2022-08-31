public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs[0].length() == 0) return "";

        int length = 0;
        int i = 1;
        StringBuilder substr = new StringBuilder();
        String previosSubStr = "";
        while(length < strs[0].length()) {
            System.out.println(length);
            previosSubStr =substr.toString();
            substr.append(strs[0].charAt(i-1));
            for (String str : strs) {
                if (i <= str.length() && str.substring(0, i).equals(substr.toString())) {
                    continue;
                } else {
                    System.out.println("Did it return");
                    return previosSubStr;
                }
            }
            length++;
            i++;
        }
        return substr.toString();
    }

    public static void main(String[] args) {
        String[] array = {"flower","flow","flight"};
        String[] array1 = {"dog","racecar","car"};
        String[] array2 = {"ab", "a"};

        LongestCommonPrefix object = new LongestCommonPrefix();
//        System.out.println(object.longestCommonPrefix(array));
//        System.out.println(object.longestCommonPrefix(array1));
        System.out.println(object.longestCommonPrefix(array2));
    }
}
