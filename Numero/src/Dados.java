import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner (System.in);
        System.out.println("Digite o valor do primeiro dado");
        int dado1 = keyboardScanner.nextInt();
        System.out.println("Digite o valor do segundo dado");
        int dado2 = keyboardScanner.nextInt();

        if (dado1 == dado2) {
            System.out.println("DUPLO!");
        } else {
            System.out.println("Não foi um duplo!");
        }
    }
}
