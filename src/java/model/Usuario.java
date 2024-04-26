package model;
public class Usuario {
    private int idusuario;
    private String nome;
    private String cpf;
    private String telefone;
    private String login;
    private String senha;
    private int status;
    private Perfil perfil;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNome() {
        return nome;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Usuario() {
    }

    public Usuario(int idusuario, String nome, String cpf, String telefone, String login, String senha, int status, Perfil perfil) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idusuario=" + idusuario + ", nome=" + nome + '}';
    }

    void setIdUsuario(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   



   

 
    
}
