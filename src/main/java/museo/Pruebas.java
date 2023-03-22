/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ERICK
 */
public class Pruebas {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList();
        
        // Empleados
        Monitor monitor1 = new Monitor("09123423T", "Samantha", LocalTime.of(4, 0));
        Vigilante vigilante1 = new Vigilante("98127312H", "Carlos", LocalTime.of(6, 0));
        Conservadores conservadorPictorico = new Conservadores(TipoConservador.PICTÓRICO, "09812322K", "Eduardo", LocalTime.of(6, 0));
        Conservadores conservadorEscultorico = new Conservadores(TipoConservador.ESCULTÓRICO, "12092343R", "Fernando", LocalTime.of(4, 0));

        // Polimorfismo en empleados
        empleados.add(vigilante1);
        empleados.add(conservadorPictorico);
        empleados.add(conservadorEscultorico);
        
        System.out.println("----------- EMPLEADOS ---------------");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        
        // Obras        
        Obra obra1 = new Obra(1, "Leonardo da Vinci", TipoObras.CUADRO);
        Obra obra2 = new Obra(2, "Pablo Picasso", TipoObras.CUADRO);
        Obra obra3 = new Obra(3, "Alexander Calder", TipoObras.ESCULTURA);
               
        //System.out.println("----------- OBRAS -----------------");
        
        // Salas 
        List<Sala> salas = new ArrayList();
        
        Fijo fijo1 = new Fijo("Bien", 1, "sala1", TipoSala.CUADROS, obra1);
        Fijo fijo2 = new Fijo("Buenas condiciones", 2, "Sala2", TipoSala.ESCULTURAS, obra3);
        Temporal temp1 = new Temporal(LocalDate.of(2015, Month.FEBRUARY, 12), LocalDate.of(2024, Month.FEBRUARY, 12), 1, "salaTemporal", TipoSala.ESCULTURAS, obra3);
               
        salas.add(fijo1);
        salas.add(fijo2);
        salas.add(temp1);
        
        System.out.println("----------- SALAS -------------");
        for (Sala sala : salas) {
            System.out.println(sala);
        }
        
        // Museo
        Museo museo1 = new Museo("Museo de obras de Narnia", "C/ Matías Prats, s/n, 29680, Estepona España", empleados, salas);
        
        System.out.println("------------ MUSEO -------------");
        
        System.out.println("Museo antes del cambio");
        System.out.println(museo1);
        
        // Casting de objeto
        Empleado emp1 = (Empleado)monitor1;
        
        // Contratar empleado
        museo1.contratar(emp1);
        
        System.out.println("Museo después del cambio");        
        System.out.println(museo1);
        
        // Despedir
        System.out.println("Museo con empleado eliminado");
        museo1.despedir(vigilante1);
        System.out.println(museo1);
        
        conservadorEscultorico.restaurar(TipoConservador.PICTÓRICO);
        
        
        
    }
    
    
}
