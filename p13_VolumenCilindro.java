
// Se desea calcular el volumen de un cilindro dado su radio y altura

import java.util.Scanner;


public class p13_VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el radio del cilindro
        System.out.print("Introduce el radio del cilindro: ");
        double radio = scanner.nextDouble();
        
        // Leer la altura del cilindro
        System.out.print("Introduce la altura del cilindro: ");
        double altura = scanner.nextDouble();
        
        
        scanner.close();
        
        // Calcular el volumen del cilindro
        double volumen = Math.PI * (radio * radio) * altura;
        
        
        System.out.println("El volumen del cilindro es: " + volumen);


    }
}
