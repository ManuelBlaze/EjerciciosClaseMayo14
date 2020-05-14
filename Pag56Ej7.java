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
public class Pag56Ej7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M [] = new int [100];
        System.out.println("Ingrese los elementos del Arreglo M:");
        for (int i = 0; i < M.length; i++) {
            M[i] = in.nextInt();
        }
        int N [] = new int [100];
        System.out.println("Ingrese los elementos del Arreglo N:");
        for (int i = 0; i < N.length; i++) {
            N[i] = in.nextInt();
        }
        int c = 0, caux = 0;
        for (int i = 0; i < 100; i++) {
            if (M [i] == N [i]) {
                c++;
            }
            caux++;
        }
        if (c == caux) {
            System.out.println("Iguales");
        }
        else {
            System.out.println("Diferentes");
        }
    }
}
