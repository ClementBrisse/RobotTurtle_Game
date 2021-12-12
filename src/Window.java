
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;



public class Window extends JFrame {
    public static int playercount;
    JButton bouton2j = new JButton("2 players");

    //Possibilité 2 : instanciation puis définition du libellé
    JButton bouton3j = new JButton("3 players");
    JButton bouton4j = new JButton("4 players");

    public Window(){
        this.setTitle("Robot Turtle main menu");
        this.setSize(640, 360);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JPanel  pan = new JPanel();
        pan.add(bouton2j);
        pan.add(bouton3j);
        pan.add(bouton4j);
        pan.setBackground(Color.BLUE);
        this.setContentPane(pan);
        //this.setContentPane(new Panneau());

        bouton2j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playercount = 2;
                Game game = new Game(0);
            }
        });
        bouton3j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playercount =3;
                Game game = new Game(0);
            }
        });

        bouton4j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playercount =4;
                Game game = new Game(0);
            }
        });


    }

    public static void closeWindow()
    {

        for(int i =0;i<=7 ;i++){
            System.out.print("\n");
            for(int j = 0;j<=7;j++){
                Tile[][] truc= Game.board.getBoard();
                System.out.print(truc[i][j].getTile(truc[i][j]));

            }
        }
        System.out.println("\n\n"+"La partie est terminée !");
        System.exit(0);

    }

}
