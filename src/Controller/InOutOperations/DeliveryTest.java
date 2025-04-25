package Controller.InOutOperations;

import Controller.ProductsStock.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class DeliveryTest {

    private Delivery delivery;
    private ArrayList<Order> pedidos;

    @BeforeEach
    public void setUp() {
        // Crear productos y pedidos ficticios
        PhisicLocation ubicacion = new PhisicLocation("Estante 1", "Pasillo A", "Alta");
        Product producto1 = new Product("Monitor", ubicacion, "Proveedor1", "Electrónica", "200", "150", "10");
        Product producto2 = new Product("Teclado", ubicacion, "Proveedor1", "Electrónica", "50", "30", "20");

        Order pedido1 = new Order(producto1, 2, true); // 200 * 2 = 400
        Order pedido2 = new Order(producto2, 3, true); // 50 * 3 = 150

        pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        delivery = new Delivery(pedidos, 25.0, 10.0, 20.0, "Cliente A");
    }

    @Test
    public void testGetOrderList() {
        assertEquals(2, delivery.getOrderList().size());
    }

    @Test
    public void testSetOrderList() {
        ArrayList<Order> nuevaLista = new ArrayList<>();
        delivery.setOrderList(nuevaLista);
        assertEquals(0, delivery.getOrderList().size());
    }

    @Test
    public void testGetAndSetTransportationCost() {
        delivery.setTransportationCost(30);
        assertEquals(30.0, delivery.getTransportationCost());
    }

    @Test
    public void testGetAndSetTax() {
        delivery.setTax(15.0);
        assertEquals(15.0, delivery.getTax());
    }

    @Test
    public void testGetAndSetDiscount() {
        delivery.setDiscount(5.0);
        assertEquals(5.0, delivery.getDiscount());
    }

    @Test
    public void testGetAndSetClient() {
        delivery.setClient("Cliente B");
        assertEquals("Cliente B", delivery.getClient());
    }

    @Test
    public void testCalculatedCost() {
        // (200 * 2) + (50 * 3) = 400 + 150 = 550
        // + transporte 25 + impuestos 10 - descuento 20 = 565
        assertEquals(565.0, delivery.CalculatedCost());
    }
}
