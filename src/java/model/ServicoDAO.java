package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoDAO extends DatabaseDAO{
    public ServicoDAO() throws Exception{}
    
    public ArrayList<Servico> getLista() throws Exception{
        ArrayList<Servico> lista = new ArrayList<Servico>();
        String SQL = "Select * FROM servico";
        this.conectar();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(SQL);
        while(rs.next()){
            Servico s = new Servico();
            s.setIdservico(rs.getInt("idservico"));
            s.setDuracao(rs.getInt("duracao"));
            s.setStatus(rs.getInt("status"));
            s.setNome(rs.getString("nome"));
            s.setDescricao(rs.getString("descricao"));
            s.setValor(rs.getFloat("valor"));
            lista.add(s);
        }
        this.desconectar();
        return lista;
        
    }
    
    public boolean gravar (Servico s){
        
        try{
            String sql;
            this.conectar();
            if(s.getIdservico()==0){
                sql = "INSERT INTO servico(nome, duracao, valor, descricao, status) VALUES(?, ?, ?, ?, ?)";
            }else{
                sql = "UPDATE servico SET nome=?, duracao=?, valor=?, descricao=?, status=? WHERE idservico=?"; 
            }

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,s.getNome());
            pstm.setInt(2,s.getDuracao());
            pstm.setFloat(3,s.getValor());
            pstm.setString(4,s.getDescricao());
            pstm.setInt(5,s.getStatus());

            if(s.getIdservico()>0){
                pstm.setInt(6,s.getIdservico());
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
    
    public Servico getCarregaPorID(int idservico) throws Exception{
        
        Servico s = new Servico();
        String sql = "SELECT * FROM servico WHERE idservico=?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idservico);
        ResultSet rs = pstm.executeQuery();
        
        if(rs.next()){
            s.setIdservico(rs.getInt("idservico"));
            s.setNome(rs.getString("nome"));
            s.setDuracao(rs.getInt("duracao"));
            s.setValor(rs.getFloat("valor"));
            s.setDescricao(rs.getString("descricao"));
            s.setStatus(rs.getInt("status"));

        }
        
        this.desconectar();
        return s;
        
    }
    
}
