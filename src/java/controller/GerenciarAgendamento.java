/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Agendamento;
import model.AgendamentoDAO;
import model.Cliente;
import model.Servico;
import model.Usuario;

/**
 *
 * @author Hecar
 */
public class GerenciarAgendamento extends HttpServlet {

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
        String acao = request.getParameter("acao");
        String idagendamento = request.getParameter("idagendamento");

        String mensagem = "";

        try {
            Agendamento a = new Agendamento();
            AgendamentoDAO aDAO = new AgendamentoDAO();
            if (acao.equals("alterar")) {
                a = aDAO.getCarregaPorID(Integer.parseInt(idagendamento));
                if (a.getIdagendamento() > 0) {
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_agendamento.jsp");
                    request.setAttribute("agendamento", a);
                    disp.forward(request, response);
                } else {
                    mensagem = "Agendamento não encontrado";
                }
            }

            if (acao.equals("deletar")) {
                a.setIdagendamento(Integer.parseInt(idagendamento));
                if (aDAO.deletar(a)) {
                    mensagem = "Agendamento cancelado!";
                } else {
                    mensagem = "Erro ao cancelar o agendamento!";
                }
            }
            if (acao.equals("ativar")) {
                a.setIdagendamento(Integer.parseInt(idagendamento));
                if (aDAO.ativar(a)) {
                    mensagem = "Agendamento ativado com sucesso!";
                } else {
                    mensagem = "Erro ao ativar o agendamento!";
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
        out.println("                <a href=\"listar_agendamento.jsp\">Agendamentos</a>");
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
        String idagendamento = request.getParameter("idagendamento");
        String valor = request.getParameter("valor");
        String data = request.getParameter("data");
        String status = request.getParameter("status");
        String descricao = request.getParameter("descricao");
        String data_cadastro = request.getParameter("data_cadastro");
        String horario = request.getParameter("horario");
        String idservico = request.getParameter("idservico");
        String idcliente = request.getParameter("idcliente");
        String idusuario = request.getParameter("idusuario");

        String mensagem = "";
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Agendamento a = new Agendamento();
            AgendamentoDAO aDAO = new AgendamentoDAO();
            if (!idagendamento.isEmpty()) {
                a.setIdagendamento(Integer.parseInt(idagendamento));
            }

            if (data.equals("") || status.equals("") || data_cadastro.equals("") || horario.equals("") || idservico.equals("") || idcliente.equals("") || idusuario.equals("")) {
                mensagem = "Campos obrigatórios deverão ser preenchidos";
            } else {
                a.setValor(Float.parseFloat(valor));
                if (!data.isEmpty()) {
                    a.setData(df.parse(data));
                }
                a.setStatus(Integer.parseInt(status));
                a.setDescricao(descricao);
                if (!data_cadastro.isEmpty()) {
                    a.setData_cadastro(df.parse(data_cadastro));
                }
                a.setHorario(horario);

                Servico s = new Servico();
                s.setIdservico(Integer.parseInt(idservico));
                a.setServico(s);

                Cliente c = new Cliente();
                c.setIdcliente(Integer.parseInt(idcliente));
                a.setCliente(c);

                Usuario u = new Usuario();
                u.setIdusuario(Integer.parseInt(idusuario));
                a.setUsuario(u);

                if (aDAO.gravar(a)) {
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
        out.println("                <a href=\"listar_agendamento.jsp\">Agendamentos</a>");
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
