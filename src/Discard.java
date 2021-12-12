import java.util.ArrayList;
import java.util.List;

/**
 * Class Discard
 */
public class Discard {

  //
  // Fields
  //

  private Card cards;
  private Integer number_cards;
  public List<Card> discard = new ArrayList<Card>();
  
  //
  // Constructors
  //
  public Discard () {

  };
  public void discarded(List discarded){
    discard.addAll(discarded);
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
   * Set the value of number_cards
   * @param newVar the new value of number_cards
   */
  private void setNumber_cards (Integer newVar) {
    number_cards = newVar;
  }

  /**
   * Get the value of number_cards
   * @return the value of number_cards
   */
  private Integer getNumber_cards () {
    return number_cards;
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
