import javax.swing.*;

/**
 * Class Turtle
 */
public class Turtle extends  Tile{

  //
  // Fields
  //

  private Integer x;
  private Integer y;
  public Character direction;
  public  String color;
  
  //
  // Constructors
  //
  public Turtle () { }
  public Turtle (int playerNumber, Integer y, Integer x) {
  int place = playerNumber-1;
    setColor(Game.playerList.get(place).getColor());
    setX(x);
    setY(y);
    setDirection('s');



  }
  public char rotateR (){
    char dir = getDirection();
    switch (dir){
      case's':
        setDirection('w');
        return getDirection();
      case'w':
        setDirection('n');
        return getDirection();
      case'n':
        setDirection('e');
        return getDirection();
      case'e':
        setDirection('s');
        return getDirection();
    }
    return 's';
  }

  public void laser()
  {
    char dir = getDirection();
    int turtleX= getX();
    int turtleY= getY();

    switch (dir) //direction faced by the turtle
    {
      case 'n': //north
          Tile lookingTileN = Board.board[turtleY -1][turtleX]; //tile in front of the turtle

          if (lookingTileN instanceof Wall) //case of a wall
          {
            if (((Wall) lookingTileN).getIceWall()) //case of ice wall --> wall disapear
            {
              Board.board[turtleY -1][turtleX]=new Tile();
              System.out.println("Turtle melts this ice wall");
            }
            else //case of solid wall --> nothing happens
            {
              System.out.println("Turtle cannot destroy this wall");
            }
          }
          else if (lookingTileN instanceof Turtle) //case of a turtle
          {
            if (Window.playercount == 2) //case of 2 player --> turtle in front will 180° rotate
            {
              setDirection('s'); // n case --> s
              System.out.println("Turtle doing 180°");
            }
            else //case of 3 or more players --> turtle in front will go back to initial position
            {
              moveTurtleToStart();
              System.out.println("Turtle going to start position");
            }
          }
          else if (lookingTileN instanceof Gem) //case of a gem --> laser go back
          {
            if (Window.playercount == 2) //case of 2 player --> current player's turtle will 180° rotate
            {
              setDirection('s');
              System.out.println("Turtle doing 180°");
            }
            else //case of 3 or more players --> current player's turtle will go back to initial position
            {
              moveTurtleToStart();
              System.out.println("Turtle going to start position");
            }
          }
          break;

      case  's': //south
        Tile lookingTileS = Board.board[turtleY +1][turtleX]; //tile in front of the turtle

        if (lookingTileS instanceof Wall) //case of a wall
        {
          if (((Wall) lookingTileS).getIceWall()) //case of ice wall --> wall disapear
          {
            Board.board[turtleY +1][turtleX]=new Tile();
            System.out.println("Turtle melts this ice wall");
          }
          else //case of solid wall --> nothing happens
          {
            System.out.println("Turtle cannot destroy this wall");
          }
        }
        else if (lookingTileS instanceof Turtle) //case of a turtle
        {
          if (Window.playercount == 2) //case of 2 player --> turtle in front will 180° rotate
          {
            setDirection('n'); // s case --> n
            System.out.println("Turtle doing 180°");
          }
          else //case of 3 or more players --> turtle in front will go back to initial position
          {
            moveTurtleToStart();
            System.out.println("Turtle going to start position");
          }
        }
        else if (lookingTileS instanceof Gem) //case of a gem --> laser go back
        {
          if (Window.playercount == 2) //case of 2 player --> current player's turtle will 180° rotate
          {
            setDirection('n');
            System.out.println("Turtle doing 180°");
          }
          else //case of 3 or more players --> current player's turtle will go back to initial position
          {
            moveTurtleToStart();
            System.out.println("Turtle going to start position");
          }
        }
        break;

      case 'e': //east
        Tile lookingTileE = Board.board[turtleY][turtleX +1]; //tile in front of the turtle

        if (lookingTileE instanceof Wall) //case of a wall
        {
          if (((Wall) lookingTileE).getIceWall()) //case of ice wall --> wall disapear
          {
            Board.board[turtleY][turtleX +1]=new Tile();
            System.out.println("Turtle melts this ice wall");
          }
          else //case of solid wall --> nothing happens
          {
            System.out.println("Turtle cannot destroy this wall");
          }
        }
        else if (lookingTileE instanceof Turtle) //case of a turtle
        {
          if (Window.playercount == 2) //case of 2 player --> turtle in front will 180° rotate
          {
            setDirection('w'); // e case --> w
            System.out.println("Turtle doing 180°");
          }
          else //case of 3 or more players --> turtle in front will go back to initial position
          {
            moveTurtleToStart();
            System.out.println("Turtle going to start position");
          }
        }
        else if (lookingTileE instanceof Gem) //case of a gem --> laser go back
        {
          if (Window.playercount == 2) //case of 2 player --> current player's turtle will 180° rotate
          {
            setDirection('w');
            System.out.println("Turtle doing 180°");
          }
          else //case of 3 or more players --> current player's turtle will go back to initial position
          {
            moveTurtleToStart();
            System.out.println("Turtle going to start position");
          }
        }
        break;

      case 'w': //west
        Tile lookingTileW = Board.board[turtleY][turtleX -1]; //tile in front of the turtle

        if (lookingTileW instanceof Wall) //case of a wall
        {
          if (((Wall) lookingTileW).getIceWall()) //case of ice wall --> wall disapear
          {
            Board.board[turtleY][turtleX -1]=new Tile();
            System.out.println("Turtle melts this ice wall");
          }
          else //case of solid wall --> nothing happens
          {
            System.out.println("Turtle cannot destroy this wall");
          }
        }
        else if (lookingTileW instanceof Turtle) //case of a turtle
        {
          if (Window.playercount == 2) //case of 2 player --> turtle in front will 180° rotate
          {
            setDirection('e'); // w case --> e
            System.out.println("Turtle doing 180°");
          }
          else //case of 3 or more players --> turtle in front will go back to initial position
          {
            moveTurtleToStart();
            System.out.println("Turtle going to start position");
          }
        }
        else if (lookingTileW instanceof Gem) //case of a gem --> laser go back
        {
          if (Window.playercount == 2) //case of 2 player --> current player's turtle will 180° rotate
          {
            setDirection('e');
            System.out.println("Turtle doing 180°");
          }
          else //case of 3 or more players --> current player's turtle will go back to initial position
          {
            moveTurtleToStart();
            System.out.println("Turtle going to start position");
          }
        }
        break;
    }

  }

  public char rotateL(){
    char dir = getDirection();
    switch (dir){
      case's':
        setDirection('e');
        return getDirection();
      case'e':
        setDirection('n');
        return getDirection();
      case'n':
        setDirection('w');
        return getDirection();
      case'w':
        setDirection('s');
        return getDirection();
    }
    return 's';
  }

  public void forward()
  {
    char dir = this.getDirection();
    switch(dir){
      case's': {
        if (this.getY() >= 7) {
          // Action si la tortue est face au bord du terrain
            // Retour case départ
          moveTurtleToStart();
        }

        else if(Board.board[this.getY()+1][this.getX()] instanceof Turtle){
          // Si la tortue est face à une autre tortue
          ((Turtle) Board.board[this.getY()+1][this.getX()]).moveTurtleToStart();
          this.moveTurtleToStart();
        }

        else if (Board.board[getY()+1][getX()] instanceof Wall) {
          // Action si la tortue est face à un mur
            setDirection('n');
          }
        else if (Board.board[getY()+1][getX()] instanceof Gem) {
          moveTurtleTo(this.getY()+1,this.getX());
          System.out.println("-------------------------------------A PLAYER WINS THE GAME !-------------------------------------------------");
          Game.setVictorytoken(false);
          Window.closeWindow();
        }

        else{
          moveTurtleTo(this.getY()+1,this.getX());
        }
        break;
      }
      case'e':{
          if (getX() >= 7) {
              // Action si la tortue est face au bord du terrain
            moveTurtleToStart();
          }
          else if(Board.board[getY()][getX()+1] instanceof Turtle){
            // Si la tortue est face à une autre tortue
            ((Turtle) Board.board[getY()][getX()+1]).moveTurtleToStart();
            this.moveTurtleToStart();
          }
          else if (Board.board[getY()][getX()+1] instanceof Wall)
          {
            // Action si la tortue est face à un mur
            setDirection('w');
          }
          else if (Board.board[getY()][getX()+1] instanceof Gem) {
            moveTurtleTo(getY(),getX()+1);
            System.out.println("-------------------------------------A PLAYER WINS THE GAME !-------------------------------------------------");
            Game.setVictorytoken(false);
            Window.closeWindow();

          }
          else{
            moveTurtleTo(getY(),getX()+1);
          }
        break;
      }

      case'n':{
          if (getY() <=0) {
            // Action si la tortue est face à une autre tortue ou au bord du terrain
            moveTurtleToStart();
          }

          else if(Board.board[getY()-1][getX()] instanceof Turtle){
            // Si la tortue est face à une autre tortue
            ((Turtle) Board.board[getY()-1][getX()]).moveTurtleToStart();
            this.moveTurtleToStart();
          }

          else if (Board.board[getY()-1][getX()] instanceof Wall)
          {
            // Action si la tortue est face à un mur
            setDirection('s');
          }
          else if (Board.board[getY()-1][getX()] instanceof Gem) {
            moveTurtleTo(getY()-1,getX());
            System.out.println("-------------------------------------A PLAYER WINS THE GAME !-------------------------------------------------");
            Game.setVictorytoken(false);
            Window.closeWindow();
          }
          else{
            moveTurtleTo(getY()-1,getX());
          }
        break;
      }

      case'w':{
          if (getX() <= 0) {
            // Action si la tortue est face à une autre tortue ou au bord du terrain
            moveTurtleToStart();
          }

          else if(Board.board[getY()][getX()-1] instanceof Turtle){
            // Si la tortue est face à une autre tortue
            ((Turtle) Board.board[getY()][getX()-1]).moveTurtleToStart();
            this.moveTurtleToStart();
          }

          else if( Board.board[getY()][getX()-1] instanceof Wall )
          {
            // Action si la tortue est face à un mur
            setDirection('e');
          }
          else if (Board.board[getY()][getX()-1] instanceof Gem) {
            moveTurtleTo(getY(),getX()-1);
            System.out.println("-------------------------------------A PLAYER WINS THE GAME !-------------------------------------------------");
            Game.setVictorytoken(false);
            Window.closeWindow();
          }
          else{
            moveTurtleTo(getY(),getX()-1);
          }
        break;
      }

    }

    //condition de victoire si la tortue arrive sur une tile GEM
    if( Board.board[getY()][getX()] instanceof Gem )
    {
      System.out.println("-------------------------------------A PLAYER WINS THE GAME !-------------------------------------------------");
      Game.setVictorytoken(false);
      Window.closeWindow();
    }
  }

  public  String getTurtlecolor(){
      return "T"+getColor();
  }

  public void moveTurtleTo(Integer y,Integer x){
  // Méthode qui change les doordonnées de la tortue, et déplace la tile tortue sur le board
    Integer ySave = getY();
    Integer xSave = getX();

    Board.board[ySave][xSave]= new Tile();
    Board.board[y][x]= this;

    setY(y);
    setX(x);
  }

  public void moveTurtleToStart(){
    if (Window.playercount == 2)
    {
      if (this.getColor() == "red")
      {
        moveTurtleTo(0,1);
      }

      if (this.getColor() == "blue")
      {
        moveTurtleTo(0,5);
      }
    }

    else if (Window.playercount == 3)
    {
      if (this.getColor() == "red")
      {
        moveTurtleTo(0,0);
      }

      if (this.getColor() == "blue")
      {
        moveTurtleTo(0,3);
      }

      if (this.getColor() == "green")
      {
        moveTurtleTo(0,6);
      }
    }

    else if (Window.playercount == 4)
    {

      if (this.getColor() == "red")
      {
        moveTurtleTo(0,0);
      }

      if (this.getColor() == "blue")
      {
        moveTurtleTo(0,2);
      }

      if (this.getColor() == "green")
      {
        moveTurtleTo(0,5);
      }

      if (this.getColor() == "purple")
      {
        moveTurtleTo(0,7);
      }
    }
    setDirection('s');
  }

  public Player getPlayer(){
    switch (getColor()){
      case "red":{
        return Game.playerList.get(0);
      }
      case "blue":{
        return Game.playerList.get(1);
      }
      case "green":{
        return Game.playerList.get(2);
      }
      case "purple":{
        return Game.playerList.get(3);
      }
      default:
        return null;
    }
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
  public Integer getX () {
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
  public Integer getY () {
    return y;
  }

  /**
   * Set the value of direction
   * @param newVar the new value of direction
   */
  public void setDirection (char newVar) {
    direction = newVar;
  }

  /**
   * Get the value of direction
   * @return the value of direction
   */
  public char getDirection () {
    return direction;
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

  /**
   * @param        colorTurtle
   */
  public void initTurtle(String colorTurtle)
  {
  }


}
