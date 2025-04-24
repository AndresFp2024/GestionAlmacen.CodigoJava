package Controller.ProductsStock;

import java.io.Serializable;

/**
 * Clase Product.
 * Representa un producto con sus características básicas como nombre, tipo, precio, proveedor, etc.
 * Implementa Serializable para permitir su persistencia.
 */
public class Product implements Serializable {

    /** Nombre del producto */
    private String name;

    /** Ubicación física del producto en el almacén */
    private PhisicLocation phisicLocation;

    /** Tipo o categoría del producto */
    private String productType;

    /** Precio de venta del producto */
    private String sellPrice;

    /** Coste del producto */
    private String cost;

    /** Cantidad disponible del producto */
    private String amount;

    /** Proveedor del producto */
    private String supplier;

    /**
     * Constructor de la clase Product.
     * Inicializa un nuevo producto con todos sus atributos.
     * 
     * @param name nombre del producto
     * @param phisicLocation ubicación física en el almacén
     * @param supplier proveedor del producto
     * @param productType tipo o categoría del producto
     * @param sellPrice precio de venta
     * @param cost coste de adquisición
     * @param amount cantidad disponible
     */
    public Product(String name, PhisicLocation phisicLocation, String supplier, String productType, String sellPrice, String cost, String amount) {
        this.name = name;
        this.phisicLocation = phisicLocation;
        this.supplier = supplier;
        this.productType = productType;
        this.cost = cost;
        this.sellPrice = sellPrice;
        this.amount = amount;
    }

    /**
     * Devuelve el nombre del producto.
     * @return el nombre
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del producto.
     * @param name nuevo nombre
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la ubicación física del producto.
     * @return la ubicación física
     */
    public PhisicLocation getPhisicLocation() {
        return phisicLocation;
    }

    /**
     * Establece la ubicación física del producto.
     * @param phisicLocation nueva ubicación física
     */
    public void setPhisicLocation(PhisicLocation phisicLocation) {
        this.phisicLocation = phisicLocation;
    }

    /**
     * Devuelve el tipo de producto.
     * @return el tipo
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * Establece el tipo de producto.
     * @param productType nuevo tipo
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * Devuelve el precio de venta.
     * @return el precio de venta
     */
    public String getSellPrice() {
        return this.sellPrice;
    }

    /**
     * Establece el precio de venta.
     * @param sellPrice nuevo precio de venta
     */
    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * Devuelve el coste del producto.
     * @return el coste
     */
    public String getCost() {
        return this.cost;
    }

    /**
     * Establece el coste del producto.
     * @param cost nuevo coste
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     * Devuelve el proveedor del producto.
     * @return el proveedor
     */
    public String getSupplier() {
        return this.supplier;
    }

    /**
     * Establece el proveedor del producto.
     * @param supplier nuevo proveedor
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    /**
     * Devuelve la cantidad disponible del producto.
     * @return la cantidad
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Establece la cantidad disponible del producto.
     * @param amount nueva cantidad
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
