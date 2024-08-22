/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEnvio;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jcone
 */
public class GestorEnvio {

    Queue<Envio> envios;

    public Queue<Envio> getEnvios() {
        return envios;
    }

    public GestorEnvio(Queue<Envio> envios) {
        this.envios = envios = new LinkedList();
    }

    public GestorEnvio() {
        this(new LinkedList());
    }

    public void registrar(Envio envio) {
        envios.add(envio);
    }

    public Envio buscar(int id) {
        for (Envio envio : envios) {
            if (id == envio.getId()) {
                return envio;
            }
        }
        return null;
    }
    
    public void despachar() {
        if (envios.peek().getPaquete().equals("En almacen")) {
            envios.peek().getPaquete().setDescripcion("Despachado");
        }
    }

    public void entregar() {
        if (envios.peek().getPaquete().equals("Despachado")) {
            envios.peek().getPaquete().setDestinario("Entregado");
        }
    }

    public void cancelar() {
        if (envios.peek().getPaquete().equals("En almacen")) {
            envios.peek().getPaquete().setDescripcion("Cancelado");
        }
    }

    @Override
    public String toString() {
        return "GestorEnvio{" + "envios=" + envios + '}';
    }
}
