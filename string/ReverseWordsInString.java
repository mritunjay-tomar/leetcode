package string;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        s=s.replaceAll("( )+", " ");
        String[] array = s.trim().split(" ");

        StringBuilder builder = new StringBuilder();

        for(int i=array.length-1;i>=0;i--) {
            if(!array[i].equals(" ")) {
                builder.append(array[i]);
                if(i != 0) builder.append(" ");
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString object = new ReverseWordsInString();

        System.out.println(object.reverseWords("the sky is blue"));
        System.out.println(object.reverseWords("  hello world  "));
        System.out.println(object.reverseWords("a good   example"));
    }
}
