/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_josuedejesus;

/**
 *
 * @author josue
 */
public class Entrenador extends Persona{
    private int contrato;
    private int ganadas;

    public Entrenador() {
        super();
    }

    public Entrenador(int contrato, int ganadas, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.contrato = contrato;
        this.ganadas = ganadas;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "contrato=" + contrato + ", ganadas=" + ganadas + '}';
    }
    
    
}
