package model;

import java.util.Date;


public class Agendamento {
    
    private int idagendamento;
    private Float valor;
    private Date data;
    private int status;
    private String descricao;
    private Date data_cadastro;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
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

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
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

    public Agendamento(int idagendamento, Float valor, Date data, int status, String descricao, Date data_cadastro, String horario, Servico servico, Cliente cliente, Usuario usuario) {
        this.idagendamento = idagendamento;
        this.valor = valor;
        this.data = data;
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
        return "Agendamento{" + "idagendamento=" + idagendamento + ", valor=" + valor + ", data=" + data + ", status=" + status + ", descricao=" + descricao + ", data_cadastro=" + data_cadastro + ", horario=" + horario + ", servico=" + servico + ", cliente=" + cliente + ", usuario=" + usuario + '}';
    }

   

    
}
