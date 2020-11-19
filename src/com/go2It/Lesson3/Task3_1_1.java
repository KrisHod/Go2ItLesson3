package com.go2It.Lesson3;

public class Task3_1_1 {
    public static void main(String[] args) {

//        for (int i = 2; i <=151; i+=2){ // the first option of for loop
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 151; i++) { // the second option of for loop
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        int[] arr = new int[152]; //creation of loop
//        for (int i = 1; i <= 151; i++) {
//            arr[i] = i;
//        }
//
//        for (int i : arr) {  // enhanced for loop
//            if (i == 0) {
//                continue;
//            }
//            else if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        int i = 1;
//        while (i <= 151) {  // while loop
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//      }

        do {                    //do while loop
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
        while (i<=151);
    }
}
