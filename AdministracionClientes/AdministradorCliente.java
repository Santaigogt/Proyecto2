/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionClientes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author jcone
 */
public class AdministradorCliente {

    private ArrayList<Cliente> clientes;

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public AdministradorCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes = new ArrayList();
    }

    public AdministradorCliente() {
        this(new ArrayList());

    }

    public void agregar(Cliente cliente) {
        clientes.add(cliente);
    }

    public void Actualizar(String id,String telefono, String correo) {
        if(clientes.iterator().next().getId().equals(id)){
            clientes.iterator().next().setCorreo(correo);
            clientes.iterator().next().setTelefono(telefono);
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro el cliente");
        }
    
    }

    public boolean Eliminar(String id) {
        for (Iterator<Cliente> it = this.clientes.iterator(); it.hasNext();) {
            if (id.equals(it.next().getId())) {
                it.remove();
                return true;
            }
        }
        return false;
    }
    
    public Cliente Buscar(String id){
        for (Cliente cliente : clientes) {
            if(id.equals(cliente.getId())){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "AdministradorCliente{" + "clientes=" + Arrays.toString(clientes.toArray()) + '}';
    }

}
