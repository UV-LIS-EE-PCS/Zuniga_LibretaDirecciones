package ADDRESS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ADDRESS_DATA.AddressBook;
import ADDRESS_DATA.AddressEntry;

public class Menu {
    public static void displayMenu(){
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
    
public static void loadFile(){
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

    public static void addAddress(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String firstName = in.nextLine();
        System.out.println("Ingrese el apellido: ");
        String lastName = in.nextLine();
        System.out.println("Ingrese la calle: ");
        String street = in.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String city = in.nextLine();
        System.out.println("Ingrese el estado: ");
        String state = in.nextLine();
        System.out.println("Ingrese el correo electrónico: ");
        String email = in.nextLine();
        System.out.println("Ingrese el número de teléfono: ");
        String phone = in.nextLine();
        System.out.println("Ingrese el código postal: ");
        int zip = in.nextInt();

        AddressEntry newAddress = new AddressEntry(firstName, lastName, street, city, state, zip, email, phone);
        AddressBook.addressEntryList.add(newAddress);
    }

    public static void deleteAddress(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre del contaco a buscar: ");
        String search = in.nextLine();
        AddressBook.removeFromList(search);
    }

    public static void findAddress(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre del contaco a buscar: ");
        String search = in.nextLine();
        AddressBook.findInList(search);
    }

    public static void showList(){
        if (AddressBook.addressEntryList.isEmpty()){
            System.out.println("No hay contactos guardados.");
        }
        else {
        System.out.println(AddressBook.addressEntryList);
        }
    }
}