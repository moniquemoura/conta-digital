//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {

        // Criando Banco
        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");

        // Criando clientes
        //Venilson
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton Andrade");
        venilton.setCpf("123.456.782-20");

        //João
        Cliente joao = new Cliente();
        joao.setNome("João da Silva");
        joao.setCpf("123.456.789-10");

        //Roberto
        Cliente roberto = new Cliente();
        roberto.setNome("Roberto Silva do Nascimento");
        roberto.setCpf("111.456.789-10");


        // Criando conta corrente e conta poupança
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);


//        cc.depositar(100);
//        cc.transferir(100, poupanca);

//        cc.imprimirExtrato();
//        poupanca.imprimirExtrato();



        // Criando contas

        //Conta do joão
        Conta conta1 = new Conta() {
        };
        conta1.setNumero(12345);
        conta1.setSaldo(1000.0);
        conta1.setCliente(venilton);

        //Conta do Roberto
        Conta conta3 = new Conta() {
        };
        conta3.setNumero(12345);
        conta3.setSaldo(1000.0);
        conta3.setCliente(roberto);

        //Conta do Venilson
        Conta conta2 = new Conta() {
        };
        conta2.setNumero(12345);
        conta2.setSaldo(1000.0);
        conta2.setCliente(joao);


        // Adicionando a conta ao banco
        banco.getContas().add(conta1);
        banco.getContas().add(conta2);
        banco.getContas().add(conta3);

        // Listando os clientes
        banco.listarClientes();

    }

}