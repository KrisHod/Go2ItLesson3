package com.go2It.Lesson3;

enum OPERATIONS {
    ADD("additon", '+'),
    SUBTRACT("substraction", '-'),
    MULTIPLY("multiplication", '*'),
    DIVIDE("division", '/');

    private String operation;
    private char operator;

    OPERATIONS(String operation, char operator) {
        this.operation = operation;
        this.operator = operator;
    }
        public String getOperation(){
            return operation;
        }
        public char getOperator () {
            return operator;
        }

}

public class Task3_2_3 {


    public static void calculate(int a, int b, OPERATIONS op) {
        System.out.println("The result of " + op.getOperation() + " is " + a + op.getOperator() + b);
    }

    public static void main(String[] args) {
        calculate(9, 3, OPERATIONS.DIVIDE);
    }
}
