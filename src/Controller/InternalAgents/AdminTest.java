package Controller.InternalAgents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdminTest {

    private Admin admin;

    @BeforeEach
    public void setUp() {
        // Creamos un administrador antes de cada prueba
        admin = new Admin("María", "admin123");
    }

    @Test
    public void testConstructorConParametros() {
        assertEquals("María", admin.getName());
        assertEquals("admin123", admin.getPassword());
    }

    @Test
    public void testConstructorVacio() {
        Admin adminVacio = new Admin();
        assertNull(adminVacio.getName());
        assertNull(adminVacio.getPassword());
    }

    @Test
    public void testSetName() {
        admin.setName("Luis");
        assertEquals("Luis", admin.getName());
    }

    @Test
    public void testSetPassword() {
        admin.setPassword("nuevoPass");
        assertEquals("nuevoPass", admin.getPassword());
    }

    @Test
    public void testGetName() {
        assertEquals("María", admin.getName());
    }

    @Test
    public void testGetPassword() {
        assertEquals("admin123", admin.getPassword());
    }
}
