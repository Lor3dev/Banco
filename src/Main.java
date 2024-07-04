public class Main extends Conta  {

    public static void main(String[] args) {
        Conta cc = new contaCorrente();
        cc.depositar(100);
        
        Conta poupanca = new contaPoupanca();
        cc.transferir(100, poupanca);
            
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
