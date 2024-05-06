package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AgendamentoDAO extends DatabaseDAO {
    
    public AgendamentoDAO() throws Exception{}
    
    public ArrayList<Agendamento> getLista() throws Exception{
        
        ArrayList<Agendamento> lista = new ArrayList<Agendamento>();
        String SQL = "Select a.*, s.nome, c.nome, u.nome FROM agendamento a "
                + "INNER JOIN servico s ON s.idservico = a.idservico " 
                + "INNER JOIN cliente c ON c.idcliente = a.idcliente "
                + "INNER JOIN usuario u ON u.idusuario = a.idusuario ";
        this.conectar();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(SQL);
        
        while(rs.next()){
            
            Agendamento a = new Agendamento();
            a.setIdagendamento(rs.getInt("a.idagendamento"));
            a.setValor(rs.getFloat("a.valor"));
            a.setData(rs.getDate("a.data"));
            a.setStatus(rs.getInt("a.status"));
            a.setDescricao(rs.getString("a.descricao"));
            a.setData_cadastro(rs.getDate("a.data_cadastro"));
            a.setHorario(rs.getString("a.horario"));
            
            Servico s = new Servico();
            s.setIdservico(rs.getInt("a.idservico"));
            s.setNome(rs.getString("s.nome"));
            
            Cliente c = new Cliente();
            c.setIdcliente(rs.getInt("a.idcliente"));
            c.setNome(rs.getString("c.nome"));
            
            Usuario u = new Usuario();
            u.setIdusuario(rs.getInt("a.idusuario"));
            u.setNome(rs.getString("u.nome"));
            
            a.setServico(s);
            a.setCliente(c);
            a.setUsuario(u);
                    
            lista.add(a);
        }
        
        this.desconectar();
        return lista;
        
    }
    
    public boolean gravar(Agendamento a) throws Exception {
    try {
        this.conectar();
        boolean proceed = false;
        boolean proceedConditionFailed = false; // Variable to track if the proceed condition failed
        
        // Verifica se existem registros com a mesma data e o mesmo horario
        String checkSql = "SELECT 1 FROM agendamento WHERE horario = ? AND data = ?" + (a.getIdagendamento() > 0 ? " AND idagendamento <> ?" : "");
        PreparedStatement checkStmt = conn.prepareStatement(checkSql);
        checkStmt.setString(1, a.getHorario());
        checkStmt.setDate(2, new Date(a.getData().getTime()));
        if (a.getIdagendamento() > 0) {
            checkStmt.setInt(3, a.getIdagendamento());
        }
        ResultSet rs = checkStmt.executeQuery();
        proceed = !rs.next(); // prosseguir se não existir registros com a mesma data e horario
        proceedConditionFailed = !proceed; // Set the variable to true if the proceed condition failed

        if (proceed) {
            String sql;
            if (a.getIdagendamento() == 0) {
                sql = "INSERT INTO agendamento(valor, data, status, descricao, data_cadastro, horario, idservico, idcliente, idusuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            } else {
                sql = "UPDATE agendamento SET valor=?, data=?, status=?, descricao=?, data_cadastro=?, horario=?, idservico=?, idcliente=?, idusuario=? WHERE idagendamento=?";
            }
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setFloat(1, a.getValor());
            pstm.setDate(2, new Date(a.getData().getTime()));
            pstm.setInt(3, a.getStatus());
            pstm.setString(4, a.getDescricao());
            pstm.setDate(5, new Date(a.getData_cadastro().getTime()));
            pstm.setString(6, a.getHorario());
            pstm.setInt(7, a.getServico().getIdservico());
            pstm.setInt(8, a.getCliente().getIdcliente());
            pstm.setInt(9, a.getUsuario().getIdusuario());
            if (a.getIdagendamento() > 0) {
                pstm.setInt(10, a.getIdagendamento());
            }

            int affectedRows = pstm.executeUpdate();
            this.desconectar();
            return affectedRows > 0; // Returns true if at least one row was affected
        } else {
            this.desconectar();
            return false; // No operation was performed due to existing row
        }
    } catch (Exception e) {
        System.out.println(e);
        this.desconectar();
        return false;
    }
}

    
    public Agendamento getCarregaPorID(int idagendamento) throws Exception{
        
        Agendamento a = new Agendamento();
        String sql = "Select a.*, s.nome, c.nome, u.nome FROM agendamento a "
                + "INNER JOIN servico s ON s.idservico = a.idservico " 
                + "INNER JOIN cliente c ON c.idcliente = a.idcliente "
                + "INNER JOIN usuario u ON u.idusuario = a.idusuario ";
        this.conectar();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        
        while(rs.next()){
            a.setIdagendamento(rs.getInt("idagendamento"));
            a.setValor(rs.getFloat("valor"));
            a.setData(rs.getDate("data"));
            a.setStatus(rs.getInt("status"));
            a.setDescricao(rs.getString("descricao"));
            a.setData_cadastro(rs.getDate("data_cadastro"));
            a.setHorario(rs.getString("horario"));
            
            Servico s = new Servico();
            s.setIdservico(rs.getInt("a.idservico"));
            s.setNome(rs.getString("s.nome"));
            a.setServico(s);
            
            Cliente c = new Cliente();
            c.setIdcliente(rs.getInt("a.idcliente"));
            c.setNome(rs.getString("c.nome"));
            a.setCliente(c);
            
            Usuario u = new Usuario();
            u.setIdusuario(rs.getInt("a.idusuario"));
            u.setNome(rs.getString("u.nome"));
            a.setUsuario(u);

        }
        
        this.desconectar();
        return a;
        
    }
    
    public boolean deletar (Agendamento a){
        
        try{
            this.conectar();
            String sql = "UPDATE agendamento SET status=0 WHERE idagendamento=? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, a.getIdagendamento());
            pstm.execute();
            this.desconectar();
            return true;
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    
    
    
}






