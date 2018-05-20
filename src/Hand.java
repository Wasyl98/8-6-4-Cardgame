import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }

    public void clear(){
        hand.clear();
    }

    public void add(Card c){
        if(c == null){
            throw new NullPointerException("Can't add a null card to a hand");
        }
        hand.add(c);
    }

    public void removeCard(Card c){
        hand.remove(c);
    }

    public void removeCard(int position){
        if (position < 0 || position > hand.size()){
            throw new IllegalArgumentException("Invalid card position: " + position);
        }
        hand.remove(position);
    }

    public int getCardCount(){
        return hand.size();
    }

    public Card getCard(int position){
        if (position < 0 || position > hand.size()) {
            throw new IllegalArgumentException("Invalid card position: " + position);
        }
        return hand.get(position);

    }

}
