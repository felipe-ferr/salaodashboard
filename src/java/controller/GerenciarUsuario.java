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
import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author Hecar
 */
public class GerenciarUsuario extends HttpServlet {

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
        String idusuario = request.getParameter("idusuario");

        Usuario u = new Usuario();

        try {

            UsuarioDAO uDAO = new UsuarioDAO();
            if (acao.equals("alterar")) {
                u = uDAO.getCarregaPorID(Integer.parseInt(idusuario));
                if (u.getIdusuario() > 0) {
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_usuario.jsp");
                    request.setAttribute("usuario", u);
                    disp.forward(request, response);
                } else {
                    mensagem = "Serviço não encontrado";
                }

            }

            if (acao.equals("deletar")) {
                u.setIdusuario(Integer.parseInt(idusuario));
                if (uDAO.deletar(u)) {
                    mensagem = "Desativado com sucesso!";
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
        out.println("                <a href=\"listar_usuario.jsp\">Usuários</a>");
        out.println("            </div>");
        out.println("        </div>");
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
        String idusuario = request.getParameter("idusuario");
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String status = request.getParameter("status");
        String idperfil = request.getParameter("idperfil");

        String mensagem = "";

        Usuario u = new Usuario();
        if (!idusuario.isEmpty()) {
            u.setIdusuario(Integer.parseInt(idusuario));
        }

        if (nome.equals("") || login.equals("") || senha.equals("") || status.equals("") || idperfil.equals("")) {
            mensagem = "Campos obrigatórios deverão ser preenchidos";
        } else {
            u.setNome(nome);
            u.setCpf(cpf);
            u.setTelefone(telefone);
            u.setLogin(login);
            u.setSenha(senha);
            u.setStatus(Integer.parseInt(status));

            Perfil p = new Perfil();
            p.setIdperfil(Integer.parseInt(idperfil));
            u.setPerfil(p);

            try {

                UsuarioDAO uDAO = new UsuarioDAO();
                if (uDAO.gravar(u)) {
                    mensagem = "Gravado com sucesso!";
                } else {
                    mensagem = "Erro ao gravar no banco de dados!";
                }

            } catch (Exception e) {
                out.print(e);
                mensagem = "Erro ao executar";
            }

            out.println("<html>");
            out.println("    <head>");
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
            out.println("                <a href=\"listar_usuario.jsp\">Usuários</a>");
            out.println("            </div>");
            out.println("        </div>");
            out.println("    </body>");
            out.println("</html>");
        }

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
