import java.util.Random;
import java.util.ArrayList;
import java.lang.StringBuilder;

/**
 * PuzzleJava
 */
public class PuzzleJava {
    //Obtains a list of 10 random numbers generated from 1 to 20. Can have repeated numbers.
    ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();

        for (int i = 0; i < 10; i++) {       /*max  min      min*/
            int randRoll = new Random().nextInt(20 - 1 + 1) + 1;
            rolls.add(randRoll);
        }

        return rolls;
    }

    //Creates an array of the alphabet and returns a letter chosen at random.
    char getRandomLetter(){
        char[] letterArray = new char[26];
        
        int i = 0;
        
        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++, i++){
            letterArray[i] = alphabet;
        }

        return letterArray[new Random().nextInt(26)];
    }

    //Creates a random password made up of 8 randomly chosen letters. Can have repeated letters.
    String generatePassword(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 8; i++){
            sb.append(getRandomLetter());
        }
        String password = sb.toString();

        return password;
    }

    //
    ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<>();

        for(int i = 0; i < length; i++){
            passwordSet.add(generatePassword());
        }

        return passwordSet;
    }

    //
    void shuffleArray(ArrayList<Integer> rolls){
        int randomAmountOfShuffles = new Random().nextInt(20) + 1;
        
        for(int i = 0; i < randomAmountOfShuffles; i++){
            //Randomly obtain indexes to shuffle from and to
            int shuffleFrom = new Random().nextInt(rolls.size());
            int shuffleTo = new Random().nextInt(rolls.size());
            
            //switch values around
            Integer temp = rolls.get(shuffleFrom);
            rolls.set(shuffleFrom,rolls.get(shuffleTo));
            rolls.set(shuffleTo,temp);

            //prints result after shuffling each time
            System.out.println(rolls);
        }
        System.out.println("Shuffled array " + randomAmountOfShuffles + " times. New order is: " + rolls);
    }

}