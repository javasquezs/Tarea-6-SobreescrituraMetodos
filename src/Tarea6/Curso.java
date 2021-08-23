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
public class Curso extends Estudiante {

    public String carrera;

    public Curso(String name, String apellido, String carne, String carrera) {
        super(name, apellido, carne);
        this.carrera = carrera;
    }

    public void datosEstudiante() {
        System.out.println("Datos del Estudiante: " + getName() + " " + getApellido());
    }

    public void datosCarnet() {
        System.out.println("Datos del Estudiante: " + getName() + " " + getApellido() + " Carnet: " + getCarne()+" carrera: "+ carrera);
    }

}
