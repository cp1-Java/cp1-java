import cifra.Cifrar;

import java.util.Scanner;

public class AplicationMain {
    public static void main(String[] args) {
        Cifrar cifrador = new Cifrar();
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                *** BEM-VINDO A CIFRA DE CÉSAR EM JAVA ***
                """);
        System.out.println("Digite a mensagem a ser cifrada: ");
        String mensagem = scanner.nextLine();
        System.out.println("Digite o valor da chave para ser cifrado: ");
        int chave = scanner.nextInt();
        String mensagemCifrada = cifrador.cifrar(mensagem, chave);
        System.out.println("Mensagem cifrada: " + mensagemCifrada);
    }
}