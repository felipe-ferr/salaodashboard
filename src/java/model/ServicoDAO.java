package model;

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
            Servico a = new Servico();
            a.setIdservico(rs.getInt("idservico"));
            a.setDuracao(rs.getInt("duracao"));
            a.setStatus(rs.getInt("status"));
            a.setNome(rs.getString("nome"));
            a.setDescricao(rs.getString("descricao"));
            a.setValor(rs.getFloat("valor"));
            lista.add(a);
        }
        this.desconectar();
        return lista;
        
    }
}
