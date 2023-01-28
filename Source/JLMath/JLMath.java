/*
 * Copyright (c) 2023 - present Java Laboratory
 * by Arsam S. Kasmaie
 */

package com.javalaboratory.JLMath;

@SuppressWarnings("all")
public class JLMath {
    public static final double PI = 3.14159265359;
    // This method adds two numbers together
    public static double add(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    } // end method add

    // This method subtracts two numbers
    public static double subtract(double firstNumber, double secondNumber) {
        return (firstNumber - secondNumber);
    } // end method subtract

    // This method multiplies two numbers together
    public static double multiply(double firstNumber, double secondNumber) {
        return (firstNumber * secondNumber);
    } // end method multiply

    // This method divides two numbers
    public static double divide(double firstNumber, double secondNumber) {
        return (firstNumber / secondNumber);
    } // end method divide

    // This method exponentiates two numbers
    public static double power(double firstNumber, double secondNumber) {
        double result = 1;
        for (int counter = 1; counter <= secondNumber; counter++) {
            result *= firstNumber;
        }
        return result;
    } // end method power
    
    // This method determines the largest number between two numbers
    public static double max(double firstNumber, double secondNumber) {
        double maximuimNumber = firstNumber;
        if (firstNumber < secondNumber) {
            maximuimNumber = secondNumber;
        }
        return maximuimNumber;
    } // end method max

    // This method determines the smallest number between two numbers
    public static double min(double firstNumber, double secondNumber) {
        double minimuimNumber = firstNumber;
        if (secondNumber < firstNumber) {
            minimuimNumber = secondNumber;
        }
        return minimuimNumber;
    } // end method min
    
    // This method adds a sequence of numbers together
    public static double range(double number) {
        if (number < 0) { number *= -1; }
        if (number > 0) {
            return number + range(number - 1);
        }
        else { return 0; }
    } // end method range
    
    // This method determines whether the number is even or not
    public static boolean isEven(double number) {
        if (number % 2 == 0) {
            return true;
        }
        else { return false; }
    } // end method isEven

    // This method determines whether the number is odd or not
    public static boolean isOdd(double number) {
        if (number % 2 == 1) {
            return true;
        }
        else { return false; }
    } // end method isOdd
    
    // This method provides the absolute value of the number
    public static double abs(double number) {
        if (number < 0) {
            number *= -1;
            return number;
        }
        return number;
    } // end method abs
    
    // This method calculates the area of a square
    public static double areaOfSquare(double side) {
        double result = JLMath.power(side, 2);
        return result;
    } // end method areaOfSquare

    // This method calculates the area of a rectangle
    public static double areaOfRectangle(double length, double width) {
        double result = length * width;
        return result;
    } // end method areaOfRectangle

    // This method calculates the area of a circle
    public static double areaOfCircle(double radius) {
        double result = (JLMath.PI * JLMath.power(radius, 2));
        return result;
    } // end method areaOfCircle

    // This method calculates the area of a cylinder
    public static double areaOfCylinder(double radius, double height) {
        double result = ((2 * JLMath.PI) * radius * height) + ((2 * JLMath.PI) * JLMath.power(radius, 2));
        return result;
    } // end method areaOfCylinder
} // end class JLMath
