package Controller.InOutOperations;

import java.io.Serializable;
import Controller.ProductsStock.*;

/**
 * Clase Order.
 * Representa un pedido de un producto, incluyendo la cantidad solicitada,
 * la validación del pedido y la capacidad de calcular su coste total.
 * Implementa Serializable para permitir su persistencia,
 * e implementa TotalCostInterface para calcular el coste del pedido.
 */
public class Order implements Serializable, TotalCostInterface {

    /** Producto solicitado en el pedido */
    private Product product;

    /** Cantidad mínima para considerar válido el pedido */
    private int minAmount;

    /** Cantidad real del producto solicitada */
    private int amount;

    /** Indica si el pedido ha sido validado */
    private boolean validate;

    /**
     * Constructor de la clase Order.
     * Inicializa un pedido con el producto, la cantidad y el estado de validación.
     * 
     * @param product producto solicitado
     * @param amount cantidad solicitada
     * @param validate si el pedido está validado
     */
    public Order(Product product, int amount, boolean validate) {
        this.product = product;
        this.amount = amount;
        this.validate = validate;
    }

    /**
     * Devuelve el producto del pedido.
     * @return el producto
     */
    public Product getProduct() {
        return this.product;
    }

    /**
     * Establece el producto del pedido.
     * @param product nuevo producto
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Devuelve la cantidad mínima requerida para el pedido.
     * @return la cantidad mínima
     */
    public int getMinAmount() {
        return this.minAmount;
    }

    /**
     * Establece la cantidad mínima requerida para el pedido.
     * @param minAmount nueva cantidad mínima
     */
    public void setMinAmount(int minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * Devuelve la cantidad solicitada del producto.
     * @return la cantidad solicitada
     */
    public int getAmount() {
        return this.amount;
    }

    /**
     * Establece la cantidad solicitada del producto.
     * @param amount nueva cantidad solicitada
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Devuelve el estado de validación del pedido.
     * @return true si está validado, false si no
     */
    public boolean getValidate() {
        return validate;
    }

    /**
     * Establece el estado de validación del pedido.
     * @param validate nuevo estado de validación
     */
    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    /**
     * Calcula el coste total del pedido.
     * Multiplica el coste del producto por la cantidad solicitada.
     * 
     * @return el coste total como un valor double
     */
    public double CalculatedCost() {
        return Integer.parseInt(product.getCost()) * amount;
    }
}
