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
public class Jugador extends Persona{
    private int numero;
    private int jugados;
    private int ganados;
    private int tarjetas;
    private int contrato;

    public Jugador() {
        super();
    }

    public Jugador(int numero, int jugados, int ganados, int tarjetas, int contrato, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.numero = numero;
        this.jugados = jugados;
        this.ganados = ganados;
        this.tarjetas = tarjetas;
        this.contrato = contrato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getJugados() {
        return jugados;
    }

    public void setJugados(int jugados) {
        this.jugados = jugados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(int tarjetas) {
        this.tarjetas = tarjetas;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return "Jugador{" + "numero=" + numero + ", jugados=" + jugados + ", ganados=" + ganados + ", tarjetas=" + tarjetas + ", contrato=" + contrato + '}';
    }

    
}
