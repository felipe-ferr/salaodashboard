package model;
public class Servico {
    private int idservico;
    private int status;
    private String nome;
    private String descricao;
    private float valor;

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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Servico() {
    }

    public Servico(int idservico, int status, String nome, String descricao, float valor) {
        this.idservico = idservico;
        this.status = status;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Servico{" + "idservico=" + idservico + ", status=" + status + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + '}';
    }


    

   

   

 
    
}
