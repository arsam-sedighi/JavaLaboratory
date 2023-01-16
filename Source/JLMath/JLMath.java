/*
 * Copyright (c) 2023 - present Java Laboratory
 * by Arsam S. Kasmaie
 */

package com.javalaboratory.JLMath;

@SuppressWarnings("all")
public class JLMath {
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
    
    // This method compares two numbers
    public static double compaire(double firstNumber, double secondNumber) {
        double maximuimNumber = firstNumber;
        if (firstNumber < secondNumber) {
            maximuimNumber = secondNumber;
        }
        return maximuimNumber;
    } // end method compaire
    
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
} // end class JLMath
