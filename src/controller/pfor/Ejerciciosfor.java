/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.pfor;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ejerciciosfor {
    
 /**
  *Ejercicio 1 
  * Codigo que permite hacer una piramide con el numero que ingresen
  * @param n Numero ingresado que permite realizar la piramide
  * @return piramide 
  **/

    public void piramide(int n) {
        for (int fila = 1; fila <= n; fila++) {
            for (int espacio = 1; espacio <= n - fila; espacio++) {
                System.out.print("  ");
            }
            for (int num = 1; num <= fila; num++) {
                System.out.print(num + " ");
            }
            for (int num = fila - 1; num >= 1; num--) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
/**
  *Ejercicio 2 
  * Codigo que muestra los numeros que no son divisibles por 3 y 5
  * @param 
  * @return numerosnodivisiblespor3y5
  **/
    public void numerosnodivisiblespor3y5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    /**
  *Ejercicio 3
  * Codigo que muestra los divisores comunes de dos numero
  * @param a y b Numeros ingresados que permiten que el codigo funcione 
  * @return divisorescomunes
  **/
    public  void divisorescomunes(int a, int b) {
        System.out.println("Los divisores comunes de " + a +  " y " + b + " son :");
            int menor = Math.min(a, b);
            for (int i = 1; i <= menor; i++) {
                if (a % i == 0 && b % i == 0) {
                     System.out.println(i);
            }
        }
    }
     /**
  *Ejercicio 4
  * Codigo que muestra la raiz de un numero sin usar funciones matematicas
  * @param num Numero ingresado que permite mostrar la raiz cuadrada de un numero
  * @return raiz de un numero entero
  **/

   public int raizentera(int num) {
    int i;
    for (i = 0; i * i <= num; i++) {
    }
    return i - 1;
}

}


