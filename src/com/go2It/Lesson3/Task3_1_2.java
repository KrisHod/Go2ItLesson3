package com.go2It.Lesson3;

public class Task3_1_2 {
    public static void main(String[] args) {
        int [] num = new int [100];
        int [] divisibleBy3 = new int[50];
        for (int i = 0,  j = 1; i<100 && j<100; i++, j+=3){
            if (j % 3!=0) {
                num[i] = j;
                System.out.println(num[i]);
            }
        }
    }
}
