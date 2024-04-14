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
import model.Cliente;
import model.ClienteDAO;

/**
 *
 * @author Hecar
 */
public class GerenciarCliente extends HttpServlet {


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
        String idcliente = request.getParameter("idcliente");
        
        Cliente c = new Cliente();
        
        try{
            
            ClienteDAO cDAO = new ClienteDAO();
            if(acao.equals("alterar")){
                c = cDAO.getCarregaPorID(Integer.parseInt(idcliente));
                if(c.getIdcliente()>0){
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_cliente.jsp");
                    request.setAttribute("cliente", c);
                    disp.forward(request, response);
                }else{
                    mensagem = "Cliente não encontrado";
                }
                
            }
            
            if(acao.equals("deletar")){
                c.setIdcliente(Integer.parseInt(idcliente));
                if(cDAO.deletar(c)){
                    mensagem = "Desativado com sucesso!";
                }else{
                    mensagem = "Erro ao desativar o usuário!";
                }
            }
            
        }catch(Exception e){
            out.print(e);
            mensagem = "Erro ao executar";
        }
        
        out.println("<script type='text/javascript'>");
        out.println("alert('"+mensagem+"');");
        out.println("location.href='listar_cliente.jsp';");
        out.println("</script>");
        
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
        String idcliente = request.getParameter("idcliente");
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String status = request.getParameter("status");
        
        String mensagem="";
        
        Cliente c = new Cliente();
        try{
            ClienteDAO cDAO = new ClienteDAO();
            if(!idcliente.isEmpty()){
                c.setIdcliente(Integer.parseInt(idcliente));
            }
            
            if(nome.equals("")||nome.isEmpty()){
                mensagem = "Campos obrigatórios deverão ser preenchidos";
            }else{
                c.setNome(nome);
                c.setCpf(cpf);
                c.setTelefone(telefone);
                c.setEmail(email);
                c.setStatus(Integer.parseInt(status));
                if(cDAO.gravar(c)){
                    mensagem = "Gravado com sucesso!";
                }else{
                    mensagem = "Erro ao gravar no banco de dados!";
                }
            }
        }catch(Exception e){
            out.print(e);
            mensagem = "Erro ao executar";
        }
        
        out.println("<script type='text/javascript'>");
        out.println("alert('"+mensagem+"');");
        out.println("location.href='listar_cliente.jsp';");
        out.println("</script>");
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
