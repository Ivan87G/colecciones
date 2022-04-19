package AlumnoNotaFinal;

import Alumno.Entidades.Alumno;
import Alumno.Servicios.ServicioAlumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Alumno> alumnos = new ArrayList();
        String op;
        ServicioAlumno a1 = new ServicioAlumno();

        do {

            alumnos.add(a1.crearAlumno());
            System.out.println("Desea Agregar otro Alumno?");
            op = leer.next();

        } while (op.equalsIgnoreCase("si"));

        System.out.println("Que estudiante quiere calcular su nota final? ");
        String nombreAlumno = leer.next();

        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                a1.notaFinal(alumno);
            }
        }
    }
}
