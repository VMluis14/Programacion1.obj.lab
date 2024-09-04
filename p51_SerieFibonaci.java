
// Se desean imprimir los primeros n números de la será de Fibonacci

import java.util.Scanner;

public class p51_SerieFibonaci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            
            System.out.print("Ingrese el número de términos a imprimir en la serie de Fibonacci: ");
            int n = obj.nextInt();

            
            while (n <= 0) {
                System.out.println("El número debe ser mayor que 0.");
                System.out.print("Ingrese el número de términos a imprimir en la serie de Fibonacci: ");
                n = obj.nextInt();
            }

            
            int a = 0;
            int b = 1;
            int contador = 1;

            
            System.out.println("Serie de Fibonacci:");
            while (contador <= n) {
                if (contador == 1) {
                    System.out.print(a);
                } else if (contador == 2) {
                    System.out.print(", " + b);
                } else {
                    int siguiente = a + b;
                    System.out.print(", " + siguiente);
                    a = b;
                    b = siguiente;
                }
                contador++;
            }
            System.out.println(); 

            
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
