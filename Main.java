import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao; //entrada do menu
        int funcionario; //funcionario escolhido pelo menu
        double valorCompra = 0.00; //carrinha de compras
        int servico1; // entrada do serviço depiladora
        int servico2; // entrada do serviço manicure
        int servico3; // entrada do serviço cabelereira
        String nome;
        String contato;
        String email;

        //criação do arquivo
        Arquivo arq = new Arquivo();

        //criação do salão
        Salao salao = new Salao();

        //Abertura da entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome completo: ");
        nome = sc.nextLine();
        System.out.println("Telefone para contato: ");
        contato = sc.nextLine();
        System.out.println("E-mail: " );
        email = sc.nextLine();

        //criação do cliente
        Cliente cliente  = new Cliente(nome, email, contato);

        //menu
        do{
            System.out.println("\nEscolha o serviço desejado: ");
            System.out.println("\n1 - Depilação");
            System.out.println("\n2 - Manicure");
            System.out.println("\n3 - Cabelereira");
            System.out.println("\n4 - Finalizar");
            System.out.println("Insira a opção desejada (1, 2, 3 ou 4): ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: //depilação
                {
                    System.out.println("Serviços disponíveis: ");
                    for (int i = 0; i < salao.funcionarios.size(); i++) {
                        if (salao.funcionarios.get(i) instanceof Depiladora) {
                            Depiladora aux = (Depiladora) salao.funcionarios.get(i);
                            aux.mostrarInfo();
                            aux.horarios();
                        }
                    }
                    System.out.println("Digite o número do serviço desejado (Apenas números de 1 a 4): ");
                    servico1 = sc.nextInt();

                    switch (servico1) {
                        case 1 -> valorCompra += salao.Julia.getValorBuco();
                        case 2 -> valorCompra += salao.Julia.getValorMeia();
                        case 3 -> valorCompra += salao.Julia.getValorPerna();
                        case 4 -> valorCompra += salao.Julia.getValorAxila();
                    }
                    System.out.println("Serviço adicionado com sucesso!");
                    System.out.println("Valor do agendamento: R$" + valorCompra);
                    arq.escrever("Depilação", cliente);
                    break;
                }
                case 2: //manicure
                {
                    System.out.println("Serviços disponíveis: ");
                    for (int i = 0; i < salao.funcionarios.size(); i++) {
                        if (salao.funcionarios.get(i) instanceof Manicure) {
                            Manicure aux = (Manicure) salao.funcionarios.get(i);
                            aux.mostrarInfo();
                            aux.horarios();
                        }
                    }
                    System.out.println("Digite o número do serviço desejado (Apenas números de 1 a 5): ");
                    servico2 = sc.nextInt();

                    switch (servico2) {
                        case 1 -> valorCompra += salao.Thayana.getValorMao();
                        case 2 -> valorCompra += salao.Thayana.getValorPe();
                        case 3 -> valorCompra += salao.Thayana.getValorAlongamento();
                        case 4 -> valorCompra += salao.Thayana.getValorManutencao();
                        case 5 -> valorCompra += salao.Thayana.getValorRemove();
                    }
                    System.out.println("Serviço adicionado com sucesso!");
                    System.out.println("Valor do agendamento: R$" + valorCompra);
                    arq.escrever("Manicure", cliente);
                    break;
                }
                case 3: //cabelereira
                {
                    System.out.println("Serviços disponíveis: ");
                    for (int i = 0; i < salao.funcionarios.size(); i++) {
                        if (salao.funcionarios.get(i) instanceof Cabelereira) {
                            Cabelereira aux = (Cabelereira) salao.funcionarios.get(i);
                            aux.mostrarInfo();
                            aux.horarios();
                        }
                    }
                    System.out.println("Digite o número do serviço desejado (Apenas números de 1 a 6): ");
                    servico3 = sc.nextInt();

                    switch (servico3) {
                        case 1 -> valorCompra += salao.Aline.getValorCorte();
                        case 2 -> valorCompra += salao.Aline.getValorEscova();
                        case 3 -> valorCompra += salao.Aline.getValorTintura();
                        case 4 -> valorCompra += salao.Aline.getValorLavagem();
                        case 5 -> valorCompra += salao.Aline.getValorProgressiva();
                        case 6 -> valorCompra += salao.Aline.getValorLuzes();
                    }
                    System.out.println("Serviço adicionado com sucesso!");
                    System.out.println("Valor do agendamento: R$" + valorCompra);
                    arq.escrever("Cabelereira", cliente);
                    break;
                }
                case 4: //sair e finalizar compra
                {
                    System.out.println("Agendamento finalizado com sucesso!");
                    System.out.println("Tolerancia de atraso de dez minutos.");
                    System.out.println("Total a pagar: R$ " + valorCompra);
                    System.out.println("O valor deve ser pago no dia do procedimento.");
                    break;
                }
        }
        }while(opcao != 4);
        }
    }