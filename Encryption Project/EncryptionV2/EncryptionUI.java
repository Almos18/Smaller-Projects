package EncryptionV2;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

public class EncryptionUI extends JFrame implements ActionListener{

    JButton encryptButton;
    JButton decryptButton;
    JMenu fileMenu;
    JMenu editMenu;
    JLabel passwordLabel;
    JLabel usernameLabel;
    JTextField passwordField;
    JTextField usernameField;
    String[] encryptedMessages = new String[10];
    String[] decryptedMessages = new String[10];
    int i = 0;
    int j = 0;

    public EncryptionUI() {

        super("Encryptor");

        EncryptObject main = new EncryptObject(encryptedMessages, decryptedMessages);

        setLayout(new GridBagLayout());

        createLoginMenu();
        createEncryptionMenu();
        createEditMenu();
        createJButtons();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.white);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        //setLocation(200,150);
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }

    public static void main(String args[])
    {
        EncryptionUI guiApp = new EncryptionUI();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
        private class ButtonEventHandler implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==encryptButton)
                {
                    encryptedMessages[i] = EncryptMessage.encryptString(encryptButton.getText());
                    i++;
                    JOptionPane.showMessageDialog(null,Arrays.toString(encryptedMessages));
                }
                else if(e.getSource()==decryptButton)
                {
                    decryptedMessages[j] = DecryptMessage.decryptString(decryptButton.getText());
                    j++;
                    JOptionPane.showMessageDialog(null,Arrays.toString(decryptedMessages));
                }
            }
        }

        private void createLoginMenu()
        {
            JFrame jFrameWindow = new JFrame("Login");

            FlowLayout flowLayout = new FlowLayout();

            jFrameWindow.setLayout(flowLayout);
            jFrameWindow.setSize(300,200);
            jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        }

        private void createEncryptionMenu()
        {
        JMenuItem item;

        fileMenu = new JMenu("View");

        item = new JMenuItem("Stored Messages");
        item.addActionListener(this);
        fileMenu.add(item);

        item = new JMenuItem("Longest Message");
        item.addActionListener(this);
        fileMenu.add(item);

        item = new JMenuItem("Shortest Message");
        item.addActionListener(this);
        fileMenu.add(item);

        item = new JMenuItem("Username");
        item.addActionListener(this);
        fileMenu.add(item);

        item = new JMenuItem("Password");
        item.addActionListener(this);
        fileMenu.add(item);

        fileMenu.addSeparator();

        item = new JMenuItem("Quit");
        item.addActionListener(this);
        fileMenu.add(item);
        }

        private void createEditMenu()
    {
        JMenuItem item;

        editMenu = new JMenu("Edit");

        item = new JMenuItem("Delete Message");
        item.addActionListener(this);
        editMenu.add(item);

        item = new JMenuItem("Add Message");
        item.addActionListener(this);
        editMenu.add(item);
    }

        private void createJButtons()
    {
        encryptButton = new JButton("Encrypt Message");
        add(encryptButton);

        decryptButton = new JButton("Decrypt Message");
        add(decryptButton);

        ButtonEventHandler handler = new ButtonEventHandler();

        encryptButton.addActionListener(handler);
        decryptButton.addActionListener(handler);
    }
}
