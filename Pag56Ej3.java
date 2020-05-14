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
public class Pag56Ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int may = -9999999, pos = 0, aux;
        int numeros [] = new int[20];
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < 20; i++) {
            aux = in.nextInt();
            numeros[i] = aux;
            if (aux > may) {
                pos = i;
                may = aux;
            }
        }
        System.out.println("El mayor elemento almacenado en el vector es: ");
        System.out.println(may + " Se encuentra en la posición " + (pos+1));
    }
}
