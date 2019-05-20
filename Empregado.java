public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;
    private double salarioAnual;
    private double bonus;
    public void nomeEmpregado(String user){
    nome = user;
}
    public String pegarnome(){
        return nome;
    }
    public void sobrenomeEmpregado(String user){
        sobrenome = user;
    }
    public String pegarSobrenome(){
    return  sobrenome;
}
    public void salarioEmpregado(double num){
        salario = num;
    }
    public double pegarsalario(){
        return salario;
}
    public void salarioAno(){
        salarioAnual = (salario)*12;
    }
    public double pegarAnual(){
        return salarioAnual;
    }
    public void salarioBonus(){
        bonus = (salarioAnual*0.1)+salarioAnual;
    }
    public void imprimirSalario(){
        System.out.printf("O salario anual do funcionario %s %s foi de %.2f\n",nome,sobrenome,salarioAnual);
    }
    public void imprimirSalarioBonus(){
        System.out.printf("O funcionario %s %s terá com o bonus de 10%% um salario anual de %.2f",nome,sobrenome,bonus);
    }
}
