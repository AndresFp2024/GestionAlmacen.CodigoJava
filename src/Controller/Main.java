package Controller;

import View.Warehouse.FrmStartWarehouse;

/**
 * Clase Main.
 * Punto de entrada de la aplicación.
 * Se encarga de lanzar la ventana principal del sistema de gestión de almacenes.
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * Crea y muestra la ventana principal del sistema.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {

        FrmStartWarehouse MainWindow = new FrmStartWarehouse();

        MainWindow.setVisible(true);

    }
}
