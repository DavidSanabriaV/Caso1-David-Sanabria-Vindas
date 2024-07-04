/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1.david.sanabria;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Caso1DavidSanabria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facturas facturas = new Facturas();
        facturas.ProductosAutomotricesFactura();
        facturas.ProductosConstruccionFactura();
        facturas.ProductosElectronicosFactura();
        Vendedor empleado = new Vendedor();
        empleado.NombreEmpleado();
        empleado.codigoEmpleado();
        empleado.vehiculoEmpleado();
        empleado.SucursalEmpleado();
        

        //Variables
        int cantidadFacturas;
        double suma = 0;
        double bono=0;
        int puntos=0; 
        //Cantidad de facturas
        String lectura1;
        lectura1 = JOptionPane.showInputDialog("Ingrese la cantidad de facturas realizadas");
        cantidadFacturas = Integer.parseInt(lectura1);

        //repeticion de informacion
        for (int i = 0; i < cantidadFacturas; i++) {
            suma += facturas.MontoFactura();
            if (facturas.productosAutomotrices>= 1 && facturas.productosConstruccion >= 1 && facturas.productosElectronicos >= 1) {
                bono += facturas.montoFactura * 0.10;
            }
            if (facturas.productosElectronicos >= 3) {
                bono += facturas.montoFactura * 0.04;
            }
            if (facturas.productosElectronicos< 3) {
                bono += facturas.montoFactura * 0.02;
            }
            if (facturas.productosAutomotrices >= 4) {
                bono += facturas.montoFactura * 0.04;
            }
            if (facturas.productosAutomotrices < 3) {
                bono += facturas.montoFactura * 0.02;
            }
            if (facturas.productosConstruccion >= 1) {
                bono += facturas.montoFactura * 0.08;
            }
        }
            if (facturas.montoFactura >= 50000) {
             puntos += 1;
        }if (facturas.montoFactura >= 50000) {
             bono += facturas.montoFactura * 0.05;
          
        }
        if (cantidadFacturas>=10||suma>=300000) {
            bono += 20000;
            
        }

        JOptionPane.showMessageDialog(null, "El Agente Vendedor " + empleado.nombre+" codigo: "+empleado.codigo+"\n"+" en el mes de: "+facturas.mes+
        "\n"+"Vendio un total de: "+suma+"Obtuvo un total en comisiones de: "+bono+"\n"+" en facturas"+"\n"+"Puntos obtenidoa por el vendedor: "+puntos+"El Agente Vendedor "+empleado.vehiculo+" cuenta con vehiculo propio"+"\n"+" trabaja en la sucursal de: "+empleado.sucursal);
       

    }

}
