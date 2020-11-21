package com.go2It.Lesson3;

import java.util.ArrayList;

public class Task3_1_3 {
    public static void main(String[] args) {
        ArrayList <String> allAddresses = new ArrayList<>();
        ArrayList <String> evenAddresses = new ArrayList<>();
        ArrayList <String> oddAddresses = new ArrayList<>();

        for (int i = 0, j = 1; i < 20 && j < 21; i++, j++) {
            allAddresses.add(j + " Yonge st");  // initializing allAddresses array
      //      System.out.println(allAddresses.toString());

            if (j % 2 != 0) {
                oddAddresses.add(j + " Yonge st"); // initializing oddAddresses array
                i--;
            } else {
                evenAddresses.add(j + " Yonge st");  // initializing evenAddresses array
            }

        }
        for (String arr : oddAddresses) {
            System.out.println("The first mailman should visit the following addresses: " + arr);
        }
        System.out.println();

        for (String arr : evenAddresses) {
            System.out.println("The second mailman should visit the following addresses: " + arr);
        }
    }
}
