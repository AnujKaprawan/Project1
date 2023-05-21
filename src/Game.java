import javax.swing.JFrame;
import java.awt.Color;

public class Game {
    public static void main(String[] args) {
        Gameplay gameplay;
        gameplay = new Gameplay();
        JFrame frame = new JFrame("Game Frame");
       // frame.getContentPane().setBackground(Color.BLACK);
        frame.setBounds(10,10,700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setResizable(false);
        frame.add(gameplay);
    }
}
