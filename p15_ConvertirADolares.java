
// Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer la cantidad en pesos
        System.out.print("Introduce la cantidad en pesos: ");
        double cantidadPesos = scanner.nextDouble();
        
        // Leer la cotización del dólar
        System.out.print("Introduce la cotización del dólar: ");
        double cotizacionDolar = scanner.nextDouble();
        
        
        scanner.close();
        
        
        
        // Calcular el equivalente en dólares
        double equivalenteDolares = cantidadPesos / cotizacionDolar;
        
        
        System.out.printf("El equivalente en dólares es: %.2f\n", equivalenteDolares);


    }
}
