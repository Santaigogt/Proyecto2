/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEnvio;

import AdministracionClientes.Cliente;
import AdministradorPaquetes.Paquete;
import AdministradorRutas.Ruta;
import java.time.LocalDate;

/**
 *
 * @author jcone
 */
public class Envio {

    private static int cont = 1;
    private int id;
    private Cliente cliente;
    private Paquete paquete;
    private Ruta ruta;
    private LocalDate fechEnvio;
    private LocalDate fechEntrega;
    private double precioApagar;

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public LocalDate getFechEnvio() {
        return fechEnvio;
    }

    public LocalDate getFechEntrega() {
        return fechEntrega;
    }

    public double getPrecioApagar() {
        
        return precioApagar;
    }

    public double precioTarifa(){
        if (paquete.getPeso() == 1) {
            double precioApagar = 1 * 2100 / paquete.getPeso();
            return precioApagar;
        } else if (paquete.getPeso() > 1) {
            double precioApagar = 1 * 2100 / paquete.getPeso();
            return precioApagar;
        }
        return -1;
    }
    public static int auto() {
        return cont++;
    }

    public Envio(Cliente cliente, Paquete paquete, Ruta ruta, LocalDate fechEnvio, LocalDate fechEntrega, double precioApagar) {
        this.id = auto();
        this.cliente = cliente;
        this.paquete = paquete;
        this.ruta = ruta;
        this.fechEnvio = fechEnvio;
        this.fechEntrega = fechEntrega;
        this.precioApagar = precioApagar;

    }

    public Envio() {
        this(null, null, null, LocalDate.now(), LocalDate.now(), 0);
    }

    @Override
    public String toString() {
        return "Envio{" + "id=" + id + ", cliente=" + cliente + ", paquete=" + paquete + ", ruta=" + ruta + ", fechEnvio=" + fechEnvio + ", fechEntrega=" + fechEntrega + ", precioApagar=" + precioApagar + '}';
    }

}
