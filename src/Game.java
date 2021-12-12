
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class Game
 */
public class Game {


    public static Board board;

    //
    // Fields
    //
    public static boolean victorytoken;
    public static List<Player> playerList = new ArrayList<Player>();
    public static int active_Player;
    public Player player;
    GameWindow gw = new GameWindow(getPlayer_count ());
    Scanner scanner = new Scanner(System.in);
    private List dc;
    private Card card;
    private int turn;

    //
    // Constructors
    //
    public Game (int turn) {
        setActive_Player(0);
        setVictorytoken(true);
        switch (turn){
            case 0:

                for (int i = 1; i <= Window.playercount ; i++)
                {
                    Player player = new Player(i);
                    playerList.add(player);
      /*System.out.println(playerList.get(i-1).getColor()+ i+"");
      System.out.println(playerList.get(0).getColor()+ 0+"");
      System.out.println("game create loop count "+ i);*/
                }
                //System.out.println(playerList.get(0).getColor()+ "p1");
                // System.out.println(playerList.get(1).getColor()+ "p2");
                board =new Board();
                for(int i =0;i<=7 ;i++){
                    System.out.print("\n");
                    for(int j = 0;j<=7;j++){
                        Tile[][] truc= board.getBoard();
                        System.out.print(truc[i][j].getTile(truc[i][j]));

                    }
                }
                turn++;

            default:
                do
                {
                    setActive_Player(0);
                    turn(true);
                    turn++;
                }while(victorytoken);


        }


    /*dc = playerList.get(0).getDeck().getDeck();
    System.out.println(dc);
    for(int u =0 ; u<=31;u++ ){


      card = (Card) dc.get(u);
      System.out.println(card.getColor());
    }
    dc = playerList.get(1).getDeck().getDeck();
    System.out.println(dc);
    for(int u =0 ; u<=31;u++ ){


      card = (Card) dc.get(u);
      System.out.println(card.getColor());
    }*/
    };

    public static void setVictorytoken(boolean victorytoken) {
        Game.victorytoken = victorytoken;
    }

    private void  displaymenu(int active_Player){System.out.println("  tour du joueur "+ playerList.get(active_Player).getColor());
        System.out.println("Faites votre choix :\n" +
                "(1) ajouter une carte au programme.\n" +
                "(2) jouer le programme.\n" +
                "(3) defausser sa main.\n"+
                "(4) poser un mur.\n" +
                "(5) fin de tour");}
    private void turn(boolean played_card){
        for(int i=0;;i++){

            // Affichage test du board (console)
            for(int e =0;e<=7 ;e++){
                System.out.print("\n");
                for(int j = 0;j<=7;j++){
                    Tile[][] truc= board.getBoard();
                    System.out.print(truc[e][j].getTile(truc[e][j]));

                }
            }
            System.out.println("\n turtle1: y="+playerList.get(0).getTurtle().getY()+"\nx="+playerList.get(0).getTurtle().getX()+"\n");
            System.out.println("\n turtle2: y="+playerList.get(1).getTurtle().getY()+"\nx="+playerList.get(1).getTurtle().getX()+"\n");

            if(active_Player <Window.playercount){
                //System.out.print("inturn"+active_Player);
                displaymenu(active_Player);

                int choice = scanner.nextInt();
                List hand = playerList.get(active_Player).getHand().getHand();
                switch (choice){

                    case 1:
                        //playerList.get(i).getProgram().addCard()
                        if(played_card){
                            for(int j=0;j<hand.size();j++){
                                card = (Card)hand.get(j);
                                System.out.print(card.getColor() +" "+"("+j+")" );
                            }
                            System.out.print(" go back (5)");
                            int choice2 =scanner.nextInt();

                            // Switch inutile, j'ai remplacé par :

                            if (choice2 >= 0 && choice2 <=4){
                                playerList.get(active_Player).getProgram().addCard(hand,choice2);
                                turn(false);
                            }
                            else if (choice2 == 5){
                                turn(true);
                            }
                            else {
                                System.out.println("Erreur, entrée incorecte");
                                turn(true);
                            }
/*
          switch (choice2){
          case 0:
            playerList.get(active_Player).getProgram().addCard(hand,choice2);
            turn(false);
          case 1:
            playerList.get(active_Player).getProgram().addCard(hand,choice2);
            turn(false);
          case 2:
            playerList.get(active_Player).getProgram().addCard(hand,choice2);
            turn(false);
          case 3:
            playerList.get(active_Player).getProgram().addCard(hand,choice2);
            turn(false);
          case 4:
            playerList.get(active_Player).getProgram().addCard(hand,choice2);
            turn(false);
          case 5:
            turn(true);

        }*/
                        }
                        else {
                            System.out.print(" vous avez deja fait une action ce tour");
                            turn(false);
                            break;

                        }
                        break;

                    case 2:
                        if(played_card) {
                            playerList.get(active_Player).getProgram().executeProgram(active_Player);

                            turn(false);
                        }
                        else{System.out.print(" vous avez deja fait une action ce tour");
                            turn(false);}
                        break;
                    case 3:

                        playerList.get(active_Player).getHand().discard(active_Player,hand.size());



                        turn(false);
                        break;
                    case 4:
                        if(played_card) {
                            System.out.println("Quel type de mur voulez-vous construire?" +
                                    "\n(1) Mur de pierre. Murs restants : " + playerList.get(active_Player).getNormalWalls() +
                                    "\n(2) Mur de glace. Murs restants : " + playerList.get(active_Player).getIceWalls());
                            int wallType = scanner.nextInt();
                            int yWall;
                            int xWall;

                            if (wallType == 1) { // Si le mur à construire est un mur de pierre
                                if (playerList.get(active_Player).getNormalWalls() > 0) {
                                    // Si le joueur a encore des murs de pierre

                                    Boolean destOk = false; // si la destination du mur est vide, il est true
                                    do{
                                        System.out.println("Entrez la coordonnée y du mur :");
                                        yWall = scanner.nextInt();

                                        System.out.println("Entrez la coordonnée x du mur :");
                                        xWall = scanner.nextInt();

                                        if(Board.board[yWall][xWall].getClass().isAssignableFrom(Tile.class)){ // si la case est vide
                                            destOk = true;
                                        }
                                        else{
                                            System.out.println("La case est déjà occupée, veuillez choisir une autre case.");
                                        }
                                    }while (!destOk);



                                    playerList.get(active_Player).setNormalWalls(playerList.get(active_Player).getNormalWalls() - 1);
                                    Board.board[yWall][xWall] = new Wall(false, yWall, xWall);
                                    turn(false);
                                } else {
                                    System.out.println("Désolé, vous n'avez plus de mur de pierre.");
                                    turn(true);
                                }
                            } else if (wallType == 2) { // Si le mur à construire est un mur de glace
                                if (playerList.get(active_Player).getIceWalls() > 0) {
                                    // Si le joueur a encore des murs de glace
                                    Boolean destOk = false; // si la destination du mur est vide, il est true
                                    do{
                                        System.out.println("Entrez la coordonnée y du mur :");
                                        yWall = scanner.nextInt();

                                        System.out.println("Entrez la coordonnée x du mur :");
                                        xWall = scanner.nextInt();

                                        if(Board.board[yWall][xWall].getClass().isAssignableFrom(Tile.class)){ // si la case est vide
                                            destOk = true;
                                        }
                                        else{
                                            System.out.println("La case est déjà occupée, veuillez choisir une autre case.");
                                        }
                                    }while (!destOk);

                                    playerList.get(active_Player).setIceWalls(playerList.get(active_Player).getIceWalls() - 1);
                                    Board.board[yWall][xWall] = new Wall(true, yWall, xWall);
                                    turn(false);
                                } else {
                                    System.out.println("Désolé, vous n'avez plus de mur de glace.");
                                    turn(true);
                                }
                            }
                        }
                        else{
                            System.out.print(" Vous avez deja fait une action ce tour");
                            turn(false);
                        }
                        break;

                    case 5:
                        if(hand.size() ==0){
                            List dc =playerList.get(active_Player).getDeck().getDeck();
                            System.out.println(dc.size());
                            if(dc.size()>6){
                               // System.out.println("dc size >7");

                            playerList.get(active_Player).setHand(new Hand(active_Player));
                            setActive_Player(active_Player+1);

                            turn(true);

                            played_card = true;
                            break;}
                            else{
                               // System.out.println("dc size <7");
                                dc.addAll(playerList.get(active_Player).getDiscard().discard);
                                Deck dek = new Deck(dc);
                                //System.out.println("deklist1");
                                //System.out.println(playerList.get(active_Player).getDeckInList(active_Player));
                                playerList.get(active_Player).setDeck(dek);
                                playerList.get(active_Player).decklist.add(active_Player,dek);
                                //System.out.println("deklist2");
                                //System.out.println(playerList.get(active_Player).getDeckInList(active_Player));
                                playerList.get(active_Player).setHand(new Hand(active_Player));
                                setActive_Player(active_Player+1);
                                turn(true);

                                played_card = true;
                                break;

                            }


                        }
                        else {

                            setActive_Player(active_Player+1);

                            turn(true);
                            played_card = true;

                            break;}
                }
            }
            else {
                setActive_Player(0);
                turn(true);
                played_card = true;
                break;}


        }
    }
//
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Get the value of board
     * @return the value of board
     */
    public static Board getBoard() {
        return board;
    }

    /**
     * Set the value of board
     * @param newVar the new value of board
     */
    private void setBoard (Board newVar) {
        board = newVar;
    }

    /**
     * Get the value of player
     * @return the value of player
     */
    private Player getPlayer () {
        return player;
    }

    /**
     * Set the value of player
     * @param newVar the new value of player
     */
    private void setPlayer (Player newVar) {
        player = newVar;
    }

    /**
     * Get the value of player_count
     * @return the value of player_count
     */
    private int getPlayer_count () {
        return Window.playercount;
    }

    /**
     * Set the value of player_count
     * @param newVar the new value of player_count
     */
    private void setPlayer_count (int newVar) {
        Window.playercount = newVar;
    }

    /**
     * Get the value of active_Player
     * @return the value of active_Player
     */
    private int getActive_Player () {
        return active_Player;
    }

    /**
     * Set the value of active_Player
     * @param newVar the new value of active_Player
     */
    private void setActive_Player (int newVar) {
        active_Player = newVar;
    }

    //
    // Other methods
    //

    /**
     * @param        player_count
     */
    public void _init_Game(int player_count)
    {
    }


    /**
     */
    public void victory_test()
    {
    }


}
