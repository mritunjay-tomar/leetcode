package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
* input - aabbbcccc
* output - a2b3c4
* */

class Result {

    public static String decryptMessage(String encryptedMessage) {
        Map<Character, Integer> messageMap = new LinkedHashMap<>();

        for(int i=0;i<encryptedMessage.length();i++) {
            if (messageMap.containsKey(encryptedMessage.charAt(i))) {
                int count = messageMap.get(encryptedMessage.charAt(i));
                messageMap.put(encryptedMessage.charAt(i), count+1);
            } else {
                messageMap.put(encryptedMessage.charAt(i), 1);
            }
        }

        StringBuilder newMessage = new StringBuilder();
        for(Map.Entry<Character, Integer> i: messageMap.entrySet()) {
            newMessage.append(i.getKey());
            if (i.getValue() > 1) {
                newMessage.append(i.getValue());
            }
        }
        return newMessage.toString();
    }

}

public class RefractorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        String result = Result.decryptMessage(encryptedMessage);
        System.out.println(result);
        scanner.close();
    }
}
