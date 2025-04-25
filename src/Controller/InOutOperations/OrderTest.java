package Controller.InOutOperations;

import Controller.ProductsStock.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    private Order order;
    private Product product;

    @BeforeEach
    public void setUp() {
        PhisicLocation ubicacion = new PhisicLocation("Estante A", "Pasillo 1", "Alta");
        product = new Product("Monitor", ubicacion, "ProveedorA", "Electrónica", "150", "100", "30");
        order = new Order(product, 3, true);  // 3 unidades del producto con coste 100
    }

    @Test
    public void testGetProduct() {
        assertEquals(product, order.getProduct());
    }

    @Test
    public void testSetProduct() {
        Product nuevo = new Product("Teclado", new PhisicLocation("B", "2", "Media"), "ProveedorB", "Accesorio", "30", "20", "50");
        order.setProduct(nuevo);
        assertEquals(nuevo, order.getProduct());
    }

    @Test
    public void testGetAndSetAmount() {
        assertEquals(3, order.getAmount());
        order.setAmount(5);
        assertEquals(5, order.getAmount());
    }

    @Test
    public void testGetAndSetMinAmount() {
        order.setMinAmount(2);
        assertEquals(2, order.getMinAmount());
    }

    @Test
    public void testGetAndSetValidate() {
        assertTrue(order.getValidate());
        order.setValidate(false);
        assertFalse(order.getValidate());
    }

    @Test
    public void testCalculatedCost() {
        // Coste del producto es 100, cantidad = 3 → 100 * 3 = 300.0
        assertEquals(300.0, order.CalculatedCost());
    }
}
