package menu;

import cifra.Cifrar;
import cifra.Decifrar;
import morse.Morse;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void start() {
        while (true) {
            System.out.println("""
                *** BEM-VINDO AO DESCRIPTOGRAFADOR EM JAVA ***
                                
                Aperte (1) para utilizar a cifra de César
                Aperte (2) para utilizar o código Morse
                Aperte (0) para sair
                """);

            int resposta = scanner.nextInt();

            if (resposta == 1) {
                menuCesar();
            } else if (resposta == 2) {
                menuMorse();
            } else if (resposta == 0) {
                System.out.println("Obrigado por utilizar nosso serviço");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    private static void menuCesar() {
        Cifrar cifrador = new Cifrar();
        Decifrar decifrar = new Decifrar();

        boolean cesar = true;

        while (cesar) {
            System.out.println("""
                    *** BEM-VINDO À CIFRA DE CÉSAR EM JAVA ***
                    """);
            System.out.println("""
                Aperte (1) para utilizar o cifrador
                Aperte (2) para utilizar o decifrador
                Aperte (0) para sair
                """);
            int respostaCesar = scanner.nextInt();
            scanner.nextLine();

            if (respostaCesar == 1) {
                System.out.println("Digite a mensagem a ser cifrada: ");
                String mensagem = scanner.nextLine();
                System.out.println("Digite o valor da chave para ser cifrado: ");
                int chave = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                String mensagemCifrada = cifrador.cifrar(mensagem, chave);
                System.out.println("Mensagem cifrada: " + mensagemCifrada);
            } else if (respostaCesar == 2) {
                System.out.println("Digite a mensagem a ser decifrada: ");
                String mensagem = scanner.nextLine();
                System.out.println("Digite o valor da chave para ser decifrado: ");
                int chave = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                String mensagemDecifrada = decifrar.decifrar(mensagem, chave);
                System.out.println("Mensagem decifrada: " + mensagemDecifrada);
            } else if (respostaCesar == 0) {
                cesar = false;
            } else {
                System.out.println("Digite uma resposta válida!");
            }
        }
    }

    private static void menuMorse() {
        Morse morse = new Morse();

        while (true) {
            System.out.println("""
                    *** BEM-VINDO AO CÓDIGO MORSE EM JAVA ***
                    Digite a mensagem a ser codificada: 
                    """);
            String mensagem = scanner.nextLine();
            String mensagemCodificada = String.valueOf(morse.morseEncriptar(mensagem));

            boolean morseF = true;

            while (morseF) {
                System.out.println("""
                    Aperte (1) para utilizar o codificador
                    Aperte (2) para utilizar o decodificador
                    Aperte (0) para sair
                    """);
                int respostaMorse = scanner.nextInt();
                scanner.nextLine();

                if (respostaMorse == 1) {
                    System.out.println("Sua mensagem codificada fica: " + mensagemCodificada);
                } else if (respostaMorse == 2) {
                    System.out.println("Sua mensagem decodificada fica: " + morse.descriptar(mensagemCodificada));
                } else if (respostaMorse == 0) {
                    morseF = false;
                } else {
                    System.out.println("Digite uma resposta válida!");
                }
            }
        }
    }
}
