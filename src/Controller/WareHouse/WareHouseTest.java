package Controller.WareHouse;

import Controller.InternalAgents.Admin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WareHouseTest {

    private WareHouse almacen;
    private Admin admin;

    @BeforeEach
    public void setUp() {
        admin = new Admin("Carlos", "admin123");
        almacen = new WareHouse("Central", "Calle Mayor 15", admin);
    }

    @Test
    public void testGetName() {
        assertEquals("Central", almacen.getName());
    }

    @Test
    public void testSetName() {
        almacen.setName("Almacén Norte");
        assertEquals("Almacén Norte", almacen.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("Calle Mayor 15", almacen.getAddress());
    }

    @Test
    public void testSetAddress() {
        almacen.setAddress("Avenida Principal 45");
        assertEquals("Avenida Principal 45", almacen.getAddress());
    }

    @Test
    public void testGetAdmin() {
        assertEquals(admin, almacen.getAdmin());
        assertEquals("Carlos", almacen.getAdmin().getName());
    }

    @Test
    public void testSetAdmin() {
        Admin nuevoAdmin = new Admin("Lucía", "admin456");
        almacen.setAdmin(nuevoAdmin);
        assertEquals(nuevoAdmin, almacen.getAdmin());
        assertEquals("Lucía", almacen.getAdmin().getName());
    }

    @Test
    public void testToString() {
        String textoEsperado = "Name : Central\nAddress : Calle Mayor 15\nAdmin : Carlos";
        assertEquals(textoEsperado, almacen.toString());
    }
}
