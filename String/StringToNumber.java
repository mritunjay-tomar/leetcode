package String;// https://leetcode.com/problems/string-to-integer-atoi/

class StringToNumber {

    public static void main(String[] args) {
        String s = "-4193";
        int number = 0;

        s = s.trim();
        String[] array = s.split("");
        boolean flag = true;

        for(String ele: array) {

            switch (ele) {
                case "-" -> flag = false;
                case "1" -> {
                    number *= 10;
                    number += 1;
                }
                case "2" -> {
                    number *= 10;
                    number += 2;
                }
                case "3" -> {
                    number *= 10;
                    number += 3;
                }
                case "4" -> {
                    number *= 10;
                    number += 4;
                }
                case "5" -> {
                    number *= 10;
                    number += 5;
                }
                case "6" -> {
                    number *= 10;
                    number += 6;
                }
                case "7" -> {
                    number *= 10;
                    number += 7;
                }
                case "8" -> {
                    number *= 10;
                    number += 8;
                }
                case "9" -> {
                    number *= 10;
                    number += 9;
                }
                case "0" -> {
                    number *= 10;
                    number += 0;
                }
            }
        }

        if (flag) System.out.println(number);
        else System.out.println(number * -1);
    }
}