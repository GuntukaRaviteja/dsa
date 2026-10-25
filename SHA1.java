import java.security.*;

public class SHA1 {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-1");

        String[] messages = {
            "", "abc", "abcdefghijklmnopqrstuvwxyz"
        };

        for (String s : messages) {
            byte[] hash = md.digest(s.getBytes("UTF-8"));
            StringBuilder hex = new StringBuilder();

            for (byte b : hash)
                hex.append(String.format("%02X", b & 0xFF));

            System.out.println("SHA1(\"" + s + "\") = " + hex);
        }
    }
}