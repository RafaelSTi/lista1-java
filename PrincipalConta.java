import java.util.Scanner;
public class Principal {
    public static void main (String[]args){
       Scanner ler = new Scanner (System.in);
       Conta c1 = new Conta();
       System.out.println("entre com o numero da conta");
       int n = ler.nextInt();
       c1.colocarNumConta(n);
       System.out.println("Entre como o numero da agencia");
       int a = ler.nextInt();
       c1.colocarAgencia(a);
       c1.pegarAgencia();
       System.out.println("Entre com o tipo da conta");
       int c = ler.nextInt();
       c1.colocarTipo(c);
       c1.pegarTipo();
       System.out.println("A conta "+c1.pegarNumConta()+" da agencia de numero "+c1.pegarAgencia()+" do tipo de conta "+c1.pegarTipo());
       c1.imprimirSaldo();
       System.out.println("Digite o valor do deposito");
       float s = ler.nextFloat();
       c1.depositar(s);
       c1.imprimirSaldo();
       System.out.println("Digite o valor que deseja sacar");
       float x = ler.nextFloat();
       c1.sacar(x);
       c1.imprimirSaldo();
    }
    }