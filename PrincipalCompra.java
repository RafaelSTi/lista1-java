import java.util.Scanner;
public class Principal {
    public static void main (String[]args){
        Scanner ler = new Scanner (System.in);
        Compra C1 = new Compra ();
        System.out.println("Digite o nome do passageiro");
        String n = ler.nextLine();
        C1.colocarCliente(n);
        C1.pegarCliente();
        System.out.println("Digite o cpf do passageiro");
        String c = ler.nextLine();
        C1.colocarCpf(c);
        C1.pegarCpf();
        System.out.println("Digite a cidade de origem");
        String cio = ler.nextLine();
        C1.colocarOrigemc(cio);
        C1.pegarOrigemc();
        System.out.println("Digite o pais de origem");
        String po = ler.nextLine();
        C1.colocarOrigemp(po);
        C1.pegarOrigemp();
        System.out.println("Digite a cidade de Destino");
        String co = ler.nextLine();
        C1.colocarDestinoc(co);
        C1.pegarDestinoc();
        System.out.println("Digite o pais de Destino");
        String pd = ler.nextLine();
        C1.colocarDestinop(pd);
        C1.pegarDestinop();
        System.out.println("digite a data de ida no modelo dd/mm/aaaa");
        String datai = ler.nextLine();
        System.out.println("Digite a data da volta no modelo dd/mm/aaaa");
        String datavo = ler.nextLine();
        C1.imprimirPassagem();
        System.out.printf("DATA DE IDA: %s\nDATA DE VOLTA: %s\nDesejamos que tenha um exelente voo\n",datai,datavo);
    }
}