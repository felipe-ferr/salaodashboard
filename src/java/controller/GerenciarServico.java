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
import model.Servico;
import model.ServicoDAO;

/**
 *
 * @author Hecar
 */
public class GerenciarServico extends HttpServlet {

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
        String idservico = request.getParameter("idservico");

        Servico s = new Servico();

        try {

            ServicoDAO sDAO = new ServicoDAO();
            if (acao.equals("alterar")) {
                s = sDAO.getCarregaPorID(Integer.parseInt(idservico));
                if (s.getIdservico() > 0) {
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_servico.jsp");
                    request.setAttribute("servico", s);
                    disp.forward(request, response);
                } else {
                    mensagem = "Serviço não encontrado";
                }

            }

            if (acao.equals("deletar")) {
                s.setIdservico(Integer.parseInt(idservico));
                if (sDAO.deletar(s)) {
                    mensagem = "Desativado com sucesso!";
                } else {
                    mensagem = "Erro ao desativar o serviço!";
                }
            }
            
            if (acao.equals("ativar")) {
                s.setIdservico(Integer.parseInt(idservico));
                if (sDAO.ativar(s)) {
                    mensagem = "Ativado com sucesso!";
                } else {
                    mensagem = "Erro ao ativar o serviço!";
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
        out.println("                <a href=\"listar_servico.jsp\">Serviços</a>");
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
        String idservico = request.getParameter("idservico");
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        String status = request.getParameter("status");

        String mensagem = "";

        Servico s = new Servico();
        try {
            ServicoDAO sDAO = new ServicoDAO();
            if (!idservico.isEmpty()) {
                s.setIdservico(Integer.parseInt(idservico));
            }

            if (nome.equals("") || nome.isEmpty()) {
                mensagem = "Campos obrigatórios deverão ser preenchidos";
            } else {
                s.setNome(nome);
                s.setDescricao(descricao);
                s.setStatus(Integer.parseInt(status));
                if (sDAO.gravar(s)) {
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
        out.println("                <a href=\"listar_servico.jsp\">Serviços</a>");
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
