package org.apache.jsp.Disenio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import TresEnRaya.Funciones;
import java.io.*;

public final class jugar1vs1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      TresEnRaya.Juego juego = null;
      synchronized (session) {
        juego = (TresEnRaya.Juego) _jspx_page_context.getAttribute("juego", PageContext.SESSION_SCOPE);
        if (juego == null){
          juego = new TresEnRaya.Juego();
          _jspx_page_context.setAttribute("juego", juego, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilo.css\" />\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/logo.png\">\n");
      out.write("        <title>TresEnRaya</title>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"contenedor-jugar\">\n");
      out.write("            <header>\n");
      out.write("                <div id=\"volver\">\n");
      out.write("                    <a href=\"inicio.jsp\">\n");
      out.write("                        <i class=\"fa-solid fa-arrow-left\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"titulo-jugar\">\n");
      out.write("                    <h1>TRES en RAYA</h1>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"images/logo.png\" alt=\"logo\" />\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <main>\n");
      out.write("                <div class=\"normas\">\n");
      out.write("                    <h1>NORMAS</h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    juego.setNivel(1);
                    if (request.getParameter("reset") != null) {
                        juego.resetearJuego();
                        response.setIntHeader("Refresh", 0);
                    }
                
      out.write("\n");
      out.write("                <form id=\"simpleform\" method=\"post\" action=\"jugar1vs1.jsp\" name=\"simpleform\">\n");
      out.write("                    <table>\n");
      out.write("                        ");

                            for (int i = 0; i < 3; i++) {
                                out.println("<tr>");
                                for (int j = 0; j < 3; j++) {
      out.write("\n");
      out.write("                        <td width=\"15\">  <input class=\"cellinput\" type=\"submit\" name=\"tablecell");
      out.print( +i);
      out.print(+j);
      out.write("\" id=\"cell\" value=\"");
      out.print( juego.getValorJugador(i, j));
      out.write(" \" />  </td>\n");
      out.write("\n");
      out.write("                        ");

                                }
                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <div id=\"enviar\">\n");
      out.write("                        <input type=\"submit\" name=\"reset\" value=\"Nuevo Juego\" />\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"normas\">\n");
      out.write("                    <h1>REGISTRO</h1>\n");
      out.write("                    ");

                        if (juego.getSitiosOcupados() < 9) {
                            if (juego.compruebaGanador(1) == 1) {
                                Funciones.guardaEnFichero("VICTORIA");
                    
      out.write(" <p style=\"color:greenyellow; font-size: 3em; padding-top: 20px;\">VICTORIA 🏆 </font></p> ");

                    } else if (juego.compruebaGanador(0) == 0) {
                        Funciones.guardaEnFichero("DERROTA");
                    
      out.write(" <p style=\"color:red; font-size: 3em; padding-top: 20px;\">DERROTA ☠</p> ");

                    } else if (juego.getSitiosOcupados() == 9) {
                        Funciones.guardaEnFichero("EMPATE");
                    
      out.write(" <p style=\"color:red; font-size: 3em; padding-top: 20px;\">EMPATE</p> ");

                            }
                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
  // Check for a "Reset" button click

            if (juego.getNivel() != -1 && juego.finJuego() == false) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (request.getParameter("tablecell" + i + j) != null) {
                            if (juego.getTablero().getValorTablero(i, j) != 0 && juego.getTablero().getValorTablero(i, j) != 1) {
                                juego.turnoHumano(i, j, 1);
                                juego.setJugador(0);
                                //response.sendRedirect("index.jsp");
                                //request.getRequestDispatcher("/index.jsp").forward(request, response);
                                response.setIntHeader("Refresh", 0);

                            }
                        }
                        if (request.getParameter("tablecell" + i + j) != null) {
                            if (juego.getTablero().getValorTablero(i, j) != 0 && juego.getTablero().getValorTablero(i, j) != 1) {
                                juego.turnoHumano(i, j, 0);
                                juego.setJugador(1);
                                //response.sendRedirect("index.jsp");
                                //request.getRequestDispatcher("/index.jsp").forward(request, response);
                                response.setIntHeader("Refresh", 0);

                            }
                        }
                    }

                }

            }


        
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
