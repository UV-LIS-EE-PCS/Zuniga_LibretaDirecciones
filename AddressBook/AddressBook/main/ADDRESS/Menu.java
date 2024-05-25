package ADDRESS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import ADDRESS_DATA.AddressBook;
import ADDRESS_DATA.AddressEntry;

/**
 * La clase Menu proporciona métodos para mostrar y manejar el menú de la libreta de direcciones.
 */
public class Menu {

    /**
     * Muestra el menú y maneja la selección del usuario.
     */
    public static void displayMenu() {
        System.out.println("=============================");
        System.out.println("Elige una opción:");
        System.out.println("a) Cargar un archivo");
        System.out.println("b) Agregar");
        System.out.println("c) Eliminar");
        System.out.println("d) Buscar");
        System.out.println("e) Mostrar");
        System.out.println("f) Salir");
        System.out.println("=============================");

        Scanner in = new Scanner(System.in);
        String menuSelection = in.nextLine();

        switch (menuSelection) {
            case "a":
                loadFile();
                displayMenu();
                break;
            case "b":
                addAddress();
                displayMenu();
                break;
            case "c":
                deleteAddress();
                displayMenu();
                break;
            case "d":
                findAddress();
                displayMenu();
                break;
            case "e":
                showList();
                displayMenu();
                break;
            case "f":
                break;

            default:
                System.out.println("Selección inválida. Por favor ingrese una opción correcta.");
                displayMenu();
                break;
        }
    }

    /**
     * Carga un archivo de contactos y lo agrega a la libreta de direcciones.
     */
    public static void loadFile() {
        System.out.println("Ingrese la ruta del archivo: ");
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String firstName = line.trim();
                String lastName = reader.readLine().trim();
                String street = reader.readLine().trim();
                String city = reader.readLine().trim();
                String state = reader.readLine().trim();
                int zip = Integer.parseInt(reader.readLine().trim());
                String email = reader.readLine().trim();
                String phone = reader.readLine().trim();
                reader.readLine(); // Read the blank line between entries

                AddressEntry entry = new AddressEntry(firstName, lastName, street, city, state, zip, email, phone);
                AddressBook.addressEntryList.add(entry);
            }
            System.out.println("Archivo cargado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato del archivo: " + e.getMessage());
        }
    }

    /**
     * Agrega una nueva entrada a la libreta de direcciones solicitando los detalles al usuario.
     */
    public static void addAddress() {
        Scanner in = new Scanner(System.in);
        System.out.println("Agregar un nuevo contacto");
        System.out.println("Nombre: ");
        String firstName = in.nextLine();
        System.out.println("Apellido: ");
        String lastName = in.nextLine();
        System.out.println("Calle: ");
        String street = in.nextLine();
        System.out.println("Ciudad: ");
        String city = in.nextLine();
        System.out.println("Estado: ");
        String state = in.nextLine();
        System.out.println("Código Postal: ");
        int zip = Integer.parseInt(in.nextLine());
        System.out.println("Correo Electrónico: ");
        String email = in.nextLine();
        System.out.println("Teléfono: ");
        String phone = in.nextLine();

        AddressEntry entry = new AddressEntry(firstName, lastName, street, city, state, zip, email, phone);
        AddressBook.addressEntryList.add(entry);
        System.out.println("Contacto agregado exitosamente.");
    }

    /**
     * Elimina una entrada de la libreta de direcciones basada en el nombre del contacto.
     */
    public static void deleteAddress() {
        System.out.println("Ingrese el nombre del contacto a eliminar: ");
        Scanner in = new Scanner(System.in);
        String search = in.nextLine();
        AddressBook.removeFromList(search);
    }

    /**
     * Busca una entrada en la libreta de direcciones basada en el nombre del contacto.
     */
    public static void findAddress() {
        System.out.println("Ingrese el nombre del contacto a buscar: ");
        Scanner in = new Scanner(System.in);
        String search = in.nextLine();
        AddressBook.findInList(search);
    }

    /**
     * Muestra todas las entradas de la libreta de direcciones.
     */
    public static void showList() {
        for (AddressEntry entry : AddressBook.addressEntryList) {
            System.out.println(entry.toString());
        }
    }
}