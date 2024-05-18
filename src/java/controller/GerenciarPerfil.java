/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Perfil;
import model.PerfilDAO;

/**
 *
 * @author Hecar
 */
public class GerenciarPerfil extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String mensagem = "";

        String acao = request.getParameter("acao");
        String idperfil = request.getParameter("idperfil");

        Perfil p = new Perfil();

        try {

            PerfilDAO pDAO = new PerfilDAO();
            if (acao.equals("alterar")) {
                p = pDAO.getCarregaPorID(Integer.parseInt(idperfil));
                if (p.getIdperfil() > 0) {
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_perfil.jsp");
                    request.setAttribute("perfil", p);
                    disp.forward(request, response);
                } else {
                    mensagem = "Perfil não encontrado";
                }

            }

            if (acao.equals("deletar")) {
                p.setIdperfil(Integer.parseInt(idperfil));
                if (pDAO.deletar(p)) {
                    mensagem = "Excluído com sucesso!";
                } else {
                    mensagem = "Erro ao excluir o perfil!";
                }
            }

        } catch (Exception e) {
            out.print(e);
            mensagem = "Erro ao executar";
        }

        out.println("<html>");
        out.println("    <head>");
        out.println("<script>");
        out.println("function getCookie(name) {");
        out.println("    let nameEQ = name + \"=\";");
        out.println("    let ca = document.cookie.split(';');");
        out.println("    for (let i = 0; i < ca.length; i++) {");
        out.println("        let c = ca[i];");
        out.println("        while (c.charAt(0) == ' ')");
        out.println("            c = c.substring(1, c.length);");
        out.println("        if (c.indexOf(nameEQ) == 0)");
        out.println("            return c.substring(nameEQ.length, c.length);");
        out.println("    }");
        out.println("    return null;");
        out.println("}");
        out.println("function escuro() {");
        out.println("    document.documentElement.style.setProperty('--cor-clara', '#252525');");
        out.println("    document.documentElement.style.setProperty('--cor-escura', '#181818');");
        out.println("    document.documentElement.style.setProperty('--cor-texto', '#AFAFAF');");
        out.println("    document.documentElement.style.setProperty('--cor-texto-preto', '#DFDFDF');");
        out.println("    document.documentElement.style.setProperty('--cor-tabela-stripe', '#161616');");
        out.println("}");
        out.println("function light() {");
        out.println("    document.documentElement.style.setProperty('--cor-clara', '#eaeaea');");
        out.println("    document.documentElement.style.setProperty('--cor-escura', '#f5f5f5');");
        out.println("    document.documentElement.style.setProperty('--cor-texto', '##0F0300');");
        out.println("    document.documentElement.style.setProperty('--cor-texto-preto', 'black');");
        out.println("    document.documentElement.style.setProperty('--cor-tabela-stripe', '#F0F0F0');");
        out.println("}");
        out.println("(function checkCookieAndApplyTheme() {");
        out.println("    let theme = getCookie(\"theme\");");
        out.println("    if (theme === \"dark\") {");
        out.println("        escuro();");
        out.println("    } else if (theme === \"light\") {");
        out.println("        light();");
        out.println("    }");
        out.println("})();");
        out.println("</script>");
        out.println("        <meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\">");
        out.println("        <link rel=\"stylesheet\" href=\"./static/css/mensagem.css\">");
        out.println("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Salão do Luciano</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <div class=\"container\">");
        out.println("            <h1>" + mensagem + "</h1>");
        out.println("            <div class=\"row\">");
        out.println("                <a href=\"index.jsp\">Início</a>");
        out.println("                <a href=\"listar_perfil.jsp\">Perfis</a>");
        out.println("            </div>");
        out.println("        </div>");
        out.println("<script type=\"text/javascript\" src=\"static/js/modoescuro.js\"></script>");
        out.println("    </body>");
        out.println("</html>");

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String idperfil = request.getParameter("idperfil");
        String nome = request.getParameter("nome");

        String mensagem = "";

        Perfil p = new Perfil();
        try {
            PerfilDAO pDAO = new PerfilDAO();
            if (!idperfil.isEmpty()) {
                p.setIdperfil(Integer.parseInt(idperfil));
            }

            if (nome.equals("") || nome.isEmpty()) {
                mensagem = "Campos obrigatórios deverão ser preenchidos";
            } else {
                p.setNome(nome);
                if (pDAO.gravar(p)) {
                    mensagem = "Gravado com sucesso!";
                } else {
                    mensagem = "Falha ao gravar informações no banco de dados. Tente novamente";
                }
            }
        } catch (Exception e) {
            out.print(e);
            mensagem = "Erro ao executar";
        }

        out.println("<html>");
        out.println("    <head>");
        out.println("<script>");
        out.println("function getCookie(name) {");
        out.println("    let nameEQ = name + \"=\";");
        out.println("    let ca = document.cookie.split(';');");
        out.println("    for (let i = 0; i < ca.length; i++) {");
        out.println("        let c = ca[i];");
        out.println("        while (c.charAt(0) == ' ')");
        out.println("            c = c.substring(1, c.length);");
        out.println("        if (c.indexOf(nameEQ) == 0)");
        out.println("            return c.substring(nameEQ.length, c.length);");
        out.println("    }");
        out.println("    return null;");
        out.println("}");
        out.println("function escuro() {");
        out.println("    document.documentElement.style.setProperty('--cor-clara', '#252525');");
        out.println("    document.documentElement.style.setProperty('--cor-escura', '#181818');");
        out.println("    document.documentElement.style.setProperty('--cor-texto', '#AFAFAF');");
        out.println("    document.documentElement.style.setProperty('--cor-texto-preto', '#DFDFDF');");
        out.println("    document.documentElement.style.setProperty('--cor-tabela-stripe', '#161616');");
        out.println("}");
        out.println("function light() {");
        out.println("    document.documentElement.style.setProperty('--cor-clara', '#eaeaea');");
        out.println("    document.documentElement.style.setProperty('--cor-escura', '#f5f5f5');");
        out.println("    document.documentElement.style.setProperty('--cor-texto', '##0F0300');");
        out.println("    document.documentElement.style.setProperty('--cor-texto-preto', 'black');");
        out.println("    document.documentElement.style.setProperty('--cor-tabela-stripe', '#F0F0F0');");
        out.println("}");
        out.println("(function checkCookieAndApplyTheme() {");
        out.println("    let theme = getCookie(\"theme\");");
        out.println("    if (theme === \"dark\") {");
        out.println("        escuro();");
        out.println("    } else if (theme === \"light\") {");
        out.println("        light();");
        out.println("    }");
        out.println("})();");
        out.println("</script>");
        out.println("        <meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\">");
        out.println("        <link rel=\"stylesheet\" href=\"./static/css/mensagem.css\">");
        out.println("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Salão do Luciano</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <div class=\"container\">");
        out.println("            <h1>" + mensagem + "</h1>");
        out.println("            <div class=\"row\">");
        out.println("                <a href=\"index.jsp\">Início</a>");
        out.println("                <a href=\"listar_perfil.jsp\">Perfis</a>");
        out.println("            </div>");
        out.println("        </div>");
        out.println("<script type=\"text/javascript\" src=\"static/js/modoescuro.js\"></script>");
        out.println("    </body>");
        out.println("</html>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
