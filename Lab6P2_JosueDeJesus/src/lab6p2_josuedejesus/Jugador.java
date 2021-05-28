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
    private int partidos;
    private int copas;
    private int tarjetas;
    private int contrato;

    public Jugador() {
        super();
    }

    public Jugador(int numero, int partidos, int copas, int tarjetas, int contrato, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.numero = numero;
        this.partidos = partidos;
        this.copas = copas;
        this.tarjetas = tarjetas;
        this.contrato = contrato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int jugados) {
        this.partidos = jugados;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int ganados) {
        this.copas = ganados;
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
        return "Jugador{" + "numero=" + numero + ", jugados=" + partidos + ", ganados=" + copas + ", tarjetas=" + tarjetas + ", contrato=" + contrato + '}';
    }

    
}
