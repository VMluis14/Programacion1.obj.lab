
// Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado.

import java.util.Scanner;

public class p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        
        System.out.print("Introduce el nombre del estudiante: ");
        String nombre = obj.nextLine();

        
        System.out.print("Introduce el sexo del estudiante (h/m): ");
        char sexo = obj.next().charAt(0);
        if (sexo != 'h' && sexo != 'm') {
            System.out.println("Sexo inválido. Debe ser 'h' para hombre o 'm' para mujer.");
            return;
        }

        
        System.out.print("Introduce la edad del estudiante: ");
        int edad = obj.nextInt();
        if (edad < 0) {
            System.out.println("Edad inválida.");
            return;
        }

        
        double suma = 0.0;
        final int NUM_CALIFICACIONES = 3;
        for (int i = 1; i <= NUM_CALIFICACIONES; i++) {
            System.out.print("Introduce la calificación " + i + ": ");
            double calificacion = obj.nextDouble();
            if (calificacion < 0 || calificacion > 10) {
                System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
                return;
            }
            suma += calificacion;
        }

        
        double promedio = suma / NUM_CALIFICACIONES;

        
        boolean aceptado = sexo == 'm' && edad > 21 && promedio >= 8 && promedio <= 9.5;

        
        if (aceptado) {
            System.out.println("El estudiante " + nombre + " es aceptado.");
        } else {
            System.out.println("El estudiante " + nombre + " no es aceptado.");
        }

        
        obj.close();
    }
}
