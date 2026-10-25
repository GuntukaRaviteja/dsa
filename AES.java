import java.util.*;
import javax.crypto.*;

class AES {
    public static void main(String[] args) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(128);
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("AES");
        String s = "AES still rocks!!";

        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] e = c.doFinal(s.getBytes());
        System.out.println("Encrypted: " +
            Base64.getEncoder().encodeToString(e));

        c.init(Cipher.DECRYPT_MODE, key);
        System.out.println("Decrypted: " +
            new String(c.doFinal(e)));
    }
}