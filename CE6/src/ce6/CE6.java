package ce6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CE6 {

    public static void main(String[] args) {

        HashMap<String, Double> Productos = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String salir = "";

        do {
            System.out.println("        Menu           ");
            System.out.println("***********************");
            System.out.println("1.- Cargar Productos");
            System.out.println("2.- Modificar Precio");
            System.out.println("3.- Eliminar Productos");
            System.out.println("4.- Mostrar Todos los Productos");
            System.out.println("5.- Salir");
            System.out.println("***********************");
            System.out.print("Ingrese Opción: ");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    String opc;
                    do {
                        System.out.println("Ingrese Nombre de Producto");
                        String prod = leer.next().toLowerCase();
                        System.out.println("Ingrese precio de " + prod);
                        Double prec = leer.nextDouble();
                        Productos.put(prod, prec);
                        System.out.println("Desea agregar otro Producto?");
                        opc = leer.next();
                    } while (opc.equalsIgnoreCase("si"));
                    break;
                case 2:
                    System.out.println("Ingrese Producto a Modificar Precio");
                    String prod = leer.next().toLowerCase();
                    if (Productos.containsKey(prod)) {
                        System.out.println("Ingrese Precio");
                        Double nuevopre = leer.nextDouble();
                        Productos.replace(prod, nuevopre);
                    } else {
                        System.out.println("El Producto no Existe");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese Nombre del Producto a Eliminar");
                    String elim = leer.next().toLowerCase();
                    Productos.remove(elim);
                    break;
                case 4:
                    System.out.println("Lista de Productos Cargados");
                    for (Map.Entry<String, Double> produc : Productos.entrySet()) {
                        String key = produc.getKey();
                        Double value = produc.getValue();
                        System.out.println(key.toUpperCase() + " Precio $" + value);
                    }
                    leer.next();
                    break;
                case 5:
                    System.out.println("Desea Salir del Programa?");
                    System.out.println("si? / no?");
                    salir = leer.next();
                    break;
            }
        } while (!salir.equalsIgnoreCase("si"));

    }
}
