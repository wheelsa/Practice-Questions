package com.wheelsa;

public class Main {

    public static void main(String[] args) {
	// write your code here
        reverseString("Yolo");
    }


public static String reverseString(String str){
    if(str.length() <= 1){
        return str;
    }
    String reversedStr = "";

    for(int i = str.length() - 1; i >= 0; i-- ){

        reversedStr = reversedStr + str.charAt(i);

    }
    System.out.println(reversedStr);
    return reversedStr;
}

}
