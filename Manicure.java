public class Manicure extends Funcionario implements Servico{

        private double valorMao = 25.00;
        private double valorPe = 30.00;
        private double valorAlongamento = 100.00;
        private double valorManutencao  = 80.00;
        private double valorRemove  = 30.00;


        //Construtor da classe
        public Manicure(String nome, String telefone, int num, double valor) {
            super(nome, telefone, num, valor);
        }


        // Metodos
        public void mostrarInfo(){
            System.out.println("1 -Valor Mão: R$" +valorMao);
            System.out.println("2 -Valor Pé: R$" +valorPe);
            System.out.println("3 -Valor Alongamento: R$" +valorAlongamento);
            System.out.println("4 -Valor Manutenção: R$" +valorManutencao);
            System.out.println("5 -Valor Remoção Alongamento: R$"+valorRemove);
        }
        @Override
    public void horarios(){
            System.out.println("Horário de atendimento: 13:30 às 18:00");
        }

    public double getValorMao() {
        return valorMao;
    }

    public double getValorPe() {
        return valorPe;
    }

    public double getValorAlongamento() {
        return valorAlongamento;
    }
    public double getValorManutencao() {
        return valorManutencao;
    }
    public double getValorRemove() {
        return valorRemove;
    }

}
