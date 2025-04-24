package Controller.InOutOperations;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase Delivery.
 * Representa una entrega de pedidos a un cliente, incluyendo los pedidos, el coste de transporte,
 * los impuestos, descuentos y el cliente asociado.
 * Implementa Serializable para permitir su persistencia, 
 * e implementa TotalCostInterface para calcular el coste total de la entrega.
 */
public class Delivery implements Serializable, TotalCostInterface {

    /** Lista de pedidos incluidos en la entrega */
    private ArrayList<Order> orderList;

    /** Coste de transporte de la entrega */
    private double transportationCost;

    /** Impuestos aplicables a la entrega */
    private double tax;

    /** Descuento aplicado a la entrega */
    private double discount;

    /** Cliente que recibe la entrega */
    private String client;

    /**
     * Constructor de la clase Delivery.
     * Inicializa todos los atributos de la entrega.
     * 
     * @param orderList lista de pedidos
     * @param transportationCost coste del transporte
     * @param tax impuestos aplicables
     * @param discount descuento aplicado
     * @param client cliente destinatario
     */
    public Delivery(ArrayList<Order> orderList, double transportationCost, double tax, double discount, String client) {
        this.orderList = orderList;
        this.transportationCost = transportationCost;
        this.tax = tax;
        this.discount = discount;
        this.client = client;
    }

    /**
     * Establece la lista de pedidos de la entrega.
     * @param orderList nueva lista de pedidos
     */
    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    /**
     * Devuelve la lista de pedidos de la entrega.
     * @return lista de pedidos
     */
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    /**
     * Establece el coste de transporte.
     * @param transportationCost nuevo coste de transporte
     */
    public void setTransportationCost(int transportationCost) {
        this.transportationCost = transportationCost;
    }

    /**
     * Devuelve el coste de transporte.
     * @return coste de transporte
     */
    public double getTransportationCost() {
        return transportationCost;
    }

    /**
     * Establece el valor del impuesto aplicado.
     * @param tax nuevo valor del impuesto
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * Devuelve el valor del impuesto aplicado.
     * @return impuesto aplicado
     */
    public double getTax() {
        return tax;
    }

    /**
     * Establece el valor del descuento aplicado.
     * @param discount nuevo valor del descuento
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * Devuelve el valor del descuento aplicado.
     * @return descuento aplicado
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Establece el nombre del cliente.
     * @param client nuevo cliente
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * Devuelve el nombre del cliente.
     * @return cliente
     */
    public String getClient() {
        return client;
    }

    /**
     * Calcula el coste total de la entrega.
     * Suma el coste de cada pedido, el transporte y los impuestos,
     * y luego aplica el descuento.
     * 
     * @return el coste total como un valor double
     */
    public double CalculatedCost() {
        double totalCost = 0;
        for (int i = 0; i < orderList.size(); i++) {
            totalCost += orderList.get(i).getAmount() * Integer.parseInt(orderList.get(i).getProduct().getSellPrice());
        }
        totalCost += transportationCost + tax - discount;
        return totalCost;
    }
}
