import java.util.ArrayList;

public class Salao {

    private String nome = "Studio Cabeleleila Leila";
    private String endereco = "Rua das Margaridas,68";
    private String contato = "(035)99828-8888";
    private String horario = "09:30 às 18:00" ;

    ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();
    Cabelereira Aline = new Cabelereira("Aline","(035)95543-6896", 1, 0.00);
    Depiladora Julia = new Depiladora("Júlia","(035)99654-4732", 2, 0.00);
    Manicure Thayana = new Manicure("Thayana", "(035)99281-5632", 3,0.00 );


    // Metodos

    public Salao() {
        funcionarios.add(Aline);
        funcionarios.add(Julia);
        funcionarios.add(Thayana);
    }

    public void mostraInfo() {
        System.out.println("Salão: "+nome);
        System.out.println("Localização: "+endereco);
        System.out.println("Contato recepção: "+contato);
        System.out.println("Horário de funcionamento: "+horario);
    }

}
