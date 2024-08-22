/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministradorEmpleado;

import java.time.LocalDate;

/**
 *
 * @author jcone
 */
public class Empleado {
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correo;
    private String puesto;
    private double salario;

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public Empleado(String id, String nombre, String telefono,LocalDate fechaNacimiento, String correo, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento =  fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado() {
        this("","","",LocalDate.now(),"","",0);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", correo=" + correo + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
    
    
}
