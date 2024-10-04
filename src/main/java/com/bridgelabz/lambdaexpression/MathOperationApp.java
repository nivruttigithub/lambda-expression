package com.bridgelabz.lambdaexpression;
interface MathOperation
{
    double calculate(double x, double y);
}
public class MathOperationApp {
    public static void main(String[] args) {
        MathOperation add = Double::sum;  //Using Method Reference
        MathOperation subtract = (x,y)->x-y;
        MathOperation multiply = (x,y)->x*y;
        MathOperation divide = (x,y)->x/y;

        System.out.println("Addition is : "+add.calculate(10,5));
        System.out.println("Subtraction is : "+subtract.calculate(10,5));
        System.out.println("Multiplication is : "+multiply.calculate(10,5));
        System.out.println("Division is : "+divide.calculate(10,5));
    }
}
