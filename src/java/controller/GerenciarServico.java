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
        
        try{
            
            ServicoDAO sDAO = new ServicoDAO();
            if(acao.equals("alterar")){
                s = sDAO.getCarregaPorID(Integer.parseInt(idservico));
                if(s.getIdservico()>0){
                    RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_servico.jsp");
                    request.setAttribute("servico", s);
                    disp.forward(request, response);
                }else{
                    mensagem = "Serviço não encontrado";
                }
                
            }
            
            if(acao.equals("deletar")){
                s.setIdservico(Integer.parseInt(idservico));
                if(sDAO.deletar(s)){
                    mensagem = "Desativado com sucesso!";
                }else{
                    mensagem = "Erro ao desativar o serviço!";
                }
            }
            
        }catch(Exception e){
            out.print(e);
            mensagem = "Erro ao executar";
        }
        
        out.println("<script type='text/javascript'>");
        out.println("alert('"+mensagem+"');");
        out.println("location.href='listar_servico.jsp';");
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
        String idservico = request.getParameter("idservico");
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        String status = request.getParameter("status");
        
        String mensagem="";
        
        Servico s = new Servico();
        try{
            ServicoDAO sDAO = new ServicoDAO();
            if(!idservico.isEmpty()){
                s.setIdservico(Integer.parseInt(idservico));
            }
            
            if(nome.equals("")||nome.isEmpty()){
                mensagem = "Campos obrigatórios deverão ser preenchidos";
            }else{
                s.setNome(nome);
                s.setDescricao(descricao);
                s.setStatus(Integer.parseInt(status));
                if(sDAO.gravar(s)){
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
        out.println("location.href='listar_servico.jsp';");
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