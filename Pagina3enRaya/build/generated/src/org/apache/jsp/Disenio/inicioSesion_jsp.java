package org.apache.jsp.Disenio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileReader;
import java.io.BufferedReader;

public final class inicioSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Inicio de sesión</title>\n");
      out.write("    <style>\n");
      out.write("        /* Agrega tus estilos CSS aquí */\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Inicio de sesión</h1>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
 String errorMessage = (String) request.getAttribute("errorMessage");
    if (errorMessage != null) { 
      out.write("\n");
      out.write("        <p style=\"color: red;\">");
      out.print( errorMessage );
      out.write("</p>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <form method=\"post\" action=\"inicioSesion.jsp\">\n");
      out.write("        <label for=\"username\">Nombre de usuario:</label>\n");
      out.write("        <input type=\"text\" id=\"username\" name=\"username\" required>\n");
      out.write("        <br>\n");
      out.write("        <label for=\"password\">Contraseña:</label>\n");
      out.write("        <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"submit\" value=\"Iniciar sesión\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        if (request.getMethod().equals("POST")) {
            String filePath = "D:\\1DAW\\Prog\\Prog_Trimestre3\\Pagina3enRaya\\src\\java\\TresEnRaya\\usuarios.txt";
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // Validar el inicio de sesión
            boolean userExists = false;
            boolean passwordCorrect = false;
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                String storedUsername = userData[0];
                String storedPassword = userData[1];

                if (storedUsername.equals(username)) {
                    userExists = true;
                    if (storedPassword.equals(password)) {
                        passwordCorrect = true;
                        break;
                    }
                }
            }

            reader.close();

            if (userExists && passwordCorrect) {
            response.sendRedirect("jugar.jsp");
                // Inicio de sesión exitoso
                // Realiza las acciones necesarias, como redireccionar al usuario a la página de inicio del juego
            } else {
                // El nombre de usuario no está registrado o la contraseña es incorrecta
                errorMessage = "Nombre de usuario o contraseña incorrectos.";
                request.setAttribute("errorMessage", errorMessage);
                request.getRequestDispatcher("inicioSesion.jsp").forward(request, response);
            }
        }
    
      out.write("\n");
      out.write("</body>\n");
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
