/*
 * Copyright (c) 2023 - present Java Laboratory
 * JLMath.java v1.00.01
 * by Arsam S. Kasmaie
 */

package com.javalaboratory.JLMath;

@SuppressWarnings("all")
public class JLMath {
    public static double add(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    } // end method add

    public static double subtract(double firstNumber, double secondNumber) {
        return (firstNumber - secondNumber);
    } // end method subtract

    public static double multiply(double firstNumber, double secondNumber) {
        return (firstNumber * secondNumber);
    } // end method multiply

    public static double allcate(double firstNumber, double secondNumber) {
        return (firstNumber / secondNumber);
    } // end method allcate

    public static double power(double firstNumber, double secondNumber) {
        double result = 1;
        for (int counter = 1; counter <= secondNumber; counter++) {
            result *= firstNumber;
        }
        return result;
    } // end method power
    
    public static double compare(double firstNumber, double secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    } // end method compaire

} // end class JLMath
