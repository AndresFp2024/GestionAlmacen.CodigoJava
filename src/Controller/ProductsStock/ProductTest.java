package Controller.ProductsStock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp() {
        // Creamos un producto de ejemplo antes de cada prueba
        PhisicLocation location = new PhisicLocation("Estante A", "Pasillo 1", "Alta");
        product = new Product("Teclado", location, "Proveedor1", "Electrónica", "25", "15", "100");
    }

    @Test
    public void testGetName() {
        assertEquals("Teclado", product.getName());
    }

    @Test
    public void testSetName() {
        product.setName("Ratón");
        assertEquals("Ratón", product.getName());
    }

    @Test
    public void testGetAndSetPhisicLocation() {
        PhisicLocation nuevaUbicacion = new PhisicLocation("Estante B", "Pasillo 2", "Media");
        product.setPhisicLocation(nuevaUbicacion);
        assertEquals(nuevaUbicacion, product.getPhisicLocation());
    }

    @Test
    public void testGetAndSetProductType() {
        product.setProductType("Periférico");
        assertEquals("Periférico", product.getProductType());
    }

    @Test
    public void testGetAndSetSellPrice() {
        product.setSellPrice("30");
        assertEquals("30", product.getSellPrice());
    }

    @Test
    public void testGetAndSetCost() {
        product.setCost("18");
        assertEquals("18", product.getCost());
    }

    @Test
    public void testGetAndSetSupplier() {
        product.setSupplier("ProveedorX");
        assertEquals("ProveedorX", product.getSupplier());
    }

    @Test
    public void testGetAndSetAmount() {
        product.setAmount("200");
        assertEquals("200", product.getAmount());
    }
}
