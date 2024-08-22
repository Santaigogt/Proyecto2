/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministradorPaquetes;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author jcone
 */
public class AdministradorPaquetes {

    private HashMap<String, Paquete> paquetes;

    public HashMap<String, Paquete> getPaquetes() {
        return paquetes;
    }

    public AdministradorPaquetes(HashMap<String, Paquete> paquetes) {
        this.paquetes = paquetes = new HashMap();
    }

    public AdministradorPaquetes() {
        this(new HashMap());
    }

    public void agregar(String id, Paquete paquete) {
        paquetes.put(id, paquete);
    }

    public void Actualizar(String id, String descripcion, String destinatario) {
        if (paquetes.containsKey(id)) {
            paquetes.get(id).setDescripcion(descripcion);
            paquetes.get(id).setDestinario(descripcion);

        }
    }

    public boolean Eliminar(String id) {
        if(paquetes.get(id).getCodigo().equals(id)){
            paquetes.remove(id);
            return true;
        }
        return false;
        
    }

    public Paquete Buscar(String id) {
        return paquetes.get(id);
    }

    @Override
    public String toString() {
        return "AdministradorPaquetes{" + "paquetes=" + paquetes + '}';
    }

}
