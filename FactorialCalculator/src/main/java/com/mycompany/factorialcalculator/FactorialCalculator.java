/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialcalculator;

/**
 *
 * @author Acer-User
 */
public class FactorialCalculator {
    
    static int factorial(int n)
    {
        int res = 1;
        int i; 
        for (i = 2; i <= n; i++) 
            res *= i; 
        return res; 
    }

    public static void main(String[] args) {
        int num = 5; 
        System.out.println("Factorial of " + num + " is "
                           + factorial(5)); 
    }
}
 