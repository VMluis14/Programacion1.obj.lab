
// un programa que le permita llevar el control de su venta de fotocopias

import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int cartaCount = 0, oficioCount = 0, dobleOficioCount = 0;
        int cartaTotal = 0, oficioTotal = 0, dobleOficioTotal = 0;
        int ventaCount = 0;
        int totalCopias = 0;
        int totalVentas = 0;

        System.out.println("---------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("---------------------------------");
        
        String otraVenta;
        
        do {
            ventaCount++;
            System.out.println("Venta: " + ventaCount);
            System.out.print("Tipo de copia (C)arta $3,(O)ficio $4,(D)oble Of $6? ");
            char tipoCopia = obj.next().toUpperCase().charAt(0);
            System.out.print("Cantidad ? ");
            int cantidad = obj.nextInt();
            
            switch (tipoCopia) {
                case 'C':
                    cartaCount += cantidad;
                    cartaTotal += cantidad * 3;
                    break;
                case 'O':
                    oficioCount += cantidad;
                    oficioTotal += cantidad * 4;
                    break;
                case 'D':
                    dobleOficioCount += cantidad;
                    dobleOficioTotal += cantidad * 6;
                    break;
                default:
                    System.out.println("Tipo de copia no válido.");
                    break;
            }
            
            totalCopias = cartaCount + oficioCount + dobleOficioCount;
            totalVentas = cartaTotal + oficioTotal + dobleOficioTotal;
            
            System.out.print("Otra venta (S/N) ? ");
            otraVenta = obj.next().toUpperCase();
            
        } while (otraVenta.equals("S"));
        
        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Ventas realizadas: " + ventaCount);
        System.out.println("-------------------------");
        System.out.println("Carta : " + cartaCount + " - $ " + cartaTotal);
        System.out.println("Oficio : " + oficioCount + " - $ " + oficioTotal);
        System.out.println("Doble Of. : " + dobleOficioCount + " - $ " + dobleOficioTotal);
        System.out.println("-------------------------");
        System.out.println("Tot. Ventas : " + totalCopias + " - $ " + totalVentas);
        
        if (totalVentas < 50) {
            System.out.println("Esta venta es una : Venta moderada");
        } else if (totalVentas >= 50 && totalVentas <= 100) {
            System.out.println("Esta venta es una : Venta frecuente");
        } else {
            System.out.println("Esta venta es una : Venta superada");
        }
        
        obj.close();
    }
}
