package com.bridgelabz.lambdaexpression;
interface MathOperation
{
    double calculate(double x, double y);
    static void showResult(MathOperation operation, double x, double y, String operationName) {
        double result = operation.calculate(x, y);
        System.out.println(operationName + " is: " + result);
    }
}
public class MathOperationApp {
    public static void main(String[] args) {
        MathOperation add = Double::sum;  //Using Method Reference
        MathOperation subtract = (x,y)->x-y;
        MathOperation multiply = (x,y)->x*y;
        MathOperation divide = (x,y)->x/y;

        MathOperation.showResult(add,10,5,"Addition");
        MathOperation.showResult(subtract,10,5,"Subtraction");
        MathOperation.showResult(multiply,10,5,"Multiplication");
        MathOperation.showResult(divide,10,5,"Division");
    }
}
