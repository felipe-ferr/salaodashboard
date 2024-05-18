package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ServicoDAO;
import java.util.ArrayList;
import model.Servico;
import controller.GerenciarLogin;
import model.Usuario;

public final class listar_005fservico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sidebar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    Usuario ulogado = GerenciarLogin.verificarAcesso(request, response);
    request.setAttribute("ulogado", ulogado);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/menu.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/tabelas.css\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./static/bulma/jquery-3.7.1.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"static/js/PesquisaTabela.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatis.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\"> // adicionei aqui por conta do método de exclusão \r\n");
      out.write("            function confirmarExclusão(id, nome) {\r\n");
      out.write("                if (confirm('Deseja desativar o servico ' + nome + '?')) {\r\n");
      out.write("                    location.href = 'gerenciar_servico.do?acao=deletar&idservico=' + id;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./static/js/pagination.js\"></script>\r\n");
      out.write("        <script src=\"./static/js/dropdownRegistros.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("            <span class=\"sidebar-titulo\">Salão do Luciano</span>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"principal\" class=\"container-principal\">\r\n");
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row-container\">\r\n");
      out.write("                    <h1>Lista de Serviços</h1>\r\n");
      out.write("                    <a href=\"form_servico.jsp\">Adicionar Serviço<i class=\"material-symbols-outlined\">add</i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row-container\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"searchContainer\">\r\n");
      out.write("                        <input type=\"text\" id=\"searchInput\" placeholder=\"Pesquisar\">\r\n");
      out.write("                        <i class=\"material-symbols-outlined\">search</i>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                     <div class=\"dropdown-texto-container\">\r\n");
      out.write("                        <p>Ordenar Por:</p>\r\n");
      out.write("                        <div id=\"dropdownBtnContainer\" onmouseover=\"toggleDropdownMenu()\" class=\"dropdownContainer\">\r\n");
      out.write("                            <div class=\"dropdownBtnContainer\">\r\n");
      out.write("                                <div class=\"dropdownBtn\" id=\"selectedOption\">Ordem Crescente</div>\r\n");
      out.write("                                <i class=\"material-symbols-outlined\">keyboard_arrow_down</i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div onclick=\"updateSelectedOption(event)\" id=\"drop\" class=\"dropdownMenu hidden\">\r\n");
      out.write("                                <span onclick=\"sortIdRowDescending()\">Ordem Crescente</span>\r\n");
      out.write("                                <span onclick=\"sortIdRowAscending()\">Ordem Decrescente</span>\r\n");
      out.write("                                <span onclick=\"sortNomeAlfabetica()\">Ordem Alfabética</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"dropdown-texto-container\">\r\n");
      out.write("                        <p>Mostrar: </p>\r\n");
      out.write("                        <div id=\"dropdownBtnContainerMostrar\" onmouseover=\"hoverDropdownMenuMostrar()\" class=\"dropdownContainer\">\r\n");
      out.write("                            <div class=\"dropdownBtnContainer\">\r\n");
      out.write("                                <div class=\"dropdownBtn\" id=\"selectedOptionMostrar\">Todas</div>\r\n");
      out.write("                                <i class=\"material-symbols-outlined\">keyboard_arrow_down</i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div onclick=\"updateSelectedOptionMostrar(event)\" id=\"dropmostrar\" class=\"dropdownMenu hidden\">\r\n");
      out.write("                                <span onclick=\"displayAll()\">Todas</span>\r\n");
      out.write("                                <span onclick=\"filterItemsByStatusInativo()\">Inativos</span>\r\n");
      out.write("                                <span onclick=\"filterItemsByStatusAtivo()\">Ativos</span>\r\n");
      out.write("                              \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"searchContainer\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Procurar Tabela Inteira..\" id=\"searchAll\">\r\n");
      out.write("                        <i class=\"material-symbols-outlined\">search</i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row-container\">\r\n");
      out.write("                    <div class=\"thead\">\r\n");
      out.write("                        <div class=\"id-row\">ID</div>\r\n");
      out.write("                        <div>Nome</div>\r\n");
      out.write("                        <div>Descrição</div>\r\n");
      out.write("                        <div>Status</div>\r\n");
      out.write("                        <div>Ações</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"table\" class=\"tabela-container container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
      model.ServicoDAO s = null;
      synchronized (_jspx_page_context) {
        s = (model.ServicoDAO) _jspx_page_context.getAttribute("s", PageContext.PAGE_SCOPE);
        if (s == null){
          s = new model.ServicoDAO();
          _jspx_page_context.setAttribute("s", s, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"pagination\" class=\"pagination\">\r\n");
      out.write("                        <button id=\"firstPageBtn\">Primeira</button>\r\n");
      out.write("                        <button class=\"prevnextbtn\" id=\"prevPageBtn\"><i class=\"material-symbols-outlined\">navigate_before</i></button>\r\n");
      out.write("                        <button class=\"prevnextbtn\" id=\"nextPageBtn\"><i class=\"material-symbols-outlined\">navigate_next</i></button>\r\n");
      out.write("                        <button id=\"lastPageBtn\">Última</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div id=\"pageInfo\" onload=\"updatePageInfo()\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./static/bulma/jquery-3.7.1.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"static/js/modoescuro.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"static/js/sumirTextoTextarea.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"static/js/PesquisaTabelajs\"></script>\r\n");
      out.write("        <script src=\"./static/js/pagination.js\"></script>\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("        <script src=\"./static/bulma/jquery-3.7.1.js\"></script>\r\n");
      out.write("        <script src=\"./static/js/showDesc.js\"></script>\r\n");
      out.write("        <script src=\"./static/js/dropdownRegistros.js\"></script>\r\n");
      out.write("        <script src=\"./static/js/filtrosTabela.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("s");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                        <div id=\"item\" class=\"tabela td\">\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"id-row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.idservico}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("                            <div class=\"nome-row\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("                            <div>\r\n");
          out.write("                                <i onclick=\"showDescDiv(this)\" style=\"cursor: pointer;\" class=\"material-symbols-outlined\">comment</i>\r\n");
          out.write("                                <span class=\"desc\" style=\"display:none\">\r\n");
          out.write("                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                </span>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"status\">\r\n");
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            <div class=\"acoes-div\">\r\n");
          out.write("                                <button class=\"botao-acoes\" onclick=\"confirmarExclusão(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.idservico}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">\r\n");
          out.write("                                    <i class=\"material-symbols-outlined\">delete</i>\r\n");
          out.write("                                </button>\r\n");
          out.write("                                <a class=\"botao-acoes\" href=\"gerenciar_servico.do?acao=alterar&idservico=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.idservico}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    <i class=\"material-symbols-outlined\">edit</i>\r\n");
          out.write("                                </a>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.status==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <span class=\"ativo\">Ativo</span>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.status==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <span class=\"inativo\">Inativo</span>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
