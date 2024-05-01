/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.fiborecursion;

import java.util.Scanner;

/**
 *
 * @author kamau
 */
public class FiboRecursion {

    static int fib(int n) {
        // Base Case
        if (n <= 1) {
            return n;
        }

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = 20;

        for (int i = 0; i < n; i++) {
            System.out.println(fib(i) + " ");
        }
    }

}
