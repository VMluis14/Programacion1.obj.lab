
// Se desea calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el primer ángulo del triángulo: ");
        double angulo1 = scanner.nextDouble();
        
        
        System.out.print("Ingrese el segundo ángulo del triángulo: ");
        double angulo2 = scanner.nextDouble();
        
        
        if (angulo1 <= 0 || angulo1 >= 180 || angulo2 <= 0 || angulo2 >= 180) {
            System.out.println("Los ángulos deben ser mayores que 0 y menores que 180 grados.");
            return;
        }
        
        
        if (angulo1 + angulo2 >= 180) {
            System.out.println("La suma de los dos ángulos debe ser menor que 180 grados.");
            return;
        }
        
        
        double angulo3 = 180 - (angulo1 + angulo2);
        
        
        System.out.printf("El tercer ángulo del triángulo es: %.2f grados%n", angulo3);
        
        
        scanner.close();
    }
}

