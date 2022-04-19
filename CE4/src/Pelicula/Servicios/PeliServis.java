package Pelicula.Servicios;

import Pelicula.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeliServis {

    List<Pelicula> Pelis;
    Scanner leer;

    public PeliServis() {
        this.Pelis = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Pelicula crearPelicula() {
        System.out.println("Ingrese Nombre de la Pelicula");
        String titulo = leer.next();

        System.out.println("Ingrese Nombre del Director");
        String nombre = leer.next();

        System.out.println("Ingrese duracion de la Pelicula");
        double duracion = leer.nextDouble();

        return new Pelicula(titulo, nombre, duracion);
    }

    public void agregarPeli() {

        Pelis.add(crearPelicula());
    }

    public void mostrarPel() {
        System.out.println("Peliculas de La Lista");
        for (Pelicula peli : Pelis) {
            System.out.println(peli.toString());
        }
    }

    public void mostPM() {
        System.out.println("Peliculas con una Duracion Mayor a 1 Hora");
        for (Pelicula peli : Pelis) {
            if (peli.getDuracion() > 1) {
                System.out.println(peli.toString());
            }
        }
    }
    
    

}
