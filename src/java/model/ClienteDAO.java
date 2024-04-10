package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteDAO extends DatabaseDAO {
    
    public ClienteDAO() throws Exception{}
    
    public ArrayList<Cliente> getLista() throws Exception{
        
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        String SQL = "Select * FROM cliente";
        this.conectar();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(SQL);
        
        while(rs.next()){
            Cliente c = new Cliente();
            c.setIdcliente(rs.getInt("idcliente"));
            c.setNome(rs.getString("nome"));
            c.setCpf(rs.getString("cpf"));
            c.setTelefone(rs.getString("telefone"));
            c.setEmail(rs.getString("email"));
            c.setStatus(rs.getInt("status"));
            lista.add(c);
        }
        this.desconectar();
        return lista;
        
    }
    
    public boolean gravar (Cliente c){
        
        try{
            String sql;
            this.conectar();
            if(c.getIdcliente()==0){
                sql = "INSERT INTO cliente(nome, cpf, telefone, email, status) VALUES(?, ?, ?, ?, ?)";
            }else{
                sql = "UPDATE cliente SET nome=?, cpf=?, telefone=?, email=?, status=? WHERE idcliente=?"; 
            }

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,c.getNome());
            pstm.setString(2,c.getCpf());
            pstm.setString(3,c.getTelefone());
            pstm.setString(4,c.getEmail());
            pstm.setInt(5,c.getStatus());

            if(c.getIdcliente()>0){
                pstm.setInt(6,c.getIdcliente());
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
            c.setStatus(rs.getInt("status"));

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
