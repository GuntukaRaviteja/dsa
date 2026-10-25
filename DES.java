import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;

class DES {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SecretKey k = SecretKeyFactory.getInstance("DESede")
            .generateSecret(new DESedeKeySpec("123456789012345678901234".getBytes()));
        Cipher c = Cipher.getInstance("DESede");
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        c.init(1, k);
        byte[] e = c.doFinal(s.getBytes());
        System.out.println("Encrypted: " + Base64.getEncoder().encodeToString(e));

        c.init(2, k);
        System.out.println("Decrypted: " + new String(c.doFinal(e)));
        sc.close();
    }
}