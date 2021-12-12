

/**
 * Class Wall
 */
public class Wall extends Tile {

    //
    // Fields
    //

    public Boolean iceWall;
    private boolean onBoard;
    private int x;
    private int y;

    //
    // Constructors
    //
    public Wall (Boolean iceWall , int y , int x) {
        if(iceWall){
            setIceWall(true);
        }
        else{
            setIceWall(false);
        }


        setY(y);
        setX(x);

    };
    public String getwall(){
        if(this.getIceWall()==true) {
            return "iWall";
        }
        else{
            return "Wall";
        }
    }

    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Set the value of iceWall
     * @param newVar the new value of iceWall
     */
    private void setIceWall (Boolean newVar) {
        this.iceWall = newVar;
    }

    /**
     * Get the value of iceWall
     * @return the value of iceWall
     */
    public  Boolean getIceWall() {
        return this.iceWall;
    }


    /**
     * Set the value of onBoard
     * @param newVar the new value of onBoard
     */
    private void setOnBoard (boolean newVar) {
        onBoard = newVar;
    }

    /**
     * Get the value of onBoard
     * @return the value of onBoard
     */
    private boolean getOnBoard () {
        return onBoard;
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

    //
    // Other methods
    //

}
