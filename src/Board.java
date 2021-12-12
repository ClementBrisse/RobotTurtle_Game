import java.util.List;

/**
 * Class Board
 */
public class Board {

  //
  // Fields
  //


  private Tile tiles;
  public static Tile[][] board; // Tile[y][x]
  //
  // Constructors
  //
  public Board ()
  {
      board = new Tile[8][8];
      for(int i =0; i<8; i++)
      {
        for(int j = 0; j<8; j++)
        {
          board[i][j]=new Tile();
        }
      }

      if (Window.playercount == 2)
      {
        for (int i = 0; i <= 7; i++)
        {
          board[i][7] = new Wall(false, i,7);
        }

        //Player 1 ORIGIN
        Game.playerList.get(0).setTurtle(new Turtle(1, 0, 1));
        Turtle tortue1 = Game.playerList.get(0).getTurtle();
        board[0][1]=tortue1;
        System.out.println("turtle color"+tortue1.getColor());

        /*//Player 1   DEMO
        Game.playerList.get(0).setTurtle(new Turtle(1, 0, 1));
        Turtle tortue1 = Game.playerList.get(0).getTurtle();
        board[0][1]=tortue1;
        System.out.println("turtle color"+tortue1.getColor());*/

        // Player 2 ORIGIN
        Game.playerList.get(1).setTurtle(new Turtle(2, 0, 5));
        Turtle tortue2 = Game.playerList.get(1).getTurtle();
        board[0][5]=tortue2;

        /*// Player 2 DEMO
        Game.playerList.get(1).setTurtle(new Turtle(2, 0, 5));
        Turtle tortue2 = Game.playerList.get(1).getTurtle();
        board[0][5]=tortue2;*/

        new Tile(tortue1,tortue2);
        System.out.println("turtle color"+tortue2.getColor());
        board[7][3] = new Gem(7,3);

      }

      else if (Window.playercount == 3)
      {
        for (int i=0 ; i<=7 ; i++)
        {
          board[i][7] = new Wall(false,i,6);
        }

        Game.playerList.get(0).setTurtle(new Turtle(1,0,0));
        Game.playerList.get(1).setTurtle(new Turtle(2,0,3));
        Game.playerList.get(2).setTurtle(new Turtle(3,0,6));
        Turtle tortue1 = Game.playerList.get(0).getTurtle();
        Turtle tortue2 = Game.playerList.get(1).getTurtle();
        Turtle tortue3 = Game.playerList.get(2).getTurtle();
        board[0][0]=tortue1;
        board[0][3]=tortue2;
        board[0][6]=tortue3;
        new Tile(tortue1);
        new Tile(tortue2);
        new Tile(tortue3);

        board[7][0] = new Gem(7,0);
        board[7][3] = new Gem(7,3);
        board[7][5] = new Gem(7,5);
      }

      else if (Window.playercount == 4)
      {

        Game.playerList.get(0).setTurtle(new Turtle(1,0,0));
        Game.playerList.get(1).setTurtle(new Turtle(2,0,2));
        Game.playerList.get(2).setTurtle(new Turtle(3,0,5));
        Game.playerList.get(3).setTurtle(new Turtle(4,0,7));

        Turtle tortue1 = Game.playerList.get(0).getTurtle();
        Turtle tortue2 = Game.playerList.get(1).getTurtle();
        Turtle tortue3 = Game.playerList.get(2).getTurtle();
        Turtle tortue4 = Game.playerList.get(3).getTurtle();


        board[0][0]=tortue1;
        board[0][2]=tortue2;
        board[0][5]=tortue3;
        board[0][7]=tortue4;
        new Tile(tortue1);
        new Tile(tortue2);
        new Tile(tortue3);
        new Tile(tortue4);

        board[7][1] = new Gem(7,1);
        board[7][6] = new Gem(7,6);
      }


      }

  public Tile[][] getBoard(){
    return board;
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //


  /**
   * Set the value of tiles
   * @param newVar the new value of tiles
   */
  private void setTiles (Tile newVar) {
    tiles = newVar;
  }

  /**
   * Get the value of tiles
   * @return the value of tiles
   */
  private Tile getTiles () {return tiles;}

  //
  // Other methods
  //


  /**
   */
  public void diplayBoard()
  {
  }


  /**
   */
  public void updateBoard()
  {
  }


}
