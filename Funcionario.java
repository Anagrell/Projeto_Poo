public abstract class Funcionario {
    protected int num;
    protected String nome;
    protected String telefone;
    private double valor;


    public Funcionario(String nome, String telefone, int num, double valor) {
        this.nome = nome;
        this.telefone = telefone;
        this.num = num;
        this.valor = valor;
    }


    // Metodos da classe
    public void mostrarInfo () {
        System.out.println("Nome Funcionario: " + nome);
        System.out.println("Numero de telefone: " + telefone);
        System.out.println("Numero de telefone: " + num);
    }
    public double getValor() {
        return valor;
    }
}
