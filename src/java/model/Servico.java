package model;
public class Servico {
    private int idservico;
    private int status;
    private String nome;
    private String descricao;

    public int getIdservico() {
        return idservico;
    }

    public void setIdservico(int idservico) {
        this.idservico = idservico;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Servico() {
    }

    public Servico(int idservico, int status, String nome, String descricao) {
        this.idservico = idservico;
        this.status = status;
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Servico{" + "idservico=" + idservico + ", status=" + status + ", nome=" + nome + ", descricao=" + descricao + '}';
    }

 

    

   

   

 
    
}
