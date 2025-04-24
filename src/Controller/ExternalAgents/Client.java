package Controller.ExternalAgents;

import java.io.Serializable;

/**
 * Clase Client.
 * Representa un cliente del sistema que realiza pedidos o recibe entregas.
 * Contiene información básica como el nombre y el identificador del cliente.
 * Implementa Serializable para permitir su persistencia.
 */
public class Client implements Serializable {

    /** Nombre del cliente */
    private String name;

    /** Identificador del cliente */
    private String id;

    /**
     * Constructor de la clase Client.
     * Inicializa el cliente con su nombre e identificador.
     * 
     * @param name nombre del cliente
     * @param id identificador del cliente
     */
    public Client(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Establece el nombre del cliente.
     * @param name nuevo nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el nombre del cliente.
     * @return nombre del cliente
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el identificador del cliente.
     * @param id nuevo identificador
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Devuelve el identificador del cliente.
     * @return identificador del cliente
     */
    public String getId() {
        return id;
    }
}
