
// Se desea calcular el promedio de 5 calificaciones introducidas por el usuario

import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        
        double suma = 0.0;
        int NUM_CALIFICACIONES = 5;
        
        
        for (int i = 1; i <= NUM_CALIFICACIONES; i++) {
            System.out.print("Introduce la calificación " + i + ": ");
            double calificacion = obj.nextDouble();
            
            // Validar que la calificación esté en el rango correcto
            if (calificacion < 0 || calificacion > 10) {
                System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
                return; // Salir del programa si hay una calificación inválida
            }
            
            suma += calificacion;
        }
        
        // Calcular el promedio
        double promedio = suma / NUM_CALIFICACIONES;
        
        // Evaluar el promedio y mostrar el mensaje correspondiente
        String mensaje;
        if (promedio > 0 && promedio <= 6) {
            mensaje = "Quedas reprobado";
        } else if (promedio > 6 && promedio <= 7) {
            mensaje = "Pasas de panzazo";
        } else if (promedio > 7 && promedio <= 8) {
            mensaje = "Muy bien, pues mejorar";
        } else if (promedio > 8 && promedio <= 9) {
            mensaje = "Excelente sigue así";
        } else if (promedio > 9 && promedio <= 10) {
            mensaje = "Perfecto tu esfuerzo valió la pena";
        } else {
            mensaje = "Promedio fuera del rango válido";
        }
        
        // Imprimir el resultado
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.println(mensaje);
        
        // Cerrar el scanner
        obj.close();
    }
}
