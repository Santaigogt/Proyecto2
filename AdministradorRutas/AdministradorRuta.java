/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministradorRutas;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author jcone
 */
public class AdministradorRuta {

    private HashSet<Ruta> rutas;
    private HashSet<String> listD;
  
    
    public HashSet<Ruta> getRutas() {
        return rutas;
    }

    public HashSet<String> getListD() {
        return listD;
    }
    
    
    public AdministradorRuta(HashSet<Ruta> rutas,HashSet<String> listD) {
        this.rutas = rutas = new HashSet();
        this.listD = listD;
    }
    
    public AdministradorRuta() {
        this(new HashSet(),new HashSet());
    }
    
    public void Agregar(Ruta ruta) {
        rutas.add(ruta);        
    }
    
    public void Actualizar(String id, String descripcion,String lisD) {
        for (Iterator<Ruta> it = rutas.iterator(); it.hasNext();) {
            if (it.next().getCodigo().equals(id)) {
                it.next().setDescripcion(descripcion);
                it.next().setListDestinos(lisD);
            }
        }
    }

    public boolean Eliminar(String id) {
        for (Iterator<Ruta> it = rutas.iterator(); it.hasNext();) {
            if (id.equals(it.next().getCodigo())) {
                it.remove();
                return true;
            }
        }
        return false;
    }
    
    public Ruta Buscar(String id) {
        for (Ruta ruta : rutas) {
            if (id.equals(ruta.getCodigo())) {
                return ruta;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "AdministradorRuta{" + "rutas=" + rutas +  '}';
    }
    
    
}
