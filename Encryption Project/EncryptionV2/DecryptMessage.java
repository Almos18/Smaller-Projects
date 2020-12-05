package EncryptionV2;

public class DecryptMessage
{
    public static String decryptString(String decryptTemp)
    {

        int zeroAndThree = 0;
        int oneAndFour = 1;
        int twoAndFive = 2;
        String decryptReturnMain = "";

        //https://fsymbols.com/keyboard/windows/alt-codes/list/
        //https://www.javatpoint.com/java-string-replace

        for (int i = 0; i < decryptTemp.length(); i++)
        {
            if (i == zeroAndThree)
            {
                decryptReturnMain += firstDictionary(decryptTemp, i);
                zeroAndThree += 3;
            }
            if (i == oneAndFour)
            {
                decryptReturnMain += secondDictionary(decryptTemp, i);
                oneAndFour += 3;
            }
            if (i == twoAndFive)
            {
                decryptReturnMain += thirdDictionary(decryptTemp, i);
                twoAndFive += 3;
            }
        }
        return decryptReturnMain;
    }

    private static String firstDictionary (String decryptTemp, int i)
    {
        String decryptReturn = "";

        decryptTemp = decryptTemp.replace('-', 'a');
        decryptTemp = decryptTemp.replace('£', 'b');
        decryptTemp = decryptTemp.replace('*', 'c');
        decryptTemp = decryptTemp.replace('@', 'd');
        decryptTemp = decryptTemp.replace('}', 'e');
        decryptTemp = decryptTemp.replace('~', 'f');
        decryptTemp = decryptTemp.replace('=', 'g');
        decryptTemp = decryptTemp.replace('!', 'h');
        decryptTemp = decryptTemp.replace('&', 'i');
        decryptTemp = decryptTemp.replace('+', 'j');
        decryptTemp = decryptTemp.replace('“', 'k');
        decryptTemp = decryptTemp.replace(':', 'l');
        decryptTemp = decryptTemp.replace('╝', 'm');
        decryptTemp = decryptTemp.replace('▄', 'n');
        decryptTemp = decryptTemp.replace('<', 'o');
        decryptTemp = decryptTemp.replace('/', 'p');
        decryptTemp = decryptTemp.replace('τ', 'q');
        decryptTemp = decryptTemp.replace('$', 'r');
        decryptTemp = decryptTemp.replace('(', 's');
        decryptTemp = decryptTemp.replace('%', 't');
        decryptTemp = decryptTemp.replace('>', 'u');
        decryptTemp = decryptTemp.replace('‘', 'v');
        decryptTemp = decryptTemp.replace(']', 'w');
        decryptTemp = decryptTemp.replace('{', 'x');
        decryptTemp = decryptTemp.replace('#', 'y');
        decryptTemp = decryptTemp.replace('[', 'z');
        decryptTemp = decryptTemp.replace('╪', ' ');
        decryptTemp = decryptTemp.replace('π', 'A');
        decryptTemp = decryptTemp.replace('_', 'B');
        decryptTemp = decryptTemp.replace('¬', 'C');
        decryptTemp = decryptTemp.replace('|', 'D');
        decryptTemp = decryptTemp.replace('≥', 'E');
        decryptTemp = decryptTemp.replace('í', 'F');
        decryptTemp = decryptTemp.replace('å', 'G');
        decryptTemp = decryptTemp.replace('¼', 'H');
        decryptTemp = decryptTemp.replace('Φ', 'I');
        decryptTemp = decryptTemp.replace('ú', 'J');
        decryptTemp = decryptTemp.replace('±', 'K');
        decryptTemp = decryptTemp.replace('¢', 'L');
        decryptTemp = decryptTemp.replace('½', 'M');
        decryptTemp = decryptTemp.replace('æ', 'N');
        decryptTemp = decryptTemp.replace('¥', 'O');
        decryptTemp = decryptTemp.replace('«', 'P');
        decryptTemp = decryptTemp.replace('╜', 'Q');
        decryptTemp = decryptTemp.replace('╧', 'R');
        decryptTemp = decryptTemp.replace('╬', 'S');
        decryptTemp = decryptTemp.replace('ñ', 'T');
        decryptTemp = decryptTemp.replace('┘', 'U');
        decryptTemp = decryptTemp.replace('█', 'V');
        decryptTemp = decryptTemp.replace('≡', 'W');
        decryptTemp = decryptTemp.replace('√', 'X');
        decryptTemp = decryptTemp.replace('Θ', 'Y');
        decryptTemp = decryptTemp.replace('║', 'Z');
        decryptTemp = decryptTemp.replace('Ñ', '?');
        decryptTemp = decryptTemp.replace('▌', '.');
        decryptTemp = decryptTemp.replace('ß', ',');
        decryptTemp = decryptTemp.replace('≈', '1');
        decryptTemp = decryptTemp.replace('⌡', '2');
        decryptTemp = decryptTemp.replace('Ω', '3');
        decryptTemp = decryptTemp.replace('ó', '4');
        decryptTemp = decryptTemp.replace('ƒ', '5');
        decryptTemp = decryptTemp.replace('î', '6');
        decryptTemp = decryptTemp.replace('Ç', '7');
        decryptTemp = decryptTemp.replace('₧', '8');
        decryptTemp = decryptTemp.replace('░', '9');
        decryptTemp = decryptTemp.replace('▀', '0');

        decryptReturn += Character.toString(decryptTemp.charAt(i));

        return decryptReturn;
        }

    private static String secondDictionary(String decryptTemp, int i)
    {
        String decryptReturn = "";

        decryptTemp = decryptTemp.replace('▄', 'a');
        decryptTemp = decryptTemp.replace('√', 'b');
        decryptTemp = decryptTemp.replace('≈', 'c');
        decryptTemp = decryptTemp.replace('½', 'd');
        decryptTemp = decryptTemp.replace('±', 'e');
        decryptTemp = decryptTemp.replace('æ', 'f');
        decryptTemp = decryptTemp.replace('╪', 'g');
        decryptTemp = decryptTemp.replace('}', 'h');
        decryptTemp = decryptTemp.replace('«', 'i');
        decryptTemp = decryptTemp.replace('⌡', 'j');
        decryptTemp = decryptTemp.replace('_', 'k');
        decryptTemp = decryptTemp.replace('=', 'l');
        decryptTemp = decryptTemp.replace('ó', 'm');
        decryptTemp = decryptTemp.replace('█', 'n');
        decryptTemp = decryptTemp.replace('ñ', 'o');
        decryptTemp = decryptTemp.replace('¢', 'p');
        decryptTemp = decryptTemp.replace('▌', 'q');
        decryptTemp = decryptTemp.replace('╬', 'r');
        decryptTemp = decryptTemp.replace('¼', 's');
        decryptTemp = decryptTemp.replace(']', 't');
        decryptTemp = decryptTemp.replace('≥', 'u');
        decryptTemp = decryptTemp.replace('ƒ', 'v');
        decryptTemp = decryptTemp.replace('╜', 'w');
        decryptTemp = decryptTemp.replace('≡', 'x');
        decryptTemp = decryptTemp.replace('|', 'y');
        decryptTemp = decryptTemp.replace('‘', 'z');
        decryptTemp = decryptTemp.replace('(', ' ');
        decryptTemp = decryptTemp.replace('!', 'A');
        decryptTemp = decryptTemp.replace('@', 'B');
        decryptTemp = decryptTemp.replace('*', 'C');
        decryptTemp = decryptTemp.replace('ß', 'D');
        decryptTemp = decryptTemp.replace('π', 'E');
        decryptTemp = decryptTemp.replace('“', 'F');
        decryptTemp = decryptTemp.replace('}', 'G');
        decryptTemp = decryptTemp.replace('~', 'H');
        decryptTemp = decryptTemp.replace('Ω', 'I');
        decryptTemp = decryptTemp.replace('/', 'J');
        decryptTemp = decryptTemp.replace('┘', 'K');
        decryptTemp = decryptTemp.replace('▀', 'L');
        decryptTemp = decryptTemp.replace('$', 'M');
        decryptTemp = decryptTemp.replace('░', 'N');
        decryptTemp = decryptTemp.replace('Θ', 'O');
        decryptTemp = decryptTemp.replace('¥', 'P');
        decryptTemp = decryptTemp.replace('°', 'Q');
        decryptTemp = decryptTemp.replace('®', 'R');
        decryptTemp = decryptTemp.replace('—', 'S');
        decryptTemp = decryptTemp.replace('₧', 'T');
        decryptTemp = decryptTemp.replace('¹', 'U');
        decryptTemp = decryptTemp.replace('Î', 'V');
        decryptTemp = decryptTemp.replace('Ý', 'W');
        decryptTemp = decryptTemp.replace('‰', 'X');
        decryptTemp = decryptTemp.replace('¿', 'Y');
        decryptTemp = decryptTemp.replace('†', 'Z');
        decryptTemp = decryptTemp.replace('Ç', '?');
        decryptTemp = decryptTemp.replace('î', '.');
        decryptTemp = decryptTemp.replace('÷', ',');
        decryptTemp = decryptTemp.replace('Ä', '1');
        decryptTemp = decryptTemp.replace('ý', '2');
        decryptTemp = decryptTemp.replace('Œ', '3');
        decryptTemp = decryptTemp.replace('Ö', '4');
        decryptTemp = decryptTemp.replace('¸', '5');
        decryptTemp = decryptTemp.replace('œ', '6');
        decryptTemp = decryptTemp.replace('¶', '7');
        decryptTemp = decryptTemp.replace('™', '8');
        decryptTemp = decryptTemp.replace('∞', '9');
        decryptTemp = decryptTemp.replace('£', '0');

        decryptReturn += Character.toString(decryptTemp.charAt(i));

        return decryptReturn;
    }

    private static String thirdDictionary (String decryptTemp, int i)
    {
        String decryptReturn = "";

        decryptTemp = decryptTemp.replace('Ç','a');
        decryptTemp = decryptTemp.replace(']','b');
        decryptTemp = decryptTemp.replace('ƒ','c');
        decryptTemp = decryptTemp.replace('œ','d');
        decryptTemp = decryptTemp.replace('Ý','e');
        decryptTemp = decryptTemp.replace('°','f');
        decryptTemp = decryptTemp.replace('ó','g');
        decryptTemp = decryptTemp.replace('╬','h');
        decryptTemp = decryptTemp.replace('¢','i');
        decryptTemp = decryptTemp.replace('▀','j');
        decryptTemp = decryptTemp.replace('(','k');
        decryptTemp = decryptTemp.replace('π','l');
        decryptTemp = decryptTemp.replace('$','m');
        decryptTemp = decryptTemp.replace('¿','n');
        decryptTemp = decryptTemp.replace('¼','o');
        decryptTemp = decryptTemp.replace('╜','p');
        decryptTemp = decryptTemp.replace('Î','q');
        decryptTemp = decryptTemp.replace('@','r');
        decryptTemp = decryptTemp.replace('∞','s');
        decryptTemp = decryptTemp.replace('‰','t');
        decryptTemp = decryptTemp.replace('/','u');
        decryptTemp = decryptTemp.replace('~','v');
        decryptTemp = decryptTemp.replace('≈','w');
        decryptTemp = decryptTemp.replace('“','x');
        decryptTemp = decryptTemp.replace('₧','y');
        decryptTemp = decryptTemp.replace('┘','z');
        decryptTemp = decryptTemp.replace('¶',' ');
        decryptTemp = decryptTemp.replace('î','A');
        decryptTemp = decryptTemp.replace('÷','B');
        decryptTemp = decryptTemp.replace('Ñ','C');
        decryptTemp = decryptTemp.replace('¸','D');
        decryptTemp = decryptTemp.replace('¥','E');
        decryptTemp = decryptTemp.replace('ß','F');
        decryptTemp = decryptTemp.replace('¼','G');
        decryptTemp = decryptTemp.replace('_','H');
        decryptTemp = decryptTemp.replace('¹','I');
        decryptTemp = decryptTemp.replace('░','J');
        decryptTemp = decryptTemp.replace('±','K');
        decryptTemp = decryptTemp.replace('™','L');
        decryptTemp = decryptTemp.replace('≡','M');
        decryptTemp = decryptTemp.replace('!','N');
        decryptTemp = decryptTemp.replace('Θ','O');
        decryptTemp = decryptTemp.replace('£','P');
        decryptTemp = decryptTemp.replace('▌','Q');
        decryptTemp = decryptTemp.replace('=','R');
        decryptTemp = decryptTemp.replace('√','S');
        decryptTemp = decryptTemp.replace('ç','T');
        decryptTemp = decryptTemp.replace('╚','U');
        decryptTemp = decryptTemp.replace('§','V');
        decryptTemp = decryptTemp.replace('Δ','W');
        decryptTemp = decryptTemp.replace('…','X');
        decryptTemp = decryptTemp.replace('²','Y');
        decryptTemp = decryptTemp.replace('¤','Z');
        decryptTemp = decryptTemp.replace('¾','?');
        decryptTemp = decryptTemp.replace('«','.');
        decryptTemp = decryptTemp.replace('Ð',',');
        decryptTemp = decryptTemp.replace('å','1');
        decryptTemp = decryptTemp.replace('ø','2');
        decryptTemp = decryptTemp.replace('•','3');
        decryptTemp = decryptTemp.replace('Ž','4');
        decryptTemp = decryptTemp.replace('×','5');
        decryptTemp = decryptTemp.replace('≥','6');
        decryptTemp = decryptTemp.replace('³','7');
        decryptTemp = decryptTemp.replace('┤','8');
        decryptTemp = decryptTemp.replace('⌠','9');
        decryptTemp = decryptTemp.replace('ý','0');

        decryptReturn += Character.toString(decryptTemp.charAt(i));

        return decryptReturn;
    }
}