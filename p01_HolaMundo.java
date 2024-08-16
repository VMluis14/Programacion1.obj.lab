// Enviaun saludo a la pantalla 


public class p01_HolaMundo {

    public static void main(String[] args) {
        String amigo = "Alan";
        String hermana = "Jessica";
        String mensaje = String.format("Tanto %s como %s desean aprender Java", hermana, amigo);

        System.out.println("Hola Mundo en el Lenguaje Java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a Java");
        System.out.println("\nMi amigo es " + amigo + " mi hermana es " + hermana);
        System.out.println("\n" + mensaje); 
    }
}