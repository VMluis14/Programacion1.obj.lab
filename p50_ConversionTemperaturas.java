
// Se desea calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores

import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            
            System.out.print("Ingrese la temperatura inicial en grados Celsius: ");
            int tempInicial = scanner.nextInt();
            System.out.print("Ingrese la temperatura final en grados Celsius: ");
            int tempFinal = scanner.nextInt();

            
            while (tempFinal < tempInicial) {
                System.out.println("La temperatura final no puede ser menor que la temperatura inicial.");
                System.out.print("Ingrese la temperatura inicial en grados Celsius: ");
                tempInicial = scanner.nextInt();
                System.out.print("Ingrese la temperatura final en grados Celsius: ");
                tempFinal = scanner.nextInt();
            }

            
            System.out.println("------------------------------------");
            System.out.println("Centígrados\tFahrenheit");
            System.out.println("------------------------------------");
            
            
            int tempActual = tempInicial;
            while (tempActual <= tempFinal) {
                double fahrenheit = (tempActual * 9.0 / 5.0) + 32;
                System.out.printf("%d\t\t%.1f%n", tempActual, fahrenheit);
                tempActual++;
            }
            
            
            System.out.print("¿Desea repetir el proceso? (s/n): ");
            char respuesta = scanner.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                continuar = false;
            }
        }
        
        System.out.println("¡Gracias por usar el programa!");
        scanner.close();
    }
}
