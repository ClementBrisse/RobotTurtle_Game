

/**
 * Class Gem
 */
public class Gem extends Tile{

  //
  // Fields
  //

  private Integer x;
  private Integer y;
  private String color;
  
  //
  // Constructors
  //
  public Gem (int y, int x) { }
  public static String getgem()
  {
    return "GEM!";
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of x
   * @param newVar the new value of x
   */
  private void setX (Integer newVar) {
    x = newVar;
  }

  /**
   * Get the value of x
   * @return the value of x
   */
  private Integer getX () {
    return x;
  }

  /**
   * Set the value of y
   * @param newVar the new value of y
   */
  private void setY (Integer newVar) {
    y = newVar;
  }

  /**
   * Get the value of y
   * @return the value of y
   */
  private Integer getY () {
    return y;
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
  private String getColor () {
    return color;
  }

  //
  // Other methods
  //

}
