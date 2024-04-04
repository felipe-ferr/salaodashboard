package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005fservico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sidebar.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/form.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/menu.css\">\r\n");
      out.write("        \r\n");
      out.write("         <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write(" \r\n");
      out.write("        <div class=\"grid-container\">\r\n");
      out.write("             ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/menu.css\">\r\n");
      out.write("         <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("            <div id=\"side\" class=\"sidebar\">\r\n");
      out.write("                <span class=\"sidebar-titulo\">Salão do Luciano</span>\r\n");
      out.write("                <a href=\"#\"><span class=\"material-symbols-outlined sidebar-icone\">calendar_month</span>Agendamentos</a>\r\n");
      out.write("                <a href=\"#\"><span class=\"material-symbols-outlined sidebar-icone\">person</span>Clientes</a>\r\n");
      out.write("                <a href=\"listar_servico.jsp\"><span class=\"material-symbols-outlined sidebar-icone\">cut</span>Serviços</a>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"tema-container bottom\">\r\n");
      out.write("                    <span>Modo Escuro</span>\r\n");
      out.write("                    <div class=\"tema-btn-container\">\r\n");
      out.write("                        <button onclick=\"escuro()\" id=\"botaodark\" class=\"btn-esquerda\"><span class=\"material-symbols-outlined\">dark_mode</span></button>\r\n");
      out.write("                        <button onclick=\"light()\" id=\"botaolight\" class=\"btn-active-direita btn-direita\"><span class=\"material-symbols-outlined\">light_mode</span></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("   \r\n");
      out.write("        <script type=\"text/javascript\" src=\"static/js/modoescuro.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("             <div class=\"container-principal\">\r\n");
      out.write("                 <form method=\"POST\"action=\"gerenciar_servico.do\"value=\"\">\r\n");
      out.write("\r\n");
      out.write("                <a class=\"botaoinicio\"href=\"#\"><i class=\"material-symbols-outlined\">arrow_back</i>Voltar ao início</a>\r\n");
      out.write("\r\n");
      out.write("                <h1>Cadastrar serviço</h1>\r\n");
      out.write("                \r\n");
      out.write("                <input type=\"hidden\" name=\"idservico\"/>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"inputContainer\">\r\n");
      out.write("                    <input required type=\"text\"name=\"nome\"><p>Nome:</p><i class=\"material-symbols-outlined\">location_on</i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"inputContainer\">\r\n");
      out.write("                    <input required type=\"number\"name=\"duracao\"><p>Duração</p><i class=\"material-symbols-outlined\">mail</i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"inputContainer\">\r\n");
      out.write("                    <input required type=\"number\"name=\"valor\"><p>Valor:</p><i class=\"material-symbols-outlined\">key</i>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"inputContainer\">\r\n");
      out.write("                    <input required type=\"text\"name=\"descricao\"><p>Descrição</p><i class=\"material-symbols-outlined\">key</i>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                 <div class=\"inputContainer\">\r\n");
      out.write("                    <input required type=\"number\"name=\"status\"><p>Status</p><i class=\"material-symbols-outlined\">key</i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <button type=\"submit\"class=\"submit\">Cadastrar Serviço</button>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("             </div>\r\n");
      out.write("        </div>\r\n");
      out.write("           \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
