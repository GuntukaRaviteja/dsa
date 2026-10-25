import javax.crypto.*;
import javax.swing.*;

public class BlowFishCipher {
    public static void main(String[] args) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("Blowfish");
        String text = JOptionPane.showInputDialog("Enter message:");

        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = c.doFinal(text.getBytes());

        c.init(Cipher.DECRYPT_MODE, key);
        String decrypted = new String(c.doFinal(encrypted));

        JOptionPane.showMessageDialog(null,
            "Encrypted: " + java.util.Base64.getEncoder().encodeToString(encrypted)
            + "\nDecrypted: " + decrypted);
    }
}