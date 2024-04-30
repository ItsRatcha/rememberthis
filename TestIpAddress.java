import java.util.Scanner;

public class TestIpAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyIpAddress myIpAddress = new MyIpAddress();

        System.out.print("Enter an IPv4 address: ");
        String ipAddress = scanner.nextLine();

        if (myIpAddress.isValidIPv4(ipAddress)) {
            System.out.println(ipAddress + " is a valid IP address");
        } else {
            System.out.println(ipAddress + " is NOT a valid IP address");
        }
    }
}
