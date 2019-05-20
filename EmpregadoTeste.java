import java.util.Scanner;
public class EmpregadoTeste {
    public static void main (String[]args){
        Scanner ler = new Scanner (System.in);
        Empregado E1 = new Empregado();
        System.out.println("Informe o nome do funcionario");
        String n = ler.nextLine();
        E1.nomeEmpregado(n);
        E1.pegarnome();
        System.out.println("Informe o sobrenome do funcionario");
        String sn = ler.nextLine();
        E1.sobrenomeEmpregado(sn);
        E1.pegarSobrenome();
        System.out.println("Informe o salario mensal do funcionario");
        double sal = ler.nextDouble();
        E1.salarioEmpregado(sal);
        E1.salarioAno();
        E1.pegarAnual();
        E1.salarioBonus();
        E1.imprimirSalario();
        E1.imprimirSalarioBonus();
    }
}
