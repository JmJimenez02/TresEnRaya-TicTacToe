<%-- 
    Document   : verResultados
    Created on : 22 may. 2023, 17:40:56
    Author     : José María Jiménez
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <div class="contenedor-result">
            <header>
                <div id="volver">
                    <a href="jugar.jsp">
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
            <div class="contenedor-resultado">
                <div class="resultados">
                    <h1>RESULTADOS</h1>
                    <%
                        ServletContext sc = this.getServletContext();
                        String rutaFichero = sc.getRealPath("WEB-INF") + "\\registro.txt";
                        rutaFichero = rutaFichero.replace('\\', '/');

                        ArrayList<String> resultados = new ArrayList();

                        int contVict = 0;
                        int contDerrot = 0;

                        BufferedReader br = new BufferedReader(new FileReader(rutaFichero));
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            resultados.add(linea);
                            if (linea.contains("VICTORIA")) {
                                contVict++;
                            } else if (linea.contains("DERROTA")) {
                                contDerrot++;
                            }
                        }
                        Collections.reverse(resultados);
                        for (int i = 0; i < resultados.size(); i++) {
                            if (resultados.get(i).contains("VICTORIA")) {
                        %> <span style="color: green"><%
                                    out.println(resultados.get(i)); %></span><br> <%
                                } else if (resultados.get(i).contains("DERROTA")) {
                                %> <span style="color: red"><%
                                    out.println(resultados.get(i)); %></span><br> <%
}
                            }

                        %>
                </div>

                <div class="contadores">
                    <p> VICTORIAS: <span style="color: green"><%=  contVict%></span></p>
                    <p> DERROTAS: <span style="color: red"><%=  contDerrot%></span></p>
                </div>
            </div>
        </div>


    </body>
</html>
