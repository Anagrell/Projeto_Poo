    import java.io.*;
    import java.util.ArrayList;
    public class Arquivo {

        public void escrever(String servico, Cliente cliente){
            // Importando as classes que nos permitirão escrever no Arquivo
            OutputStream os = null;
            OutputStreamWriter osw = null;
            BufferedWriter bw = null;

            try {
                // Recebe o nome do arquivo
                os = new FileOutputStream("Agendamentos.txt", true); // Arquivo

                // Mostra em qual arquivo estaremos escrevendo
                osw = new OutputStreamWriter(os);

                // Permite que escrevamos no arquivo
                bw = new BufferedWriter(osw);

                bw.write("Serviço: " + servico + "  Cliente: " + cliente.getNome() + "  Telefone:" + cliente.getContato() + "  E-mail: " + cliente.getEmail());
                bw.newLine();
                bw.newLine();

            } catch (IOException e) {
                System.out.println("ERRO: "+e);
            }finally{
                // Fechando a entrada de dados
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

