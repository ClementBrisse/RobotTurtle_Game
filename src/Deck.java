import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class Deck
 */
public class Deck {

  //
  // Fields
  //

  private Card cards;
  private Integer number_cards;
  private List<Card> deck  = new ArrayList<Card>();
  private int dc;
  
  //
  // Constructors
  //


  public Deck (String color) {


    for(int i =0 ;i<=3;i++){
      Card card =new Card('l');
      deck.add(card);
    }
    for(int i =0 ;i<=8;i++){
      Card card =new Card('j');
      deck.add(card);
    }
    for(int i =0 ;i<=8;i++){
      Card card =new Card('p');
      deck.add(card);
    }
    for(int i =0 ;i<=18;i++){
      Card card =new Card('b');
      deck.add(card);
    }
    System.out.println("deck");

    for(int i =0 ; i<=37;i++ ){
    deck.get(i).getColor();}
    deckshuffle(deck);
    System.out.println("deck shuffle");
    for(int i =0 ; i<=37;i++ ){


      deck.get(i).getColor();}




  };
  public Deck(List dc){
    deck.addAll(dc);

    deckshuffle(deck);



  }
  private void deckshuffle(List deck){
    Collections.shuffle(deck);


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
  public List getDeck(){
    return deck;
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



}
