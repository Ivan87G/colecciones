package ce2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CE2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        List<String> razas = new ArrayList();
        int op;
        String tipo;

        do {
            System.out.println("Ingrese una Raza de perro");
            razas.add(leer.next());
            System.out.println("Quiere agregar una nueva raza?");
            System.out.print("Presione 1-> SI / 2-> NO: ");
            op = leer.nextInt();
            if (op != 1 && op != 2) {
                System.out.println("Opción Incorrecta");
                System.out.println("Quiere agregar una nueva raza?");
                System.out.print("Presione 1-> SI / 2-> NO: ");
                op = leer.nextInt();
            }            
        } while (op != 2);

        System.out.println("\nLista de razas de perro");
        for (String raza : razas) {
            System.out.println(raza);
        }
        System.out.println("\ningrese una raza de perro");
        tipo = leer.next();
        System.out.println("");

        int c = 0;
        Iterator raza = razas.iterator();
        while (raza.hasNext()) {
            if (raza.next().equals(tipo)) {
                raza.remove();
                c++;
            }
        }
        if (c == 0) {
            System.out.println("La Raza Ingresada No Se Encontro");
        }

        Collections.sort(razas);
        System.out.println("\nLista de razas de perro final");
        for (String raz : razas) {
            System.out.println(raz);
        }
    }
}
