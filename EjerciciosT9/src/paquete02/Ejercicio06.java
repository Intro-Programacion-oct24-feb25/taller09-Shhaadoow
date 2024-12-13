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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] menu = {"Café tradicional", "Café francés", "Café alemán"};
        double[] precios = {1.5, 2.1, 2.3};
        int[] cantidadCompra = new int[menu.length];
        double[] Acumulador = new double[menu.length];

        
        while (true) {
            System.out.println("Menú del día:");
            for (int i = 0; i < menu.length; i++) {
                System.out.printf("%d. %s - $%.2f cada taza\n", i + 1, menu
                        [i], precios[i]);
            }

            System.out.print("Seleccione el número del producto que desea "
                    + "comprar (Escriba 0 para finalizar su orden):\n ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            if (opcion >= 1 && opcion <= menu.length) {
                System.out.printf("Ingrese el número de tazas de %s que desea: "
                        + "", menu[opcion - 1]);
                int numT = scanner.nextInt();
                double totalPedido = numT * precios[opcion - 1];
                System.out.printf("Total: $%.2f\n\n", totalPedido);
                cantidadCompra[opcion - 1] += numT;
                Acumulador[opcion - 1] += totalPedido;
            } else {
                System.out.println("Por favor ingrese un número presente en"
                        + " el menú\n");
            }
        }

        System.out.println("\nResumen de la orden:\n");
        double totalPagar = 0.0;
        for (int i = 0; i < menu.length; i++) {
            if (cantidadCompra[i] > 0) {
                System.out.printf("  %s (%d t), valor a cancelar $%.2f\n", 
                        menu[i], cantidadCompra[i], Acumulador[i]);
                totalPagar += Acumulador[i];
            }
        }

        System.out.printf("\nTotal a pagar: $%.2f\n", totalPagar);
        scanner.close();
    }
}




