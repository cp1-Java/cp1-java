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

    public static String descriptar(String mensagemMorse) {
        StringBuilder descriptado = new StringBuilder();
        String[] palavras = mensagemMorse.split(" / ");

        for (String palavra : palavras) {
            String[] letras = palavra.trim().split(" ");
            for (String letra : letras) {
                switch (letra) {
                    case ".-":
                        descriptado.append("A");
                        break;
                    case "-...":
                        descriptado.append("B");
                        break;
                    case "-.-.":
                        descriptado.append("C");
                        break;
                    case "-..":
                        descriptado.append("D");
                        break;
                    case ".":
                        descriptado.append("E");
                        break;
                    case "..-.":
                        descriptado.append("F");
                        break;
                    case "--.":
                        descriptado.append("G");
                        break;
                    case "....":
                        descriptado.append("H");
                        break;
                    case "..":
                        descriptado.append("I");
                        break;
                    case ".---":
                        descriptado.append("J");
                        break;
                    case "-.-":
                        descriptado.append("K");
                        break;
                    case ".-..":
                        descriptado.append("L");
                        break;
                    case "--":
                        descriptado.append("M");
                        break;
                    case "-.":
                        descriptado.append("N");
                        break;
                    case "---":
                        descriptado.append("O");
                        break;
                    case ".--.":
                        descriptado.append("P");
                        break;
                    case "--.-":
                        descriptado.append("Q");
                        break;
                    case ".-.":
                        descriptado.append("R");
                        break;
                    case "...":
                        descriptado.append("S");
                        break;
                    case "-":
                        descriptado.append("T");
                        break;
                    case "..-":
                        descriptado.append("U");
                        break;
                    case "...-":
                        descriptado.append("V");
                        break;
                    case ".--":
                        descriptado.append("W");
                        break;
                    case "-..-":
                        descriptado.append("X");
                        break;
                    case "-.--":
                        descriptado.append("Y");
                        break;
                    case "--..":
                        descriptado.append("Z");
                        break;
                    case "-----":
                        descriptado.append("0");
                        break;
                    case ".----":
                        descriptado.append("1");
                        break;
                    case "..---":
                        descriptado.append("2");
                        break;
                    case "...--":
                        descriptado.append("3");
                        break;
                    case "....-":
                        descriptado.append("4");
                        break;
                    case ".....":
                        descriptado.append("5");
                        break;
                    case "-....":
                        descriptado.append("6");
                        break;
                    case "--...":
                        descriptado.append("7");
                        break;
                    case "---..":
                        descriptado.append("8");
                        break;
                    case "----.":
                        descriptado.append("9");
                        break;
                    default:
                        break;
                }
            }
            descriptado.append(" ");
        }

        return descriptado.toString().trim();
    }


    public static void main(String[] args) {
        System.out.println(morseEncriptar("ola tudo bem"));
       System.out.println(descriptar("--- .-.. .-  / - ..- -.. ---  / -... . -- "));
    }
}
