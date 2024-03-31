package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MenuDAO extends DatabaseDAO {
    
    public MenuDAO() throws Exception{}
    
    public ArrayList<Menu> getLista() throws Exception{
        
        ArrayList<Menu> lista = new ArrayList<Menu>();
        String SQL = "Select * FROM menu";
        this.conectar();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(SQL);
        
        while(rs.next()){
            Menu m = new Menu();
            m.setIdMenu(rs.getInt("idMenu"));
            m.setLink(rs.getString("link"));
            m.setNome(rs.getString("nome"));
            m.setStatus(rs.getInt("status"));
            
            lista.add(m);
        }
        this.desconectar();
        return lista;
        
    }
    
    public boolean gravar(Menu m){
        
        try{
            
            String sql;
            this.conectar();
            if(m.getIdMenu()==0){
                sql = "INSERT INTO menu(nome,link,status) VALUES (?, ?, ?)";
            }else{
                sql = "UPDATE menu SET nome=?, link=?, status=? WHERE idMenu=?";
            }
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, m.getNome());
            pstm.setString(2, m.getLink());
            pstm.setInt(3, m.getStatus());
            
            if(m.getIdMenu()>0){
                pstm.setInt(4, m.getIdMenu());
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
    
}
