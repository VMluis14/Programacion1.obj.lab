
// Desea llevar el control de la inscripción de los participantes y el dinero recaudado.

import java.util.ArrayList;
import java.util.Scanner;

public class ex01_PrimerExamenParcial {
    
    static class Participante {
        String nombre;
        int edad;
        String sexo;
        String tipoParticipante;
        double costo;

        Participante(String nombre, int edad, String sexo, String tipoParticipante, double costo) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            this.tipoParticipante = tipoParticipante;
            this.costo = costo;
        }
    }

    private static final int EDAD_MINIMA = 23;
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        ArrayList<Participante> participantes = new ArrayList<>();
        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0;
        int totalHombres = 0, totalMujeres = 0, totalRechazados = 0;
        double totalRecaudadoAlumnos = 0.0, totalRecaudadoDocentes = 0.0, totalRecaudadoTrabajadores = 0.0;
        double totalRecaudadoGeneral = 0.0;
        int totalParticipantes = 0;
        double edadTotal = 0.0;
        String pregunta = "";
        do {
            
            System.out.println("Nombre del participante");
            String nombre = obj.nextLine();
            obj.nextLine();

            System.out.println("La edad del participante:");
            int edad = obj.nextInt();
            obj.nextLine(); 

            if (edad < EDAD_MINIMA) {
                System.out.println("El participante debe tener al menos " + EDAD_MINIMA + " años. Inscripción rechazada.");
                totalRechazados++;
                continue;
            }

            System.out.println("El sexo del participante (M/F):");
            String sexo = obj.nextLine();
            if (sexo.equalsIgnoreCase("M")) {
                totalHombres++;
            } else if (sexo.equalsIgnoreCase("F")) {
                totalMujeres++;
            }

            System.out.println("Que tipo de participante eres: (Alumno/Docente/Trabajador)");
            String tipoParticipante = obj.nextLine();
            double costo = 0.0;

            

            switch (tipoParticipante.toLowerCase()) {
                case "alumno":
                    costo = 40.0;
                    totalAlumnos++;
                    totalRecaudadoAlumnos += costo;
                    break;
                case "docente":
                    costo = 60.0;
                    totalDocentes++;
                    totalRecaudadoDocentes += costo;
                    break;
                case "trabajador":
                    costo = 80.0;
                    totalTrabajadores++;
                    totalRecaudadoTrabajadores += costo;
                    break;
                default:
                    System.out.println("Tipo de participante no válido. Inscripción rechazada.");
                    totalRechazados++;
                    continue;
            }
            
            Participante participante = new Participante(nombre, edad, sexo, tipoParticipante, costo);
            participantes.add(participante);
            totalRecaudadoGeneral += costo;
            totalParticipantes++;
            edadTotal += edad;

            System.out.println("Bienvenido " + nombre + "!");
            System.out.println("Edad: " + edad);
            System.out.println("Sexo: " + sexo);
            System.out.println("Tipo de Participante: " + tipoParticipante);
            System.out.println("Costo de inscripción: $" + costo);

            
            System.out.print("Otra participante (S/N) ? ");
            pregunta = obj.next().toUpperCase();
            
        } while (pregunta.equals("S"));

        


        System.out.println("\nResumen de la inscripción:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres: " + totalHombres);
        System.out.println("Total de Mujeres: " + totalMujeres);
        System.out.println("Total de Participantes (aceptados): " + totalParticipantes);
        if (totalParticipantes > 0) {
            System.out.println("Promedio de la edad de los participantes: " + (edadTotal / totalParticipantes));
        } else {
            System.out.println("No hay participantes aceptados.");
        }
        System.out.println("Total de Rechazados: " + totalRechazados);
        System.out.println("Total dinero recaudado de Alumnos: $" + totalRecaudadoAlumnos);
        System.out.println("Total dinero recaudado de Docentes: $" + totalRecaudadoDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: $" + totalRecaudadoTrabajadores);
        System.out.println("Total dinero recaudado en general: $" + totalRecaudadoGeneral);
        
        obj.close();
    }
}
