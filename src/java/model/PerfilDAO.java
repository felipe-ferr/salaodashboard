package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PerfilDAO extends DatabaseDAO{
    public PerfilDAO() throws Exception{}
    
    public ArrayList<Perfil> getLista() throws Exception{
        ArrayList<Perfil> lista = new ArrayList<Perfil>();
        String SQL = "Select * FROM perfil";
        this.conectar();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(SQL);
        while(rs.next()){
            Perfil p = new Perfil();
            p.setIdperfil(rs.getInt("idperfil"));
            p.setNome(rs.getString("nome"));
            lista.add(p);
        }
        this.desconectar();
        return lista;
        
    }
    
    public boolean gravar (Perfil p){
        
        try{
            String sql;
            this.conectar();
            if(p.getIdperfil()==0){
                sql = "INSERT INTO perfil(nome) VALUES(?)";
            }else{
                sql = "UPDATE perfil SET nome=? WHERE idperfil=?"; 
            }

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,p.getNome());

            if(p.getIdperfil()>0){
                pstm.setInt(2,p.getIdperfil());
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
    
    public Perfil getCarregaPorID(int idperfil) throws Exception{
        
        Perfil p = new Perfil();
        String sql = "SELECT * FROM perfil WHERE idperfil=?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, idperfil);
        ResultSet rs = pstm.executeQuery();
        
        if(rs.next()){
            p.setIdperfil(rs.getInt("idperfil"));
            p.setNome(rs.getString("nome"));

        }
        
        this.desconectar();
        return p;
        
    }
    
    public boolean deletar(Perfil p){

        try{
            String sql = "DELETE FROM perfil WHERE idperfil=? ";
            this.conectar();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, p.getIdperfil());
            pstm.execute();
            this.desconectar();
            return true;

        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
}
