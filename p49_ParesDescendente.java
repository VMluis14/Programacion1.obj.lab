
// Números impares de forma decendenteb desde 100 hasta el número que el usuario decida

import java.util.Scanner;

public class p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            
            System.out.print("Ingrese un número entero (n): ");
            int n = obj.nextInt();
            
            
            while (n < 100) {
                System.out.println("El número debe ser mayor o igual a 100.");
                System.out.print("Ingrese un número entero (n): ");
                n = obj.nextInt();
            }
            
            
            int suma = 0;
            int cantidad = 0;
            int i = 100; 

            
            System.out.print("Números pares: ");
            while (i <= n) {
                System.out.print(i + " ");
                suma += i;
                cantidad++;
                i += 2; 
            }
            System.out.println(); 

            
            double promedio = (cantidad > 0) ? (double) suma / cantidad : 0;

            System.out.println("Suma de los números pares: " + suma);
            System.out.printf("Promedio de los números pares: %.2f%n", promedio);

            
            System.out.print("¿Desea repetir el proceso? (s/n): ");
            char respuesta = obj.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                continuar = false;
            }
        }
        
        System.out.println("¡Gracias por usar el programa!");
        obj.close();
    }
}
