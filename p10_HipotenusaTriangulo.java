
// Calcula la hipotenusa 

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer la longitud del primer lado
        System.out.print("Introduce la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();
        
        // Leer la longitud del segundo lado
        System.out.print("Introduce la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();
        
        
        scanner.close();
        
        // Calcular la hipotenusa usando la fórmula proporcionada
        double hipotenusa = Math.sqrt(lado1 * lado1 + lado2 * lado2);
        
        
        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);

    }
    
}
