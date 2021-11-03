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

        Card player1Card1 = gameHands[random.nextInt(gameHands.length)];
        Card player2Card2 = gameHands[random.nextInt(gameHands.length)];

        short player1Score = 0;
        short player2Score = 0;

        System.out.println("Player 1 drew a " + player1Card1 + " and Player 2 drew a " + player2Card2);

        if(player1Card1.value == player2Card2.value){
            System.out.println("it's a tie, you both get a point");
            player1Score++;
            player2Score++;
        } else if (player1Card1.value > player2Card2.value){
            System.out.println("Player 1 gets a point.");
            player1Score++;
        } else if (player1Card1.value < player2Card2.value){
            System.out.println("Player 2 gets a point.");
            player2Score++;
        }
        System.out.println("\tplayer 1 score: " + player1Score + "\n" + "\tplayer 2 score: " + player2Score);
    }

}
