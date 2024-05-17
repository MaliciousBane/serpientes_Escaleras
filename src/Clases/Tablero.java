/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class Tablero {

    Casilla[] casillasTablero = new Casilla[100];
    Jugador[] jugadores;
    int jugadorAct;

    public Tablero() {
        inicializarCasilla();
        this.jugadorAct = 0;

    }

    public void inicializarCasilla() {
        for (int i = 0; i < 100; i++) {
            casillasTablero[i] = new Casilla(i);
        }
    }

    public void crearJugador(int numeroJugadores) {
        if (numeroJugadores >= 2 && numeroJugadores <= 4) {

            String[] listaColores = {"AZUL", "ROJO", "VERDE", "MORADO"};

            Jugador[] listaJugadores = new Jugador[numeroJugadores];
            for (int i = 0; i < numeroJugadores; i++) {
                listaJugadores[i] = new Jugador(listaColores[i]);
            }
            this.jugadores = listaJugadores;
            casillasTablero[0].setJugadores(listaJugadores);
        }
    }

    public int moverJugador(int indiceJugador, int cantCasillas) {
        Jugador jugador = jugadores[indiceJugador];
        int newPosition = jugador.getPosicion() + cantCasillas;
        if (newPosition >= 100) {
            newPosition = 99; // Asegurar que no se salga del tablero
        }

        jugador.setPosicion(newPosition);
        this.jugadorAct = (this.jugadorAct + 1) % jugadores.length;
        System.out.println(this.jugadorAct);
        // Limpiar la posición actual
        //vector[currentPosition].setOpaque(false);
        //vector[currentPosition].repaint();

        // Establecer la nueva posición
        //vector[newPosition].setOpaque(true);
        //vector[newPosition].repaint();
        // Actualizar la posición actual del jugador
        //currentPosition = newPosition;
        return jugador.getPosicion();
    }

    public int moverJugador13(int indiceJugador, int cantCasillas) {
        Jugador jugador = jugadores[indiceJugador];
        int newPosition = jugador.getPosicion() + cantCasillas;
        if (newPosition >= 169) {
            newPosition = 168; // Asegurar que no se salga del tablero
        }

        jugador.setPosicion(newPosition);
        this.jugadorAct = (this.jugadorAct + 1) % jugadores.length;
        System.out.println(this.jugadorAct);
        // Limpiar la posición actual
        //vector[currentPosition].setOpaque(false);
        //vector[currentPosition].repaint();

        // Establecer la nueva posición
        //vector[newPosition].setOpaque(true);
        //vector[newPosition].repaint();
        // Actualizar la posición actual del jugador
        //currentPosition = newPosition;
        return jugador.getPosicion();
    }

    public int moverJugador15(int indiceJugador, int cantCasillas) {
        Jugador jugador = jugadores[indiceJugador];
        int newPosition = jugador.getPosicion() + cantCasillas;
        if (newPosition >= 225) {
            newPosition = 224; // Asegurar que no se salga del tablero
        }

        jugador.setPosicion(newPosition);
        this.jugadorAct = (this.jugadorAct + 1) % jugadores.length;
        System.out.println(this.jugadorAct);
        // Limpiar la posición actual
        //vector[currentPosition].setOpaque(false);
        //vector[currentPosition].repaint();

        // Establecer la nueva posición
        //vector[newPosition].setOpaque(true);
        //vector[newPosition].repaint();
        // Actualizar la posición actual del jugador
        //currentPosition = newPosition;
        return jugador.getPosicion();
    }

    public Casilla[] getCasillasTablero() {
        return casillasTablero;
    }

    public void setCasillasTablero(Casilla[] casillasTablero) {
        this.casillasTablero = casillasTablero;
    }

    public int tirarDado() {
        Random rand = new Random();
        return rand.nextInt(6 - 1) + 1;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getJugadorAct() {
        return jugadorAct;
    }

    public void setJugadorAct(int jugadorAct) {
        this.jugadorAct = jugadorAct;
    }

}
