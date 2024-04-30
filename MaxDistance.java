import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter centre: ");
        int centerX = scanner.nextInt();
        int centerY = scanner.nextInt();

        System.out.print("Enter other points: ");
        int n = scanner.nextInt(); // Number of points
        double maxDistance = Double.MIN_VALUE;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
            if (distance > maxDistance) {
                maxDistance = distance;
                maxX = x;
                maxY = y;
            }
        }

        System.out.println("Point for max distance: " + maxX + " " + maxY);
        System.out.println("Max distance: " + maxDistance);
        
        scanner.close();
    }
}
