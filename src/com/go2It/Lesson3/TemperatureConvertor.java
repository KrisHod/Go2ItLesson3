package com.go2It.Lesson3;

import java.util.Scanner;

public class TemperatureConvertor {
    public static void convertTemperature(double temp, String scale) {
        if (scale.equals("F") || scale.equals("f")) {
            double res = temp * 1.8 + 32;
            System.out.println(temp + "F equals to " + res + "C.");
        } else if (scale.equals("C") || scale.equals("c")) {
            double res = (temp - 32) / 1.8;
            System.out.println(temp + "C equals to " + res + "F.");
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the target temperature");
        int temp = in.nextInt();
        System.out.println("Please enter the target scale (F or C)");
        String scale = in.next();
        convertTemperature(temp, scale);
    }
}
