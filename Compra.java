public class Conta {
    private int numConta;
    private int agencia;
    private int tipo;
    private float saldo;
    public void depositar (float valorDeposito){
        saldo = saldo+valorDeposito;   
    }
    public void sacar (float valorSaque){
        saldo -= valorSaque;
    }
    public void imprimirSaldo(){
        System.out.println("Seu saldo é de "+saldo);
    }
    public void colocarNumConta(int num){
        numConta = num;
    }
    public int pegarNumConta(){
        return numConta;
    }
    public void colocarAgencia ( int num){
        agencia = num;
    }
    public int pegarAgencia(){
        return agencia;
    }
    public void colocarTipo (int num){
    tipo = num ;
    }
    public int pegarTipo (){
        return tipo;
    }  
}