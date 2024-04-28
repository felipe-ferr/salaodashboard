package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("\n");
      out.write("  <h1>Pagination with Vanilla JavaScript</h1>\n");
      out.write("  <ul id=\"paginated-list\" data-current-page=\"1\" aria-live=\"polite\">\n");
      out.write("    <li>Item 1</li>\n");
      out.write("    <li>Item 2</li>\n");
      out.write("    <li>Item 3</li>\n");
      out.write("    <li>Item 4</li>\n");
      out.write("    <li>Item 5</li>\n");
      out.write("    <li>Item 6</li>\n");
      out.write("    <li>Item 7</li>\n");
      out.write("    <li>Item 8</li>\n");
      out.write("    <li>Item 9</li>\n");
      out.write("    <li>Item 10</li>\n");
      out.write("    <li>Item 11</li>\n");
      out.write("    <li>Item 12</li>\n");
      out.write("    <li>Item 13</li>\n");
      out.write("    <li>Item 14</li>\n");
      out.write("    <li>Item 15</li>\n");
      out.write("    <li>Item 16</li>\n");
      out.write("    <li>Item 17</li>\n");
      out.write("    <li>Item 18</li>\n");
      out.write("    <li>Item 19</li>\n");
      out.write("    <li>Item 20</li>\n");
      out.write("    <li>Item 21</li>\n");
      out.write("    <li>Item 22</li>\n");
      out.write("    <li>Item 23</li>\n");
      out.write("    <li>Item 24</li>\n");
      out.write("    <li>Item 25</li>\n");
      out.write("    <li>Item 26</li>\n");
      out.write("    <li>Item 27</li>\n");
      out.write("    <li>Item 28</li>\n");
      out.write("    <li>Item 29</li>\n");
      out.write("    <li>Item 30</li>\n");
      out.write("    <li>Item 31</li>\n");
      out.write("    <li>Item 32</li>\n");
      out.write("    <li>Item 33</li>\n");
      out.write("    <li>Item 34</li>\n");
      out.write("    <li>Item 35</li>\n");
      out.write("    <li>Item 36</li>\n");
      out.write("    <li>Item 37</li>\n");
      out.write("    <li>Item 38</li>\n");
      out.write("    <li>Item 39</li>\n");
      out.write("    <li>Item 40</li>\n");
      out.write("    <li>Item 41</li>\n");
      out.write("    <li>Item 42</li>\n");
      out.write("    <li>Item 43</li>\n");
      out.write("    <li>Item 44</li>\n");
      out.write("    <li>Item 45</li>\n");
      out.write("    <li>Item 46</li>\n");
      out.write("    <li>Item 47</li>\n");
      out.write("    <li>Item 48</li>\n");
      out.write("    <li>Item 49</li>\n");
      out.write("    <li>Item 50</li>\n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("  <nav class=\"pagination-container\">\n");
      out.write("    <button class=\"pagination-button\" id=\"prev-button\" aria-label=\"Previous page\" title=\"Previous page\">\n");
      out.write("      &lt;\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div id=\"pagination-numbers\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <button class=\"pagination-button\" id=\"next-button\" aria-label=\"Next page\" title=\"Next page\">\n");
      out.write("      &gt;\n");
      out.write("    </button>\n");
      out.write("  </nav>\n");
      out.write("</main>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("  Pen by <a href=\"https://www.jemimaabu.com\" target=\"_blank\" rel=\"noopener\">Jemima Abu</a> <span class=\"heart\">&hearts;</span>\n");
      out.write("</footer>\n");
      out.write("        \n");
      out.write("        <script src=\"../static/js/pagination.js\"></script>\n");
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
