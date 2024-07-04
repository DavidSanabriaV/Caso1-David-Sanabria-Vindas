/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1.david.sanabria;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Facturas {
    //Atributos
    public String nombreCliente;
    public int cedulaCliente;
    public int codigoFactura;
    public double montoFactura;
    public int mes;
    public int productosElectronicos;
    public int productosAutomotrices;
    public int productosConstruccion;
    
    //Solicitud de nombre cliente
    public String NombreCliente() {
        nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del Cliente");
        return nombreCliente;

    }
    //Solicitud de Cedula Cliente
    public int CedulaCliente() {
        String lectura1;
        lectura1 = JOptionPane.showInputDialog("Ingrese el numero de cedula del cliente");
        cedulaCliente = Integer.parseInt(lectura1);
        return cedulaCliente;

    }
    //Solicitud de Codigo Factura
    public int CodigoFactura() {
        String lectura2;
        lectura2 = JOptionPane.showInputDialog("Ingrese el codigo de factura");
        codigoFactura = Integer.parseInt(lectura2);
        return codigoFactura;

    }
    //Solicitud de Monto Factura
    public double MontoFactura() {
        String lectura3;
        lectura3 = JOptionPane.showInputDialog("Ingrese el monto de la factura");
        montoFactura = Double.parseDouble(lectura3);
        return montoFactura;
    }
    //Solicitud de Mes Factura
    
    public int MesFactura() {
        String respuesta="";
        String lectura4;
        lectura4 = JOptionPane.showInputDialog("Ingrese el mes de la factura");
        mes = Integer.parseInt(lectura4);
       String lectura1;
        lectura1 = JOptionPane.showInputDialog("Ingrese el numero del mes de la compra");
        mes = Integer.parseInt(lectura1);
        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "Enero");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Febrero");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Marzo");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Mayo");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Junio");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Julio");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Septiembre");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Octubre");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Noviembre");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Diciembre");
                break;
        }
        return mes;
    }
    //Solicitud de Productos Electronicos
    public int ProductosElectronicosFactura() {
        String lectura5;
        lectura5 = JOptionPane.showInputDialog("Ingrese la cantidad de productos electronicos");
        productosElectronicos = Integer.parseInt(lectura5);  
        return productosElectronicos;
    }
    //Solicitud de productosAutomotrices
    public int ProductosAutomotricesFactura() {
        String lectura6;
        lectura6 = JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices");
        productosAutomotrices = Integer.parseInt(lectura6);  
        return productosAutomotrices;
    }
    //Solicitud de productosConstruccion
    public int ProductosConstruccionFactura() {
        String lectura7;
        lectura7 = JOptionPane.showInputDialog("Ingrese la cantidad de productos de construccion");
        productosConstruccion = Integer.parseInt(lectura7);  
        return productosConstruccion;
    }
    
}
