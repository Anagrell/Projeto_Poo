public class Cliente {

    private String nome;
    private String email;
    private String contato;
    private double total;

    public Cliente(String nome, String email, String contato) {
        this.nome = nome;
        this.email = email;
        this.contato = contato;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public String getEmail() {
        return email;
    }
}
