public class Data {
    private int dia;
    private int mes;
    private int ano;
    public void pegardia(int num){
    dia = num;  
}
    public int colocardia(){
        return dia;
    }
    public void pegarems(int num){
        mes = num;
    }
    public int colocarmes(){
        return mes;
    }
    public void pegarano(int num){
        ano = num;
    }
    public int colocarano(){
        return ano;
    }
    public void imprimirdata(){
        System.out.printf("A data informada é %d/%d/%d\n",dia,mes,ano);
    }
}
