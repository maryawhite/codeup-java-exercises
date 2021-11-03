package cardgames;

public class Card {
    String suit;
    short value;
    String name;

    //do we need a constructor here to create the suit and value?
    public Card(String suit, short value, String name){
        this.suit = suit;
        this.value = value;
        this.name = name;
    }
}
