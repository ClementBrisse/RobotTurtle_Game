import java.util.ArrayList;
import java.util.List;

/**
 * Class Tile
 */
public class Tile {


  //
  // Fields
  //
  public String tile;
  public  static int c = 0;
  public static  int  j=0;
  private Wall wall;
  private int x;
  private int y;
  private Gem gem;
  private Turtle turtle;
  public static List<Turtle> turtlelist = new ArrayList<Turtle>();
  
  //
  // Constructors
  //
      public Tile () {
        setEmpty();

      };
    public Tile(Turtle turtle1 ,Turtle turtle2){
        turtlelist.add(turtle1);
        turtlelist.add(turtle2);


    }
    public Tile(Turtle turtle1 ){
        setTurtle(turtle1);



    }

     private void setEmpty(){tile = "|_._|";}
    public String getEmpty(){ return tile;}

    public String getTile(Tile board)
    {
      if (board instanceof Wall){

      tile = ((Wall) board).getwall();
        return tile;
    }
      else  if (board instanceof Turtle){

          tile = ""+((Turtle) board).getColor()+((Turtle) board).getDirection();
          return tile;

      }
      else if (board instanceof Gem){
          tile = Gem.getgem();
          return tile;
      }
      else{
         tile= getEmpty();
         return tile;
      }
    }





  //
  // Methods,,
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of wall
   * @param newVar the new value of wall
   */
  private void setWall (Wall newVar) {
    wall = newVar;

  }

  /**
   * Get the value of wall
   * @return the value of wall
   */
  private Wall getWall () {
    return wall;
  }

  /**
   * Set the value of x
   * @param newVar the new value of x
   */
  private void setX (int newVar) {
    x = newVar;
  }

  /**
   * Get the value of x
   * @return the value of x
   */
  private int getX () {
    return x;
  }

  /**
   * Set the value of y
   * @param newVar the new value of y
   */
  private void setY (int newVar) {
    y = newVar;
  }

  /**
   * Get the value of y
   * @return the value of y
   */
  private int getY () {
    return y;
  }

  /**
   * Set the value of gem
   * @param newVar the new value of gem
   */
  private void setGem (Gem newVar) {
    gem = newVar;
  }

  /**
   * Get the value of gem
   * @return the value of gem
   */
  private Gem getGem () {
    return gem;
  }

  /**
   * Set the value of turtle
   * @param newVar the new value of turtle
   */
  private void setTurtle (Turtle newVar) {
    turtlelist.add(newVar);
    System.out.println("tortue 1 "+turtlelist.get(0).getColor());
      System.out.println(turtlelist);
  }

  /**
   * Get the value of turtle
   * @return the value of turtle
   */
  public List<Turtle> getTurtle () {
    return turtlelist;
  }

  //
  // Other methods
  //

  /**
   */
  public void display()
  {
  }


  /**
   */
  public void update()
  {
  }


}
