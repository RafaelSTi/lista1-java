import java.util.Scanner;
public class FaturaTeste {
    public static void main(String[]args){
        Scanner ler = new Scanner (System.in);
        Fatura F1 = new Fatura ();
        System.out.println("infomre o codigo do peça");
        String n = ler.nextLine();
        F1.colocarNumero(n);
        F1.pegarNumero();
        System.out.println("informe a descrição do produto");
        String d = ler.nextLine();
        F1.colocarDescricao(d);
        F1.pegarDescricao();
        System.out.println("Informe a quantidade do produto que será comprado");
        int quant = ler.nextInt();
        F1.colocarQuantidade(quant);
        F1.pegarQuantidade();
        System.out.println("Informe o preço do produto");
        double preço = ler.nextDouble();
        F1.colocarPreco(preço);
        F1.pegarPreco();
        F1.valorTotal();
        F1.imprimirValor();
    }
}
