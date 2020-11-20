package com.go2It.Lesson3;

public class Task3_1_3 {
    public static void main(String[] args) {
        String[] allAddresses = new String[20];
        String[] evenAddresses = new String[10];
        String[] oddAddresses = new String[10];

        for (int i = 0, j = 1; i < allAddresses.length && j<allAddresses.length; i++, j++) {
            allAddresses[i] = j + " Yonge st";

            if (j % 2 == 0){
                evenAddresses[i]= j + " Yonge st";
                i--;
            }
            else {
                oddAddresses[i]= j + " Yonge st";
            }

        }
        for (String arr:evenAddresses) {
            System.out.println("First mailman should visit the following addresses: " + arr);
            
        }
    }
}
