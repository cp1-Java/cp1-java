package morse;

public class Morse {
    public static StringBuilder morseEncriptar(String mensagem){
        StringBuilder encriptado = new StringBuilder();
        for (int i = 0; i < mensagem.length(); i ++){
            char caractere = Character.toUpperCase(mensagem.charAt(i));
            switch (caractere) {
                case 'A':
                    encriptado.append(".- ");
                    break;
                case 'B':
                    encriptado.append("-... ");
                    break;
                case 'C':
                    encriptado.append("-.-. ");
                    break;
                case 'D':
                    encriptado.append("-.. ");
                    break;
                case 'E':
                    encriptado.append(". ");
                    break;
                case 'F':
                    encriptado.append("..-. ");
                    break;
                case 'G':
                    encriptado.append("--. ");
                    break;
                case 'H':
                    encriptado.append(".... ");
                    break;
                case 'I':
                    encriptado.append(".. ");
                    break;
                case 'J':
                    encriptado.append(".--- ");
                    break;
                case 'K':
                    encriptado.append("-.- ");
                    break;
                case 'L':
                    encriptado.append(".-.. ");
                    break;
                case 'M':
                    encriptado.append("-- ");
                    break;
                case 'N':
                    encriptado.append("-. ");
                    break;
                case 'O':
                    encriptado.append("--- ");
                    break;
                case 'P':
                    encriptado.append(".--. ");
                    break;
                case 'Q':
                    encriptado.append("--.- ");
                    break;
                case 'R':
                    encriptado.append(".-. ");
                    break;
                case 'S':
                    encriptado.append("... ");
                    break;
                case 'T':
                    encriptado.append("- ");
                    break;
                case 'U':
                    encriptado.append("..- ");
                    break;
                case 'V':
                    encriptado.append("...- ");
                    break;
                case 'W':
                    encriptado.append(".-- ");
                    break;
                case 'X':
                    encriptado.append("-..- ");
                    break;
                case 'Y':
                    encriptado.append("-.-- ");
                    break;
                case 'Z':
                    encriptado.append("--.. ");
                    break;
                case '0':
                    encriptado.append("----- ");
                    break;
                case '1':
                    encriptado.append(".---- ");
                    break;
                case '2':
                    encriptado.append("..--- ");
                    break;
                case '3':
                    encriptado.append("...-- ");
                    break;
                case '4':
                    encriptado.append("....- ");
                    break;
                case '5':
                    encriptado.append("..... ");
                    break;
                case '6':
                    encriptado.append("-.... ");
                    break;
                case '7':
                    encriptado.append("--... ");
                    break;
                case '8':
                    encriptado.append("---.. ");
                    break;
                case '9':
                    encriptado.append("----. ");
                    break;
                case ' ':
                    encriptado.append(" / ");
                    break;
                default:
                    break;
            }
        }
        return encriptado;
    }

    public static void main(String[] args) {
        System.out.println(morseEncriptar("ola tudo bem"));
    }
}
