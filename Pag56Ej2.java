/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Pag56Ej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A [] = new int[45];
        System.out.println("Ingrese elementos del arreglo A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
        int B [] = new int[45];
        System.out.println("Ingrese elementos del arreglo B: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = in.nextInt();
        }
        int C [] = new int[45];
        for (int i = 0; i < 45; i++) {
            C[i] = A[i] + B [i];
        }
        System.out.println("Los eementos del arreglo C son:");
        for (int i:C) {
            System.out.println(i);
        }
    }
}
