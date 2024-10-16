package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    public JugadorActivo(String descripcion, String nombre, double salario, char sexo, int partidos, int goles) {
        super(descripcion, nombre, salario, sexo);
        Partidos = partidos;
        Goles = goles;
    }
    
    public  double getBono() {
        return (Salario * 0.10) + (Partidos * 50) + (Goles * 5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JugadorActivo{");
        sb.append("Partidos=").append(Partidos);
        sb.append(", Goles=").append(Goles);
        sb.append('}');
        return sb.toString();
    }

}
