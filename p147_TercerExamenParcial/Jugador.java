package p147_TercerExamenParcial;

public class Jugador {
    private String Nombre;
    private int Edad;
    private char Sexo; // 'M' para masculino, 'F' para femenino
    private String EstadoCivil; // "Soltero" o "Casado"
    private String Descripcion;
    private double Salario;

    
    public Jugador() {}

    
    public Jugador(String nombre, int edad, char sexo, String estadoCivil, String descripcion, double salario) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Sexo = sexo;
        this.EstadoCivil = estadoCivil;
        this.Descripcion = descripcion;
        this.Salario = salario;
    }

    public String getNombre() { 
        return Nombre; 
    }
    public void setNombre(String nombre) { 
        this.Nombre = nombre;
    }
    public int getEdad() { 
        return Edad; 
    }
    public void setEdad(int edad) { 
        this.Edad = edad; 
    }
    public char getSexo() { 
        return Sexo; 
    }
    public void setSexo(char sexo) { 
        this.Sexo = sexo; 
    }
    public String getEstadoCivil() { 
        return EstadoCivil; 
    }
    public void setEstadoCivil(String estadoCivil) { 
        this.EstadoCivil = estadoCivil; 
    }
    public String getDescripcion() { 
        return Descripcion; 
    }
    public void setDescripcion(String descripcion) { 
        this.Descripcion = descripcion; 
    }
    public double getSalario() { 
        return Salario; 
    }
    public void setSalario(double salario) { 
        this.Salario = salario; 
    }
}

    

