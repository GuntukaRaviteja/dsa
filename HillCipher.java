import java.util.*;

class HillCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[] m = new int[3], r = new int[3];

        System.out.println("Enter key matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) a[i][j] = sc.nextInt();

        System.out.print("Enter 3-letter text: ");
        String s = sc.next().toLowerCase();

        for (int i = 0; i < 3; i++) {
            m[i] = s.charAt(i) - 'a';
            for (int j = 0; j < 3; j++) r[i] += a[i][j] * m[j];
            System.out.print((char)(r[i] % 26 + 'a'));
        }
        sc.close();
    }
}