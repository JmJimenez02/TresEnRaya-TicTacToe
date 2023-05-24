/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TresEnRaya;

/**
 *
 * @author josem
 */
public class Tablero {

    protected int[][] tablero; // Estado del tablero

    /**
     * Inicializa el tablero
     */
    public Tablero() {
        tablero = new int[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = -1;
            }
        }
    }

    /**
     * Establece el movimiento de un jugador en una posición
     *
     * @param f fila
     * @param c columna
     * @param jugador
     */
    public void setMovim(int f, int c, int jugador) {
        tablero[f][c] = jugador;
    }

    /**
     * Comprueba las combinaciones posibles para ganar el juego
     *
     * @param jugadorActual
     * @return Devuelve el valor del ganador o -1 si no hay
     */
    public int ganador(int jugadorActual) {
        int rival;
        if (jugadorActual == 0) {
            rival = 1;
        } else {
            rival = 0;
        }

        int ganador = -1;
        if (tablero[0][0] == jugadorActual && tablero[0][1] == jugadorActual && tablero[0][2] == jugadorActual) {
            ganador = jugadorActual;
        } else if (tablero[1][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[1][2] == jugadorActual) {
            ganador = jugadorActual;
        } else if (tablero[2][0] == jugadorActual && tablero[2][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            ganador = jugadorActual;
        } else if (tablero[0][0] == jugadorActual && tablero[1][0] == jugadorActual && tablero[2][0] == jugadorActual) {
            ganador = jugadorActual;
        } else if (tablero[0][1] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][1] == jugadorActual) {
            ganador = jugadorActual;
        } else if (tablero[0][2] == jugadorActual && tablero[1][2] == jugadorActual && tablero[2][2] == jugadorActual) {
            ganador = jugadorActual;
        } else if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            ganador = jugadorActual;
        } else if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            ganador = jugadorActual;
        }
        return ganador;
    }

    /**
     * Dibuja en el tablero
     *
     * @param f fila
     * @param c columna
     * @return nada si está vacía, O si contiene el jugador 0, X si contiene el
     * jugador 1
     */
    public String tableroXO(int f, int c) {
        int valor = tablero[f][c];
        if (valor == -1) {
            return "";
        } else if (valor == 0) {
            return "O";
        } else {
            return "X";
        }
    }

    /**
     * Devuelve el valor de una casilla específica
     *
     * @param f fila
     * @param c columna
     * @return valor casilla
     */
    public int getValorTablero(int f, int c) {
        return tablero[f][c];
    }

    /**
     * Comprueba si la máquina puede ganar con su próximo movimiento o el humano
     * tiene posibilidad de ganar en el tablero temporal
     *
     * @return posición del próximo movimiento
     */
    public String puedeGanar() {
        String loc = "";
        int jugadorActual = 0;
        int rival = 1; //humano
        boolean elegido = false;
        int[][] temp = new int[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                temp[i][j] = tablero[i][j];
            }
        }

        if (elegido == false) {

            for (int i = 0; i < 3 && elegido == false; i++) {
                for (int j = 0; j < 3 && elegido == false; j++) {
                    if (tablero[i][j] == -1 && elegido == false) {
                        temp[i][j] = 0;
                        if (temp[0][0] == jugadorActual && temp[0][1] == jugadorActual && temp[0][2] == jugadorActual) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[1][0] == jugadorActual && temp[1][1] == jugadorActual && temp[1][2] == jugadorActual) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[2][0] == jugadorActual && temp[2][1] == jugadorActual && temp[2][2] == jugadorActual) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][0] == jugadorActual && temp[1][0] == jugadorActual && temp[2][0] == jugadorActual) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][1] == jugadorActual && temp[1][1] == jugadorActual && temp[2][1] == jugadorActual) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][2] == jugadorActual && temp[1][2] == jugadorActual && temp[2][2] == jugadorActual) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][0] == jugadorActual && temp[1][1] == jugadorActual && temp[2][2] == jugadorActual) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][2] == jugadorActual && temp[1][1] == jugadorActual && temp[2][0] == jugadorActual) {
                            loc = i + "" + j;
                            elegido = true;
                        }
                        temp[i][j] = -1;
                    }

                }
            }
        }

        if (elegido == false) {
            for (int i = 0; i < 3 && elegido == false; i++) {
                for (int j = 0; j < 3 && elegido == false; j++) {
                    if (tablero[i][j] == -1 && elegido == false) {
                        temp[i][j] = 1;
                        if (temp[0][0] == rival && temp[0][1] == rival && temp[0][2] == rival) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[1][0] == rival && temp[1][1] == rival && temp[1][2] == rival) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[2][0] == rival && temp[2][1] == rival && temp[2][2] == rival) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][0] == rival && temp[1][0] == rival && temp[2][0] == rival) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][1] == rival && temp[1][1] == rival && temp[2][1] == rival) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][2] == rival && temp[1][2] == rival && temp[2][2] == rival) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][0] == rival && temp[1][1] == rival && temp[2][2] == rival) {
                            loc = i + "" + j;
                            elegido = true;
                        } else if (temp[0][2] == rival && temp[1][1] == rival && temp[2][0] == rival) {
                            loc = i + "" + j;
                            elegido = true;
                        }
                        temp[i][j] = -1;
                    }

                }
            }
        }

        return loc;
    }

    /**
     * Crea una copia temporal del tablero
     *
     * @return copia temporal
     */
    public int[][] posibleTablero() {
        int[][] temp = new int[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                temp[i][j] = tablero[i][j];
            }
        }

        return temp;
    }
}
