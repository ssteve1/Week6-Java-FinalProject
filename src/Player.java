import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>();
    private int score;
    private String name;

    public Player(String name) {
        this.score = 0;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe(){
        System.out.println("Player: " + name + " has these cards in hand");
        for(int i = 0; i< hand.size();i++){
             hand.get(i).describe();
        }
    }
    public Card flip(){
        return hand.remove(0);
    }

    public void draw(Deck deck){
       hand.add(deck.draw());
    }

    public void incrementScore(){
        this.score++;
    }
}
