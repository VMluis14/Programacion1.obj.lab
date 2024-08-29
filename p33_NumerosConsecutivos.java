
// Dados tres números enteros, verificar si son consecutivos

import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Dame el primer numero: ");
        n1 = obj.nextInt();
        System.out.print("Dame el segundo numero: ");
        n2 = obj.nextInt();
        System.out.print("Dame el tercer numero: ");
        n3 = obj.nextInt();

        if (SonConsecutivos(n1, n2, n3)) {
            System.out.println("Los numeros son consecutivos.");
        }else{
            System.out.println("Error: Los numeros no son consecutivos.");
        }

        
    }
    
    public static boolean SonConsecutivos(int a, int b, int c) {
        // Ordenar los números
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int medio = a + b + c - min - max;

        // Verificar si son consecutivos
        return (max == min + 2 && medio == min + 1);
    }


}
