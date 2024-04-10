/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
        String data = request.getParameter("data");
        String valor = request.getParameter("valor");
        String status = request.getParameter("status");
        String descricao = request.getParameter("descricao");
        String data_cadastro = request.getParameter("data_cadastro");
        String horario = request.getParameter("horario");
        String idservico = request.getParameter("idservico");
        String idcliente = request.getParameter("idcliente");
        String idusuario = request.getParameter("idusuario");
        
        String mensagem = "";
        
        Agendamento a = new Agendamento();
        if(!idagendamento.isEmpty()){
            a.setIdagendamento(Integer.parseInt(idagendamento));
        }
            
        if(data.equals("")||valor.equals("")||status.equals("")||data_cadastro.equals("")||horario.equals("")||idservico.equals("")||idcliente.equals("")||idusuario.equals("")){
            mensagem = "Campos obrigatórios deverão ser preenchidos";
        }else{
            
            a.setData(data);
            a.setValor(Integer.parseInt(valor));
            a.setStatus(Integer.parseInt(status));
            a.setDescricao(descricao);
            a.setData_cadastro(data_cadastro);
            a.setHorario(horario);
            
            Servico s = new Servico();
            s.setIdservico(Integer.parseInt(idservico));
            
            Cliente c = new Cliente();
            c.setIdcliente(Integer.parseInt(idcliente));
            
            Usuario u = new Usuario();
            u.setIdusuario(Integer.parseInt(idusuario));

            try{
                
                AgendamentoDAO aDAO = new AgendamentoDAO();
                if(aDAO.gravar(a)){
                    mensagem = "Gravado com sucesso!";
                }else{
                    mensagem = "Erro ao gravar no banco de dados!";
                }
                
            }catch(Exception e){
                out.print(e);
                mensagem = "Erro ao executar";
            }

            out.println("<script type='text/javascript'>");
            out.println("alert('"+mensagem+"');");
            out.println("location.href='listar_usuario.jsp';");
            out.println("</script>");
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
