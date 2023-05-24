package org.apache.jsp.Disenio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jugarDibujado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/Diseño_sin_título-removebg-preview.png\">\n");
      out.write("        <title>TresEnRaya-Jugar</title>\n");
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
      out.write("                    <img src=\"images/Diseño_sin_título-removebg-preview.png\" alt=\"logo\" />\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <main>\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <label for=\"value-1\" class=\"custom-radio\"></label>\n");
      out.write("                                ");

                                if (request.getParameter("value-radio").equals("value-1")) {
                                out.print("<img src=\"images/logo.png\"/>");
                                  }
                                
      out.write("\n");
      out.write("                                <input\n");
      out.write("                                    value=\"value-1\"\n");
      out.write("                                    name=\"value-radio\"\n");
      out.write("                                    id=\"value-1\"\n");
      out.write("                                    type=\"radio\"\n");
      out.write("                                    />\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input\n");
      out.write("                                    value=\"value-2\"\n");
      out.write("                                    name=\"value-radio\"\n");
      out.write("                                    id=\"value-2\"\n");
      out.write("                                    type=\"radio\"\n");
      out.write("                                    />\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input\n");
      out.write("                                    value=\"value-3\"\n");
      out.write("                                    name=\"value-radio\"\n");
      out.write("                                    id=\"value-3\"\n");
      out.write("                                    type=\"radio\"\n");
      out.write("                                    />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input\n");
      out.write("                                    value=\"value-4\"\n");
      out.write("                                    name=\"value-radio\"\n");
      out.write("                                    id=\"value-4\"\n");
      out.write("                                    type=\"radio\"\n");
      out.write("                                    />\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input\n");
      out.write("                                    value=\"value-5\"\n");
      out.write("                                    name=\"value-radio\"\n");
      out.write("                                    id=\"value-5\"\n");
      out.write("                                    type=\"radio\"\n");
      out.write("                                    />\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input\n");
      out.write("                                    value=\"value-6\"\n");
      out.write("                                    name=\"value-radio\"\n");
      out.write("                                    id=\"value-6\"\n");
      out.write("                                    type=\"radio\"\n");
      out.write("                                    />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input\n");
      out.write("                                    value=\"value-7\"\n");
      out.write("                                    name=\"value-radio\"\n");
      out.write("                                    id=\"value-7\"\n");
      out.write("                                    type=\"radio\"\n");
      out.write("                                    />\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input\n");
      out.write("                                    value=\"value-8\"\n");
      out.write("                                    name=\"value-radio\"\n");
      out.write("                                    id=\"value-8\"\n");
      out.write("                                    type=\"radio\"\n");
      out.write("                                    />\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input\n");
      out.write("                                    value=\"value-9\"\n");
      out.write("                                    name=\"value-radio\"\n");
      out.write("                                    id=\"value-9\"\n");
      out.write("                                    type=\"radio\"\n");
      out.write("                                    />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <div id=\"enviar\">\n");
      out.write("                        <input type=\"submit\" value=\"Dibujar\" />\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
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
