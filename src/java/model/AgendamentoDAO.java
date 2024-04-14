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
    
    public boolean gravar (Agendamento a){
       
        try{
            String sql;
            this.conectar();
            if(a.getIdagendamento()==0){
                sql = "INSERT INTO agendamento(data, status, descricao, data_cadastro, horario, idservico, idcliente, idusuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            }else{
                sql = "UPDATE agendamento SET data=?, status=?, descricao=?, data_cadastro=?, horario=?, idservico=?, idcliente=?, idusuario=? WHERE idagendamento=?"; 
            }

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setDate(1, new Date(a.getData().getTime()) );
            pstm.setInt(2, a.getStatus());
            pstm.setString(3, a.getDescricao());
            pstm.setDate(4, new Date(a.getData_cadastro().getTime()) );
            pstm.setString(5, a.getHorario());
            pstm.setInt(6, a.getServico().getIdservico());
            pstm.setInt(7, a.getCliente().getIdcliente());
            pstm.setInt(8, a.getUsuario().getIdusuario());

            if(a.getIdagendamento()>0){
                pstm.setInt(9, a.getIdagendamento());
            }

            pstm.execute();
            this.desconectar();
            return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public Agendamento getCarregaPorID(int idagendamento) throws Exception{
        
        Agendamento a = new Agendamento();
        String sql = "SELECT a.*, s.servico, c.cliente, u.usuario FROM agendamento a "
                + "INNER JOIN servico s ON s.idservico = a.idservico "
                + "INNER JOIN cliente c ON c.idcliente = a.idcliente "
                + "INNER JOIN usuario u ON u.idusuario = a.idusuario "
                + "WHERE a.idagendamento=? ";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idagendamento);
        ResultSet rs = pstm.executeQuery();
        
        if(rs.next()){
            a.setIdagendamento(rs.getInt("a.idagendamento"));
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

        }
        
        this.desconectar();
        return a;
        
    }
    
    public boolean deletar (Cliente c){
        
        try{
            this.conectar();
            String sql = "DELETE FROM cliente WHERE idcliente=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, c.getIdcliente());
            pstm.execute();
            this.desconectar();
            return true;
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
}