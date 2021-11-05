package cardgames;

public class Card {
    String suit;
    short value;         //if I make this value private then I can't use player1Card1.value in my GameOfWar class
    String name;


    //constructor here to create the suit and value and name
    public Card(String suit, short value, String name){
        this.suit = suit;
        this.value = value;
        this.name = name;
    }

    //Create methods to access these properties and change them (getters and setters).
    public String getSuit() {
        return suit;
    }

    public short getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  '\'' + name + '\'' +
                " of " +
                '\'' + suit + '\'';
    }
}
