/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author reroes
 */
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas marcas deseas ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        
        String[] marcas = new String[cantidad];
        int contador = 0;
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa una marca: ");
            String marca = scanner.nextLine();
            char inicial = Character.toUpperCase(marca.charAt(0));
            
            if (inicial == 'A' || inicial == 'C' || inicial == 'T') {
                i--;
            } else {
                marcas[contador] = marca;
                contador++;
            }
        }
        
        System.out.println("Marcas ingresadas:");
        for (int i = 0; i < contador; i++) {
            System.out.println(marcas[i]);
        }
    }
}
