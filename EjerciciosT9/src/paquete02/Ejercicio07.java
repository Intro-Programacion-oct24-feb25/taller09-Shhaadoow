/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        double promedio;
        System.out.println("Ingrese 10 números por favor");
        for (int i = 0; i < 10; i++) {
            
            numeros[i] = scanner.nextInt();
            suma = suma + numeros[i];
        }

        promedio = suma / 10.0;

        for (int i = 0; i < 10; i++) {
            double diferencia = numeros[i] - promedio;
            System.out.printf("El número %s con diferencia de : %.2f\n", 
                    numeros[i], diferencia);
        }
    }
}

