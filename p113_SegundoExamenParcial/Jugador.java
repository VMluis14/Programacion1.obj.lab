package p113_SegundoExamenParcial;

public abstract class Jugador {
    private String Nombre;
    private char Sexo;
    private String Descripcion;
    private double Salario;
    private double Total;

    public Jugador(String descripcion, String nombre, double salario, char sexo) {
        this.Descripcion = descripcion;
        this.Nombre = nombre;
        this.Salario = salario;
        this.Sexo = sexo; 
    }
    
    public abstract double getBono();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("jugador{");
        sb.append("Nombre=").append(Nombre);
        sb.append(", Sexo=").append(Sexo);
        sb.append(", Descripcion=").append(Descripcion);
        sb.append(", Salario=").append(Salario);
        sb.append(", Total=").append(Total);
        sb.append('}');
        return sb.toString();
    }

    
}
