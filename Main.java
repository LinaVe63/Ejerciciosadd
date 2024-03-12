import java.util.Scanner;

class Alumno {
    private final String nivel;
    private final String especialidad;

    // Constructor
    public Alumno(int numeroControl, String nivel, String especialidad) {
        this.nivel = nivel;
        this.especialidad = especialidad;
    }

    // Getters
    public String getNivel() {
        return nivel;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el número de alumnos
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();

        // Arreglos para almacenar los alumnos
        Alumno[] alumnos = new Alumno[numAlumnos];

        // Leer los datos de los alumnos
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese los datos del alumno " + (i + 1) + ":");
            System.out.print("Número de control: ");
            int numeroControl = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Nivel (bachillerato, profesional, maestría): ");
            String nivel = scanner.nextLine();
            System.out.print("Especialidad: ");
            String especialidad = scanner.nextLine();

            alumnos[i] = new Alumno(numeroControl, nivel, especialidad);
        }

        // Contadores para cada categoría
        int contadorBachillerato = 0;
        int contadorProfesional = 0;
        int contadorMaestria = 0;
        int contadorSistemas = 0;

        // Calcular los resultados
        for (Alumno alumno : alumnos) {
            if (alumno.getNivel().equalsIgnoreCase("bachillerato")) {
                contadorBachillerato++;
            } else if (alumno.getNivel().equalsIgnoreCase("profesional")) {
                contadorProfesional++;
            } else if (alumno.getNivel().equalsIgnoreCase("maestría")) {
                contadorMaestria++;
            }

            if (alumno.getEspecialidad().equalsIgnoreCase("sistemas")) {
                contadorSistemas++;
            }
        }

        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("a) Alumnos de bachillerato: " + contadorBachillerato);
        System.out.println("b) Alumnos de profesional: " + contadorProfesional);
        System.out.println("c) Alumnos de maestría: " + contadorMaestria);
        System.out.println("d) Alumnos de sistemas: " + contadorSistemas);
    }
}