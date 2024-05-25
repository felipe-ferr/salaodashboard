package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.GerenciarLogin;
import model.Usuario;

public final class form_005fservico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sidebar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    Usuario ulogado = GerenciarLogin.verificarAcesso(request, response);
    request.setAttribute("ulogado", ulogado);

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <script src=\"./static/js/modoescuro.js\"></script>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/form.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/menu.css\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"static/favicon/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <title>Adicionar Serviço</title>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"grid-container\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/menu.css\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"side\" class=\"sidebar\">\r\n");
      out.write("            <a href=\"index.jsp\" class=\"sidebar-titulo\">Salão do Luciano</a>\r\n");
      out.write("            <a href=\"listar_agendamento.jsp\"><span class=\"material-symbols-outlined sidebar-icone\">calendar_month</span>Agendamentos</a>\r\n");
      out.write("            <a href=\"listar_cliente.jsp\"><span class=\"material-symbols-outlined sidebar-icone\">person</span>Clientes</a>\r\n");
      out.write("            <a href=\"listar_servico.jsp\"><span class=\"material-symbols-outlined sidebar-icone\">cut</span>Serviços</a>\r\n");
      out.write("            <a href=\"listar_perfil.jsp\"><span class=\"material-symbols-outlined sidebar-icone\">account_circle</span>Perfis</a>\r\n");
      out.write("            <a href=\"listar_usuario.jsp\"><span class=\"material-symbols-outlined sidebar-icone\">engineering</span>Usuários</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"tema-container bottom\">      \r\n");
      out.write("                <div class=\"switch-container\">\r\n");
      out.write("                    <div><span class=\"material-symbols-outlined sidebar-icone\">account_circle</span>");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("</div> \r\n");
      out.write("                    <a href=\"gerenciar_login.do\" style=\"width: auto\"><span class=\"material-symbols-outlined logout\">logout</span></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"switch-container\">\r\n");
      out.write("                    <span class=\"material-symbols-outlined\">dark_mode</span>\r\n");
      out.write("                    <label class=\"switch\">\r\n");
      out.write("                        <input type=\"checkbox\" id=\"switch\" onchange=\"toggleTheme()\">\r\n");
      out.write("                        <span class=\"slider round\"></span>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <span class=\"material-symbols-outlined\">light_mode</span>\r\n");
      out.write("                </span>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"static/js/modoescuro.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"static/js/showBotaoSair.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-principal\">\r\n");
      out.write("                <form method=\"POST\"action=\"gerenciar_servico.do\" value=\"\" accept-charset=\"ISO-8859-1 \">\r\n");
      out.write("\r\n");
      out.write("                    <a class=\"botaoinicio\" href=\"index.jsp\">\r\n");
      out.write("                        <i class=\"material-symbols-outlined\">arrow_back</i>Voltar ao início\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <h1>Cadastrar serviço</h1>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" name=\"idservico\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servico.idservico}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputContainer\">\r\n");
      out.write("                        <input required type=\"text\"name=\"nome\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servico.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                        <p>Nome:</p>\r\n");
      out.write("                        <i class=\"material-symbols-outlined\">cut</i>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <script type=\"text/javascript\" src=\"./static/js/sumirTextoTextarea.js\"></script>\r\n");
      out.write("                    <div style=\"margin-top: 5vh\" class=\"inputContainer\">\r\n");
      out.write("                        <p class=\"textareatexto\" id=\"ptextarea\">Descrição</p>\r\n");
      out.write("                        <textarea id=\"area\" onclick=\"sumirp()\" type=\"text\" name=\"descricao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servico.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputContainerRow\">\r\n");
      out.write("                        <div class=\"containerColumn\">\r\n");
      out.write("                            <span>Status</span>\r\n");
      out.write("                            <div style=\"width: 30%\" onclick=\"setupDropdown()\" id=\"dropdownBtnContainer\" class=\"dropdownContainer\">\r\n");
      out.write("                                <div class=\"dropdownBtnContainer\">\r\n");
      out.write("                                    <div class=\"dropdownBtn\" id=\"selectedOptionMostrar\">Ativo</div>\r\n");
      out.write("                                    <i class=\"material-symbols-outlined\">keyboard_arrow_down</i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div id=\"dropstatus\" class=\"dropdownMenu hidden\">\r\n");
      out.write("                                    <label class=\"label\"><input type=\"radio\" checked name=\"status\" value=\"1\">Ativo</label>\r\n");
      out.write("                                    <label class=\"label\"><input type=\"radio\" name=\"status\" value=\"0\">Inativo</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"submit\"class=\"submit\">Cadastrar Serviço</button>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./static/js/dropdownForms.js\"></script>\r\n");
      out.write("        <script src=\"./static/js/mascaras.js\"></script>\r\n");
      out.write("        <script src=\"./static/js/fillDate.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ulogado!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ulogado.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
