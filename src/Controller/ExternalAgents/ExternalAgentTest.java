package Controller.ExternalAgents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExternalAgentTest {

    private ExternalAgent agent;

    @BeforeEach
    public void setUp() {
        agent = new ExternalAgent(
            "Javier López",
            "987654321",
            "Calle Falsa 123",
            1001,
            "javier@example.com",
            "Distribuidor"
        );
    }

    @Test
    public void testGetName() {
        assertEquals("Javier López", agent.getName());
    }

    @Test
    public void testSetName() {
        agent.setName("Laura Ruiz");
        assertEquals("Laura Ruiz", agent.getName());
    }

    @Test
    public void testGetPhoneNumber() {
        assertEquals("987654321", agent.getPhoneNumber());
    }

    @Test
    public void testSetPhoneNumber() {
        agent.setPhoneNumber("123456789");
        assertEquals("123456789", agent.getPhoneNumber());
    }

    @Test
    public void testGetAddress() {
        assertEquals("Calle Falsa 123", agent.getAddress());
    }

    @Test
    public void testSetAddress() {
        agent.setAddress("Av. Nueva 456");
        assertEquals("Av. Nueva 456", agent.getAddress());
    }

    @Test
    public void testGetId() {
        assertEquals(1001, agent.getId());
    }

    @Test
    public void testSetId() {
        agent.setId(2002);
        assertEquals(2002, agent.getId());
    }

    @Test
    public void testGetEmail() {
        assertEquals("javier@example.com", agent.getEmail());
    }

    @Test
    public void testSetEmail() {
        agent.setEmail("laura@example.com");
        assertEquals("laura@example.com", agent.getEmail());
    }

    @Test
    public void testGetFuntion() {
        assertEquals("Distribuidor", agent.getFuntion());
    }

    @Test
    public void testSetFuntion() {
        agent.setFuntion("Proveedor");
        assertEquals("Proveedor", agent.getFuntion());
    }
}
