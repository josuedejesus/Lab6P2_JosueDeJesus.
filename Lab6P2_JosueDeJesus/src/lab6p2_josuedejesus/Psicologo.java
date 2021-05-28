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
public class Psicologo extends Persona{
    private String titulo;
    private int id;
    private String specialidad;
    private int informes;
    private int atendidos;

    public Psicologo() {
        super();
    }

    public Psicologo(String titulo, int id, String specialidad, int informes, int atendidos, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.titulo = titulo;
        this.id = id;
        this.specialidad = specialidad;
        this.informes = informes;
        this.atendidos = atendidos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialidad() {
        return specialidad;
    }

    public void setSpecialidad(String specialidad) {
        this.specialidad = specialidad;
    }

    public int getInformes() {
        return informes;
    }

    public void setInformes(int informes) {
        this.informes = informes;
    }

    public int getAtendidos() {
        return atendidos;
    }

    public void setAtendidos(int atendidos) {
        this.atendidos = atendidos;
    }

    @Override
    public String toString() {
        return "Psicologo{" + "titulo=" + titulo + ", id=" + id + ", specialidad=" + specialidad + ", informes=" + informes + ", atendidos=" + atendidos + '}';
    }
    
    
}
