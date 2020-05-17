package com.wheelsa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        reverseString("Yolo");
//    System.out.println(palindrome("abba"));
//        System.out.println(reverseInteger(1234));
//        System.out.println(maxOccuringCharString("hello lula loo"));
        fizzBuzz(25);
    }


    //reverse an integer

    public static void fizzBuzz(int n){
        int i = 0;
        while(i++ != n){
            if( i % 3 == 0 && i% 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            }else if ( i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
            ;
        }
    }

    public static char maxOccuringCharString(String str){
//        final int ASCII_SIZE = 256;
        int[] hashCount = new int[256];
        for(int i = 0; i < str.length(); i++) {
            hashCount[str.charAt(i)]++;
        }
        System.out.println(Arrays.toString(hashCount));
        int max = -1;
        char result = ' ';

        for(int i = 0; i< str.length(); i++){
            if(max < hashCount[str.charAt(i)]){
                max = hashCount[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }

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
