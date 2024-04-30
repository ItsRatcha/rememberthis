public class MyIpAddress implements IpAddress {

    public boolean isValidIPv4(String ipAddress) {
        // Split the IP address by dots
        String[] parts = ipAddress.split("\\.");

        // Check if the IP address consists of four parts
        if (parts.length != 4) {
            return false;
        }

        // Check each part for validity
        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                // Check if each part is between 0 and 255
                if (num < 0 || num > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false; // If not a number
            }
        }

        return true;
    }
}
