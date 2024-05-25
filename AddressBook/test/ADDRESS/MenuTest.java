package ADDRESS;

import ADDRESS_DATA.AddressBook;
import ADDRESS_DATA.AddressEntry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.SystemErrRule;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

@ExtendWith(SystemOutRule.class)
@ExtendWith(SystemErrRule.class)
@ExtendWith(TextFromStandardInputStream.class)
public class MenuTest {

    @BeforeEach
    public void setUp() {
        AddressBook.addressEntryList.clear();
    }

    @Test
    public void testDisplayMenuLoadFile() {
        String input = "a\n";
        TextFromStandardInputStream systemIn = emptyStandardInputStream();
        systemIn.provideText(input);

        SystemOutRule systemOut = new SystemOutRule().enableLog();
        Menu.displayMenu();
        
        String output = systemOut.getLog();
        assertTrue(output.contains("Ingrese la ruta del archivo:"));
    }

    @Test
    public void testAddAddress() {
        String input = "b\nRoberto\nZuniga\nAlamos\nCoatzacoalcos\nVeracruz\nrobzun03@gmail.com\n9211234567\n12345\n";
        TextFromStandardInputStream systemIn = emptyStandardInputStream();
        systemIn.provideText(input);

        SystemOutRule systemOut = new SystemOutRule().enableLog();
        Menu.displayMenu();
        
        assertFalse(AddressBook.addressEntryList.isEmpty());
        AddressEntry entry = AddressBook.addressEntryList.get(0);
        assertEquals("Roberto", entry.getFirstName());
        assertEquals("Zuniga", entry.getLastName());
    }

    @Test
    public void testDeleteAddress() {
        AddressEntry entry = new AddressEntry("Roberto", "Zuniga", "Alamos", "Coatzacoalcos", "Veracruz", 12345, "robzun03@gmail.com", "9211234567");
        AddressBook.addressEntryList.add(entry);
        
        String input = "c\nRoberto\nsi\n";
        TextFromStandardInputStream systemIn = emptyStandardInputStream();
        systemIn.provideText(input);

        SystemOutRule systemOut = new SystemOutRule().enableLog();
        Menu.displayMenu();
        
        assertTrue(AddressBook.addressEntryList.isEmpty());
    }

    @Test
    public void testFindAddress() {
        AddressEntry entry = new AddressEntry("Roberto", "Zuniga", "Alamos", "Coatzacoalcos", "Veracruz", 12345, "robzun03@gmail.com", "9211234567");
        AddressBook.addressEntryList.add(entry);

        String input = "d\nRoberto\n";
        TextFromStandardInputStream systemIn = emptyStandardInputStream();
        systemIn.provideText(input);

        SystemOutRule systemOut = new SystemOutRule().enableLog();
        Menu.displayMenu();
        
        String output = systemOut.getLog();
        assertTrue(output.contains("Se ha encontrado el siguiente contacto:"));
    }

    @Test
    public void testShowList() {
        AddressEntry entry1 = new AddressEntry("Roberto", "Zuniga", "Alamos", "Coatzacoalcos", "Veracruz", 12345, "robzun03@gmail.com", "9211234567");
        AddressEntry entry2 = new AddressEntry("Henry", "Vazquez", "Santa Isabel", "Acayucan", "Veracruz", 54321, "henrydanger@gmail.com", "9247654321");
        AddressBook.addressEntryList.add(entry1);
        AddressBook.addressEntryList.add(entry2);

        String input = "e\n";
        TextFromStandardInputStream systemIn = emptyStandardInputStream();
        systemIn.provideText(input);

        SystemOutRule systemOut = new SystemOutRule().enableLog();
        Menu.displayMenu();
        
        String output = systemOut.getLog();
        assertTrue(output.contains("Roberto Zuniga"));
        assertTrue(output.contains("Henry Vazquez"));
    }
}
