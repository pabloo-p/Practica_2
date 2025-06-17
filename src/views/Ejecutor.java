package views;

import controller.pfor.Ejerciciosfor;
import controller1.pwhile.Ejercicioswhile;
import controller2.pdo_while.Ejercicios_dowhile;
import controller3.pswitch.Ejercicios_switch;
import controller4.Ejercicios_practica;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejerciciosfor f = new Ejerciciosfor();
        Ejercicioswhile w = new Ejercicioswhile();
        Ejercicios_dowhile d = new Ejercicios_dowhile();
        Ejercicios_switch s = new Ejercicios_switch();
        Ejercicios_practica p = new Ejercicios_practica();
        
        int opcionPrincipal;

        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Ejercicios con FOR");
            System.out.println("2. Ejercicios con WHILE");
            System.out.println("3. Ejercicios con DO WHILE");
            System.out.println("4. Ejercicios con SWITCH");
            System.out.println("5. Ejercicios de Practica 2");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = sc.nextInt();

            switch (opcionPrincipal) {
                case 1 -> {
                    System.out.println("FOR");
                    System.out.println("1. Piramide");
                    System.out.println("2. Numeros que no sean divisibles por 3 y 5");
                    System.out.println("3. Divisores comunes ");
                    System.out.println("4. Raiz de un numero entero");
                    System.out.print("Seleccione una opcion: ");
                    int forOp = sc.nextInt();
                    switch (forOp) {
                        case 1 -> {
                            System.out.print("Ingrese el numero: ");
                            int inicio = sc.nextInt();
                            f.piramide(inicio);
                        }
                        case 2 -> {
                            f.numerosnodivisiblespor3y5();
                        }
                        case 3 -> {
                            System.out.println("Ingerese el primer numero");
                            int num1 = sc.nextInt();
                            System.out.println("Ingrese el segundo numero");
                            int num2 = sc.nextInt();
                            f.divisorescomunes(num1 , num2);                           
                        }
                        case 4 -> {
                            System.out.println("Ingresa un numero entero");
                            int numero = sc.nextInt();
                            if ( numero < 0){
                                System.out.println("El numero debe ser positivo");
                            } else {
                                int raiz = f.raizentera(numero);
                                System.out.println("La raiz cuadrada de "+ numero + " es " + raiz);
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("WHILE");
                    System.out.println("1. Contar digitos ");
                    System.out.println("2. Numero Palindromo");
                    System.out.println("3. Revertir numeros");
                    System.out.println("4. Raiz cubica de un numero");
                    System.out.println("Seleccione una opcion: ");
                    int forOp = sc.nextInt();
                    switch (forOp){
                        case 1 -> {
                            System.out.println("Ingrese los numeros");
                            int numero = sc.nextInt();
                            int digitos = w.contardigitos(numero);
                            System.out.println("El número tiene " + digitos + " digitos");                      
                        }
                        case 2 -> {
                            System.out.println("Ingrese un numero");
                            int numero =  sc.nextInt();
                            
                            if (w.palindromo(numero)) {
                            System.out.println("El número es un palíndromo.");
                            } else {
                            System.out.println("El número no es un palíndromo.");
                        }
                        }
                        case 3 -> {
                            System.out.println("Ingrese un numero entero: ");
                            int numero = sc.nextInt();
                            int digito = w.revertirnumero(numero);
                            System.out.println("El numero revertido es: " + digito );
                        }
                        case 4 -> {
                            System.out.println("Ingrese un numero: ");
                            int numero = sc.nextInt();
                            int resultado = w.raizCubica(numero);
                            System.out.println("La raiz cubica de "+ numero +" es " + resultado);
                        }                       
                    }
                }
                    
                case 3 -> {
                    System.out.println("DO WHILE");
                    System.out.println("1. Mood Menu ");
                    System.out.println("2. Sumar digitos hasta uno");
                    System.out.println("3. Tabla de potencia");
                    System.out.println("4. Juego de dados");
                    System.out.println("Seleccione una opcion: ");
                    int forOp = sc.nextInt();
                    switch (forOp){
                        case 1 -> {      
                            System.out.println("MENÚ PRINCIPAL");
                            System.out.println("1. Saludar");
                            System.out.println("2. Mostrar la hora actual");
                            System.out.println("3. Otra opción");
                            System.out.println("4. Salir");
                            System.out.print("Elige una opción: ");
                            int opcion = sc.nextInt();
                            d.menu(opcion);

                        }
                        case 2 -> {
                            System.out.println("Ingrese un numero: ");
                            int numero = sc.nextInt();
                            int resultado = d.sumaDigitosHastaUno(numero);
                            System.out.println("El resultado final es: "+ resultado);
                                                        
                        }
                        case 3 -> {
                            String resultado = d.tablaPotencia();
                            System.out.println("Tabla de potencia: "+ resultado);   
                            int numero = sc.nextInt();
                            
                        }
                        case 4 ->{
                            d.lanzarHastaDobleSeis();
                        }
                    }
                }
                case 4 -> {
                    System.out.println("SWITCH");
                    System.out.println("1. Semaforo");
                    System.out.println("2. Figuras geometricas ");
                    System.out.println("3. Estaciones del año  ");
                    System.out.println("4. Converciones de moneda");
                    System.out.println("Selecciona una opcion: ");
                    int forOp = sc.nextInt();
                    switch (forOp){
                        case 1 ->{
                            System.out.println("SEMAFORO");
                            System.out.println("Eliga un Numero del 1 al 3 : ");
                            int semaforo = sc.nextInt();
                            s.semaforo(semaforo);                           
                        }
                        case 2 -> {
                            System.out.println("Ingrese el numero de Lados de la figura");
                            int lados = sc.nextInt();
                            s.figurageometrica(lados);
                        }
                        case 3 -> {
                            System.out.println("Ingrese el numero del mes: ");
                            int mes = sc.nextInt();
                            s.estaciones(mes);
                        }
                        case 4 -> {
                            System.out.println("Ingrese el valor a convertir");
                            double cantidad = sc.nextDouble();
                            System.out.println("Moneda de origen: ");
                            System.out.println("1. USD");
                            System.out.println("2. EUROS");
                            System.out.println("3. MXN");
                            System.out.println("4. PEN");
                            System.out.println("Cual es la moneda de origen: ");
                            int origen = sc.nextInt();
                            System.out.println("Moneda destino: ");
                            System.out.println("1. USD");
                            System.out.println("2. EUROS");
                            System.out.println("3. MXN");
                            System.out.println("4. PEN");
                            System.out.println("Cual es la moneda a la cual se quiere convertir: ");
                            int destino = sc.nextInt();
                            double resultado = s.convercionesdemoneda(cantidad, origen, destino);
                            if (resultado != -1) {
                            System.out.printf("Resultado:%.2f \n",resultado);
                            } else {
                            System.out.println("Conversión no válida.");
                           }
                        }
                    }
                    
                }
                case 5 -> {
                    System.out.println("PRACTICA 2");
                    System.out.println("1. Control de inventario");
                    System.out.println("2. Gestión de préstamos en biblioteca");
                    System.out.println("3. Sistema de riego ");
                    System.out.println("4. Calcular el servicios basicos ");
                    System.out.println("5.  Tienda Electronica ");
                    System.out.println("Selecciona una opcion: ");
                    int forOp = sc.nextInt();
                    switch (forOp){
                        case 1 ->{
                            System.out.println("Control de inventario");
                            p.controlInventario(args);
                        }
                        case 2 -> {
                            System.out.println("Informe de prestamos");
                            p.multaBiblioteca();
                        }
                        case 3 -> {
                            int riegototal = p.riego();
                            System.out.println("El tiempo total de riego en el dia es " + riegototal+ " horas");
                            sc.nextInt();                     
                        }
                        case 4 -> {
                            System.out.print("Ingrese el consumo(m^3): ");
                            float consumo = sc.nextFloat();
                            p.imprimirPlanilla(consumo);
                            break;
                                               
                        }
                        case 5 ->{
                            p.tiendaElectronica(args);
                            
                        }
                    }
                }
                case 0 -> System.out.println("Saliendo del programa");
                default -> System.out.println("Opción inválida.");
            }          
        }while (opcionPrincipal != 0);
    } 
}