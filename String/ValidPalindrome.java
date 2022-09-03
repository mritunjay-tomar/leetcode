package String;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z#_$]+", "").toLowerCase();
        s = s.replaceAll("#", "")
                .replaceAll("@", "")
                .replaceAll("\\$", "")
                .replaceAll("%", "")
                .replaceAll("&", "")
                .replaceAll("//*", "")
                .replaceAll("_", "");
        System.out.println(s);
        if(s.length() == 0) return true;
        StringBuilder reverse = new StringBuilder(s).reverse();
        return s.equals(reverse.toString());
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = " ";
        String s2 = "race a car";
        String s3 = "c#dc";
        String s4 = "ab_a";
        ValidPalindrome object = new ValidPalindrome();
        System.out.println(object.isPalindrome(s));
        System.out.println(object.isPalindrome(s1));
        System.out.println(object.isPalindrome(s2));
        System.out.println(object.isPalindrome(s3));
        System.out.println(object.isPalindrome(s4));
    }
}
