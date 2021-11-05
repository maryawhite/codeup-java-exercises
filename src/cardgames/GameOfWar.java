package cardgames;

import java.util.Random;

public class GameOfWar {

    public static void main(String[] args) {

        Random random = new Random();

        Card[] gameHands = CardsArray.getAllCards();

//        for(Card card : gameHands){
////            System.out.println(card);
//
//        }
        boolean weArePlaying = true;
        short player1Score = 0;
        short player2Score = 0;
        short counter = 0;

        while (weArePlaying) {

            Card player1Card1 = gameHands[random.nextInt(gameHands.length)];
            Card player2Card2 = gameHands[random.nextInt(gameHands.length)];

            System.out.println("Player 1 drew a " + player1Card1 + " and Player 2 drew a " + player2Card2);

            short player1cardvalue = player1Card1.getValue();     //the difference between have a private visibility and default visibility, if the field is private we would have to use getValue(), but since the field is not private, we can use player2Card2.value.
            if (player1cardvalue == player2Card2.value) {
                System.out.println("it's a tie, you both get a point");
                player1Score++;
                player2Score++;
                counter++;
                System.out.println("Round # " + counter);
            } else if (player1Card1.value > player2Card2.value) {
                System.out.println("Player 1 gets a point.");
                player1Score++;
                counter++;
                System.out.println("Round # " + counter);

            } else if (player1Card1.value < player2Card2.value) {
                System.out.println("Player 2 gets a point.");
                player2Score++;
                counter++;
                System.out.println("Round # " + counter);

            }
            System.out.println("\tplayer 1 score: " + player1Score + "\n" + "\tplayer 2 score: " + player2Score);
            if(counter >= 26){
                if(player1Score > player2Score){
                    System.out.println("Player 1 WINS!!!");
                } else {
                    System.out.println("Player 2 WINS!!!");
                }
                break;
            }
        }
    }

}
