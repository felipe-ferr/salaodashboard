package model;
public class Agendamento {
    private int idAgendamento;
    private String servico;
    private String data;
    private String horario;
    private Double valor;

    public Agendamento() {
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Agendamento(int idAgendamento, String servico, String data, String horario, Double valor) {
        this.idAgendamento = idAgendamento;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "idAgendamento=" + idAgendamento + ", servico=" + servico + ", data=" + data + ", horario=" + horario + ", valor=" + valor + '}';
    }
    
}
