import java.security.*;
import javax.crypto.spec.*;

public class DiffieHellman {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("DH");
        kpg.initialize(512);

        KeyPair kp = kpg.generateKeyPair();
        KeyFactory kf = KeyFactory.getInstance("DH");

        DHPublicKeySpec pub = kf.getKeySpec(
            kp.getPublic(), DHPublicKeySpec.class);

        System.out.println("Public key: " + pub.getY());
        System.out.println("Prime p: " + pub.getP());
        System.out.println("Generator g: " + pub.getG());
    }
}