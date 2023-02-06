import java.util.ArrayList;

public class TestPuzzleJava {

    public static void main(String[] args) {
        // Creates object instance of PuzzleJava Class
        PuzzleJava generator = new PuzzleJava();

        // Test method to obtain 10 random rolls
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        // Test method to obtain a random lowercase letter from the alphabet
        char randLetter = generator.getRandomLetter();
        System.out.println(randLetter);

        // Test method to obtain a password created from getRandomLetter
        String password = generator.generatePassword();
        System.out.println(password);

        // Test method to obtain a variable array of passwords
        int length = randomRolls.get(0);
        ArrayList<String> passwordSet = generator.getNewPasswordSet(length);
        System.out.println("Generating a list of passwords with " + length + " entries.");
        for (int i = 0; i < length; i++) {
            System.out.println(i + 1 + ": " + passwordSet.get(i));
        }

        // Test method for random array shuffle
        generator.shuffleArray(randomRolls);
    }
}
