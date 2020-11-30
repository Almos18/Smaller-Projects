package EncryptionV2;

import javax.swing.*;
import java.util.Arrays;

public class EncryptObject {

    private String encryptedMessages[] = new String[10];
    private String decryptedMessages[] = new String[10];
    //private String username;
   // private String password;

    public EncryptObject(String[] encryptedMessages, String[] decryptedMessages)
    {
        this(new String[]{"No encrypted messages to show"},new String[]{"No decrypted messages to show"},"none","none");
    }

    public EncryptObject(String[] encryptedMessages, String[] decryptedMessages, String username, String password)
    {
        setEncryptedMessages(encryptedMessages);
        setDecryptedMessages(decryptedMessages);
        toString();
       // setUsername(username);
        //setPassword(password);
    }

    public String[] getEncryptedMessages() {

        return encryptedMessages;

    }

    public void setEncryptedMessages(String[] encryptedMessages)
    {
        this.encryptedMessages = encryptedMessages;
    }

    public String[] getDecryptedMessages() {
        return decryptedMessages;
    }

    public void setDecryptedMessages(String[] decryptedMessages) {
        this.decryptedMessages = decryptedMessages;
    }

    @Override
    public String toString() {
        return "Encrypted Messages: " + Arrays.toString(getEncryptedMessages()) +
                "Decrypted Messages: " + Arrays.toString(getDecryptedMessages());
    }
    /* public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;*/
    }

/*encryptTemp = JOptionPane.showInputDialog(null,"Please input a message you want encrypted",
            "Question",JOptionPane.QUESTION_MESSAGE);*/

    /*decryptTemp = JOptionPane.showInputDialog(null,"Please input a message you want encrypted",
            "Question",JOptionPane.QUESTION_MESSAGE);*/

    //This is experimenting
//}
