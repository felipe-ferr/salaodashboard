package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AgendamentoDAO extends DatabaseDAO {
    
    public AgendamentoDAO() throws Exception{}
    
    public ArrayList<Agendamento> getLista() throws Exception{
        
        ArrayList<Agendamento> lista = new ArrayList<Agendamento>();
        String SQL = "Select a.* FROM s.nome, c.nome, u.nome FROM agendamento a "
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
            a.setStatus(rs.getInt("a.status"));
            a.setDescricao(rs.getString("a.descricao"));
            a.setData_cadastro(rs.getDate("a.data_cadastro"));
            a.setHorario(rs.getTime("a.horario"));
            
            Servico s = new Servico();
            s.setIdservico(rs.getInt("a.idservico"));
            s.setNome(rs.getString("s.nome"));
            
            Cliente c = new Cliente();
            c.setIdcliente(rs.getInt("a.idcliente"));
            c.setNome(rs.getString("c.nome"));
            
            /*Usuario u = new Usuario();
            u.setIdusuario(rs.getInt("a.idusuario"));
            u.setNome(rs.getString("u.nome"));*/
            
            a.setServico(s);
            a.setCliente(c);
            //a.setUsuario(u);
                    
            lista.add(a);
        }
        
        this.desconectar();
        return lista;
        
    }
    
    public boolean gravar (Agendamento a){
        /*
        try{
            String sql;
            this.conectar();
            if(a.getIdagendamento()==0){
                sql = "INSERT INTO agendamento(data, valor, status, descricao, data_cadastro, horario) "
                        + "VALUES(?, ?, ?, ?, ?, ?)";
            }else{
                sql = "UPDATE agendamento SET nome=?, cpf=?, telefone=?, email=? WHERE idcliente=?"; 
            }

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,a.getNome());
            pstm.setString(2,a.getCpf());
            pstm.setString(3,a.getTelefone());
            pstm.setString(4,a.getEmail());

            if(a.getIdcliente()>0){
                pstm.setInt(5,a.getIdcliente());
            }

            pstm.execute();
            this.desconectar();
            return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        */
    }
    
    public Cliente getCarregaPorID(int idcliente) throws Exception{
        
        Cliente c = new Cliente();
        String sql = "SELECT * FROM cliente WHERE idcliente=?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idcliente);
        ResultSet rs = pstm.executeQuery();
        
        if(rs.next()){
            c.setIdcliente(rs.getInt("idcliente"));
            c.setNome(rs.getString("nome"));
            c.setCpf(rs.getString("cpf"));
            c.setTelefone(rs.getString("telefone"));
            c.setEmail(rs.getString("email"));

        }
        
        this.desconectar();
        return c;
        
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