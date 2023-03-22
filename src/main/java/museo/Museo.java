/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ERICK
 */
public class Museo {

    private String nombre;
    private String direccion;
    private List<Empleado> empleado;
    private List<Sala> sala;

    public Museo(String nombre, String direccion, List<Empleado> empleado, List<Sala> sala) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleado = empleado;
        this.sala = sala;
    }       

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public List<Sala> getSala() {
        return sala;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }
    
    public void contratar(Empleado emp){
        
        empleado.add(emp);
       
    }
    
    public void despedir(Empleado emp){ // No hace falta que devuelva ya que queremos realizar una modificación dentro de la lista que ya tenemos creada cuando instanciamos el museo
        
        empleado.remove(emp);
        
    }
    
    public void añadirSala(Sala s){        
        
        sala.add(s);
        
    }
    
    public void quitarSala(Sala s){

        sala.remove(s);
    }

    @Override
    public String toString() {
        return "Museo{" + "nombre=" + nombre + "\rdireccion=" + direccion + "\rempleado=" + empleado + "\rsala=" + sala + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
