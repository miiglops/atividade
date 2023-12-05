import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Crie uma senha: ");
        String senha = keyboardScanner.next();

        while (senha.length()<8) {
            System.out.println("A senha deve conter no mínimo 8 caracteres");
            System.out.println("Digite outra senha: ");
            senha = keyboardScanner.next();
        }
        
        
        while(!senha.matches(".*[!@#$%^&*].*")){
            System.out.println("A senha deve conter um caractere especial (!, @, #, $, %, ^, & ou *)");
            System.out.println("Digite outra senha: ");
            senha = keyboardScanner.next();
            

        }

        while (!senha.matches(senha.toUpperCase())) {
            System.out.println("A senha deve conter uma letra maiúscula");
            System.out.println("Digite outra senha: ");
            senha = keyboardScanner.next();
        }
    }
}
