package menu;

import cifra.Cifrar;
import cifra.Decifrar;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void start() {
        while (true) {
            System.out.println("""
                *** BEM-VINDO AO DESCRIPTOGRAFADOR EM JAVA ***
                                
                Aperte (1) para utilizar a cifra de cesár
                Aperte (2) para utilizar o código morse
                Aperte (0) para sair
                """);

            int resposta = scanner.nextInt();

            if (resposta == 1) {
                menuCesar();
            } else if (resposta == 2) {

            } else if (resposta == 0){
                System.out.println("Obrigado por utilizar nosso serviço");
                break;
            }else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuCesar() {
        boolean cesar = true;
        Cifrar cifrador = new Cifrar();
        Decifrar decifrar = new Decifrar();

        while (cesar) {
            System.out.println("""
                    *** BEM-VINDO A CIFRA DE CESAR EM JAVA ***
                    Digite a mensagem a ser cifrada: 
                    """);
            String mensagem = scanner.next();
            System.out.println("Digite o valor da chave para ser cifrado: ");
            int chave = scanner.nextInt();
            boolean cifrar = true;
            while (cifrar){
                System.out.println("""
                    Aperte (1) para utilizar o cifrador
                    Aperte (2) para utilizar o decifrador
                    Aperte (0) para sair
                    """);
                int respostaCesar = scanner.nextInt();

                if (respostaCesar == 1) {
                    String mensagemCifrada = cifrador.cifrar(mensagem, chave);
                    System.out.println("Mensagem cifrada: " + mensagemCifrada);
                } else if (respostaCesar == 2) {
                    String mensagemDecifrada = decifrar.decifrar(mensagem, chave);
                    System.out.println("Mensagem decifrada: " + mensagemDecifrada);
                } else {
                    cifrar = false;
                }
            }
        }
    }

}
