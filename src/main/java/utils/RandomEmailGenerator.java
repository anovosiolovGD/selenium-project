package utils;

import java.security.SecureRandom;

public class RandomEmailGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String DOMAIN = "example.com";
    public static String generateRandomEmail() {
        int localPartLength = 8;
        StringBuilder sb = new StringBuilder();
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < localPartLength; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }

        sb.append("@").append(DOMAIN);
        return sb.toString();
    }

}


