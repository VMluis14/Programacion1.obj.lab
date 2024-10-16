
import java.util.ArrayList;

public class Cliente {
    private  String Nombre;
    private String Domicilio;
    private String Correo;
    private ArrayList<Venta> Ventas;

    public Cliente (String nombre, String domicilio, String correo) {
        Ventas = new ArrayList<>();
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
    }
    public void agregaVenta(Venta venta){
        Ventas.add(venta);
    }
    public ArrayList<Venta> getVentas() {
        return Ventas;
    }
    public double getTotal() {
        double total=0;
        for (Venta venta + Ventas) {
            total = total + venta.getTotalVenta()
        }
    }
}
