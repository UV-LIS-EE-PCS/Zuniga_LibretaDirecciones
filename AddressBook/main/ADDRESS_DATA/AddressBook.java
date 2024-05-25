package ADDRESS_DATA;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static ArrayList<AddressEntry> addressEntryList = new ArrayList<>();

    public static void findInList(String search){
        for(int i = 0; i < addressEntryList.size(); i++){
            if (addressEntryList.get(i).firstName.equalsIgnoreCase(search)){
                System.out.println("Se ha encontrado el siguiente contacto: ");
                System.out.println(addressEntryList.get(i).toString());
            }
            else {
                System.out.println("No se han encontrado contactos con el nombre " + search + ".");
            }
        }
    }

        public static void removeFromList(String search){
            for(int i = 0; i < addressEntryList.size(); i++){
                if (addressEntryList.get(i).firstName.equalsIgnoreCase(search)){
                    System.out.println("Se ha encontrado el siguiente contacto: ");
                    System.out.println(addressEntryList.get(i).toString());
                    System.out.println("¿Desea eliminarlo?");
                    Scanner in = new Scanner(System.in);
                    String answer = in.nextLine();
                    switch (answer) {
                        case "si":
                            addressEntryList.remove(i);
                            System.out.println("Se ha eliminado el contacto.");
                            break;
                        case "no":
                            System.out.println("El contacto no fue eliminado.");
                            break;
                        default:
                            System.out.println("Respuesta inválida. Por favor ingrese 'si' o 'no'.");
                            removeFromList(search);
                            break;
                    }
                }
                else {
                    System.out.println("No se han encontrado contactos con el nombre " + search + ".");
                }
            }

    }
}
