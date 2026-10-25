import java.nio.file.*;
import javax.crypto.*;

class BlowFish {
    public static void main(String[] args) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
        kg.init(128);
        SecretKey k = kg.generateKey();

        Cipher c = Cipher.getInstance("Blowfish");
        c.init(Cipher.ENCRYPT_MODE, k);

        Path input = Path.of("inputFile.txt");
        if (Files.notExists(input)) {
            Files.writeString(input, "Hello Blowfish!");
        }

        byte[] data = Files.readAllBytes(input);
        Files.write(Path.of("outputFile.txt"), c.doFinal(data));

        System.out.println("File encrypted successfully!");
    }
}