package ADDRESS_DATA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressEntryTest {
    
    @Test
    public void testConstructor() {
        AddressEntry entry = new AddressEntry("Roberto", "Zuniga", "Alamos", "Coatzacoalcos", "Veracruz", 12345, "robzun03@gmail.com", "9211234567");
        assertNotNull(entry);
        assertEquals("Roberto", entry.getFirstName());
        assertEquals("Zuniga", entry.getLastName());
        assertEquals("Alamos", entry.getStreet());
        assertEquals("Coatzacoalcos", entry.getCity());
        assertEquals("Veracruz", entry.getState());
        assertEquals(12345, entry.getZip());
        assertEquals("robzun03@gmail.com", entry.getEmail());
        assertEquals("9211234567", entry.getPhone());
    }

    @Test
    public void testToString() {
        AddressEntry entry = new AddressEntry("Roberto", "Zuniga", "Alamos", "Coatzacoalcos", "Veracruz", 12345, "robzun03@gmail.com", "9211234567");
        String expected = "Roberto Zuniga\nAlamos\nCoatzacoalcos, Veracruz c.p. 12345\nrobzun03@gmail.com\n9211234567\n";
        assertEquals(expected, entry.toString());
    }

    @Test
    public void testSettersAndGetters() {
        AddressEntry entry = new AddressEntry();
        entry.setFirstName("Roberto");
        entry.setLastName("Zuniga");
        entry.setStreet("Alamos");
        entry.setCity("Coatzacoalcos");
        entry.setState("Veracruz");
        entry.setZip(12345);
        entry.setEmail("robzun03@gmail.com");
        entry.setPhone("9211234567");

        assertEquals("Roberto", entry.getFirstName());
        assertEquals("Zuniga", entry.getLastName());
        assertEquals("Alamos", entry.getStreet());
        assertEquals("Coatzacoalcos", entry.getCity());
        assertEquals("Veracruz", entry.getState());
        assertEquals(12345, entry.getZip());
        assertEquals("robzun03@gmail.com", entry.getEmail());
        assertEquals("9211234567", entry.getPhone());
    }
}
