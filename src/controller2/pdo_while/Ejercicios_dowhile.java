/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller2.pdo_while;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ejercicios_dowhile {
     /**
  *Ejercicio 1
  * Codigo que muestra un mood menu que tiene 4 opciones
  * @param opcion Opcion ingresa muestra lo que esta en cada una de ellas
  * @return menu
  **/
    
    public void menu(int opcion) {
        
        do {
            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! ¿Cómo estás?");
                    break;
                case 2:
                    System.out.println("La hora actual es: " + java.time.LocalTime.now());
                    break;
                case 3:
                    System.out.println("Esta es otra opción del menú.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
            return ;

        } while (opcion != 4);
    }
     /**
  *Ejercicio 2
  * Codigo que suma los digitos de un  numero hasta que el resultado sea un numero de un digito
  * @param numero Numero ingresado que va sumando hasta que quede un numero de un solo digito
  * @return suam
  **/
    public int sumaDigitosHastaUno(int numero) {
    int suma;

    do {
        suma = 0;
        do {
            suma += numero % 10;
            numero /= 10;
        } while (numero > 0);
        numero = suma;
    } while (suma >= 10);

    return suma;
    }
        /**
  *Ejercicio 3
  * Codigo que muestra la potencia de 2 
  * @param numero Numero ingresado que permite dar la potencia de 2
  * @return potencias de 2
  **/
    
    public String tablaPotencia(){
        int numero = 1;
        String resultado = "";
        do{
            resultado += numero + "\n";
            numero *= 2;
        } while (numero <= 1024);
                return resultado.trim();
    }
      /**
  *Ejercicio 4
  * Codigo que muestra da dados hasta que salga doble 6
  * @param dado1, dado2 El juego sigue hasta que los dos dados salga doble 6
  * @return intentos
  **/   
    public void lanzarHastaDobleSeis() {
        Random random = new Random();
        int dado1, dado2;
        int intentos = 0;

        do {
            dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;
            intentos++;
            System.out.println("Intento " + intentos + ": " + dado1 + " - " + dado2);
        } while (!(dado1 == 6 && dado2 == 6));

        System.out.println("¡Doble 6 conseguido en " + intentos + " intentos!");
    }
    
}
  




