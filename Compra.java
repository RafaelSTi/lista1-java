public class Compra {
    private String nome;
    private String cpf;
    private String cidadeOrigem;
    private String paisOrigem;
    private String cidadeDestino;
    private String paisDestino;
    public void colocarCliente (String user){
        nome = user;
    }
    public String pegarCliente(){
        return nome;
    }
    public void colocarCpf (String num){
        cpf = num ;
    }
    public String pegarCpf(){
        return cpf;
    }
    public void colocarOrigemc(String local){
        cidadeOrigem = local;
    }
    public String pegarOrigemc(){
        return cidadeOrigem;
    }
    public void colocarOrigemp(String local){
        paisOrigem = local ;
    }
    public String pegarOrigemp (){
     return paisOrigem ;
    }
    public void colocarDestinoc (String local){
        cidadeDestino = local;
    }  
    public String pegarDestinoc (){
        return cidadeDestino;
    }
    public void colocarDestinop(String local){
        paisDestino = local;
    }
    public String pegarDestinop(){
        return paisDestino;
    }
    public void imprimirPassagem(){
        System.out.printf("Obrigado por escolher nossa agência aérea\nORIGEM:%s - %s DESTINO:%s- %s\nValor:1000,00\nNome do passageiro: %s\nCPF: %s\n",cidadeOrigem,paisOrigem,cidadeDestino,paisDestino
                ,nome,cpf);
    }
}