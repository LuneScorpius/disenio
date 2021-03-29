/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jagum
 */
public class SolicitudClass {
    long matricula;
    final String programa;
    final String materia;
    final String grupo;
    final String movimiento;
    final String observaciones;
    final long fecha;

    public SolicitudClass(String programa, String materia, String grupo, String movimiento, String observaciones, long fecha) {
        this.programa = programa;
        this.materia = materia;
        this.grupo = grupo;
        this.movimiento = movimiento;
        this.observaciones = observaciones;
        this.fecha = fecha;
    }

    public SolicitudClass(long matricula, String programa, String materia, String grupo, String movimiento, String observaciones, long fecha) {
        this.matricula = matricula;
        this.programa = programa;
        this.materia = materia;
        this.grupo = grupo;
        this.movimiento = movimiento;
        this.observaciones = observaciones;
        this.fecha = fecha;
    }
    
    public void setID(long matricula){
        this.matricula = matricula;
    }
    
    public long getID(){
        return matricula;
    }
}
