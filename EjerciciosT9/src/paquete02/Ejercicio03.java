/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int suma =0;
        double promedio=0;
        int i =0;
        int[] arreglo2 = new int[2];
        for( i = 0; i < arreglo.length; i++){
            suma = suma+arreglo[i];
        }
        promedio = (double)suma/arreglo.length;
        for(i = 0; i < arreglo.length; i++){
            if(arreglo[i]>promedio){
                arreglo2[0]=arreglo2[0]+1;
            }else{
                if(arreglo[i]<promedio){
                    arreglo2[1]=arreglo2[1]+1;
                }
            }
        }
        for(i = 0; i < 1; i++){
            System.out.printf("Valores encima de la media: %d\n"
                    + "Valores debajo de la media: %d\n", 
                    arreglo2[0], arreglo2[1]);
        }
    }

}
