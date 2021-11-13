import java.util.ArrayList;

public class DeckofCards {
    ArrayList<Card> deckofCards = new ArrayList<Card>();
    public static void main(String[] args){
        String [] suit = {"club","diamond","heart","Spade"};
        String [] rank = {"1","2","3","4","5","6","7","8","9","Jack","King","Queen","Ace"};
        DeckofCards obj= new DeckofCards();

        for(String suits: suit){
            for(int i=0;i<=13;i++)
            {
                Card oneCard=new Card(rank,suit);
                obj.deckofCards.add( oneCard);
            }
        }
    }
}




