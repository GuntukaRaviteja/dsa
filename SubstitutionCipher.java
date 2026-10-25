import java.util.*;

class SubstitutionCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zyxwvutsrqponmlkjihgfedcba";

        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase(), e = "";

        for (char c : s.toCharArray())
            e += a.indexOf(c) >= 0 ? b.charAt(a.indexOf(c)) : c;

        System.out.println("Encrypted: " + e);
        sc.close();
    }
}