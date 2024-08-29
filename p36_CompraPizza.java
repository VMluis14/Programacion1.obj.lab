
// Compra de una pizza y descuento por mayoreo 

import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args) {
        double PRECIO_CHICA = 5.00;
        double PRECIO_MEDIANA = 10.00;
        double PRECIO_GRANDE = 20.00;
        double DESCUENTO_PORCENTAJE = 0.15;
        double LIMITE_DESC = 2000.00;


        Scanner obj = new Scanner(System.in);

        
        
        System.out.println("Seleccione el tamaño de la pizza:");
        System.out.println("1. Chica ($5)");
        System.out.println("2. Mediana ($10)");
        System.out.println("3. Grande ($20)");
        int opcionTamaño = obj.nextInt();

        
        double precioPorPizza = 0.0;
        switch (opcionTamaño) {
            case 1:
                precioPorPizza = PRECIO_CHICA;
                break;
            case 2:
                precioPorPizza = PRECIO_MEDIANA;
                break;
            case 3:
                precioPorPizza = PRECIO_GRANDE;
                break;
            default:
                System.out.println("Opción no válida.");
                return; 
        }

        
        System.out.print("Ingrese la cantidad de pizzas: ");
        int cantidad = obj.nextInt();

        
        double totalCompra = precioPorPizza * cantidad;
        double descuento = 0.0;
        double totalConDescuento = totalCompra;

        
        if (totalCompra > LIMITE_DESC) {
            descuento = totalCompra * DESCUENTO_PORCENTAJE;
            totalConDescuento = totalCompra - descuento;
        }

        
        System.out.println("Tamaño de la pizza: " + (opcionTamaño == 1 ? "Chica" : opcionTamaño == 2 ? "Mediana" : "Grande"));
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total de la compra con descuento: $" + totalConDescuento);

        
        obj.close();
    }
}

    

