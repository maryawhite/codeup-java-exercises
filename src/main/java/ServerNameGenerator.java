import java.util.Random;

public class ServerNameGenerator {

    static String[] adjectiveWords = {"adorable", "blushing", "charming", "doubtful", "sleepy", "sneezy", "dopey", "bashful", "happy", "zealous"};
    static String[] nounWords = {"world", "water", "school", "room", "money", "mother", "book", "bottle", "car", "house"};

//    Random random = new Random();

    //Create a method that will return a random element from an array of strings.
    public static String generateWord(String[] wordArray){
        Random random = new Random();
        String rand = wordArray[random.nextInt(wordArray.length)];
        return rand;
    }

    public static void main(String[] args) {
        //inside of the main method, select a random noun and adjective and hyphenate the words and display them in a sentence
//        String serverAdjective = ServerNameGenerator.generateWord(adjectiveWords);
        String adj = generateWord(adjectiveWords);
        String noun = generateWord(nounWords);
        System.out.println("Here is your server name:");
        System.out.println(adj + "-" + noun);
    }

}
