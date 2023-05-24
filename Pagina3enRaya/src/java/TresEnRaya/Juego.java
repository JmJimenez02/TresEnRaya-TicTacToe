/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TresEnRaya;

import java.util.Random;

/**
 *
 * @author josem
 */
public class Juego {

    int primerJugador;
    int jugadorActual;
    Tablero tableroJuego;
    int completo;

    public Juego() {
        primerJugador = 1;
        jugadorActual = 1;
        tableroJuego = new Tablero();
        completo = 0;
    }
    
    public int getJugadorActual() {
        return jugadorActual;
    }

    public void setJugador(int actual) {
        jugadorActual = actual;
    }

    public int getSitiosOcupados() {
        return completo;
    }
    
    public Tablero getTablero() {
        return tableroJuego;
    }

    /**
     * Comprueba si la casilla elegida por el humano está libre y hace el
     * movimiento
     *
     * @param f fila
     * @param c columna
     * @param jugador jugador actual
     */
    public void turnoHumano(int f, int c, int jugador) {
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tableroJuego.getValorTablero(i, j) == -1) {
                    cont++;
                }
            }
        }
        if (cont != 0) {
            tableroJuego.setMovim(f, c, jugador);
            completo++;
            if (jugador == 1) {
                jugadorActual = 0;
            } else {
                jugadorActual = 1;
            }
        }
    }

    /**
     * Obtiene el valor de una casilla del tablero
     *
     * @param f fila
     * @param c columna
     * @return valor de la casilla
     */
    public String getValorJugador(int f, int c) {
        return tableroJuego.tableroXO(f, c);
    }

    /**
     * Reinicia el juego
     */
    public void resetearJuego() {
        primerJugador = 1;
        jugadorActual = 1;
        tableroJuego = new Tablero();
        completo = 0;
    }

    /**
     * Juega la máquina Genera una lista de posibles movimientos y selecciona
     * uno al azar. Realiza el movimiento seleccionado en el tablero.
     */
    public void turnoMaquina() {
        String[] posiciones = new String[9];
        int cont = 0;
        // Hace una lista de posiciones vacías
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tableroJuego.getValorTablero(i, j) == -1) {
                    posiciones[cont] = i + "" + j;
                    cont++;
                }
            }
        }
        // Comprueba si hay posiciones disponibles
        if (cont != 0) {
            Random rand = new Random();
            int n = rand.nextInt(cont) + 0;
            int fila = Integer.parseInt(posiciones[n].substring(0, 1));
            int columna = Integer.parseInt(posiciones[n].substring(1, 2));
            completo++;
            tableroJuego.setMovim(fila, columna, 0);
            jugadorActual = 1;
        }
    }

    /**
     * Comprueba si hay ganador
     *
     * @param jugadorActual
     * @return valor del ganador
     */
    public int compruebaGanador(int jugadorActual) {
        int ganador = tableroJuego.ganador(jugadorActual);
        return ganador;
    }

    /**
     * Comprueba si el juego ha terminado
     *
     * @return true si ha terminado, false en caso contrario
     */
    public boolean finJuego() {
        if (compruebaGanador(0) != -1 || compruebaGanador(1) != -1 || completo == 9) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Realiza un movimiento anticipado de la máquina Si puede ganar hace el
     * movimiento y si no, un movimiento normal
     */
    public void movimientoAnticipado() {
        String posicion = tableroJuego.puedeGanar();
        if (!(posicion.equals(""))) {
            int fila = Integer.parseInt(posicion.substring(0, 1));
            int columna = Integer.parseInt(posicion.substring(1, 2));
            tableroJuego.setMovim(fila, columna, 0);
            completo++;
            jugadorActual = 1;
        } else {
            turnoMaquina();
        }
    }
    
    public String dibujar() {
        String s = tableroJuego.puedeGanar();
        return s;
    }

}


// ------------------------------------------------------------------------------------------------------
