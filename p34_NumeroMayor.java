
// Dados tres números enteros, verificar cual es el mayor.

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        double n1, n2, n3;
        double mayor;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Dame el primer numero: ");
        n1 = obj.nextDouble();
        System.out.print("Dame el segundo numero: ");
        n2 = obj.nextDouble();
        System.out.print("Dame el tercer numero: ");
        n3 = obj.nextDouble();

        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        }else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        }else {
            mayor = n3;
        }
        
        System.out.println("El numero mayor es: " + mayor);  
    


    }
}
