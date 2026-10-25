import java.util.*;

class CeaserCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text and key: ");
        String s = sc.nextLine();
        int k = sc.nextInt() % 26;

        String e = "", d = "";
        for (char c : s.toCharArray())
            e += Character.isLetter(c) ?
                (char)(Character.isUpperCase(c) ?
                (c - 'A' + k) % 26 + 'A' :
                (c - 'a' + k) % 26 + 'a') : c;

        for (char c : e.toCharArray())
            d += Character.isLetter(c) ?
                (char)(Character.isUpperCase(c) ?
                (c - 'A' - k + 26) % 26 + 'A' :
                (c - 'a' - k + 26) % 26 + 'a') : c;

        System.out.println("Encrypted: " + e + "\nDecrypted: " + d);
        sc.close();
    }
}