import java.util.ArrayList;
import java.util.List;

public class Banco {

        private String nome;
        private List<Conta> contas;


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public List<Conta> getContas() {
            return contas;
        }

        public void setContas(List<Conta> contas) {
            this.contas = contas;
        }

    public void listarClientes() {
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            System.out.println("Cliente: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
            // Adicionar aqui outras informações do cliente que você desejar imprimir
        }
    }

    public Banco() {
        this.contas = new ArrayList<>();
    }

}
