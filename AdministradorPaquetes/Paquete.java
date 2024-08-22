/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministradorPaquetes;

/**
 *
 * @author jcone
 */
public class Paquete {
    private String codigo;
    private String descripcion;
    private double peso;
    private String remitente;
    private String destinario;
    private String estado;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    
    
    
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDestinario() {
        return destinario;
    }

    public String getEstado() {
        return estado;
    }
    
    public Paquete(String codigo, double peso, String remitente, String destinario, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion ;
        this.peso = peso;
        this.remitente = remitente;
        this.destinario = destinario;
        this.estado = "En almacen";
    }

    public Paquete() {
        this("",0,"","","");
    }

    @Override
    public String toString() {
        return "Paquete{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", peso=" + peso + ", remitente=" + remitente + ", destinario=" + destinario + ", estado=" + estado + '}';
    }
    
}
