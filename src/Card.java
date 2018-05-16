public class Card {

    public final static int SPADES = 0;   // Codes for the 4 suits, plus Joker.
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;
    //public final static int JOKER = 4;

    public final static int ACE = 1;      // Codes for the non-numeric cards.
    public final static int JACK = 11;    //   Cards 2 through 10 have their
    public final static int QUEEN = 12;   //   numerical values for their codes.
    public final static int KING = 13;

    private final int value;
    private final int suit;

    public Card(int theValue, int theSuit) {

        if(theValue<1 || theValue >13){
            throw  new IllegalArgumentException("Illegal card value");
        }

        if(theSuit != SPADES && theSuit != HEARTS && theSuit != DIAMONDS && theSuit != CLUBS){
            throw new IllegalArgumentException("Illegal card suit");
        }

        this.value = theValue;
        this.suit = theSuit;
    }

    public int getValue() {
        return value;
    }


    public int getSuit() {
        return suit;
    }

}
