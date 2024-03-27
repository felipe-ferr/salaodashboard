package model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AgendamentoDAO extends DatabaseDAO{
    public AgendamentoDAO() throws Exception{}
    
    public ArrayList<Agendamento> getLista() throws Exception{
        ArrayList<Agendamento> lista = new ArrayList<Agendamento>();
        String SQL = "Select * FROM agendamento";
        this.conectar();
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(SQL);
        while(rs.next()){
            Agendamento a = new Agendamento();
            a.setIdAgendamento(rs.getInt("idAgendamento"));
            a.setServico(rs.getString("servico"));
            a.setData(rs.getString("data"));
            a.setHorario(rs.getString("horario"));
            a.setValor(rs.getDouble("valor"));
            lista.add(a);
        }
        this.desconectar();
        return lista;
        
    }
}
