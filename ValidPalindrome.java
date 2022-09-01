public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z#_$]+", "").toLowerCase();
        if(s.length() == 0) return true;
        StringBuilder reverse = new StringBuilder(s).reverse();
        return s.equals(reverse.toString());
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = " ";
        String s2 = "race a car";
        ValidPalindrome object = new ValidPalindrome();
        System.out.println(object.isPalindrome(s));
        System.out.println(object.isPalindrome(s1));
        System.out.println(object.isPalindrome(s2));
    }
}
