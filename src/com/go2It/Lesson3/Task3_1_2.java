package com.go2It.Lesson3;

import java.util.ArrayList;

public class Task3_1_2 {
    public static void main(String[] args) {
        // version without ArrayList
//        int [] num = new int [100];
//        int [] divisibleBy6 = new int[50];
//        for (int i = 0,  j = 0; i<100 && j<100; i++, j+=3){ // loop for initializing array with arithmetic progression +3
//            if (j % 6!=0) {                                 // without digitals divided by 6
//                num[i] = j;
//                i--;
//            }
//            else {
//                divisibleBy6[i]=j;
//            }
//        }
//
//        for (int arr:num) {
//            System.out.println(arr);
//        }
//
//        for (int arr:divisibleBy6) {
//            System.out.println(arr);
//        }
//        System.out.println(divisibleBy6.length);

        // version with ArrayList
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> divisibleBy6 = new ArrayList<>();
        for (int i = 0, j = 0; i < 100 && j < 100; i++, j += 3) {
            if (j % 6 != 0) {                                 // without digitals divided by 6
                num.add(j);
                i--;
            } else {
                divisibleBy6.add(j);
            }
        }

        for (int arr : num) {
            System.out.println(arr);
        }

        for (int arr : divisibleBy6) {
            System.out.println(arr);
        }
        System.out.println(divisibleBy6.size());
    }
}
