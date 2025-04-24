package Controller.InternalAgents;

import java.io.Serializable;

/**
 * Clase Admin.
 * Representa a un administrador del sistema, que tiene un nombre y una contraseña.
 * Implementa Serializable para permitir su almacenamiento o transmisión.
 */
public class Admin implements Serializable {

    /** Nombre del administrador */
    private String name;

    /** Contraseña del administrador */
    private String password;

    /**
     * Constructor vacío de la clase Admin.
     * Crea un objeto Admin sin inicializar atributos.
     */
    public Admin() {
    }

    /**
     * Constructor de la clase Admin.
     * Inicializa el administrador con un nombre y una contraseña.
     * 
     * @param name nombre del administrador
     * @param password contraseña del administrador
     */
    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * Establece el nombre del administrador.
     * @param name nuevo nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el nombre del administrador.
     * @return el nombre
     */
    public String getName() {
        return name;
    }

    /**
     * Establece la contraseña del administrador.
     * @param password nueva contraseña
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Devuelve la contraseña del administrador.
     * @return la contraseña
     */
    public String getPassword() {
        return password;
    }
}
