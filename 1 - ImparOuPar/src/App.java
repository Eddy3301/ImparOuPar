import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Olá, digite o número que deseja veríficar.");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número %d é PAR", numero); }
        else {
            System.out.printf("O número %d é IMPAR.", numero);
        }
    scanner.close();    
    }
        
    }

