
//Números impares de forma ascendente desde 1 hasta el número que el usuario decida

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            
            System.out.print("Ingrese un número entero positivo (n): ");
            int n = obj.nextInt();

            
            while (n < 1) {
                System.out.println("Ingrese un número entero ");
                System.out.print("Ingrese un número entero (n): ");
                n = obj.nextInt();
            }

            
            int suma = 0;
            int cantidad = 0;
            int i = 1;

            
            System.out.print("Números impares: ");
            while (i <= n) {
                System.out.print(i + " ");
                suma += i;
                cantidad++;
                i += 2; 
            }
            System.out.println(); 

            
            double promedio = (cantidad > 0) ? (double) suma / cantidad : 0;

            System.out.println("Suma de los números impares: " + suma);
            System.out.printf("Promedio de los números impares: %.2f%n", promedio);

            
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
