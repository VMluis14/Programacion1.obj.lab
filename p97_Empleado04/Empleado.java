package p97_Empleado04;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Casado;


    public Empleado() {}

    public Empleado(String nombre, int edad, char sexo, boolean casado) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        Casado = casado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public boolean isCasado() {
        return Casado;
    }

    public void setCasado(boolean casado) {
        Casado = casado;
    }

    public String toString() {
        return String.format("Nombre: %s, Edad: %d, Sexo: %s, Casado: %s", Nombre, Edad,(Sexo == 'M' ? "Mujer" : "Hombre"), (Casado ? "Casado" : "No Casado"));
    }    
    
}
