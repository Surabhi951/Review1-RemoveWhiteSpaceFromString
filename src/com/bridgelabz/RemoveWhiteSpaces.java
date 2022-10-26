package com.bridgelabz;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        removeWhiteSpacesInAString(str, str1);
    }

    public static void removeWhiteSpacesInAString(String str, String str1){
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ') {
                str1 = str1 + str.charAt(i);
            }
        }
        System.out.println("After removing white spaces from string is: " + str1);
    }
}
