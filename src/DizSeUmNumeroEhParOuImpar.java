import java.util.Scanner;

public class DizSeUmNumeroEhParOuImpar {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Par ou ímpar?\nDigite um número:");
        int numero = scanner.nextInt();
        String resposta = numero %2 == 0? "O número digitado é par.": "O número digitado é ímpar.";
        System.out.println(resposta);
    }
}
