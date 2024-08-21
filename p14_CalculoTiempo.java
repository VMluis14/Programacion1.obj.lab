// Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        // Leer la cantidad de horas
        System.out.print("Introduce la cantidad de horas: ");
        int horas = obj.nextInt();
        
        
        obj.close();
        
        // Calcular días, horas, minutos y segundos
        int dias = horas / 24;
        int horasRestantes = horas % 24;
        int minutos = horasRestantes * 60;
        int segundos = minutos * 60;
        
        
        System.out.println("Equivalente en días: " + dias);
        System.out.println("Equivalente en horas: " + horasRestantes);
        System.out.println("Equivalente en minutos: " + minutos);
        System.out.println("Equivalente en segundos: " + segundos);
    }
}
