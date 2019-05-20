import java.util.Scanner;
public class DataTeste {
    public static void main(String[]args){
        Scanner ler = new Scanner (System.in);
        Data D1 = new Data();
        System.out.println("Informe o dia");
        int a = ler.nextInt();
        D1.pegardia(a);
        D1.colocardia();
        System.out.println("Informe o mes");
        int b = ler.nextInt();
        D1.pegarems(b);
        D1.colocarmes();
        System.out.println("informe o ano");
        int c = ler.nextInt();
        D1.pegarano(c);
        D1.colocarano();
        D1.imprimirdata();       
    }
}
