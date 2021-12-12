

/**
 * Class Card
 */
public class Card {

  //
  // Fields
  //

  public char location;
  private Image img;
  private String color;
  
  //
  // Constructors
  //
  public Card (char type) {

    switch (type){
      case 'l':
        setColor("red");
        getColor();
        break;
      case 'b':
        setColor("blue");
        getColor();

        break;
      case 'j':
        setColor("yellow");
        getColor();
        break;
      case 'p':
        setColor("purple");
        getColor();
        break;
    }

  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of location
   * @param newVar the new value of location
   */
  public void setLocation (char newVar) {
    location = newVar;
  }

  /**
   * Get the value of location
   * @return the value of location
   */
  public char getLocation () {
    return location;
  }

  /**
   * Set the value of img
   * @param newVar the new value of img
   */
  private void setImg (Image newVar) {
    img = newVar;
  }

  /**
   * Get the value of img
   * @return the value of img
   */
  private Image getImg () {
    return img;
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

  //
  // Other methods
  //

}
