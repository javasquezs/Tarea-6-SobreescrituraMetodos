/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea6;

/**
 *
 * @author JAVS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante1 = new Estudiante("Jorge","Vasquez","1020304050");
        estudiante1.datosEstudiante();
        estudiante1.datosCarnet();
        
        Estudiante estudiante2 = new Estudiante("Brandon","Contreras","9080706");
        estudiante2.datosEstudiante();
        estudiante2.datosCarnet();
    }
    
}
