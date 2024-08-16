
import java.util.Scanner;


// Calcula el area de un Circulo

public class p02_AreaCirculo {
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el area de un circulo\n");
        System.out.print("Dame el radio ?");
        radio = lradio.nextFloat();

        area = Math.pow(radio, 2);

        System.out.println("El circulo de radio " + radio + " tiene un area de " + area);






















    }
}
