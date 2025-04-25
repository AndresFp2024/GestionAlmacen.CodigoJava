package Controller.ExternalAgents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    private Client client;

    @BeforeEach
    public void setUp() {
        client = new Client("Andrés", "CL001");
    }

    @Test
    public void testConstructor() {
        assertEquals("Andrés", client.getName());
        assertEquals("CL001", client.getId());
    }

    @Test
    public void testSetName() {
        client.setName("Cristina");
        assertEquals("Cristina", client.getName());
    }

    @Test
    public void testSetId() {
        client.setId("CL999");
        assertEquals("CL999", client.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Andrés", client.getName());
    }

    @Test
    public void testGetId() {
        assertEquals("CL001", client.getId());
    }
}
