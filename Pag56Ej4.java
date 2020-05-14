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
public class Pag56Ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A [] = new int [500];
        System.out.println("Ingrese elementos del arreglo A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
        int Cuadrados [] = new int [500];
        for (int i = 0; i < Cuadrados.length; i++) {
            Cuadrados [i] = (int)Math.pow(A[i], 2) ;
        }
        System.out.println("Los elementos del Arreglo A son:");
        for (int i: A) {
            System.out.println(i);
        }
        System.out.println("Los elementos del Arreglo Resultante son:");
        for (int i: Cuadrados) {
            System.out.println(i);
        }
    }
}
