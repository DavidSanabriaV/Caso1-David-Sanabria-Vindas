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
public class Vendedor {

    //Atributos
    public String nombre;
    public int cedula;
    public int codigo;
    public String sucursal;
    public String vehiculo;

    //Solicitud de nombre
    public String NombreEmpleado() {
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        return nombre;

    }

    //Solicitud de cedula
    public int CedulaEmpleado() {
        String lectura1;
        lectura1 = JOptionPane.showInputDialog("Ingrese su numero de cedula");
        cedula = Integer.parseInt(lectura1);
        return cedula;
    }

    //Solicitud de codigo
    public int codigoEmpleado() {
        String lectura2;
        lectura2 = JOptionPane.showInputDialog("Ingrese su numero de codigo");
        codigo = Integer.parseInt(lectura2);
        return codigo;
    }

    //Solicitud de sucursal
    public String SucursalEmpleado() {
        sucursal = JOptionPane.showInputDialog("Ingrese el nombre de su sucursal");
        return sucursal;
    }

    //Solicitud de vehiculo
    public String vehiculoEmpleado() {
        vehiculo = JOptionPane.showInputDialog("Ingrese si tiene vehiculo");
        return vehiculo;
    }

}
