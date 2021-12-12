import java.util.ArrayList;
import java.util.List;

/**
 * Class Program
 */
public class Program {

    //
    // Fields
    //
    private String color;
    private Card cards;
    private Integer number_cards;
    private Boolean bug;
    private List<Card> program = new ArrayList<Card>();
    //
    // Constructors
    //
    public Program () {
    };
    public Program (String color) {
        this.color = color;
    };

    public List addCard(List hand ,int card_number){

        program.add((Card) hand.get(card_number));
        hand.remove(card_number);

        return program;
    }

    public void executeProgram(int playerNumber){

        Game.playerList.get(playerNumber).getDiscard().discarded(program);

        int programSize = program.size();
        for (int i =0; i<programSize;i++) {
            switch(program.get(0).getColor()){
                case "blue":{
                    Game.playerList.get(playerNumber).getTurtle().forward();
                    break;
                }
                case "yellow":{
                    Game.playerList.get(playerNumber).getTurtle().rotateL();
                    break;
                }
                case "purple":{
                    Game.playerList.get(playerNumber).getTurtle().rotateR();
                    break;
                }
                case "red":{
                    Game.playerList.get(playerNumber).getTurtle().laser();
                    break;
                }
            }
            System.out.println("Program card : "+program.get(0).getColor());
            program.remove(program.get(0));
        }
    }

    //
    // Methods
    //


    //
    // Accessor methods
    //


    public List<Card> getProgram() {
        return program;
    }

    public void setProgram(List<Card> program) {
        this.program = program;
    }

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

    /**
     * Set the value of bug
     * @param newVar the new value of bug
     */
    private void setBug (Boolean newVar) {
        bug = newVar;
    }

    /**
     * Get the value of bug
     * @return the value of bug
     */
    private Boolean getBug () {
        return bug;
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
