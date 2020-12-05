package EncryptionV2;

public class EncryptMessage
{
    public static String encryptString(String encryptTemp)
    {

        int zeroAndThree = 0;
        int oneAndFour = 1;
        int twoAndFive = 2;
        String encryptReturnMain = "";

        for (int i = 0; i < encryptTemp.length(); i++)
        {
            if (i == zeroAndThree)
            {
                encryptReturnMain += firstDictionary(encryptTemp, i);
                zeroAndThree += 3;
            }
            if (i == oneAndFour)
            {
                encryptReturnMain += secondDictionary(encryptTemp, i);
                oneAndFour += 3;
            }
            if (i == twoAndFive) {
                encryptReturnMain += thirdDictionary(encryptTemp, i);
                twoAndFive += 3;
            }
        }
        return encryptReturnMain;
    }
    //Goes through 3 different dictionaries to make guessing the words more difficult
    private static String firstDictionary (String encryptTemp, int i)
    {
        String encryptReturn = "";

        encryptTemp = encryptTemp.replace('a', '-');
        encryptTemp = encryptTemp.replace('b', '£');
        encryptTemp = encryptTemp.replace('c', '*');
        encryptTemp = encryptTemp.replace('d', '@');
        encryptTemp = encryptTemp.replace('e', '}');
        encryptTemp = encryptTemp.replace('f', '~');
        encryptTemp = encryptTemp.replace('g', '=');
        encryptTemp = encryptTemp.replace('h', '!');
        encryptTemp = encryptTemp.replace('i', '&');
        encryptTemp = encryptTemp.replace('j', '+');
        encryptTemp = encryptTemp.replace('k', '“');
        encryptTemp = encryptTemp.replace('l', ':');
        encryptTemp = encryptTemp.replace('m', '╝');
        encryptTemp = encryptTemp.replace('n', '▄');
        encryptTemp = encryptTemp.replace('o', '<');
        encryptTemp = encryptTemp.replace('p', '/');
        encryptTemp = encryptTemp.replace('q', 'τ');
        encryptTemp = encryptTemp.replace('r', '$');
        encryptTemp = encryptTemp.replace('s', '(');
        encryptTemp = encryptTemp.replace('t', '%');
        encryptTemp = encryptTemp.replace('u', '>');
        encryptTemp = encryptTemp.replace('v', '‘');
        encryptTemp = encryptTemp.replace('w', ']');
        encryptTemp = encryptTemp.replace('x', '{');
        encryptTemp = encryptTemp.replace('y', '#');
        encryptTemp = encryptTemp.replace('z', '[');
        encryptTemp = encryptTemp.replace(' ', '╪');
        encryptTemp = encryptTemp.replace('A', 'π');
        encryptTemp = encryptTemp.replace('B', '_');
        encryptTemp = encryptTemp.replace('C', '¬');
        encryptTemp = encryptTemp.replace('D', '|');
        encryptTemp = encryptTemp.replace('E', '≥');
        encryptTemp = encryptTemp.replace('F', 'í');
        encryptTemp = encryptTemp.replace('G', 'å');
        encryptTemp = encryptTemp.replace('H', '¼');
        encryptTemp = encryptTemp.replace('I', 'Φ');
        encryptTemp = encryptTemp.replace('J', 'ú');
        encryptTemp = encryptTemp.replace('K', '±');
        encryptTemp = encryptTemp.replace('L', '¢');
        encryptTemp = encryptTemp.replace('M', '½');
        encryptTemp = encryptTemp.replace('N', 'æ');
        encryptTemp = encryptTemp.replace('O', '¥');
        encryptTemp = encryptTemp.replace('P', '«');
        encryptTemp = encryptTemp.replace('Q', '╜');
        encryptTemp = encryptTemp.replace('R', '╧');
        encryptTemp = encryptTemp.replace('S', '╬');
        encryptTemp = encryptTemp.replace('T', 'ñ');
        encryptTemp = encryptTemp.replace('U', '┘');
        encryptTemp = encryptTemp.replace('V', '█');
        encryptTemp = encryptTemp.replace('W', '≡');
        encryptTemp = encryptTemp.replace('X', '√');
        encryptTemp = encryptTemp.replace('Y', 'Θ');
        encryptTemp = encryptTemp.replace('Z', '║');
        encryptTemp = encryptTemp.replace('?', 'Ñ');
        encryptTemp = encryptTemp.replace('.', '▌');
        encryptTemp = encryptTemp.replace(',', 'ß');
        encryptTemp = encryptTemp.replace('1', '≈');
        encryptTemp = encryptTemp.replace('2', '⌡');
        encryptTemp = encryptTemp.replace('3', 'Ω');
        encryptTemp = encryptTemp.replace('4', 'ó');
        encryptTemp = encryptTemp.replace('5', 'ƒ');
        encryptTemp = encryptTemp.replace('6', 'î');
        encryptTemp = encryptTemp.replace('7', 'Ç');
        encryptTemp = encryptTemp.replace('8', '₧');
        encryptTemp = encryptTemp.replace('9', '░');
        encryptTemp = encryptTemp.replace('0', '▀');

        encryptReturn += Character.toString(encryptTemp.charAt(i));

        return encryptReturn;
    }

    private static String secondDictionary(String encryptTemp, int i)
    {
        String encryptReturn = "";

        encryptTemp = encryptTemp.replace('a', '▄');
        encryptTemp = encryptTemp.replace('b', '√');
        encryptTemp = encryptTemp.replace('c', '≈');
        encryptTemp = encryptTemp.replace('d', '½');
        encryptTemp = encryptTemp.replace('e', '±');
        encryptTemp = encryptTemp.replace('f', 'æ');
        encryptTemp = encryptTemp.replace('g', '╪');
        encryptTemp = encryptTemp.replace('h', '}');
        encryptTemp = encryptTemp.replace('i', '«');
        encryptTemp = encryptTemp.replace('j', '⌡');
        encryptTemp = encryptTemp.replace('k', '_');
        encryptTemp = encryptTemp.replace('l', '=');
        encryptTemp = encryptTemp.replace('m', 'ó');
        encryptTemp = encryptTemp.replace('n', '█');
        encryptTemp = encryptTemp.replace('o', 'ñ');
        encryptTemp = encryptTemp.replace('p', '¢');
        encryptTemp = encryptTemp.replace('q', '▌');
        encryptTemp = encryptTemp.replace('r', '╬');
        encryptTemp = encryptTemp.replace('s', '¼');
        encryptTemp = encryptTemp.replace('t', ']');
        encryptTemp = encryptTemp.replace('u', '≥');
        encryptTemp = encryptTemp.replace('v', 'ƒ');
        encryptTemp = encryptTemp.replace('w', '╜');
        encryptTemp = encryptTemp.replace('x', '≡');
        encryptTemp = encryptTemp.replace('y', '|');
        encryptTemp = encryptTemp.replace('z', '‘');
        encryptTemp = encryptTemp.replace(' ', '(');
        encryptTemp = encryptTemp.replace('A', '!');
        encryptTemp = encryptTemp.replace('B', '@');
        encryptTemp = encryptTemp.replace('C', '*');
        encryptTemp = encryptTemp.replace('D', 'ß');
        encryptTemp = encryptTemp.replace('E', 'π');
        encryptTemp = encryptTemp.replace('F', '“');
        encryptTemp = encryptTemp.replace('G', '}');
        encryptTemp = encryptTemp.replace('H', '~');
        encryptTemp = encryptTemp.replace('I', 'Ω');
        encryptTemp = encryptTemp.replace('J', '/');
        encryptTemp = encryptTemp.replace('K', '┘');
        encryptTemp = encryptTemp.replace('L', '▀');
        encryptTemp = encryptTemp.replace('M', '$');
        encryptTemp = encryptTemp.replace('N', '░');
        encryptTemp = encryptTemp.replace('O', 'Θ');
        encryptTemp = encryptTemp.replace('P', '¥');
        encryptTemp = encryptTemp.replace('Q', '°');
        encryptTemp = encryptTemp.replace('R', '®');
        encryptTemp = encryptTemp.replace('S', '—');
        encryptTemp = encryptTemp.replace('T', '₧');
        encryptTemp = encryptTemp.replace('U', '¹');
        encryptTemp = encryptTemp.replace('V', 'Î');
        encryptTemp = encryptTemp.replace('W', 'Ý');
        encryptTemp = encryptTemp.replace('X', '‰');
        encryptTemp = encryptTemp.replace('Y', '¿');
        encryptTemp = encryptTemp.replace('Z', '†');
        encryptTemp = encryptTemp.replace('?', 'Ç');
        encryptTemp = encryptTemp.replace('.', 'î');
        encryptTemp = encryptTemp.replace(',', '÷');
        encryptTemp = encryptTemp.replace('1', 'Ä');
        encryptTemp = encryptTemp.replace('2', 'ý');
        encryptTemp = encryptTemp.replace('3', 'Œ');
        encryptTemp = encryptTemp.replace('4', 'Ö');
        encryptTemp = encryptTemp.replace('5', '¸');
        encryptTemp = encryptTemp.replace('6', 'œ');
        encryptTemp = encryptTemp.replace('7', '¶');
        encryptTemp = encryptTemp.replace('8', '™');
        encryptTemp = encryptTemp.replace('9', '∞');
        encryptTemp = encryptTemp.replace('0', '£');

        encryptReturn += Character.toString(encryptTemp.charAt(i));

        return encryptReturn;
    }

    private static String thirdDictionary (String encryptTemp, int i)
    {
        String encryptReturn = "";

        encryptTemp = encryptTemp.replace('a', 'Ç');
        encryptTemp = encryptTemp.replace('b', ']');
        encryptTemp = encryptTemp.replace('c', 'ƒ');
        encryptTemp = encryptTemp.replace('d', 'œ');
        encryptTemp = encryptTemp.replace('e', 'Ý');
        encryptTemp = encryptTemp.replace('f', '°');
        encryptTemp = encryptTemp.replace('g', 'ó');
        encryptTemp = encryptTemp.replace('h', '╬');
        encryptTemp = encryptTemp.replace('i', '¢');
        encryptTemp = encryptTemp.replace('j', '▀');
        encryptTemp = encryptTemp.replace('k', '(');
        encryptTemp = encryptTemp.replace('l', 'π');
        encryptTemp = encryptTemp.replace('m', '$');
        encryptTemp = encryptTemp.replace('n', '¿');
        encryptTemp = encryptTemp.replace('o', '¼');
        encryptTemp = encryptTemp.replace('p', '╜');
        encryptTemp = encryptTemp.replace('q', 'Î');
        encryptTemp = encryptTemp.replace('r', '@');
        encryptTemp = encryptTemp.replace('s', '∞');
        encryptTemp = encryptTemp.replace('t', '‰');
        encryptTemp = encryptTemp.replace('u', '/');
        encryptTemp = encryptTemp.replace('v', '~');
        encryptTemp = encryptTemp.replace('w', '≈');
        encryptTemp = encryptTemp.replace('x', '“');
        encryptTemp = encryptTemp.replace('y', '₧');
        encryptTemp = encryptTemp.replace('z', '┘');
        encryptTemp = encryptTemp.replace(' ', '¶');
        encryptTemp = encryptTemp.replace('A', 'î');
        encryptTemp = encryptTemp.replace('B', '÷');
        encryptTemp = encryptTemp.replace('C', 'Ñ');
        encryptTemp = encryptTemp.replace('D', '¸');
        encryptTemp = encryptTemp.replace('E', '¥');
        encryptTemp = encryptTemp.replace('F', 'ß');
        encryptTemp = encryptTemp.replace('G', '¼');
        encryptTemp = encryptTemp.replace('H', '_');
        encryptTemp = encryptTemp.replace('I', '¹');
        encryptTemp = encryptTemp.replace('J', '░');
        encryptTemp = encryptTemp.replace('K', '±');
        encryptTemp = encryptTemp.replace('L', '™');
        encryptTemp = encryptTemp.replace('M', '≡');
        encryptTemp = encryptTemp.replace('N', '!');
        encryptTemp = encryptTemp.replace('O', 'Θ');
        encryptTemp = encryptTemp.replace('P', '£');
        encryptTemp = encryptTemp.replace('Q', '▌');
        encryptTemp = encryptTemp.replace('R', '=');
        encryptTemp = encryptTemp.replace('S', '√');
        encryptTemp = encryptTemp.replace('T', 'ç');
        encryptTemp = encryptTemp.replace('U', '╚');
        encryptTemp = encryptTemp.replace('V', '§');
        encryptTemp = encryptTemp.replace('W', 'Δ');
        encryptTemp = encryptTemp.replace('X', '…');
        encryptTemp = encryptTemp.replace('Y', '²');
        encryptTemp = encryptTemp.replace('Z', '¤');
        encryptTemp = encryptTemp.replace('?', '¾');
        encryptTemp = encryptTemp.replace('.', '«');
        encryptTemp = encryptTemp.replace(',', 'Ð');
        encryptTemp = encryptTemp.replace('1', 'å');
        encryptTemp = encryptTemp.replace('2', 'ø');
        encryptTemp = encryptTemp.replace('3', '•');
        encryptTemp = encryptTemp.replace('4', 'Ž');
        encryptTemp = encryptTemp.replace('5', '×');
        encryptTemp = encryptTemp.replace('6', '≥');
        encryptTemp = encryptTemp.replace('7', '³');
        encryptTemp = encryptTemp.replace('8', '┤');
        encryptTemp = encryptTemp.replace('9', '⌠');
        encryptTemp = encryptTemp.replace('0', 'ý');

        encryptReturn += Character.toString(encryptTemp.charAt(i));

        return encryptReturn;
    }
}