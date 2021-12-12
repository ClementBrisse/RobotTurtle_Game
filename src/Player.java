import java.util.ArrayList;
import java.util.List;

/**
 * Class Player
 */
public class Player {

  //
  // Fields
  //

  public String color; // red, blue, green, purple
  public  Deck deck;
  private Hand hand;
  private Discard discard;
  private Program program;
  private Turtle turtle;
  public static List decklist = new ArrayList<Deck>();
  public Deck deckInList;
  private List list= new ArrayList();
  private Integer normalWalls;
  private Integer iceWalls;
  
  //
  // Constructors
  //
  public Player () {

  };

  public Player (int playerNumber){

    switch (playerNumber){
      case 1:
        setColor("red");
        break;
      case 2:
        setColor("blue");
        break;
      case 3:
        setColor("green");
        break;
      case 4:
        setColor("purple");
        break;
    }

    // J'ai sorti le code suivant du switch, ça sert à rien de le répéter
    setDeck(new Deck(getColor()));
    decklist.add(getDeck());
    setHand(new Hand(getColor(),playerNumber));
    setProgram(new Program(getColor()));
    setDiscard(new Discard());
    setIceWalls(2);
    setNormalWalls(3);

    System.out.println("player" + playerNumber + " done");
    //setDeck();
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //


  public void setNormalWalls(Integer normalWalls) {
    this.normalWalls = normalWalls;
  }
  public Integer getNormalWalls() {
    return normalWalls;
  }

  public void setIceWalls(Integer iceWalls) {
    this.iceWalls = iceWalls;
  }
  public Integer getIceWalls() {
    return iceWalls;
  }


  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  private void setColor (String newVar) {

    color = newVar;

  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  /**
   * Set the value of deck
   * @param newVar the new value of deck
   */
  public void setDeck(Deck newVar) {
    deck = newVar;
  }

  /**
   * Get the value of deck
   * @return the value of deck
   */
  public  Deck getDeck() {
    return deck;
  }
  public  Deck getDeckInList(int place){
    deckInList =(Deck) decklist.get(place);
    return deckInList;

  }

  /**
   * Set the value of hand
   * @param newVar the new value of hand
   */
  public void setHand (Hand newVar) {
    hand = newVar;
  }

  /**
   * Get the value of hand
   * @return the value of hand
   */
  public Hand getHand () {
    return hand;
  }

  /**
   * Set the value of discard
   * @param newVar the new value of discard
   */
  private void setDiscard (Discard newVar) {
    discard = newVar;
  }

  /**
   * Get the value of discard
   * @return the value of discard
   */
  public Discard getDiscard () {
    return discard;
  }

  /**
   * Set the value of program
   * @param newVar the new value of program
   */
  private void setProgram (Program newVar) {
    program = newVar;
  }

  /**
   * Get the value of program
   * @return the value of program
   */
  public Program getProgram () {
    return program;
  }

  /**
   * Set the value of turtle
   * @param newVar the new value of turtle
   */
  public void setTurtle (Turtle newVar) {
    turtle = newVar;
  }

  /**
   * Get the value of turtle
   * @return the value of turtle
   */
  public Turtle getTurtle () {
    return turtle;
  }

  /**
   * Set the value of gem
   * @param newVar the new value of gem
   */


  /**
   * Get the value of gem
   * @return the value of gem
   */


  //
  // Other methods
  //

  /**
   */
  public void _ini_()
  {
  }


  /**
   */
  public void add_instruction()
  {
  }


  /**
   */
  public void add_wall()
  {
  }


  /**
   */
  public void run_program()
  {
  }


  /**
   */
  public void discard_hand()
  {
  }


}
