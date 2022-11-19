public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Renato");

        Conta cc = new ContaCorrente(renato);
        Conta poupanca = new ContaPoupanca(renato);

        cc.depositar(1000);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}