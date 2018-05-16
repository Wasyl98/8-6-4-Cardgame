public class Deck {
    private Card[] deck;
    private int cardsUsed;

    public void buildDeck(){
        deck = new Card[52];
        int cardCt = 0;

        for (int suit = 0;suit <= 3;suit++) {
            for (int value = 1;value <= 13;value++) {
                deck[cardCt] = new Card(value,suit);
                cardCt++;
            }
        }

    }

    public void shuffleDeck(){
        for ( int i = deck.length-1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;

    }

    public int cardsLeft(){
        return deck.length - cardsUsed;
    }

    public Card dealCard(){
        if(cardsUsed == deck.length)
            throw new IllegalStateException("Deck is empty");
        ++cardsUsed;
        return deck[cardsUsed-1];
    }
}