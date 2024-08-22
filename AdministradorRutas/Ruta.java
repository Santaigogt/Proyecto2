/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministradorRutas;

import java.util.HashSet;

/**
 *
 * @author jcone
 */
public class Ruta {

    private String codigo;
    private String nombre;
    private String descripcion;
    private String listDestinos;   

    public void setListDestinos(String listDestinos) {
        this.listDestinos = listDestinos;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getListDestinos() {
        return listDestinos;
    }

    

    public Ruta(String codigo, String nombre, String descripcion,String listDestinos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listDestinos = listDestinos;
    }

    public Ruta() {
        this("","","","");
    }

    @Override
    public String toString() {
        return "Ruta{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", listDestinos=" + listDestinos + '}';
    }

    
}
