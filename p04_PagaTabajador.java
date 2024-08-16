
import java.util.Scanner;

// Calcula la paga de un trabajador

public class p04_PagaTabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);
        // Entrada 
        System.out.print("Nombre del trabajador ? "); nombre = obj.nextLine();
        System.out.print("Horas Trabajadas ? "); horas = obj.nextInt();
        System.out.print("Paga x hora ? "); paga = obj.nextFloat();
        tasa = 0.03;
        // Calculo
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;
        // Salida 
        System.out.println("\nResumen de pagos\n");
        System.out.println(String.format("El trabajador %s, trabajo %d horas, a una paga de %,2f pesos la hora, con una tasa de impuesto de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("Paga bruta  = %.2f", pagabruta));
        System.out.println(String.format("Impuestos  = %.2f", impuesto));
        System.out.println(String.format("Paga neta  = %.2f", paganeta));
    }
    
}
