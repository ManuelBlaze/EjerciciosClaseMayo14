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
public class Pag56Ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  pos = 0, npos = 0, nneg = 0, neg = 0, cero = 0;
        int aux;
        int numeros[] = new int [300];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            aux = in.nextInt();
            if (aux > 0) {
                pos += aux;
                npos++;
            }
            else if (aux < 0){
                neg += aux;
                nneg++;
            }
            else {
                cero++;
            }
            numeros[i] = aux;
        }
        System.out.println("La cantidad de ceros es "+cero);
        System.out.println("La cantidad de positivos es "+npos);
        System.out.println("La cantidad de negativos es "+nneg);
        System.out.println("La suma de positivos es "+pos);
        System.out.println("La suma de negativos es "+neg);
    }
}
