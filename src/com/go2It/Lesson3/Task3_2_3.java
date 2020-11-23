package com.go2It.Lesson3;

enum OPERATIONS {
    ADD("additon"),
    SUBTRACT("substraction"),
    MULTIPLY("multiplication"),
    DIVIDE("division");

    private String operation;
    private char operator;

    OPERATIONS(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}

public class Task3_2_3 {

    public static void calculate(int a, int b, OPERATIONS op) {
        switch (op) {
            case ADD:
                System.out.println("The result of " + op.getOperation() + " is " + a + b);
                break;
            case DIVIDE:
                System.out.println("The result of " + op.getOperation() + " is " + a / b);
                break;
            case MULTIPLY:
                System.out.println("The result of " + op.getOperation() + " is " + a * b);
                break;
            case SUBTRACT:
                System.out.println("The result of " + op.getOperation() + " is " + (a - b));
                break;
        }
    }

    public static void main(String[] args) {
        calculate(9, 3, OPERATIONS.DIVIDE);
    }
}
