import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();
    public Deck() {

        List<String> suits = List.of("Clubs","Spades","Diamonds","Hearts");
        List<String> ranks = List.of("2","3","4","5","6","7","8","9","10","Jack",
                "Queen","King","Ace");
        for(int i = 0; i< suits.size();i++){
            for(int j = 0; j< ranks.size();j++){
                String cardInfo = ranks.get(j) + " of" + suits.get(i);
                  Card card = new Card(j,cardInfo);
                 cards.add(card);
            }

        }

    }


    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card draw()
    {
        return cards.remove(cards.size()-1);
    }


}
