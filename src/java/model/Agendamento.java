package model;

import java.sql.Time;
import java.util.Date;

public class Agendamento {
    
    private int idagendamento;
    private float valor;
    private int status;
    private String descricao;
    private Date data_cadastro;
    private Time horario;
    private Servico servico;
    private Cliente cliente;
    //Usuario usuario;

    public Agendamento() {
    }

    public int getIdagendamento() {
        return idagendamento;
    }

    public void setIdagendamento(int idagendamento) {
        this.idagendamento = idagendamento;
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

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
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

    public Agendamento(int idagendamento, float valor, int status, String descricao, Date data_cadastro, Time horario, Servico servico, Cliente cliente, Usuario usuario) {
        this.idagendamento = idagendamento;
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
        return "Agendamento{" + "idagendamento=" + idagendamento + ", valor=" + valor + ", status=" + status + ", descricao=" + descricao + ", data_cadastro=" + data_cadastro + ", horario=" + horario + ", servico=" + servico + ", cliente=" + cliente + ", usuario=" + usuario + '}';
    }
    
    
    
}
