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
public class Pag56Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aux, may=0;
        double prom = 0;
        int numeros[] = new int [50];        
        System.out.println("Ingrese los valores del arreglo");
        for (int i = 0; i < numeros.length; i++) {
            aux = in.nextInt();
            numeros[i] = aux;
            prom += aux;
        }
        prom /= numeros.length;
        for (int i: numeros) {
            if (i > prom) {
                may++;
            }
        }
        int mayores[] = new int[may];
        int c = 0;
        for (int i: numeros) {
            if (i > prom) {
                mayores[c] = i;
                c++;
            }
        }
        System.out.println("El promedio del arreglo es: " +prom);
        System.out.println("Hay "+may+" datos mayores que el promedio, y son: ");
        for (int i: mayores) {
            System.out.println(i);
        }
    }
}
