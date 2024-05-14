package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.GerenciarLogin;
import model.Usuario;

public final class form_005fagendamento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sidebar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
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

    Usuario ulogado = GerenciarLogin.verificarAcesso(request, response);
    request.setAttribute("ulogado", ulogado);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/form.css\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./static/js/mascaras.js\"></script>\r\n");
      out.write("\r\n");
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
      out.write("            <div class=\"container-principal\">\r\n");
      out.write("                <form method=\"POST\" action=\"gerenciar_agendamento.do\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("                    <a class=\"botaoinicio\"href=\"#\">\r\n");
      out.write("                        <i class=\"material-symbols-outlined\">arrow_back</i>Voltar ao início\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("                    <h1>Cadastrar Agendamento</h1>\r\n");
      out.write("\r\n");
      out.write("                    <hr>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" name=\"idagendamento\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agendamento.idagendamento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputContainerRow\">\r\n");
      out.write("                        <div class=\"inputContainer\">\r\n");
      out.write("                            <input id=\"money\" oninput=\"maskMoneyValue()\" required type=\"number\" name=\"valor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agendamento.valor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                            <p>Valor:</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">payments</i>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"inputContainer\">                      \r\n");
      out.write("                            <input id=\"dateInput\" required type=\"text\" name=\"data\" value=\"");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("                            <p>Data:</p>\r\n");
      out.write("                            <span class=\"erroMensagem\">A data não pode ser menor que hoje!</span>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">calendar_month</i>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <span style=\"margin-top: 5%; display: flex\" id=\"titlehorario\">Horário</span>\r\n");
      out.write("                    <div class=\"horarios-container fade-in\" id=\"semana\" style=\"display: flex\">\r\n");
      out.write("                        <label id=\"inputElement\" id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input  type=\"radio\" name=\"horario\" value=\"9:00\" />\r\n");
      out.write("                            <p>9:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"10:00\" />\r\n");
      out.write("                            <p>10:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"11:00\" />\r\n");
      out.write("                            <p>11:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"13:00\" />\r\n");
      out.write("                            <p>13:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"14:00\" />\r\n");
      out.write("                            <p>14:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"15:00\" />\r\n");
      out.write("                            <p>15:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"16:00\" />\r\n");
      out.write("                            <p>16:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"17:00\" />\r\n");
      out.write("                            <p>17:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"18:00\" />\r\n");
      out.write("                            <p>18:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"19:00\" />\r\n");
      out.write("                            <p>19:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"horarios-container fade-in\" id=\"domingo\" style=\"display:none\">\r\n");
      out.write("                        <label id=\"inputElement\" id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input  type=\"radio\" name=\"horario\" value=\"9:00\" />\r\n");
      out.write("                            <p>9:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"10:00\" />\r\n");
      out.write("                            <p>10:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label id=\"inputElement\" class=\"horario\">\r\n");
      out.write("                            <input type=\"radio\" name=\"horario\" value=\"11:00\" />\r\n");
      out.write("                            <p>11:00</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">schedule</i>\r\n");
      out.write("                        </label>                    \r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputContainerRow\">  \r\n");
      out.write("                        <div class=\"inputContainer\">\r\n");
      out.write("                            <input  id=\"date\" required type=\"text\" name=\"data_cadastro\" value=\"");
      if (_jspx_meth_fmt_formatDate_1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("                            <p style=\"font-size:0.7vw\">Data de Cadastro:</p>\r\n");
      out.write("                            <i class=\"material-symbols-outlined\">calendar_month</i>\r\n");
      out.write("                        </div>    \r\n");
      out.write("                        <div class=\"preencherHoje\">\r\n");
      out.write("                            <label for=\"fillDateCheckbox\">Data de hoje</label>\r\n");
      out.write("                            <input onclick=\"fillDate()\" id=\"fillDateCheckbox\" type=\"checkbox\">\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <hr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"inputContainerRow\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"containerColumn\">\r\n");
      out.write("                            <span>Status</span>\r\n");
      out.write("                            <div onclick=\"setupDropdown()\" id=\"dropdownBtnContainer\" class=\"dropdownContainer\">\r\n");
      out.write("                                <div class=\"dropdownBtnContainer\">\r\n");
      out.write("                                    <div class=\"dropdownBtn\" id=\"selectedOptionMostrar\">Ativo</div>\r\n");
      out.write("                                    <i class=\"material-symbols-outlined\">keyboard_arrow_down</i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div id=\"dropstatus\" class=\"dropdownMenu hidden\">\r\n");
      out.write("                                    <label class=\"label\"><input checked type=\"radio\" name=\"status\" value=\"1\">Ativo</label>\r\n");
      out.write("                                    <label class=\"label\"><input type=\"radio\" name=\"status\" value=\"0\">Inativo</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"containerColumn\">\r\n");
      out.write("                            <span>Serviço</span>\r\n");
      out.write("                            <div id=\"dropdownBtnServico\" class=\"dropdownContainer\">\r\n");
      out.write("                                <div class=\"dropdownBtnContainer\">\r\n");
      out.write("                                    <div class=\"dropdownBtn\" id=\"selectedOptionServico\">Selecionar</div>\r\n");
      out.write("                                    <i class=\"material-symbols-outlined\">keyboard_arrow_down</i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div id=\"dropservico\" class=\"dropdownMenu hidden\">\r\n");
      out.write("                                    ");
      model.ServicoDAO servico = null;
      synchronized (_jspx_page_context) {
        servico = (model.ServicoDAO) _jspx_page_context.getAttribute("servico", PageContext.PAGE_SCOPE);
        if (servico == null){
          servico = new model.ServicoDAO();
          _jspx_page_context.setAttribute("servico", servico, PageContext.PAGE_SCOPE);
        }
      }
      out.write("                   \r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"containerColumn\">\r\n");
      out.write("                            <span>Cliente</span>\r\n");
      out.write("                            <div id=\"dropdownBtnCliente\" class=\"dropdownContainer\">\r\n");
      out.write("                                <div class=\"dropdownBtnContainer\">\r\n");
      out.write("                                    <div class=\"dropdownBtn\" id=\"selectedOptionCliente\">Selecionar</div>\r\n");
      out.write("                                    <i class=\"material-symbols-outlined\">keyboard_arrow_down</i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div id=\"dropcliente\" class=\"dropdownMenu hidden\">\r\n");
      out.write("                                    ");
      model.ClienteDAO cliente = null;
      synchronized (_jspx_page_context) {
        cliente = (model.ClienteDAO) _jspx_page_context.getAttribute("cliente", PageContext.PAGE_SCOPE);
        if (cliente == null){
          cliente = new model.ClienteDAO();
          _jspx_page_context.setAttribute("cliente", cliente, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"containerColumn\">\r\n");
      out.write("                            <span>Usuário</span>\r\n");
      out.write("                            <div id=\"dropdownBtnUsuario\" class=\"dropdownContainer\">\r\n");
      out.write("                                <div class=\"dropdownBtnContainer\">\r\n");
      out.write("                                    <div class=\"dropdownBtn\" id=\"selectedOptionUsuario\">Selecionar</div>\r\n");
      out.write("                                    <i class=\"material-symbols-outlined\">keyboard_arrow_down</i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div id=\"dropusuario\" class=\"dropdownMenu hidden\">\r\n");
      out.write("                                    ");
      model.UsuarioDAO usuario = null;
      synchronized (_jspx_page_context) {
        usuario = (model.UsuarioDAO) _jspx_page_context.getAttribute("usuario", PageContext.PAGE_SCOPE);
        if (usuario == null){
          usuario = new model.UsuarioDAO();
          _jspx_page_context.setAttribute("usuario", usuario, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <script type=\"text/javascript\" src=\"./static/js/sumirTextoTextarea.js\"></script>\r\n");
      out.write("                    <div style=\"margin-top: 5vh\" class=\"inputContainer\">\r\n");
      out.write("                        <p class=\"textareatexto\" id=\"ptextarea\">Descrição:</p>\r\n");
      out.write("                        <textarea id=\"area\" onclick=\"sumirp()\" type=\"text\" name=\"descricao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agendamento.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"submit\"class=\"submit\">Cadastrar Agendamento</button>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./static/js/dropdownForms.js\"></script>\r\n");
      out.write("        <script src=\"./static/js/mascaras.js\"></script>\r\n");
      out.write("        <script src=\"./static/js/fillDate.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                                $(document).ready(function () {\r\n");
      out.write("                                    $('#date').mask('00/00/0000');\r\n");
      out.write("                                    $('.time').mask('00:00:00');\r\n");
      out.write("                                    $('.cep').mask('00000-000');\r\n");
      out.write("                                    $('.phone').mask('(00) 00000-0000');\r\n");
      out.write("                                    $('.cpf').mask('000.000.000-00');\r\n");
      out.write("\r\n");
      out.write("                                });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agendamento.data}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent(null);
    _jspx_th_fmt_formatDate_1.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${agendamento.data_cadastro}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servico.lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <label class=\"label\"><input checked type=\"radio\" name=\"idservico\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.idservico}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\r\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("c");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <label class=\"label\"><input checked type=\"radio\" name=\"idcliente\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.idcliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("u");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <label class=\"label\"><input checked type=\"radio\" name=\"idusuario\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.idusuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
