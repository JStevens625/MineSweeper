
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    Tile tile;


    public void easygame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
        buttonboard.setLayout(new GridLayout(9, 9));
        tile.easygame(buttonboard);
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
        tile.mediumgame(buttonboard);
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
        tile.hardgame(buttonboard);
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
