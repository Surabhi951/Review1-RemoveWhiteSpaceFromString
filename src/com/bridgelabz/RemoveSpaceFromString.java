package com.bridgelabz;

import java.util.Scanner;

public class RemoveSpaceFromString {

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        RemoveSpaceFromString removeSpaceFromString = new RemoveSpaceFromString();
        removeSpaceFromString.removeWhiteSpacesFromString(str);
    }

    public void removeWhiteSpacesFromString(String str){
        str = str.replaceAll("\\s", "");
        System.out.println("After removing white spaces from string is: " + str);
    }

}
