public class App {

    public static void main(String[] args) {
        // a) Instantiate a Deck and two Players

        Deck deck = new Deck();
        Player player1 = new Player("Steve");
        Player player2 = new Player("St.Fleur");

        // call the shuffle method on the deck.
        deck.shuffle();

        //b)	Using a traditional for loop,
        // iterate 52 times calling the Draw method on the other player
        // each iteration using the Deck you instantiated.

        for(int i = 0; i<52;i++){
            if (i % 2 == 0){
                player1.draw(deck);
            }
            else {
                player2.draw(deck);
            }
        }

        // c)	Using a traditional for loop,
        // iterate 26 times and call the flip method for each player.

        for(int i = 0; i<26 ; i++ ){

            //d)	Compare the value of each card returned by the two player’s flip methods.
            // Call the incrementScore method on the player whose card has the higher value.
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            if (card1.getValue()> card2.getValue()){
                player1.incrementScore();
            }
            else{
                player2.incrementScore();
            }
        }

        //e)	After the loop, compare the final score from each player.
        System.out.println(player1.getName() + " has a score of " + player1.getScore() +
        " and " + player2.getName() + " has a score of " + player2.getScore());

        //f)	Print the final score of each player and either “Player 1”, “Player 2”,
        // or “Draw” depending on which score is higher or if they are both the same.

        if (player1.getScore()>player2.getScore()){
            System.out.println(player1.getName() + " is the winner.");
        }
        else if (player1.getScore()<player2.getScore()){
            System.out.println(player2.getName() + " is the winner.");
        }
        else if (player1.getScore()==player2.getScore()){
            System.out.println("It's a draw!!");
        }

    }
}