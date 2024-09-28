package p95_Empleado02;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Carlos Perez");
        empleado1.setEdad(25);
        System.out.println(empleado1.toString());

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Maria de Jesus");
        empleado2.setEdad(16);
        System.out.println(empleado2.toString());
        

        System.out.println("Empleado 1 Nombre " + empleado1.getNombre());
        System.err.println("Empleado 1 Edad " + empleado1.getEdad());



    }
}
