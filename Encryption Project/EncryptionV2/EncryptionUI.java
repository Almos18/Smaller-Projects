package EncryptionV2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class EncryptionUI {

    JButton encryptButton;
    JButton decryptButton;
    JButton showRecorded;

    public EncryptionUI() {
        JFrame jFrameWindow = new JFrame();

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);
        jFrameWindow.setSize(250, 150);
        jFrameWindow.setTitle("Encryption");
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Choose what you want to do");
        jFrameWindow.add(jLabel);

        encryptButton = new JButton("Encrypt Message");
        jFrameWindow.add(encryptButton);

        decryptButton = new JButton("Decrypt Message");
        jFrameWindow.add(decryptButton);

        showRecorded = new JButton("Show Stored Strings");
        jFrameWindow.add(showRecorded);

        ButtonEventHandler handler = new ButtonEventHandler();

        encryptButton.addActionListener(handler);
        decryptButton.addActionListener(handler);
        showRecorded.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }

    public static void main(String args[])
    {
        EncryptionUI guiApp = new EncryptionUI();
    }
        private class ButtonEventHandler implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==encryptButton)
                {
                    EncryptObject.encryptString(encryptButton.getText());
                }
                else if(e.getSource()==decryptButton)
                {
                    //DecryptObject.decryptString(decryptButton.getText());
                }
            }
        }
}
