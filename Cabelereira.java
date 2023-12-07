public class Cabelereira extends Funcionario implements Servico {

        private double valorCorte = 40.00;
        private double valorEscova = 50.00;
        private double valorTintura = 80.00;
        private double valorLavagem  = 35.00;
        private double valorProgressiva  = 310.00;
        private double valorLuzes  = 280.00;


        //Construtor da classe
        public Cabelereira(String nome, String telefone, int num, double valor) {
            super(nome, telefone, num, valor);
        }


        // Metodos
        public void mostrarInfo(){
            System.out.println("1 -Valor Corte: R$" +valorCorte );
            System.out.println("2 -Valor Escova: R$" +valorEscova);
            System.out.println("3 -Valor Tintura: R$" +valorTintura);
            System.out.println("4 -Valor Lavagem: R$" +valorLavagem);
            System.out.println("5 -Valor Progressiva: R$" +valorProgressiva);
            System.out.println("6 -Valor Luzer: R$" +valorLuzes);
        }

        @Override
        public void horarios(){
            System.out.println("Horário de atendimento: 10:30 às 17:30");
        }


    public double getValorCorte() {
        return valorCorte;
    }
    public double getValorEscova() {
        return valorEscova;
    }
    public double getValorTintura() {
        return valorTintura;
    }
    public double getValorLavagem() {
        return valorLavagem;
    }
    public double getValorProgressiva() {
        return valorProgressiva;
    }
    public double getValorLuzes() {
        return valorLuzes;
    }
}
