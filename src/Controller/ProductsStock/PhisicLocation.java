package Controller.ProductsStock;

import java.io.Serializable;

/**
 * Clase PhisicLocation.
 * Representa la ubicación física de un producto dentro del almacén,
 * incluyendo pasillo, estante y altura.
 */
public class PhisicLocation implements Serializable {

    /** Número o identificador del estante */
    private String shelf;

    /** Número o identificador del pasillo */
    private String hall;

    /** Nivel o altura del estante */
    private String high;

    /**
     * Constructor de la clase PhisicLocation.
     * Inicializa una ubicación física con los datos proporcionados.
     * 
     * @param shelf número del estante
     * @param hall número del pasillo
     * @param high altura del estante
     */
    public PhisicLocation(String shelf, String hall, String high) {
        this.hall = hall;
        this.high = high;
        this.shelf = shelf;
    }

    /**
     * Devuelve el número del pasillo.
     * @return el pasillo
     */
    public String getHall() {
        return this.hall;
    }

    /**
     * Establece el número del pasillo.
     * @param hall nuevo valor del pasillo
     */
    public void setHall(String hall) {
        this.hall = hall;
    }

    /**
     * Devuelve la altura del estante.
     * @return la altura
     */
    public String getHigh() {
        return this.high;
    }

    /**
     * Establece la altura del estante.
     * @param high nueva altura
     */
    public void setHigh(String high) {
        this.high = high;
    }

    /**
     * Devuelve el número del estante.
     * @return el estante
     */
    public String getShelf() {
        return shelf;
    }

    /**
     * Establece el número del estante.
     * @param shelf nuevo valor del estante
     */
    public void setShelf(String shelf) {
        this.shelf = shelf;
    }
}
