/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministradorEmpleado;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author jcone
 */
public class AdministradorEmpleado {

    private ArrayList<Empleado> empleados;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public AdministradorEmpleado(ArrayList<Empleado> empleados) {
        this.empleados = empleados = new ArrayList();
    }

    public AdministradorEmpleado() {
        this(new ArrayList());
    }

    public void Agregar(Empleado empleado) {
        empleados.add(empleado);
    }

    public void Actualizar(String id, String puest, String tel, String email,
            double salario) {
        for (Iterator<Empleado> it = empleados.iterator(); it.hasNext();) {
            if (id.equals(it.next().getId())) {
                it.next().setCorreo(email);
                it.next().setPuesto(puest);
                it.next().setSalario(salario);
                it.next().setTelefono(tel);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ningun empleado");
            }
        }

    }

    public boolean Eliminar(String id) {
        for (Iterator<Empleado> it = empleados.iterator(); it.hasNext();) {
            if (id.equals(it.next().getId())) {
                it.remove();
                return true;
            }
        }
        return false;
    }
    public Empleado Buscar(String id) {
        for (Empleado empleado : empleados) {
            if (id.equals(empleado.getId())) {
                return empleado;
            }
        }
        return null;
    }
}
