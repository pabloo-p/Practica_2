/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller3.pswitch;

/**
 *
 * @author asus
 */
public class Ejercicios_switch {
    /*Ejercicio 1
  * Codigo que muestra el estado del semaforo segun la opcion que selecciones
  * @param estado Muestra si puede o no avanzar
  * @return estado
  **/   
    public  void semaforo(int estado) {
        switch (estado) {
            case 1:
                System.out.println("Semáforo en Verde :Puede avanzar.");
                break;

            case 2:
                System.out.println("Semáforo en Amarillo :Debes reducir tu velocidad para hacer alto total.");
                break;

            case 3:
                System.out.println("Semáforo en Rojo :Debe detenerse  .");
                break;

            default:
                System.out.println("Numero no válido. Use 1 (Verde), 2 (Amarillo), 3 (Rojo).");
                break;
        }
    }
     /*Ejercicio 2
  * Codigo que muestra la figura geometricas segun loa lados que tenga 
  * @param lados al ingresar los lados que tiene la figura el programa lo lee y vota que figura es
  * @return figura
  **/   
    public void figurageometrica(int lados) {
        switch (lados){
            case 0:
                System.out.println("No existe una figura con "+ lados+"lados");
                break;
            case 1: 
                System.out.println("No existe una figura geomtrica con "+lados+" lados");
                break;
            case 2:
                System.out.println("No existe una figura geometrica con "+lados+" lados");
                break;
            case 3:
                System.out.println("La Figura es un Rectangulo ");
                break;
            case 4:
                System.out.println("La Figura es un Cuadrado o Rectangulo");
                break;
            case 5:
                System.out.println("La Figura es un Pentágono");
                break;
            case 6:
                System.out.println("La Figura es un Hexágono");
                break;
            case 7:
                System.out.println("La Figura es un Heptágono");
                break;
            case 8: 
                System.out.println("La Figura es un Octágono");
                break;
            case 9:
                System.out.println("La Figura es un Eneágono");
                break;
            case 10:
                System.out.println("La Figura es un Decágono");
                break;
                default:
                    System.out.println("Figura con " + lados + " lados no está en la lista común");
                    break;
        }
    }
     /*Ejercicio 3
  * Codigo que muestra las estaciones del año segun el mes 
  * @param mes Segun el mes en el que estemos el programa nos da la estacion
  * @return estacion
  **/   
    public void  estaciones(int mes) {
        switch (mes) {
            case 12: case 1: case 2:
                System.out.println("Invierno");
                break;
            case 3: case 4: case 5:
                System.out.println("Primavera");
                break;
            case 6: case 7: case 8:
                System.out.println("Verano");
                break;
            case 9: case 10: case 11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Número de mes no válido. Debe ser de 1 a 12.");
        }
    }
     /*Ejercicio 4
  * Codigo que muestra la converciones de monedas que eligas
  * @param cantidad al momento en el que se ingresa la conatidad tienes que seleccionaar
    la moneda de origen y luego seleecionar a cual la quieres convertir
  * @return cantidad convertida
  **/   
    public double convercionesdemoneda(double cantidad, int origen, int destino){
        double tasa = 1.0;
        double resultado;
        switch (origen){
            case 1:
                switch (destino){
                    case 1: tasa = 1.0;
                    break;
                    case 2: tasa = 0.87;
                    break;
                    case 3: tasa = 19.05;
                    break;
                    case 4: tasa = 3.63;
                    break;
                    default:
                        return -1 ;                       
                }
                break;
            case 2:
                switch (destino){
                    case 1: tasa = 1.14;
                    break;
                    case 2: tasa = 1.0 ;
                    break;
                    case 3: tasa = 21.76;
                    break;
                    case 4: tasa = 4.15;
                    break;
                    default:
                        return -1;       
                }
                break;
            case 3:
                switch (destino){
                    case 1: tasa = 0.052;
                    break;
                    case 2: tasa = 0.046;
                    break;
                    case 3: tasa = 1.0;
                    break;
                    case 4: tasa = 0.19;
                    break;
                    default:
                        return -1;       
                }
                break;
            case 4:
                switch(destino){
                    case 1: tasa = 0.28;
                    break;
                    case 2: tasa = 0.24;
                    break;
                    case 3: tasa = 5.24;
                    break;
                    case 4: tasa = 1.0;
                    break;
                    default:
                        return -1;       
                }
                break;
            default:
                return -1 ;
                
        }
        return cantidad * tasa;
    }
}
