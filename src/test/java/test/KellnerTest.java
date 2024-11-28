package test;

import org.junit.jupiter.api.Test;

import vorlage.Kellner;

import static org.junit.jupiter.api.Assertions.*;

public class KellnerTest {

    @Test
    public void testKellnerConstructor() throws Exception {
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        assertEquals("Anna Schmidt", kellner.getName());
        assertEquals(101, kellner.mitarbeiterID);
    }

    @Test
    public void testKellnerShortName() throws Exception {
        // Arrange
        String shortName = "Bob"; // Name with 3 characters

        // Act & Assert
        Exception exception = assertThrows(Exception.class, () -> {
            new Kellner(shortName, 123); // Try to create a Person with an invalid name
        });

        // Verify the exception message
        assertEquals("Der Name der Person muss mindestens 5 Zeichen enthalten!", exception.getMessage());
    }


    @Test
    public void testSetName() throws Exception {
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        kellner.setName("Peter Müller");
        assertEquals("Peter Müller", kellner.getName());
    }

    @Test
    public void testSetKellnerID() throws Exception {
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        kellner.mitarbeiterID = 102;
        assertEquals(102, kellner.mitarbeiterID);
    }
}
