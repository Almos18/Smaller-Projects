package EncryptionV2;

import javax.swing.*;

public class DecryptMessage
{
    public static String decryptString(String decryptTemp) {
        decryptTemp = JOptionPane.showInputDialog("Input message");

        int zeroAndThree = 0;
        int oneAndFour = 1;
        int twoAndFive = 2;
        String decryptReturn = "";
        String decryptOriginal = decryptTemp;

        for (int i = 0; i < decryptTemp.length(); i++)
        {
            if (i == zeroAndThree)
            {
                decryptTemp = decryptTemp.replace('-','a');
                decryptTemp = decryptTemp.replace('£','b' );
                decryptTemp = decryptTemp.replace('*','c');
                decryptTemp = decryptTemp.replace('@','d');
                decryptTemp = decryptTemp.replace('}','e');
                decryptTemp = decryptTemp.replace('~','f') ;
                decryptTemp = decryptTemp.replace('=','g' );
                decryptTemp = decryptTemp.replace('!','h');
                decryptTemp = decryptTemp.replace('&','i');
                decryptTemp = decryptTemp.replace('+','j');
                decryptTemp = decryptTemp.replace('“','k');
                decryptTemp = decryptTemp.replace(':','l');
                decryptTemp = decryptTemp.replace('╝','m');
                decryptTemp = decryptTemp.replace('▄','n');
                decryptTemp = decryptTemp.replace('<','o');
                decryptTemp = decryptTemp.replace('/','p');
                decryptTemp = decryptTemp.replace('τ','q');
                decryptTemp = decryptTemp.replace('$','r');
                decryptTemp = decryptTemp.replace('(','s');
                decryptTemp = decryptTemp.replace('%','t');
                decryptTemp = decryptTemp.replace('>','u');
                decryptTemp = decryptTemp.replace('‘','v');
                decryptTemp = decryptTemp.replace(']','w');
                decryptTemp = decryptTemp.replace('{','x');
                decryptTemp = decryptTemp.replace('#','y');
                decryptTemp = decryptTemp.replace('[','z');
                decryptTemp = decryptTemp.replace('╪', ' ');
                decryptTemp = decryptTemp.replace('π','A');
                decryptTemp = decryptTemp.replace('_','B');
                decryptTemp = decryptTemp.replace('¬','C');
                decryptTemp = decryptTemp.replace('|','D');
                decryptTemp = decryptTemp.replace('≥','E');
                decryptTemp = decryptTemp.replace('í','F');
                decryptTemp = decryptTemp.replace('å','G');
                decryptTemp = decryptTemp.replace('¼','H');
                decryptTemp = decryptTemp.replace('Φ','I');
                decryptTemp = decryptTemp.replace('ú','J');
                decryptTemp = decryptTemp.replace('±','K');
                decryptTemp = decryptTemp.replace('¢','L');
                decryptTemp = decryptTemp.replace('½','M');
                decryptTemp = decryptTemp.replace('æ','N');
                decryptTemp = decryptTemp.replace('¥','O');
                decryptTemp = decryptTemp.replace('«','P');
                decryptTemp = decryptTemp.replace('╜','Q');
                decryptTemp = decryptTemp.replace('╧','R');
                decryptTemp = decryptTemp.replace('╬','S');
                decryptTemp = decryptTemp.replace('ñ','T');
                decryptTemp = decryptTemp.replace('┘','U');
                decryptTemp = decryptTemp.replace('█','V');
                decryptTemp = decryptTemp.replace('≡','W');
                decryptTemp = decryptTemp.replace('√','X');
                decryptTemp = decryptTemp.replace('Θ','Y');
                decryptTemp = decryptTemp.replace('║','Z');
                decryptTemp = decryptTemp.replace('Ñ','?');
                decryptTemp = decryptTemp.replace('▌','.');
                decryptTemp = decryptTemp.replace('ß',',');
                decryptTemp = decryptTemp.replace('≈','1');
                decryptTemp = decryptTemp.replace('⌡','2');
                decryptTemp = decryptTemp.replace('Ω','3');
                decryptTemp = decryptTemp.replace('ó','4');
                decryptTemp = decryptTemp.replace('ƒ','5');
                decryptTemp = decryptTemp.replace('î','6');
                decryptTemp = decryptTemp.replace('Ç','7');
                decryptTemp = decryptTemp.replace('₧','8');
                decryptTemp = decryptTemp.replace('░','9');
                decryptTemp = decryptTemp.replace('▀','0');
                zeroAndThree += 3;
                decryptReturn += Character.toString(decryptTemp.charAt(i));
            }

            if (i == oneAndFour)
            {
                decryptTemp = decryptOriginal;
                decryptTemp = decryptTemp.replace('a', '▄');
                decryptTemp = decryptTemp.replace('b', '√');
                decryptTemp = decryptTemp.replace('c', '≈');
                decryptTemp = decryptTemp.replace('d', '½');
                decryptTemp = decryptTemp.replace('e', '±');
                decryptTemp = decryptTemp.replace('f', 'æ');
                decryptTemp = decryptTemp.replace('g', '╪');
                decryptTemp = decryptTemp.replace('h', '}');
                decryptTemp = decryptTemp.replace('i', '«');
                decryptTemp = decryptTemp.replace('j', '⌡');
                decryptTemp = decryptTemp.replace('k', '_');
                decryptTemp = decryptTemp.replace('l', '=');
                decryptTemp = decryptTemp.replace('m', 'ó');
                decryptTemp = decryptTemp.replace('n', '█');
                decryptTemp = decryptTemp.replace('o', 'ñ');
                decryptTemp = decryptTemp.replace('p', '¢');
                decryptTemp = decryptTemp.replace('q', '▌');
                decryptTemp = decryptTemp.replace('r', '╬');
                decryptTemp = decryptTemp.replace('s', '¼');
                decryptTemp = decryptTemp.replace('t', ']');
                decryptTemp = decryptTemp.replace('u', '≥');
                decryptTemp = decryptTemp.replace('v', 'ƒ');
                decryptTemp = decryptTemp.replace('w', '╜');
                decryptTemp = decryptTemp.replace('x', '≡');
                decryptTemp = decryptTemp.replace('y', '|');
                decryptTemp = decryptTemp.replace('z', '‘');
                decryptTemp = decryptTemp.replace(' ', '(');
                decryptTemp = decryptTemp.replace('A', '!');
                decryptTemp = decryptTemp.replace('B', '@');
                decryptTemp = decryptTemp.replace('C', 'Ñ');
                decryptTemp = decryptTemp.replace('D', 'ß');
                decryptTemp = decryptTemp.replace('E', 'π');
                decryptTemp = decryptTemp.replace('F', '“');
                decryptTemp = decryptTemp.replace('G', '}');
                decryptTemp = decryptTemp.replace('H', '~');
                decryptTemp = decryptTemp.replace('I', 'Ω');
                decryptTemp = decryptTemp.replace('J', '/');
                decryptTemp = decryptTemp.replace('K', '┘');
                decryptTemp = decryptTemp.replace('L', '▀');
                decryptTemp = decryptTemp.replace('M', '$');
                decryptTemp = decryptTemp.replace('N', '░');
                decryptTemp = decryptTemp.replace('O', 'Θ');
                decryptTemp = decryptTemp.replace('P', '¥');
                decryptTemp = decryptTemp.replace('Q', '°');
                decryptTemp = decryptTemp.replace('R', '®');
                decryptTemp = decryptTemp.replace('S', '—');
                decryptTemp = decryptTemp.replace('T', '₧');
                decryptTemp = decryptTemp.replace('U', '¹');
                decryptTemp = decryptTemp.replace('V', 'Î');
                decryptTemp = decryptTemp.replace('W', 'Ý');
                decryptTemp = decryptTemp.replace('X', '‰');
                decryptTemp = decryptTemp.replace('Y', '¿');
                decryptTemp = decryptTemp.replace('Z', '†');
                decryptTemp = decryptTemp.replace('?', 'Ç');
                decryptTemp = decryptTemp.replace('.', 'î');
                decryptTemp = decryptTemp.replace(',', '÷');
                decryptTemp = decryptTemp.replace('1', 'Ä');
                decryptTemp = decryptTemp.replace('2', 'ý');
                decryptTemp = decryptTemp.replace('3', 'Œ');
                decryptTemp = decryptTemp.replace('4', 'Ö');
                decryptTemp = decryptTemp.replace('5', '¸');
                decryptTemp = decryptTemp.replace('6', 'œ');
                decryptTemp = decryptTemp.replace('7', '¶');
                decryptTemp = decryptTemp.replace('8', '™');
                decryptTemp = decryptTemp.replace('9', '∞');
                decryptTemp = decryptTemp.replace('0', '£');
                oneAndFour += 3;
                decryptReturn += Character.toString(decryptTemp.charAt(i));
            }

            if (i == twoAndFive)
            {
                decryptTemp = decryptOriginal;
                decryptTemp = decryptTemp.replace('a', 'Ç');
                decryptTemp = decryptTemp.replace('b', ']');
                decryptTemp = decryptTemp.replace('c', 'ƒ');
                decryptTemp = decryptTemp.replace('d', 'œ');
                decryptTemp = decryptTemp.replace('e', 'Ý');
                decryptTemp = decryptTemp.replace('f', '°');
                decryptTemp = decryptTemp.replace('g', 'ó');
                decryptTemp = decryptTemp.replace('h', '╬');
                decryptTemp = decryptTemp.replace('i', '¢');
                decryptTemp = decryptTemp.replace('j', '▀');
                decryptTemp = decryptTemp.replace('k', '(');
                decryptTemp = decryptTemp.replace('l', 'π');
                decryptTemp = decryptTemp.replace('m', '$');
                decryptTemp = decryptTemp.replace('n', '¿');
                decryptTemp = decryptTemp.replace('o', '¼');
                decryptTemp = decryptTemp.replace('p', '╜');
                decryptTemp = decryptTemp.replace('q', 'Î');
                decryptTemp = decryptTemp.replace('r', '@');
                decryptTemp = decryptTemp.replace('s', '∞');
                decryptTemp = decryptTemp.replace('t', '‰');
                decryptTemp = decryptTemp.replace('u', '/');
                decryptTemp = decryptTemp.replace('v', '~');
                decryptTemp = decryptTemp.replace('w', '≈');
                decryptTemp = decryptTemp.replace('x', '“');
                decryptTemp = decryptTemp.replace('y', '₧');
                decryptTemp = decryptTemp.replace('z', '┘');
                decryptTemp = decryptTemp.replace(' ', '¶');
                decryptTemp = decryptTemp.replace('A', 'î');
                decryptTemp = decryptTemp.replace('B', '÷');
                decryptTemp = decryptTemp.replace('C', 'Ñ');
                decryptTemp = decryptTemp.replace('D', '¸');
                decryptTemp = decryptTemp.replace('E', '¥');
                decryptTemp = decryptTemp.replace('F', 'ß');
                decryptTemp = decryptTemp.replace('G', '¼');
                decryptTemp = decryptTemp.replace('H', '_');
                decryptTemp = decryptTemp.replace('I', '¹');
                decryptTemp = decryptTemp.replace('J', '░');
                decryptTemp = decryptTemp.replace('K', '±');
                decryptTemp = decryptTemp.replace('L', '™');
                decryptTemp = decryptTemp.replace('M', '≡');
                decryptTemp = decryptTemp.replace('N', '!');
                decryptTemp = decryptTemp.replace('O', 'Θ');
                decryptTemp = decryptTemp.replace('P', '£');
                decryptTemp = decryptTemp.replace('Q', '▌');
                decryptTemp = decryptTemp.replace('R', '=');
                decryptTemp = decryptTemp.replace('S', '√');
                decryptTemp = decryptTemp.replace('T', 'ç');
                decryptTemp = decryptTemp.replace('U', '╚');
                decryptTemp = decryptTemp.replace('V', '§');
                decryptTemp = decryptTemp.replace('W', 'Δ');
                decryptTemp = decryptTemp.replace('X', '…');
                decryptTemp = decryptTemp.replace('Y', '²');
                decryptTemp = decryptTemp.replace('Z', '¤');
                decryptTemp = decryptTemp.replace('?', '¾');
                decryptTemp = decryptTemp.replace('.', '«');
                decryptTemp = decryptTemp.replace(',', 'Ð');
                decryptTemp = decryptTemp.replace('1', 'å');
                decryptTemp = decryptTemp.replace('2', 'ø');
                decryptTemp = decryptTemp.replace('3', '•');
                decryptTemp = decryptTemp.replace('4', 'Ž');
                decryptTemp = decryptTemp.replace('5', '×');
                decryptTemp = decryptTemp.replace('6', '≥');
                decryptTemp = decryptTemp.replace('7', '³');
                decryptTemp = decryptTemp.replace('8', '┤');
                decryptTemp = decryptTemp.replace('9', '⌠');
                decryptTemp = decryptTemp.replace('0', 'ý');
                twoAndFive += 3;
                decryptReturn += Character.toString(decryptTemp.charAt(i));
            }
        }
        return decryptReturn;
    }
}