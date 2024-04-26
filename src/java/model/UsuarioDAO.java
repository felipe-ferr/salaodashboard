package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO extends DatabaseDAO{
    public UsuarioDAO() throws Exception{}
    
    public ArrayList<Usuario> getLista() throws Exception{
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        String SQL = "SELECT u.*, p.nome  FROM usuario u "
                + "INNER JOIN perfil p ON p.idperfil = u.idperfil ";
        this.conectar();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(SQL);
        while(rs.next()){
            Usuario u = new Usuario();
            u.setIdusuario(rs.getInt("u.idusuario"));
            u.setNome(rs.getString("u.nome"));
            u.setCpf(rs.getString("u.cpf"));
            u.setTelefone(rs.getString("u.telefone"));
            u.setLogin(rs.getString("u.login"));
            u.setSenha(rs.getString("u.senha"));
            u.setStatus(rs.getInt("u.status"));
            
            Perfil p = new Perfil();
            p.setIdperfil(rs.getInt("u.idperfil"));
            p.setNome(rs.getString("p.nome"));
            u.setPerfil(p);
            lista.add(u);
        }
        this.desconectar();
        return lista;
        
    }
    
    public boolean gravar (Usuario u){
        
        try{
            String sql;
            this.conectar();
            if(u.getIdusuario()==0){
                sql = "INSERT INTO usuario(nome, cpf, telefone, login, senha, status, idperfil) "
                        + "VALUES(?, ?, ?, ?, ?, ?, ?)";
            }else{
                sql = "UPDATE usuario SET nome=?, cpf=?, telefone=?, login=?, senha=?, status=?, idperfil=? "
                        + "WHERE idusuario=?"; 
            }

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,u.getNome());
            pstm.setString(2,u.getCpf());
            pstm.setString(3,u.getTelefone());
            pstm.setString(4,u.getLogin());
            pstm.setString(5,u.getSenha());
            pstm.setInt(6,u.getStatus());
            pstm.setInt(7, u.getPerfil().getIdperfil());

            if(u.getIdusuario()>0){
                pstm.setInt(8,u.getIdusuario());
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
    
    public Usuario getCarregaPorID(int idusuario) throws Exception{
        
        Usuario u = new Usuario();
        String SQL = "SELECT u.*, p.nome  FROM usuario u "
                + "INNER JOIN perfil p ON p.idperfil = u.idperfil ";
        this.conectar();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(SQL);
        while(rs.next()){
            u.setIdusuario(rs.getInt("u.idusuario"));
            u.setNome(rs.getString("u.nome"));
            u.setCpf(rs.getString("u.cpf"));
            u.setTelefone(rs.getString("u.telefone"));
            u.setLogin(rs.getString("u.login"));
            u.setSenha(rs.getString("u.senha"));
            u.setStatus(rs.getInt("u.status"));
            
            Perfil p = new Perfil();
            p.setIdperfil(rs.getInt("u.idperfil"));
            p.setNome(rs.getString("p.nome"));
            u.setPerfil(p);
        }
        
        this.desconectar();
        return u;
        
    }
    
    public boolean deletar(Usuario u){
        
        try{
            String sql = "UPDATE usuario SET status=0 WHERE idusuario=? ";
            this.conectar();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, u.getIdusuario());
            pstm.execute();
            this.desconectar();
            return true;
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        
        
    }

    public Usuario getRecuperarUsuario(String login){
            
            Usuario u = new Usuario();
            String sql = "SELECT  u.* FROM usuario u "
                    + "WHERE u.login=?";
            try{
                this.conectar();
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setString(1, login);
                ResultSet rs = pstm.executeQuery();
                if(rs.next()) {
                    u.setIdusuario(rs.getInt("u.idusuario"));
                    u.setNome(rs.getString("u.nome"));
                    u.setLogin(rs.getString("u.login"));
                    u.setSenha(rs.getString("senha"));
                    u.setStatus(rs.getInt("status"));
                    PerfilDAO pDAO = new PerfilDAO();
                    u.setPerfil(pDAO.getCarregaPorID(rs.getInt("u.idPerfil")));
                }
                this.desconectar();
                return u;
                
            }catch (Exception e) {
                System.out.println(e);
                return null;
            }
    }
    
    }

