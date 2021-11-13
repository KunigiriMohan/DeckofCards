import java.util.ArrayList;

public class DeckofCards {
    ArrayList<Card> deckofCards = new ArrayList<Card>();
    public static void main(String[] args){
        String [] suit = {"club","diamond","heart","Spade"};
        DeckofCards obj= new DeckofCards();
        int rank;
        for(String suits: suit){
            for(rank=1;rank<=13;rank++)
            {
                Card oneCard=new Card(rank,suit);
                obj.deckofCards.add( oneCard);
            }
        }
    }
}
