public class Depiladora extends Funcionario implements  Servico{

    private double valorBuco = 10.00;
    private double valorMeia = 25.00;
    private double valorPerna = 40.00;
    private double valorAxila = 20.00;



    //Construtor da classe
    public Depiladora(String nome, String telefone, int num, double valor) {
        super(nome, telefone, num, valor);
    }


    // Metodos
    public void mostrarInfo(){
        System.out.println("1 -Valor Buço: R$" +valorBuco);
        System.out.println("2 -Valor Meia Perna: R$" +valorMeia);
        System.out.println("3 -Valor Perna Completa: R$" +valorPerna);
        System.out.println("4 -Valor Axila: R$" +valorAxila);
    }


    @Override
    public void horarios(){
        System.out.println("Horário de atendimento: 09:30 às 15:00");
    }

    public double getValorBuco() {
        return valorBuco;
    }

    public double getValorMeia() {
        return valorMeia;
    }
    public double getValorPerna() {
        return valorPerna;
    }
    public double getValorAxila() {
        return valorAxila;
    }
}
