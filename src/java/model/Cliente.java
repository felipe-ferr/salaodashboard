package model;

public class Cliente {
    private int idcliente;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Cliente() {
    }

    public Cliente(int idcliente, String nome, String cpf, String telefone, String email) {
        this.idcliente = idcliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idcliente=" + idcliente + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
}
