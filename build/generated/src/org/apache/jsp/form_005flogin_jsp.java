package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <script>\r\n");
      out.write("// Script para carregar o modo escuro antes do usuário ver a página.\r\n");
      out.write("\r\n");
      out.write("// Pegar o valor do cookie\r\n");
      out.write("            function getCookie(name) {\r\n");
      out.write("                let nameEQ = name + \"=\";\r\n");
      out.write("                let ca = document.cookie.split(';');\r\n");
      out.write("                for (let i = 0; i < ca.length; i++) {\r\n");
      out.write("                    let c = ca[i];\r\n");
      out.write("                    while (c.charAt(0) == ' ')\r\n");
      out.write("                        c = c.substring(1, c.length);\r\n");
      out.write("                    if (c.indexOf(nameEQ) == 0)\r\n");
      out.write("                        return c.substring(nameEQ.length, c.length);\r\n");
      out.write("                }\r\n");
      out.write("                return null;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("// Funções pra aplicar o modo escuro e claro\r\n");
      out.write("            function escuro() {\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-clara', '#252525');\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-escura', '#181818');\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-texto', '#AFAFAF');\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-texto-preto', '#DFDFDF');\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-tabela-stripe', '#161616');\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function light() {\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-clara', '#eaeaea');\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-escura', '#f5f5f5');\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-texto', '##0F0300');\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-texto-preto', 'black');\r\n");
      out.write("                document.documentElement.style.setProperty('--cor-tabela-stripe', '#F0F0F0');\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("// Função pra checar o cookie e aplicar o tema antes da página carregar\r\n");
      out.write("            (function checkCookieAndApplyTheme() {\r\n");
      out.write("                let theme = getCookie(\"theme\");\r\n");
      out.write("                if (theme === \"dark\") {\r\n");
      out.write("                    escuro();\r\n");
      out.write("                } else if (theme === \"light\") {\r\n");
      out.write("                    light();\r\n");
      out.write("                }\r\n");
      out.write("            })();\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Salão do Luciano | Login</title>\r\n");
      out.write("        <script src=\"./static/js/modoescuro.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/login.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/menu.css\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"static/favicon/favicon.ico\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"flex-container\">  \r\n");
      out.write("            ");

                String mensagem = (String)request.getSession().getAttribute("mensagem");
                if(mensagem !=null){
                    request.getSession().removeAttribute("mensagem");
                
            
      out.write("\r\n");
      out.write("            <div class=\"alert\">\r\n");
      out.write("                ");
      out.print(mensagem);
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("            <div class=\"form-container\">\r\n");
      out.write("                <form class=\"form_login\" action=\"gerenciar_login.do\" method=\"POST\" accept-charset=\"ISO-8859-1\">\r\n");
      out.write("                <h1>Entrar na sua conta</h1>\r\n");
      out.write("                <div class=\"inputContainer\">\r\n");
      out.write("                    <input type=\"text\" name=\"login\" id=\"login\" value=\"\" required=\"\">\r\n");
      out.write("                    <p>Usuário</p>\r\n");
      out.write("                    <i class=\"material-symbols-outlined\">person</i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"inputContainer\">\r\n");
      out.write("                    <input type=\"password\" name=\"senha\" id=\"senha\" value=\"\" required=\"\">\r\n");
      out.write("                    <p>Senha</p>\r\n");
      out.write("                    <i class=\"material-symbols-outlined\">key</i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <button class=\"btn\">Entrar</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"info\">\r\n");
      out.write("                <img src=\"imagens/logo.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
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
