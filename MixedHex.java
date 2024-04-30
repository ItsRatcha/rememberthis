import java.util.Scanner;

public class MixedHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string of hex digits (in pairs): ");
        String hex1 = scanner.next();
        System.out.print("Enter string of hex digits (in pairs): ");
        String hex2 = scanner.next();
        System.out.print("Enter a delimiter: ");
        String delimiter = scanner.next();
        System.out.print("Mixed hex: ");
        Display(hex1, hex2, delimiter);

        scanner.close();
    }

    private static void Display(String hex1, String hex2, String delimiter) {
        int length1 = hex1.length();
        int length2 = hex2.length();
        int maxLength = Math.max(length1, length2);

        StringBuilder mixedHex = new StringBuilder();
        for (int i = 0; i < maxLength; i += 2) {
            if (i < length1) {
                mixedHex.append(hex1.substring(i, i + 2));
                if (i + 2 < length1 || i + 2 < length2) {
                    mixedHex.append(delimiter);
                }
            }
            if (i < length2) {
                mixedHex.append(hex2.substring(i, i + 2));
                if (i + 2 < length2 || i + 2 < length1) {
                    mixedHex.append(delimiter);
                }
            }
        }

        System.out.println(mixedHex);
    }
}
