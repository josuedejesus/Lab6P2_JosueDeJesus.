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
public class Preparador extends Persona{
    private int id;
    private int contrato;
    private String especialidad;
    private String titulo;

    public Preparador() {
        super();
    }

    public Preparador(int id, int contrato, String especialidad, String titulo, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.id = id;
        this.contrato = contrato;
        this.especialidad = especialidad;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Preparador{" + "id=" + id + ", contrato=" + contrato + ", especialidad=" + especialidad + ", titulo=" + titulo + '}';
    }
    
    
}
