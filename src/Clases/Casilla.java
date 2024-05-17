/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class Casilla {

    private Jugador[] jugadores;
    private Serpiente serpiente;
    private Escalera escalera;
    private int posicion;

    public Casilla(int posicion) {
        this.posicion = posicion;
    }

    public void asignarSerpiente(Serpiente serpiente) {
        if (CasillaTieneEscalera()) {
            return;
        }

        this.serpiente = serpiente;
    }

    public void asignarEscalera(Escalera escalera) {
        if (CasillaTieneSerpiente()) {
            return;
        }

        this.escalera = escalera;
    }

    public boolean CasillaTieneSerpiente() {
        return serpiente != null;
    }

    public boolean CasillaTieneEscalera() {
        return escalera != null;
    }

    public void JugadorEstaEnSerpiente() {

    }

    public void JugadorEstaEnEscalera() {

    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public Serpiente getSerpiente() {
        return serpiente;
    }

    public void setSerpiente(Serpiente serpiente) {
        this.serpiente = serpiente;
    }

    public Escalera getEscalera() {
        return escalera;
    }

    public void setEscalera(Escalera escalera) {
        this.escalera = escalera;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

}
