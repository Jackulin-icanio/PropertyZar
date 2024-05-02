package common;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomUtils {

//    public static class RandomUsernameGenerator {
//
//        private static final List<String> NAMES = Arrays.asList(
//                "John", "Stephen", "Sarah", "Emily", "Michael", "Robert",
//                "Jessica", "Laura", "David", "Sophia", "Fernando1", "Maria", "Anne", "Julie", "Marie",
//                "Giorgia", "Alexander", "Elena", "Sanjay", "Amit", "Priya", "Sunita", "Mohammad", "Zahra",
//                "Heba1", "Hana", "Thabo", "Nasrin", "Jebas", "Sowmi", "Pravin", "Amutha", "Bemi", "Celin", "Kiruba",
//                "Mathan", "Mala", "Jeni", "Praisy", "John1");
//
//            public static String generateRandomUsername() {
//                Random random = new Random();
//                return NAMES.get(random.nextInt(NAMES.size()));
//            }
//        }
public static class RandomUsernameGenerator {

    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int USERNAME_LENGTH = 8; // You can adjust the length

    public static String generateRandomUsername() {
        Random random = new Random();
        StringBuilder username = new StringBuilder(USERNAME_LENGTH);

        // Add random letters to the username
        for (int i = 0; i < USERNAME_LENGTH; i++) {
            int index = random.nextInt(LETTERS.length());
            char randomChar = LETTERS.charAt(index);
            // Randomly choose to make the letter uppercase or lowercase
            if (random.nextBoolean()) {
                randomChar = Character.toLowerCase(randomChar);
            }
            username.append(randomChar);
        }

        return username.toString();
    }
}
}