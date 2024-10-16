package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo() {
    }

    public Equipo(String nombre, String liga) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = new ArrayList<>();
    }
    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }
    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }
    
    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono = totalBono + jugador.getTotalBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total = total + jugador.getTotal();
        }
        return total;
    }
    
    public int getTotalH() {
        int totalHombres = 0;
        for(Jugador jugador : Jugadores) {
            totalHombres = totalHombres + jugador.getTotalH();
        }
        return totalHombres;
    }
        
    public int getTotalM() {
        int totalMujeres = 0;
        for(Jugador jugador : Jugadores) {
            totalMujeres = totalMujeres + jugador.getTotalM();
        }
        return totalMujeres;
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores + "]";
    }

    

    
    
   /*  public void reporte() {
        System.out.println(Equipo);
        for (Jugador jugador : Jugadores) {
            System.out.println(">"+ Liga);
            for (Jugador jugador : Jugadores )
        }
    */

    
    
    
    
}
