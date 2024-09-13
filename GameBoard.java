import javax.swing.*;

public class GameBoard extends JFrame{
    public GameBoard(){
        this.add(new GamePanel()); //ajout du paneau du jeu
        this.setVisible(true);
        this.setTitle("SnakeGame");
        this.setResizable(false);
        this.pack(); //ajuster à la meme taille que celle du panneau
        this.setLocationRelativeTo(null); //ma fenetre sera au centre de mon ecran

    }

    public static void main(String[] args)
    {
        JFrame frame = new GameBoard();
        frame.setVisible(true);
    }
}
