package cifra;

public class Decifrar {

    // Método para descriptografar uma mensagem utilizando a Cifra de César
    public static String decifrar(String mensagem, int chave) {
        StringBuilder decifrado = new StringBuilder();

        // Loop pela mensagem cifrada
        for (int i = 0; i < mensagem.length(); i++) {
            // Obtém o caractere na posição i da mensagem
            char caractere = mensagem.charAt(i);
            // Verifica se o caractere é uma letra do alfabeto
            if (Character.isLetter(caractere)) {
                // Calcula o código ASCII do caractere
                int codigoAscii = (int) caractere;
                // Ajuste para letras maiúsculas e minúsculas
                int base = Character.isUpperCase(caractere) ? 65 : 97;
                // Aplica a cifra de César para descriptografar o caractere
                int decifradoCodigoAscii = (codigoAscii - chave - base + 26) % 26 + base;
                // Adiciona o caractere descriptografado ao resultado
                decifrado.append((char) decifradoCodigoAscii);
            } else {
                // Mantém os caracteres que não são letras inalterados
                decifrado.append(caractere);
            }
        }

        return decifrado.toString();
    }
}
