<%-- 
    Document   : jugar
    Created on : 16 may 2023, 14:08:30
    Author     : josem
--%>

<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="TresEnRaya.Funciones"%>
<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="juego" class="TresEnRaya.Juego" scope="session" />
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estiloo.css" />
        <link rel="icon" type="image/png" href="images/logo.png">
        <title>TresEnRaya</title>
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
            integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
    </head>
    <body>
        <div class="contenedor-jugar">
            <header>
                <div id="volver">
                    <a href="inicio.jsp">
                        <i class="fa-solid fa-arrow-left"></i>
                    </a>
                </div>
                <div class="titulo-jugar">
                    <h1>TRES en RAYA</h1>
                </div>
                <div id="logo">
                    <img src="images/logo.png" alt="logo" />
                </div>
            </header>
            <main>
                <div class="normas">
                    <h1>NORMAS</h1>
                    <p>
                        Cada jugador solo debe colocar su símbolo una vez por turno y no debe ser sobre una casilla ya jugada. Se debe conseguir realizar una línea recta o diagonal por símbolo.
                    </p>
                </div>

                <%
                  if (request.getParameter("reset") != null) {
                    juego.resetearJuego();
                    response.setIntHeader("Refresh", 0);
                  }
                %>
                <form id="simpleform" method="post" action="jugar.jsp" name="simpleform">
                    <table>
                        <%
                          for (int i = 0; i < 3; i++) {
                            out.println("<tr>");
                            for (int j = 0; j < 3; j++) {%>
                        <td>  <input class="celdaInput" type="submit" name="casilla<%= +i%><%=+j%>" id="cell" value="<%= juego.getValorJugador(i, j)%> " />  </td>

                        <%
                            }
                          }
                        %>
                    </table>
                    <div id="enviar">
                        <input type="submit" name="reset" value="Nuevo Juego" />
                    </div>
                </form>
                <div class="cont-res">
                    <div class="normas">
                        <h1>RESULTADO</h1>
                        <%
                          ServletContext sc = this.getServletContext();
                          String rutaFichero = sc.getRealPath("WEB-INF") + "\\registro.txt";
                          rutaFichero = rutaFichero.replace('\\', '/');

                          if (juego.getSitiosOcupados() < 9) {
                            if (juego.compruebaGanador(1) == 1) {
                              Funciones.guardaEnFichero(DateTimeFormatter.ofPattern("dd-MM-yyyy, hh:mm:ss a").format(LocalDateTime.now()) + "  -  VICTORIA", rutaFichero);
                        %> <p style="color:greenyellow; font-size: 3em; padding-top: 20px;">VICTORIA 🏆</p> <%
                        } else if (juego.compruebaGanador(0) == 0) {
                          Funciones.guardaEnFichero(DateTimeFormatter.ofPattern("dd-MM-yyyy, hh:mm:ss a").format(LocalDateTime.now()) + "  -  DERROTA", rutaFichero);
                        %> <p style="color:red; font-size: 3em; padding-top: 20px;">DERROTA ☠</p> <%
                        } else if (juego.getSitiosOcupados() > 8) {
                          Funciones.guardaEnFichero(DateTimeFormatter.ofPattern("dd-MM-yyyy, hh:mm:ss a").format(LocalDateTime.now()) + "  -  EMPATE", rutaFichero);
                        %> <p style="color:red; font-size: 3em; padding-top: 20px;">EMPATE</p> <%
                            }
                          }
                        %>
                    </div>
                    <div id="resultados">
                        <a href="verResultados.jsp">Ver Resultados</a>
                    </div>
                </div>
            </main>
        </div>


        <%
          if (juego.finJuego() == false) {
            for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                if (request.getParameter("casilla" + i + j) != null) {
                  if (juego.getTablero().getValorTablero(i, j) != 0 && juego.getTablero().getValorTablero(i, j) != 1) {
                    juego.turnoHumano(i, j, 1);
                    response.setIntHeader("Refresh", 0);

                  }
                }
              }

            }

            if (juego.getJugadorActual() == 0 && juego.finJuego() == false) {
              juego.movimientoAnticipado();
            }

          }
        %>

    </body>
</html>

