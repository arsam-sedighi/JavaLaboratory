/*
 * Copyright (c) 2023 - present Java Laboratory
 * by Arsam S. Kasmaie
 */

package com.javalaboratory;

@SuppressWarnings("all")
public class JLHealth {
    // This method measures body mass index
    public static double BMI(double weight, double stature) {
        double result = weight / JLMath.power(stature, 2);
        return result;
    } // end method BMI

    // This method determines the health status of the body mass index
    public  static String BMIHealthCondition(double BMINumber) {
        final double UNDER_WEGHT = 18.5;
        final double NORMAL = 24.9;
        final double OVER_WEIGHT = 29.9;
        final double OBESE = 30;
        String result = "";
        if (BMINumber <= UNDER_WEGHT) {
            result = "Underweight";
        }
        if (BMINumber <= NORMAL) {
            result = "Normal";
        }
        if (BMINumber >= OVER_WEIGHT) {
            result = "Overweight";
        }
        if (BMINumber >= OBESE) {
            result = "Obese";
        }
        return result;
    } // end method BMIHealthCondition
} // end class JLHealth
