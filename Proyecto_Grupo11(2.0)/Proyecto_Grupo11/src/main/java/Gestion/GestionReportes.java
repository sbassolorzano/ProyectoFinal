/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Aqui se maneja tanto para adminsitrador como para vendedor
package Gestion;
import Personas.Empleado;
import Personas.Cliente;
import Vehiculos.Vehiculo;//Importamos todas las clases de vehiculos
import Ventas.Venta;
import Ventas.Cotizacion;
import Promociones.Promocion;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
//Static para ser accesible desde cualquier ventana, evitando problemas internos
public class GestionReportes { //Creacion de las listas
    private static  ArrayList<Vehiculo> Listavehiculos = new ArrayList<>();
    private static  ArrayList<Empleado> Listaempleados = new ArrayList<>();
    private static  ArrayList<Cliente> Listaclientes = new ArrayList<>();
    private static  ArrayList<Venta> Listaventas = new ArrayList<>();
    private static  ArrayList<Cotizacion> Listacotizaciones = new ArrayList<>();
    private static ArrayList<Promocion> Listapromociones = new ArrayList<>();
    //Metodos get unicamente , los setters reemplazan el valor actual por uno nuevo , borrando los datos anterioriores y generando problemas en la lista
    
    //GETT
    public static ArrayList<Vehiculo> getListavehiculos() {
        return Listavehiculos;
    }

    public static ArrayList<Empleado> getListaempleados() {
        return Listaempleados;
    }

    public static ArrayList<Cliente> getListaclientes() {
        return Listaclientes;
    }

    public static ArrayList<Venta> getListaventas() {
        return Listaventas;
    }

    public static ArrayList<Cotizacion> getListacotizaciones() {
        return Listacotizaciones;
    }

    public static ArrayList<Promocion> getListapromociones() {
        return Listapromociones;
    }
    
    //Metdos agegar para guardar y registrar los datos en la interfaz (GUI)
    public static void agregarVehiculo (Vehiculo vehiculo){
        Listavehiculos.add(vehiculo);
    }
    public static void agregarEmpleado(Empleado empleado){
        Listaempleados.add(empleado);
    }
    public static void agregarClientes(Cliente cliente){
        Listaclientes.add(cliente);
    }
    public static void agregarVentas(Venta venta){
        Listaventas.add(venta);
    }
    public static void agregarPromociones(Promocion promo){
        Listapromociones.add(promo);
    }
    public static void agregarCotizacion(Cotizacion coti){
        Listacotizaciones.add(coti);
    }
    
    //Metodo para ingresar el boton
    public static Empleado buscarEmpleado(String usuario,String contraseña){
        for ( Empleado x : Listaempleados){ //Busca al empleado en la lista
            if(x.getUsuario().equals(usuario) && x.getContrasena().equals(contraseña)){
                return x; // Debe cumplir el usuario y contraseña, independiente si esta digitado en mayusculas o minusculasd
            }
        }
        return null ; // En caso no llegar a encontrar el usario
    }

    // Copia esto dentro de GestionConcesionaria.java
    
    
    

    
}
