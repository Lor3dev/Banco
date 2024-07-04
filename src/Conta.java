public class Conta {
    
        protected int agencia;
        protected int numero;
        protected double saldo, valor;
        protected static final int AGENCIA_PADRAO = 0001;
        protected static int SEQUENCIAL = 1;

        public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    
        public int getAgencia(){
                return agencia;
        }
    
        public int getNumero(){
            return numero;
        }
    
        public double getSaldo(){
        return saldo;
        }
    
        public void sacar(double valor){
                saldo -= valor;
    
        }
        public void depositar(double valor){
                saldo += valor;
    
        }
        public void transferir(double valor, Conta contaDestino){
                this.sacar(valor);
                contaDestino.depositar(valor);
    
        }
        public void imprimirExtrato() {
                System.out.println("==Extrato==");
                System.out.println(String.format("Agencia %d", agencia));
                System.out.println(String.format("Numero %d", numero));
                System.out.println(String.format("Saldo %f", saldo));
        }

    

}
