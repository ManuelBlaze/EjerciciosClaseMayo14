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
public class Pag56Ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeros [] = new int [150];
        int inversos [] = new int [150];
        System.out.println("Digite los elementos del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = in.nextInt();
        }
        int c = 0;
        for (int i = numeros.length -1; i >= 0; i--) {
            inversos[c] = numeros[i];
            c++;
        }
        System.out.println("El Arreglo original es:");
        for (int i: numeros) {
            System.out.println(i);
        }
        System.out.println("El Arreglo inverso es:");
        for (int i: inversos) {
            System.out.println(i);
        }
    }
}
