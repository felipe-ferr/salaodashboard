package model;

public class Menu {
    private String nome;
    private String link;
    private int status;
    private int idMenu;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public Menu() {
    }

    public Menu(String nome, String link, int status, int idMenu) {
        this.nome = nome;
        this.link = link;
        this.status = status;
        this.idMenu = idMenu;
    }

    @Override
    public String toString() {
        return "Menu{" + "nome=" + nome + ", link=" + link + ", status=" + status + ", idMenu=" + idMenu + '}';
    }
    
    
}
