package Controller.ProductsStock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhisicLocationTest {

    private PhisicLocation ubicacion;

    @BeforeEach
    public void setUp() {
        // Creamos un objeto de prueba antes de cada test
        ubicacion = new PhisicLocation("Estante 1", "Pasillo A", "Alta");
    }

    @Test
    public void testGetShelf() {
        assertEquals("Estante 1", ubicacion.getShelf());
    }

    @Test
    public void testSetShelf() {
        ubicacion.setShelf("Estante 2");
        assertEquals("Estante 2", ubicacion.getShelf());
    }

    @Test
    public void testGetHall() {
        assertEquals("Pasillo A", ubicacion.getHall());
    }

    @Test
    public void testSetHall() {
        ubicacion.setHall("Pasillo B");
        assertEquals("Pasillo B", ubicacion.getHall());
    }

    @Test
    public void testGetHigh() {
        assertEquals("Alta", ubicacion.getHigh());
    }

    @Test
    public void testSetHigh() {
        ubicacion.setHigh("Media");
        assertEquals("Media", ubicacion.getHigh());
    }
}
