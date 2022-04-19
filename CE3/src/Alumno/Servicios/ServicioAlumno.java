package Alumno.Servicios;

import Alumno.Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioAlumno {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public Alumno crearAlumno() {

        System.out.println("Ingrese Nombre de Alumno");
        String nombre = leer.next();
        List<Integer> notas = new ArrayList();
        System.out.println("Ingrese notas 1");
        notas.add(leer.nextInt());
        System.out.println("Ingrese notas 2");
        notas.add(leer.nextInt());
        System.out.println("Ingrese notas 3");
        notas.add(leer.nextInt());

        return new Alumno(nombre, notas);
    }

    public void notaFinal(Alumno x) {
        
        double prom = 0.00;
        for(Integer notas : x.getNotas()){
             prom += notas ; 
        }
        
       double promedio = prom/3;
        System.out.println("La nota final de "+x.getNombre()+" es: "+promedio);    
    }

}
