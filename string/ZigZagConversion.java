package string;

// https://leetcode.com/problems/zigzag-conversion/

public class ZigZagConversion {
    public String convert(String s, int n) {
        StringBuilder[] builderArray = new StringBuilder[n];
        int len = s.length();

//        for(int i=0;i<len;i++) {
//            if(j == n) j = 0;
//            if(builderArray[j] == null) builderArray[j] = new StringBuilder();
//            builderArray[j++].append(s.charAt(i));
//        }

        int j = 0, i=1;
        while(i <= len) {
            if(i%2 == 0) {
                
            } else {

            }
            i++;
        }


        StringBuilder returnString = new StringBuilder();
        for(StringBuilder builder: builderArray) {
            returnString.append(builder);
        }

        return returnString.toString();
    }

    public static void main(String[] args) {
        ZigZagConversion object = new ZigZagConversion();
        System.out.println(object.convert("PAYPALISHIRING", 3));
    }
}
