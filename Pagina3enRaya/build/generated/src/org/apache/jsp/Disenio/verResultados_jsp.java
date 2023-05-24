package org.apache.jsp.Disenio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public final class verResultados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estiloo.css\" />\n");
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
      out.write("        <div class=\"contenedor-result\">\n");
      out.write("            <header>\n");
      out.write("                <div id=\"volver\">\n");
      out.write("                    <a href=\"jugar.jsp\">\n");
      out.write("                        <i class=\"fa-solid fa-arrow-left\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"titulo-jugar\">\n");
      out.write("                    <h1>TRES en RAYA</h1>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"images/logo.png\" alt=\"logo\" />\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"contenedor-resultado\">\n");
      out.write("                <div class=\"resultados\">\n");
      out.write("                    <h1>RESULTADOS</h1>\n");
      out.write("                    ");

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
                        
      out.write(" <span style=\"color: green\">");

                                    out.println(resultados.get(i)); 
      out.write("</span><br> ");

                                } else if (resultados.get(i).contains("DERROTA")) {
                                
      out.write(" <span style=\"color: red\">");

                                    out.println(resultados.get(i)); 
      out.write("</span><br> ");

}
                            }

                        
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"contadores\">\n");
      out.write("                    <p> VICTORIAS: <span style=\"color: green\">");
      out.print(  contVict);
      out.write("</span></p>\n");
      out.write("                    <p> DERROTAS: <span style=\"color: red\">");
      out.print(  contDerrot);
      out.write("</span></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
