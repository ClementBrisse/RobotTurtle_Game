import java.util.ArrayList;
import java.util.List;

/**
 * Class Hand
 */
public class Hand {

  //
  // Fields
  //

  private Card cards;
  private int card_count;
  
  //
  // Constructors
  //
  public List<Card> hand = new ArrayList<Card>();

  public Hand (String color , int ply) {
    int place = ply-1;
    Deck dk = (Deck)Player.decklist.get(place);
    //System.out.println("Player.decklist.get(place)"+Player.decklist.get(place));
    hand = cardRemove(dk.getDeck());
   // System.out.println("hand");
    /*for(int i =0 ; i<5;i++ ){
      System.out.println("hand.get(i).getColor()"+hand.get(i).getColor());}*/




  };
  public Hand(int active_player){
    Deck dk = Game.playerList.get(active_player).getDeckInList(active_player);
    hand= cardRemove(dk.getDeck());
  }
  public List cardRemove(List deck){
    List<Card> take = new ArrayList<Card>();
    for(int i =0 ; i<=4;i++){


      take.add((Card) deck.get(i));

      deck.remove(i);

    }
    return take;



  }
  public void cardPlayed(){

  }

  public List<Card> getHand() {
    return hand;
  }

  public void discard(int active_Player,int size){
    List<Card> take = new ArrayList<Card>();
    for(int i =1 ; i<size;i++){


      take.add((Card) hand.get(i));


  }
    hand.clear();
    Game.playerList.get(active_Player).getDiscard().discarded(take);
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of cards
   * @param newVar the new value of cards
   */
  private void setCards (Card newVar) {
    cards = newVar;
  }

  /**
   * Get the value of cards
   * @return the value of cards
   */
  private Card getCards () {
    return cards;
  }

  /**
   * Set the value of card_count
   * @param newVar the new value of card_count
   */
  private void setCard_count (int newVar) {
    card_count = newVar;
  }

  /**
   * Get the value of card_count
   * @return the value of card_count
   */
  private int getCard_count () {
    return card_count;
  }

  //
  // Other methods
  //

  /**
   */
  public void _init_()
  {
  }


}
