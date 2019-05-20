public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preço;
    private double total;
    public void colocarNumero(String num){
       numero = num;
    }
    public String pegarNumero(){
       return numero;
    }
    public void colocarDescricao(String nome){
      descricao = nome;
    }
    public String pegarDescricao(){
        return descricao;
    }
    public void colocarQuantidade(int num){
        quantidade = num;
    }
    public int pegarQuantidade(){
        return quantidade;
    }
    public void colocarPreco(double num){
        preço = num;
    }
    public double pegarPreco(){
        return preço;
    }
    public void valorTotal(){
        total = (quantidade*preço);
    }
    public void imprimirValor(){
    System.out.printf("O produto do codigo: %s\nDescrição do produto: %s\nQuantidade do produto: %d\nPreço do produto: %.2f\nO valor total da compra é de %.2f\n",
            numero,descricao,quantidade,preço,total);
}
}