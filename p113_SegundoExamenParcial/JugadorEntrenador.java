package p113_SegundoExamenParcial;

public class JugadorEntrenador  extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(int proyectos, int subordinados, String descripcion, String nombre, double salario, char sexo) {
        super(descripcion, nombre, salario, sexo);
        this.Proyectos = proyectos;
        this.Subordinados = subordinados;
    }

    public  double getBono() {
        return (Salario* 0.15) + (Proyectos * 100) + (Subordinados * 10);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JugadorEntrenador{");
        sb.append("Subordinados=").append(Subordinados);
        sb.append(", Proyectos=").append(Proyectos);
        sb.append('}');
        return sb.toString();
    }
    
}
