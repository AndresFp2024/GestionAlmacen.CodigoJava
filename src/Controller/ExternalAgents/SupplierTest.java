package Controller.ExternalAgents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SupplierTest {

    private Supplier supplier;

    @BeforeEach
    public void setUp() {
        supplier = new Supplier("ProveedorX", "SUP001");
    }

    @Test
    public void testConstructor() {
        assertEquals("ProveedorX", supplier.getName());
        assertEquals("SUP001", supplier.getId());
    }

    @Test
    public void testSetName() {
        supplier.setName("ProveedorY");
        assertEquals("ProveedorY", supplier.getName());
    }

    @Test
    public void testSetId() {
        supplier.setId("SUP999");
        assertEquals("SUP999", supplier.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("ProveedorX", supplier.getName());
    }

    @Test
    public void testGetId() {
        assertEquals("SUP001", supplier.getId());
    }
}
