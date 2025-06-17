package controller4;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Ejercicios_practica {
    /*Ejercicio 1
  * Codigo que muestra el control de un inventario, este codigo te deja ingresar cuantos 
    productos tienes y despues ingresas el nombre del producto y la cantidad del producto
    y si la cantidad del prducto es menor a 5 lo repone
  * @param prodcuto al momento en el que se engresa el prodcuto si es menor a 5 te lo dise 
    y lo tienes que reponer
  * @return productos a reponer, y la cantidad total
  **/   

    public void controlInventario(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos productos desea ingresar? ");
        int cProductos = sc.nextInt();
        sc.nextLine();

        String[] productos = new String[cProductos];
        int[] cantidades = new int[cProductos];

        for (int i = 0; i < cProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i] = sc.nextLine();

            System.out.print("Ingrese la cantidad en stock de " + productos[i] + ": ");
            cantidades[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Productos a reponer");
        int totalReponer = 0;
        for (int i = 0; i < cProductos; i++) {
            if (cantidades[i] < 5) {
                int aReponer = 5 - cantidades[i];
                System.out.println("-" + productos[i] + " (stock: " + cantidades[i] + ", reponer: " + aReponer + ")");
                totalReponer += aReponer;
            }
        }
        System.out.println("Total de unidades a reabastecer: " + totalReponer);
        return;
    }
       /*Ejercicio 2
  * Codigo que muestra las multas de una biblioteca por cada dia de retraso
  * @param prestamo al ingresar el el prestamo de un libro pide la fecha en la que se llevo el lirbo
    y pide la fecha la cual devolvio y los dias que tuvo de restraso y segun eso da la multa
  * @return multas
  **/   
   public void multaBiblioteca() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Cuántos préstamos desea ingresar? ");
    int cantidadP = sc.nextInt();
    sc.nextLine();

    String[] fechaRetiro = new String[cantidadP];
    int[] retraso = new int[cantidadP];
    double tmultas = 0;

    for (int i = 0; i < cantidadP; i++) {
        System.out.print("Ingrese la fecha de retiro del préstamo " + (i + 1) + ":");
        fechaRetiro[i] = sc.nextLine();

        System.out.print("Ingrese los días de retraso: ");
        retraso[i] = sc.nextInt();
        sc.nextLine();
    }

    for (int i = 0; i < cantidadP; i++) {
        System.out.println("Préstamo " + (i + 1));
        System.out.println("Fecha de retiro: "+ fechaRetiro[i]);

        if (retraso[i] > 0) {
            double multa = retraso[i] * 0.50;
            tmultas += multa;
            System.out.println("Días de retraso: " + retraso[i]);
            System.out.println("Multa: $" + multa);

            if (retraso[i] > 30) {
                System.out.println("Estado: Pendiente revisión administrativa");
            }
        } else {
            System.out.println("Devuelto a tiempo. Sin multa.");
        }
    }
    System.out.println("Total de multas acumuladas: $" + tmultas);
    return;
}
   /** Ejercicio 3
 * Codigo que muestra el tiempo total que se riega en el dia 
 *@param 
 * @return Tiempo total de riego en horas
 */
public static int riego() {
    int tiempoRiego = 0;
    for (int i = 0; i < 12; i++) {
        int humedad = (int) (Math.random() * 101);
        if (humedad < 30) {
            tiempoRiego += 2;
        }
    }
    return tiempoRiego;
}
 /**  E jercicio 4
 * Codigo que imprime la planilla de servicio de agua potable de loja 
 *@param este codigo sirve para calcular el agua potable de loja y con eso sacar
 * el costo del alcantarrillado, recoleccion de de basura
 * @return planilla
 */
   private float obtenerCostoAgua(float metrosCubicos) {
        float total = 3.00f; 

        if (metrosCubicos <= 15) {
            return total;
        } else if (metrosCubicos <= 25) {
            total += (metrosCubicos - 15) * 0.10f;
        } else if (metrosCubicos <= 40) {
            total += (10 * 0.10f); 
            total += (metrosCubicos - 25) * 0.20f;
        } else if (metrosCubicos <= 60) {
            total += (10 * 0.10f); 
            total += (15 * 0.20f); 
            total += (metrosCubicos - 40) * 0.30f;
        } else {
            total += (10 * 0.10f); 
            total += (15 * 0.20f); 
            total += (20 * 0.30f); 
            total += (metrosCubicos - 60) * 0.35f;
        }

        return total;
    }
   public void imprimirPlanilla(float consumo) {
        float costoAgua = obtenerCostoAgua(consumo);
        float valorAlcantarillado = costoAgua * 0.35f;
        float recoleccionBasura = 0.75f;
        float procesamientoDatos = 0.50f;
        float montoFinal = costoAgua + valorAlcantarillado + recoleccionBasura + procesamientoDatos;
        System.out.println("\n*** PLANILLA DE AGUA POTABLE ***");
        System.out.printf("Consumo: %.2f m³\n", consumo);                         
        System.out.printf("Costo por agua: $%.2f\n", costoAgua);
                         
        System.out.printf("Alcantarillado (35%%): $%.2f\n", valorAlcantarillado);                           
        System.out.printf("Recolección de basura: $%.2f\n", recoleccionBasura);                            
        System.out.printf("Procesamiento de datos: $%.2f\n", procesamientoDatos);                                    
        System.out.printf("TOTAL A PAGAR: $%.2f\n", montoFinal);     

}
    /** ejercicio 5
 * Codigo que imprime para gestionar y analizar los pedidos en un sistemas de ventas
 * de comercio electrinica
 *@param numero al momento de ingresar cuantos numero de pedido queremos, nos va a pedir el nombre
 * de cada uno y la unidad  comparada
 * @return total de ventas
 */
    public void tiendaElectronica(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalVentasNetas = 0;
        int cuponesEnviados = 0;

        System.out.print("¿Cuántos pedidos desea ingresar?: ");
        int cantidadPedidos = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidadPedidos; i++) {
            System.out.println("\nPedido #" + i);

            System.out.print("Nombre del producto: ");
            String producto = sc.nextLine();

            System.out.print("Cantidad comprada: ");
            int cantidad = sc.nextInt();

            System.out.print("Precio unitario (USD): ");
            double precioUnitario = sc.nextDouble();

            double total = cantidad * precioUnitario;
            if (total > 100) {
                double descuento = total * 0.10;
                total -= descuento;
                System.out.println("Descuento del 10% aplicado. Nuevo total: $" + total);
            }
            totalVentasNetas += total;

            System.out.print("¿Es el primer pedido del cliente? (s/n): ");
            sc.nextLine();
            String esPrimero = sc.nextLine();

            if (esPrimero.equalsIgnoreCase("s")) {
                cuponesEnviados++;
                System.out.println("Cupón adicional enviado al cliente.");
            }

            System.out.println("Total a pagar por este pedido: $" + total);
        }

        System.out.println("\n=== RESUMEN FINAL ===");
        System.out.println("Total de ventas netas: $" + totalVentasNetas);
        System.out.println("Cupones enviados: " + cuponesEnviados);
    }
}


