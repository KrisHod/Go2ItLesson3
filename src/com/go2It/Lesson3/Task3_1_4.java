package com.go2It.Lesson3;

import java.io.IOException;
import java.util.Scanner;

public class Task3_1_4 {
    public static void main(String[] args) throws IOException {
        try(Scanner in = new Scanner (System.in)){
            System.out.println("Print something here");
            for (int i=0; ;i++){
                if (in.nextLine().equals("quit")){
                    break;
                }
                else {
                    System.out.println(in.nextLine());
                    System.out.println("Print something here again");
                }
            }
        }
    }
}
