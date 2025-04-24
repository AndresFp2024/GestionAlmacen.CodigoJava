package Controller.ExternalAgents;

/**
 * Clase ExternalAgent.
 * Representa un agente externo que interactúa con el sistema, como un cliente o proveedor.
 * Contiene información general como nombre, teléfono, dirección, correo, etc.
 * Esta clase puede ser extendida por otras más específicas.
 */
public class ExternalAgent {

    /** Nombre del agente externo */
    protected String name;

    /** Número de teléfono del agente */
    protected String phoneNumber;

    /** Dirección del agente */
    protected String address;

    /** Identificador numérico del agente */
    protected int id;

    /** Correo electrónico del agente */
    protected String email;

    /** Función que desempeña el agente en el sistema */
    protected String funtion;

    /**
     * Constructor de la clase ExternalAgent.
     * Inicializa todos los atributos del agente externo.
     * 
     * @param name nombre del agente
     * @param phoneNumber número de teléfono
     * @param address dirección
     * @param id identificador numérico
     * @param email correo electrónico
     * @param funtion función del agente
     */
    public ExternalAgent(String name, String phoneNumber, String address, int id, String email, String funtion) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.id = id;
        this.email = email;
        this.funtion = funtion;
    }

    /**
     * Devuelve el nombre del agente.
     * @return nombre del agente
     */
    public String getName() {
        return this.name;
    }

    /**
     * Establece el nombre del agente.
     * @param name nuevo nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el número de teléfono del agente.
     * @return número de teléfono
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Establece el número de teléfono del agente.
     * @param phoneNumber nuevo número de teléfono
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Devuelve la dirección del agente.
     * @return dirección
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Establece la dirección del agente.
     * @param address nueva dirección
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Devuelve el identificador del agente.
     * @return identificador numérico
     */
    public int getId() {
        return this.id;
    }

    /**
     * Establece el identificador del agente.
     * @param id nuevo identificador
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el correo electrónico del agente.
     * @return correo electrónico
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Establece el correo electrónico del agente.
     * @param email nuevo correo
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve la función del agente en el sistema.
     * @return función
     */
    public String getFuntion() {
        return this.funtion;
    }

    /**
     * Establece la función del agente en el sistema.
     * @param funtion nueva función
     */
    public void setFuntion(String funtion) {
        this.funtion = funtion;
    }
}
