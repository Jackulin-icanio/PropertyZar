package common;

import java.util.Random;

public class RandomUtils {
    private static final String ALPHANUMERIC_CHARS = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static Random random = new Random();

    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALPHANUMERIC_CHARS.length());
            char randomChar = ALPHANUMERIC_CHARS.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
    public static String generateRandomUsername(int length) {
        return generateRandomString(length);
    }
}