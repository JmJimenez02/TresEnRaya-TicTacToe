package org.apache.jsp.Disenio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileWriter;
import java.io.BufferedWriter;
import TresEnRaya.Funciones;
import java.io.IOException;
import java.io.FileReader;
import java.io.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Iniciar Sesión</h1>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"registro.jsp\">\n");
      out.write("            <label for=\"usuario\">Nombre de usuario:</label>\n");
      out.write("            <input type=\"text\" id=\"usuario\" name=\"usuario\" required>\n");
      out.write("            <br>\n");
      out.write("            <label for=\"contrasenia\">Contraseña:</label>\n");
      out.write("            <input type=\"password\" id=\"contrasenia\" name=\"contrasenia\" required>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Iniciar sesión\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

          String usuario = request.getParameter("usuario");
          String contrasenia = request.getParameter("contrasenia");

          boolean existe = false;
          boolean contrCorrecta = false;
          String linea = "";
          String ruta = "D:\\1DAW\\Prog\\Prog_Trimestre3\\Pagina3enRaya\\src\\java\\TresEnRaya\\usuarios.txt";

          BufferedReader br = new BufferedReader(new FileReader(ruta));
          while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            String nombreRegistrado = datos[0];
            String contrRegistrado = datos[1];

            if (nombreRegistrado.equals(usuario)) {
              existe = true;
              if (contrRegistrado.equals(contrasenia)) {
                contrCorrecta = true;
                break;
              }
            }
          }

          br.close();

          if (existe && contrCorrecta) {
            response.sendRedirect("jugar.jsp");
          } else if (existe && !contrCorrecta) {
        
      out.write(" <p>Contraseña Incorrecta</p>");

          } else {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
                    bw.write(usuario);
                    bw.write(",");
                    bw.write(contrasenia);
                    bw.newLine();
                    bw.close();
                    
                    response.sendRedirect("jugar.jsp");
            /*BufferedWriter bw = null;
            try {
              bw = new BufferedWriter(new FileWriter(ruta, true));

              bw.write(usuario + "," + contrasenia);
              bw.newLine();

              response.sendRedirect("jugar.jsp");
            } catch (IOException e) {
              out.println("Error al escribir en el archivo usuarios.txt: " + e.getMessage());
            } finally {
              if (bw != null) {
                  bw.close();
              }
            }*/
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
