/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memoria;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */

public class Main {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Lista lista = new Lista();
        int opcion = -1;

        lista.add(new Nodo(10, "Manzana"));
        lista.add(new Nodo(20, "Pera"));
        lista.add(new Nodo(30, "Naranja"));

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1.Agregar nodo al final");
            System.out.println("2.Agregar nodo en posición");
            System.out.println("3.Eliminar nodo por código");
            System.out.println("4.Buscar nodo por código");
            System.out.println("5.Mostrar todos los nodos");
            System.out.println("6.Mostrar tamaño de la lista");
            System.out.println("0.Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = lea.nextInt();
                lea.nextLine(); 
                switch (opcion) {
                    case 1:
                        agregarAlFinal(lea, lista);
                        break;
                    case 2:
                        agregarEnPosicion(lea, lista);
                        break;
                    case 3:
                        eliminarPorCodigo(lea, lista);
                        break;
                    case 4:
                        buscarPorCodigo(lea, lista);
                        break;
                    case 5:
                        System.out.println("\n--- Contenido de la Lista ---");
                        lista.print();
                        break;
                    case 6:
                        System.out.println("El tamaño de la lista es: "+lista.size());
                        break;
                    case 0:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número para la opción.");
                lea.nextLine(); 
                opcion = -1;
            }
        } while (opcion != 0);

        lea.close();
    }

    private static void agregarAlFinal(Scanner lea, Lista lista) {
        try {
            System.out.print("Ingrese código para el nuevo nodo: ");
            int codigo = lea.nextInt();
            lea.nextLine();
            System.out.print("Ingrese nombre para el nuevo nodo: ");
            String nombre = lea.nextLine();
            lista.add(new Nodo(codigo, nombre));
            System.out.println("Nodo agregado al final.");
        } catch (InputMismatchException e) {
            System.out.println("Error: El código debe ser un número.");
            lea.nextLine();
        }
    }

    private static void agregarEnPosicion(Scanner lea, Lista lista) {
        try {
            System.out.print("Ingrese el código para el nuevo nodo: ");
            int codigo = lea.nextInt();
            lea.nextLine();
            System.out.print("Ingrese el nombre para el nuevo nodo: ");
            String nombre = lea.nextLine();
            System.out.print("Ingrese la posición (índice 0) para el nuevo nodo: ");
            int index = lea.nextInt();
            lea.nextLine();

            Nodo nuevoNodo = new Nodo(codigo, nombre);
            lista.add(index, nuevoNodo);
            System.out.println("Nodo agregado en la posición "+index+".");

        } catch (InputMismatchException e) {
            System.out.println("Error: Código e índice deben ser números.");
            lea.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    private static void eliminarPorCodigo(Scanner lea, Lista lista) {
        try {
            System.out.print("Ingrese el código del nodo a eliminar: ");
            int codigo = lea.nextInt();
            lea.nextLine();
            if (lista.remove(codigo)) {
                System.out.println("Nodo con código "+codigo+" eliminado exitosamente.");
            } else {
                System.out.println("No se encontró ningún nodo con el código "+codigo+".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: El código debe ser un número.");
            lea.nextLine();
        }
    }

    private static void buscarPorCodigo(Scanner lea, Lista lista) {
        try {
            System.out.print("Ingrese el código del nodo a buscar: ");
            int codigo = lea.nextInt();
            lea.nextLine();
            Nodo nodo = lista.get(codigo);
            if (nodo != null) {
                System.out.println("Nodo encontrado: "+nodo.toString());
            } else {
                System.out.println("No se encontró ningún nodo con el código "+codigo+".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: El código debe ser un número.");
            lea.nextLine();
        }
    }
}