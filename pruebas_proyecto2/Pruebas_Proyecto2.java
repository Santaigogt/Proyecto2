/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas_proyecto2;
import AdministracionClientes.AdministradorCliente;
import AdministracionClientes.Cliente;
import AdministradorPaquetes.Paquete;
import AdministradorRutas.AdministradorRuta;
import AdministradorRutas.Ruta;
import GestorEnvio.Envio;
import GestorEnvio.GestorEnvio;
import java.time.LocalDate;
import java.util.HashSet;

/**
 *
 * @author jcone
 */
public class Pruebas_Proyecto2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Envio envio = new Envio();
        Envio envio1 = new Envio();
        System.out.println(envio);
        System.out.println(envio1);
    }
}