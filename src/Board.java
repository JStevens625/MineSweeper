
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class Board
{

    JFrame GameFrame = new JFrame();
    JPanel buttonboard = new JPanel();

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    JButton easybuttons[][] = new JButton[9][9];
    JButton mediumbuttons[][] = new JButton[16][16];
    JButton hardbuttons[][] = new JButton[30][16];

    public void easygame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
        buttonboard.setLayout(new GridLayout(9, 9));
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                easybuttons[i][k] = new JButton();
                buttonboard.add(easybuttons[i][k]);
            }
        }
        GameFrame.add(buttonboard);

        GameFrame.setSize(600, 600);
        GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
        GameFrame.setVisible(true);
    }

    public void mediumgame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
         buttonboard.setLayout(new GridLayout(16, 16));
        for (int i = 0; i < 16; i++) {
            for (int k = 0; k < 16; k++) {
                mediumbuttons[i][k] = new JButton();
                buttonboard.add(mediumbuttons[i][k]);
            }
        }
        GameFrame.add(buttonboard);
        GameFrame.setSize(600, 600);
        GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
        GameFrame.setVisible(true);
    }

    public void hardgame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
        buttonboard.setLayout(new GridLayout(16, 30));
        for (int i = 0; i < 30; i++) {
            for (int k = 0; k < 16; k++) {
                hardbuttons[i][k] = new JButton();
                buttonboard.add(hardbuttons[i][k]);
            }
        }
        GameFrame.add(buttonboard);
        GameFrame.setSize(600, 600);
        GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
        GameFrame.setVisible(true);
    }

    private Tile[][] addTiles(Tile[][] inputGrid, int difficulty)
    {
        int bombQuantity = 0;
        switch (difficulty) {
            case 0:
                bombQuantity = 10;
                break;
            case 1:
                bombQuantity = 40;
                break;
            case 2:
                bombQuantity = 99;
                break;
        }
        return inputGrid;
    }
}
