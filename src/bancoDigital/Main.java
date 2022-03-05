package bancoDigital;

public class Main {
    public static void main (String [] args ) {

        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");

        Conta cc = new ContaCorrente(carlos);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(carlos);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
