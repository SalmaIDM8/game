import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;


public class GamePanel extends JPanel implements ActionListener {
    public GamePanel(){
        this.setPreferredSize(new Dimension(600,600));
        this.setBackground(Color.GREEN);
        this.setFocusable(true);
        //this.addKeyListener(new MyKeyAdapter());
        //startGame()
    }

    /*gestion des evenements (collision et mouvements)*/
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void startGame(){

    }
    public void draw(Graphics g) {
        // Dessiner la pomme
        g.setColor(Color.red);
        g.fillOval(100,100,20, 20);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Nettoie l'affichage
        draw(g);                 // Appelle ta méthode pour dessiner la pomme
    }

}
