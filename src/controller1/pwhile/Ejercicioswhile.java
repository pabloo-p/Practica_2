/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller1.pwhile;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ejercicioswhile {
     /**
  *Ejercicio 1
  * Codigo que muestra los digitos que se ingresan 
  * @param numero Numero ingresado para mostrar los digitos de los numeros que ingresan
  * @return contar de digitos
  **/
    public int contardigitos(int numero) {
        numero = Math.abs(numero);
        if (numero == 0) {
            return 1;
        }
        int contador = 0;
        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }
        return contador;
    }
      /**
  *Ejercicio 2
  * Codigo que muestra los numeros palindromos 
  * @param numero Numero ingresado para mostrar los palimdromos
  * @return si el numero es palindromo o no
  **/
     public boolean palindromo(int numero) {
    int original = numero;
    int invertido = 0;

    while (numero > 0) {
        int digito = numero % 10;
        invertido = (invertido * 10) + digito;
        numero = numero / 10;
    }
    return original == invertido;
}
    /**
  *Ejercicio 3
  * Codigo que muestra el numero revertido
  * @param numero Numero ingresado para mostrar el numero revertido
  * @return el numero revertido
  **/

    public int revertirnumero(int numero) {
        int numeroR= 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroR= numeroR * 10 + digito;
            numero /= 10;
        }
        return numeroR;
    }
    /**
  *Ejercicio 4
  * Codigo que muestra la raiz cubica de un numero
  * @param numero Numero ingresado para mostrar la raiz del mumero
  * @return la raiz de numero
  **/
    public int raizCubica(int numero) {
    int raiz = 0;

    while ((raiz * raiz * raiz) <= numero) {
        raiz++;
    }

    return raiz - 1;
}
}
