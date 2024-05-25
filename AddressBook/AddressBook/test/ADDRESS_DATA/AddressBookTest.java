package ADDRESS_DATA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class AddressBookTest {

    @Test
    public void testAddAddress() {
        AddressEntry entry = new AddressEntry("Roberto", "Zuniga", "Alamos", "Coatzacoalcos", "Veracruz", 12345, "robzun03@gmail.com", "9211234567");
        AddressBook.addressEntryList = new ArrayList<>();
        AddressBook.addressEntryList.add(entry);
        assertTrue(AddressBook.addressEntryList.contains(entry));
    }

    @Test
    public void testFindInList() {
        AddressEntry entry = new AddressEntry("Roberto", "Zuniga", "Alamos", "Coatzacoalcos", "Veracruz", 12345, "robzun03@gmail.com", "9211234567");
        AddressBook.addressEntryList = new ArrayList<>();
        AddressBook.addressEntryList.add(entry);

        AddressBook.findInList("Roberto");
        // No assertion needed, just check the output manually for now
    }

    @Test
    public void testRemoveFromList() {
        AddressEntry entry = new AddressEntry("Roberto", "Zuniga", "Alamos", "Coatzacoalcos", "Veracruz", 12345, "robzun03@gmail.com", "9211234567");
        AddressBook.addressEntryList = new ArrayList<>();
        AddressBook.addressEntryList.add(entry);
        AddressBook.removeFromList("Roberto");

        assertFalse(AddressBook.addressEntryList.contains(entry));
    }
}
