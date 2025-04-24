package Controller.ExternalAgents;

import java.io.Serializable;

/**
 * Clase Supplier.
 * Representa un proveedor que suministra productos al sistema.
 * Contiene información básica como el nombre y el identificador del proveedor.
 * Implementa Serializable para permitir su persistencia.
 */
public class Supplier implements Serializable {

    /** Nombre del proveedor */
    private String name;

    /** Identificador del proveedor */
    private String id;

    /**
     * Constructor de la clase Supplier.
     * Inicializa un proveedor con su nombre e identificador.
     * 
     * @param name nombre del proveedor
     * @param id identificador del proveedor
     */
    public Supplier(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Establece el nombre del proveedor.
     * @param name nuevo nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el nombre del proveedor.
     * @return nombre del proveedor
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el identificador del proveedor.
     * @param id nuevo identificador
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Devuelve el identificador del proveedor.
     * @return identificador del proveedor
     */
    public String getId() {
        return id;
    }
}
