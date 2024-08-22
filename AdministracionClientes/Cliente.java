/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionClientes;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author jcone
 */
public class Cliente {
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String correo;
    private String telefono;

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Cliente(String id, String nombre, LocalDate fechaNacimiento, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Cliente() {
        this("","",LocalDate.now(),"","");
    }
    
     public int obtenerEdad() {
        if (fechaNacimiento != null) {
            return Period.between(fechaNacimiento, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
    
    
    
}
