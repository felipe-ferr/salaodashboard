package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ServicoDAO;
import java.util.ArrayList;
import model.Servico;

public final class listar_005fservico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"./static/bulma/bulma.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/bulma/dataTables.bulma.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/bulma/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/bulma/css/bulma.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/bulma/css/bulma.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/css/menu.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"static/js/bulmadatatable.js\"></script>\n");
      out.write("       \n");
      out.write("        <script type=\"text/javascript\" src=\"static/js/traducao.js\"></script>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"grid-container\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <span class=\"sidebar-titulo\">Salão do Luciano</span>\n");
      out.write("                <a href=\"#\"><span class=\"material-symbols-outlined sidebar-icone\">calendar_month</span>Servicos</a>\n");
      out.write("                <a href=\"#\"><span class=\"material-symbols-outlined sidebar-icone\">person</span>Clientes</a>\n");
      out.write("                <a href=\"#\"><span class=\"material-symbols-outlined sidebar-icone\">cut</span>Serviços</a>\n");
      out.write("                \n");
      out.write("               <a href=\"#\" class=\"bottom\" ><span class=\"material-symbols-outlined sidebar-icone\">dark_mode</span></span>Modo Escuro</a>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        <div class=\"container-principal\">\n");
      out.write("      \n");
      out.write("\n");
      out.write("            <table class=\"table\" id=\"listarServico\">    \n");
      out.write("            <thead>\n");
      out.write("               <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Duração</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>Descrição</th>\n");
      out.write("                <th>Valor</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("            \n");
      out.write("            ");
      model.ServicoDAO a = null;
      synchronized (_jspx_page_context) {
        a = (model.ServicoDAO) _jspx_page_context.getAttribute("a", PageContext.PAGE_SCOPE);
        if (a == null){
          a = new model.ServicoDAO();
          _jspx_page_context.setAttribute("a", a, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table> \n");
      out.write("            \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write(" \n");
      out.write("        <script src=\"./static/bulma/jquery-3.7.1.js\"></script>\n");
      out.write("        <script src=\"./static/bulma/dataTables.js\"></script>\n");
      out.write("        <script src=\"./static/bulma/dataTables.bulma.js\"></script>\n");
      out.write("        <script src=\"./static/js/bulmadatatable.js\"></script>\n");
      out.write("     \n");
      out.write("        \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("a");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                   \n");
          out.write("            <tr>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.idservico}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.duracao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.valor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            </tr>\n");
          out.write("            ");
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
}
