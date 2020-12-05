package EncryptionV2;

public class EncryptObject{

    private String encryptedMessages;
    private String decryptedMessages;

    public EncryptObject() {
        this("None", "None");
    }

    public EncryptObject(String encryptedMessages, String decryptedMessages) {
        setEncryptedMessages(encryptedMessages);
        setDecryptedMessages(decryptedMessages);
        toString();
    }

    public String getEncryptedMessages() {
        return encryptedMessages;
    }

    public void setEncryptedMessages(String encryptedMessages) {
        this.encryptedMessages = encryptedMessages;
    }

    public String getDecryptedMessages() {
        return decryptedMessages;
    }

    public void setDecryptedMessages(String decryptedMessages) {
        this.decryptedMessages = decryptedMessages;
    }

    @Override
    public String toString() {
        return "Encrypted Messages: " + getEncryptedMessages() +
                "\nDecrypted Messages: " + getDecryptedMessages();
    }
}
