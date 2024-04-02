package model;
public class Servico {
    private int idservico;
    private int duracao;
    private int status;
    private String nome;
    private String descricao;
    private float valor;

    public int getIdServico() {
        return idservico;
    }

    public void setIdServico(int idservico) {
        this.idservico = idservico;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
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

    public Servico(int idservico, int duracao, int status, String nome, String descricao, float valor) {
        this.idservico = idservico;
        this.duracao = duracao;
        this.status = status;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Servico{" + "idservico=" + idservico + ", duracao=" + duracao + ", status=" + status + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + '}';
    }

    public void setName(String nome) {
    }

    public void setPrice(int parseInt) {
    }

    public void setQuantity(double parseDouble) {
    }
    
}
