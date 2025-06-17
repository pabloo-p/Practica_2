/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller4;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class dc {
    public void ejemploMientrasConContador() {
    int contador = 1;
    while (contador <= 5) {
        System.out.println("Contador = " + contador);
        contador++;
    }
}
    public void ejemploHacerMientrasConBandera() {
        Scanner sc = new Scanner(System.in);
    boolean bandera = false;
    int numero;

    do {
        System.out.print("Ingrese un número (0 para salir): ");
        numero = sc.nextInt();
        if (numero == 0) {
            bandera = true;
        }
    } while (!bandera);
}
    public void modificarValor(int numero) {
    numero = numero + 10;
    System.out.println("Dentro del método: " + numero);
}

public void ejemploPorValor() {
    int x = 5;
    modificarValor(x);
    System.out.println("Fuera del método: " + x);
}
class Contenedor {
    int valor;
}

public void modificarReferencia(Contenedor obj) {
    obj.valor = obj.valor + 10;
}

public void ejemploPorReferencia() {
    Contenedor c = new Contenedor();
    c.valor = 5;
    modificarReferencia(c);
    System.out.println("Valor modificado: " + c.valor); // Imprime 15
}
public void imprimirDias(int dia) {
    String msg = "";

    for (int i = 1; i <= dia; i++) {
        switch (i) {
            case 1:
                msg = "Lunes, Mal día";
                break;
            case 2:
                msg = "Martes, Buen día";
                break;
            case 3:
                msg = "Miércoles, Mal día";
                break;
            case 4:
                msg = "Jueves, Buen día";
                break;
            case 5:
                msg = "Viernes, Mal día";
                break;
            case 6:
                msg = "Sábado, Buen día";
                break;
            case 7:
                msg = "Domingo, Descanso";
                break;
            default:
                msg = "Número de día inválido";
                break;
        }

        System.out.println(msg);
        if (i % 2 == 0) {
            System.out.println("Es un gran día para aprender Teoría de la Programación.");
        }
    }
}


}
