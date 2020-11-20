package com.go2It.Lesson3;

public class Task3_1_3 {
    public static void main(String[] args) {
        String[] allAddresses = new String[20];
        String[] evenAddresses = new String[10];
        String[] oddAddresses = new String[10];

        for (int i = 0, j = 1; i < allAddresses.length && j < allAddresses.length +1; i++, j++) {
            allAddresses[i] = j + " Yonge st";  // initializing allAddresses array

            if (j % 2 != 0) {
                oddAddresses[i] = j + " Yonge st"; // initializing oddAddresses array
                i--;
            } else {
                evenAddresses[i] = j + " Yonge st";  // initializing evenAddresses array
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
