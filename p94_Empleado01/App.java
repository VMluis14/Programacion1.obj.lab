package p94_Empleado01;

// Pgina principal 

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.Nombre = "Juan Cid";
        empleado1.Edad = 35;
        System.out.println(empleado1.toString());

        // Instanciar, luego reservar espacio en memoria
        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.Nombre = "Yamile Medina";
        empleado2.Edad = 16;
        System.out.println(empleado2.toString());

        // Accede elementos individuales directamente
        System.out.println("Nombre : " + empleado1.Nombre);
        System.out.println("Edad : " + empleado1.Edad);
    }
}