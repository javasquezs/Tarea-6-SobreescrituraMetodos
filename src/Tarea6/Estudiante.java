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
public class Estudiante extends Persona {

    private String carne;

    public Estudiante(String name, String apellido, String carne) {
        super(name, apellido);
        this.carne = carne;
    }

    public String getCarne() {
        return carne;
    }

    public void datosEstudiante() {
        System.out.println("Datos del Estudiante: " + getName() + " " + getApellido());
    }

    public void datosCarnet() {
        System.out.println("Datos del Estudiante: " + getName() + " " + getApellido()+" Carnet: " + carne);
    }
}
