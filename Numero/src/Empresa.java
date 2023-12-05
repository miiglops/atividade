

public class Empresa {
    public static void main(String[] args) {
        double jan = 15.000;
        double fev = 23.000;
        double mar = 17.000;
        double total = jan+fev+mar;
        double media = (jan+fev+mar)/3;
        System.out.println("O gasto total no trimestre é de R$"+total);
        System.out.println("A média de valores é: "+media);
    }
}
