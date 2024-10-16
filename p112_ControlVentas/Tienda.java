
import java.util.ArrayList;

public class Tienda {
    private String Nombre;
    private String Propietario;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;

    public Tienda(String nombre, String propietario, String domicilio) {
        Clientes = new ArrayList<>();
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }
    public double getTotal() {
        double total = 0;
        for (Cliente cliente + Clientes) {
            total = total + cliente.getTotal();
        }
        return total;
    }
    public void reporte() {
        System.out.println("");
    }
    @Override
    public String toString() {
        return "Tienda [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Domicilio=" + Domicilio + ", Clientes="
                + Clientes.size() + ", getTotal()=" + getTotal() + "]";
    }
    
}
