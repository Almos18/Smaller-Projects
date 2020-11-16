package EncryptionV1;

//EncryptUI.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class EncryptUI
{
    JButton encrypt;
    JButton decrypt;
    JButton showMessages;
    String storageString1[] = new String[] {"","","","",""};
    String storageString2[] = new String[] {"","","","",""};
    String nonArrayStorageString1, nonArrayStorageString2;
    int k=0, h=0;

    public EncryptUI()
    {
        JFrame jFrameWindow = new JFrame();

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);
        jFrameWindow.setSize(250,150);
        jFrameWindow.setTitle("EncryptUI");
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Choose what you want to do");
        jFrameWindow.add(jLabel);

        encrypt = new JButton("Encrypt");
        jFrameWindow.add(encrypt);

        decrypt = new JButton("Decrypt");
        jFrameWindow.add(decrypt);

        showMessages = new JButton("Show Stored Messages");
        jFrameWindow.add(showMessages);

        ButtonEventHandler handler = new ButtonEventHandler();

        encrypt.addActionListener(handler);
        decrypt.addActionListener(handler);
        showMessages.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }

    public static void main(String args[])
    {
        EncryptUI guiApp = new EncryptUI();
    }
    private class ButtonEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String firstString[] = new String[1];
            String secondString="", thirdString="";
            if(e.getSource()==encrypt)
            {
                nonArrayStorageString1 = encryptionCode5(firstString, secondString, thirdString);
                JOptionPane.showMessageDialog(null,"Your encrypted message is \n\n" + nonArrayStorageString1);
                storageString1[k] = nonArrayStorageString1;
                k++;
            }
            else if(e.getSource()==decrypt)
            {
                nonArrayStorageString2 = decryptionCode5(firstString, thirdString);
                JOptionPane.showMessageDialog(null,"Your decrypted message is \n\n" + nonArrayStorageString2);
                storageString2[h] = nonArrayStorageString2;
                h++;
            }
            else if(e.getSource()==showMessages)
            {
                showStoredMessages(storageString1, storageString2);
            }
        }
    }

    public static String encryptionCode5(String firstString[], String secondString, String thirdString)
    {
        firstString[0] = JOptionPane.showInputDialog(null,"Please input a message you want encrypted",
                "Question",JOptionPane.QUESTION_MESSAGE);

        for(int i=0;i<firstString.length;i++)
        {
            thirdString = firstString[0];
            secondString = thirdString;

            secondString = secondString.replace('a','-');
            secondString = secondString.replace('b','£');
            secondString = secondString.replace('c','*');
            secondString = secondString.replace('d','@');
            secondString = secondString.replace('e','}');
            secondString = secondString.replace('f','~');
            secondString = secondString.replace('g','=');
            secondString = secondString.replace('h','!');
            secondString = secondString.replace('i','&');
            secondString = secondString.replace('j','+');
            secondString = secondString.replace('k','“');
            secondString = secondString.replace('l',':');
            secondString = secondString.replace('m','╝');
            secondString = secondString.replace('n','▄');
            secondString = secondString.replace('o','<');
            secondString = secondString.replace('p','/');
            secondString = secondString.replace('q','τ');
            secondString = secondString.replace('r','$');
            secondString = secondString.replace('s','(');
            secondString = secondString.replace('t','%');
            secondString = secondString.replace('u','>');
            secondString = secondString.replace('v','‘');
            secondString = secondString.replace('w',']');
            secondString = secondString.replace('x','{');
            secondString = secondString.replace('y','#');
            secondString = secondString.replace('z','[');
            secondString = secondString.replace(' ','╪');
            secondString = secondString.replace('A','π');
            secondString = secondString.replace('B','_');
            secondString = secondString.replace('C','¬');
            secondString = secondString.replace('D','|');
            secondString = secondString.replace('E','≥');
            secondString = secondString.replace('F','í');
            secondString = secondString.replace('G','å');
            secondString = secondString.replace('H','¼');
            secondString = secondString.replace('I','Φ');
            secondString = secondString.replace('J','ú');
            secondString = secondString.replace('K','±');
            secondString = secondString.replace('L','¢');
            secondString = secondString.replace('M','½');
            secondString = secondString.replace('N','æ');
            secondString = secondString.replace('O','¥');
            secondString = secondString.replace('P','«');
            secondString = secondString.replace('Q','╜');
            secondString = secondString.replace('R','╧');
            secondString = secondString.replace('S','╬');
            secondString = secondString.replace('T','ñ');
            secondString = secondString.replace('U','┘');
            secondString = secondString.replace('V','█');
            secondString = secondString.replace('W','≡');
            secondString = secondString.replace('X','√');
            secondString = secondString.replace('Y','Θ');
            secondString = secondString.replace('Z','║');
            secondString = secondString.replace('?','Ñ');
            secondString = secondString.replace('.','▌');
            secondString = secondString.replace(',','ß');
            secondString = secondString.replace('1','≈');
            secondString = secondString.replace('2','⌡');
            secondString = secondString.replace('3','Ω');
            secondString = secondString.replace('4','ó');
            secondString = secondString.replace('5','ƒ');
            secondString = secondString.replace('6','î');
            secondString = secondString.replace('7','Ç');
            secondString = secondString.replace('8','₧');
            secondString = secondString.replace('9','░');
            secondString = secondString.replace('0','▀');
        }
        return secondString;
    }

    public static String decryptionCode5(String firstString[], String thirdString)
    {
        firstString[0] = JOptionPane.showInputDialog(null,"Please input a message you want decrypted",
                "Question",JOptionPane.QUESTION_MESSAGE);

        String secondString="";

        for(int i=0;i<firstString.length;i++)
        {
            thirdString = firstString[0];
            secondString = thirdString;

            secondString = secondString.replace('-','a');
            secondString = secondString.replace('£','b');
            secondString = secondString.replace('*','c');
            secondString = secondString.replace('@','d');
            secondString = secondString.replace('}','e');
            secondString = secondString.replace('~','f');
            secondString = secondString.replace('=','g');
            secondString = secondString.replace('!','h');
            secondString = secondString.replace('&','i');
            secondString = secondString.replace('+','j');
            secondString = secondString.replace('“','k');
            secondString = secondString.replace(':','l');
            secondString = secondString.replace('╝','m');
            secondString = secondString.replace('▄','n');
            secondString = secondString.replace('<','o');
            secondString = secondString.replace('/','p');
            secondString = secondString.replace('τ','q');
            secondString = secondString.replace('$','r');
            secondString = secondString.replace('(','s');
            secondString = secondString.replace('%','t');
            secondString = secondString.replace('>','u');
            secondString = secondString.replace('‘','v');
            secondString = secondString.replace(']','w');
            secondString = secondString.replace('{','x');
            secondString = secondString.replace('#','y');
            secondString = secondString.replace('[','z');
            secondString = secondString.replace('╪',' ');
            secondString = secondString.replace('π','A');
            secondString = secondString.replace('_','B');
            secondString = secondString.replace('¬','C');
            secondString = secondString.replace('|','D');
            secondString = secondString.replace('≥','E');
            secondString = secondString.replace('í','F');
            secondString = secondString.replace('å','G');
            secondString = secondString.replace('¼','H');
            secondString = secondString.replace('Φ','I');
            secondString = secondString.replace('ú','J');
            secondString = secondString.replace('±','K');
            secondString = secondString.replace('¢','L');
            secondString = secondString.replace('½','M');
            secondString = secondString.replace('æ','N');
            secondString = secondString.replace('¥','O');
            secondString = secondString.replace('«','P');
            secondString = secondString.replace('╜','Q');
            secondString = secondString.replace('╧','R');
            secondString = secondString.replace('╬','S');
            secondString = secondString.replace('ñ','T');
            secondString = secondString.replace('┘','U');
            secondString = secondString.replace('█','V');
            secondString = secondString.replace('≡','W');
            secondString = secondString.replace('√','X');
            secondString = secondString.replace('Θ','Y');
            secondString = secondString.replace('║','Z');
            secondString = secondString.replace('Ñ','?');
            secondString = secondString.replace('▌','.');
            secondString = secondString.replace('ß',',');
            secondString = secondString.replace('≈','1');
            secondString = secondString.replace('⌡','2');
            secondString = secondString.replace('Ω','3');
            secondString = secondString.replace('ó','4');
            secondString = secondString.replace('ƒ','5');
            secondString = secondString.replace('î','6');
            secondString = secondString.replace('Ç','7');
            secondString = secondString.replace('₧','8');
            secondString = secondString.replace('░','9');
            secondString = secondString.replace('▀','0');
        }
        return secondString;
    }

    public static void showStoredMessages(String storageString1[], String storageString2[])
    {
        JTextArea final1 = new JTextArea(10, 10);
        final1.setText("The values you have inputted are:\n\n" + Arrays.toString(storageString1) + "\n" + Arrays.toString(storageString2));
        final1.setWrapStyleWord(true);
        final1.setLineWrap(true);
        final1.setCaretPosition(0);
        final1.setEditable(false);

        JOptionPane.showMessageDialog(null,new JScrollPane(final1),"RESULT",JOptionPane.INFORMATION_MESSAGE);
    }
}