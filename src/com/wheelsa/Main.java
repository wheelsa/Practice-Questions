package com.wheelsa;

public class Main {

    public static void main(String[] args) {

//        reverseString("Yolo");
//    System.out.println(palindrome("abba"));
        System.out.println(reverseInteger(1234));
    }


    //reverse an integer

   public static int reverseInteger(int number){
        int reversedNumber = 0;

        while (number != 0){
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }
        return reversedNumber;
   }


//Function tests if string is palindrome
//    public static boolean palindrome(String str){
//        int j = str.length() - 1;
//        int i = 0;
//        while( i < j){
//            if(str.charAt(i) != str.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }

//
//public static String reverseString(String str){
//    if(str.length() <= 1){
//        return str;
//    }
//    String reversedStr = "";
//
//    for(int i = str.length() - 1; i >= 0; i-- ){
//
//        reversedStr = reversedStr + str.charAt(i);
//
//    }
//    System.out.println(reversedStr);
//    return reversedStr;
//}

}
