package Pelicula.Utilidades;

import Pelicula.Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPeliPorTit = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPeliPorDir = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
}
