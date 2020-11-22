package EncryptionV2;

import javax.swing.*;

public class EncryptMessage
{
    public static String encryptString(String encryptTemp)
    {

        for(int i=0;i<encryptTemp.length();i++)
        {
            encryptTemp = encryptTemp.replace('a','-');
            encryptTemp = encryptTemp.replace('b','£');
            encryptTemp = encryptTemp.replace('c','*');
            encryptTemp = encryptTemp.replace('d','@');
            encryptTemp = encryptTemp.replace('e','}');
            encryptTemp = encryptTemp.replace('f','~');
            encryptTemp = encryptTemp.replace('g','=');
            encryptTemp = encryptTemp.replace('h','!');
            encryptTemp = encryptTemp.replace('i','&');
            encryptTemp = encryptTemp.replace('j','+');
            encryptTemp = encryptTemp.replace('k','“');
            encryptTemp = encryptTemp.replace('l',':');
            encryptTemp = encryptTemp.replace('m','╝');
            encryptTemp = encryptTemp.replace('n','▄');
            encryptTemp = encryptTemp.replace('o','<');
            encryptTemp = encryptTemp.replace('p','/');
            encryptTemp = encryptTemp.replace('q','τ');
            encryptTemp = encryptTemp.replace('r','$');
            encryptTemp = encryptTemp.replace('s','(');
            encryptTemp = encryptTemp.replace('t','%');
            encryptTemp = encryptTemp.replace('u','>');
            encryptTemp = encryptTemp.replace('v','‘');
            encryptTemp = encryptTemp.replace('w',']');
            encryptTemp = encryptTemp.replace('x','{');
            encryptTemp = encryptTemp.replace('y','#');
            encryptTemp = encryptTemp.replace('z','[');
            encryptTemp = encryptTemp.replace(' ','╪');
            encryptTemp = encryptTemp.replace('A','π');
            encryptTemp = encryptTemp.replace('B','_');
            encryptTemp = encryptTemp.replace('C','¬');
            encryptTemp = encryptTemp.replace('D','|');
            encryptTemp = encryptTemp.replace('E','≥');
            encryptTemp = encryptTemp.replace('F','í');
            encryptTemp = encryptTemp.replace('G','å');
            encryptTemp = encryptTemp.replace('H','¼');
            encryptTemp = encryptTemp.replace('I','Φ');
            encryptTemp = encryptTemp.replace('J','ú');
            encryptTemp = encryptTemp.replace('K','±');
            encryptTemp = encryptTemp.replace('L','¢');
            encryptTemp = encryptTemp.replace('M','½');
            encryptTemp = encryptTemp.replace('N','æ');
            encryptTemp = encryptTemp.replace('O','¥');
            encryptTemp = encryptTemp.replace('P','«');
            encryptTemp = encryptTemp.replace('Q','╜');
            encryptTemp = encryptTemp.replace('R','╧');
            encryptTemp = encryptTemp.replace('S','╬');
            encryptTemp = encryptTemp.replace('T','ñ');
            encryptTemp = encryptTemp.replace('U','┘');
            encryptTemp = encryptTemp.replace('V','█');
            encryptTemp = encryptTemp.replace('W','≡');
            encryptTemp = encryptTemp.replace('X','√');
            encryptTemp = encryptTemp.replace('Y','Θ');
            encryptTemp = encryptTemp.replace('Z','║');
            encryptTemp = encryptTemp.replace('?','Ñ');
            encryptTemp = encryptTemp.replace('.','▌');
            encryptTemp = encryptTemp.replace(',','ß');
            encryptTemp = encryptTemp.replace('1','≈');
            encryptTemp = encryptTemp.replace('2','⌡');
            encryptTemp = encryptTemp.replace('3','Ω');
            encryptTemp = encryptTemp.replace('4','ó');
            encryptTemp = encryptTemp.replace('5','ƒ');
            encryptTemp = encryptTemp.replace('6','î');
            encryptTemp = encryptTemp.replace('7','Ç');
            encryptTemp = encryptTemp.replace('8','₧');
            encryptTemp = encryptTemp.replace('9','░');
            encryptTemp = encryptTemp.replace('0','▀');
        }
        return encryptTemp;
    }
}