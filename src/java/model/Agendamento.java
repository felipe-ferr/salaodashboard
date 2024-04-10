package model;

public class Agendamento {
    
    private int idagendamento;
    private String data;
    private float valor;
    private int status;
    private String descricao;
    private String data_cadastro;
    private String horario;
    private Servico servico;
    private Cliente cliente;
    private Usuario usuario;

    public Agendamento() {
    }

    public int getIdagendamento() {
        return idagendamento;
    }

    public void setIdagendamento(int idagendamento) {
        this.idagendamento = idagendamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Agendamento(int idagendamento, String data, float valor, int status, String descricao, String data_cadastro, String horario, Servico servico, Cliente cliente, Usuario usuario) {
        this.idagendamento = idagendamento;
        this.data = data;
        this.valor = valor;
        this.status = status;
        this.descricao = descricao;
        this.data_cadastro = data_cadastro;
        this.horario = horario;
        this.servico = servico;
        this.cliente = cliente;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "idagendamento=" + idagendamento + ", data=" + data + ", valor=" + valor + ", status=" + status + ", descricao=" + descricao + ", data_cadastro=" + data_cadastro + ", horario=" + horario + ", servico=" + servico + ", cliente=" + cliente + ", usuario=" + usuario + '}';
    }

    
    
}
