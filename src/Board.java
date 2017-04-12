
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class Board
{

    JFrame GameFrame = new JFrame();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    Tile[][] gameGrid;

    public void easygame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
        gameGrid = new Tile[9][9];
        gameGrid = addTiles(gameGrid, 0);
        GameFrame.setSize(600, 600);
        GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
        GameFrame.setVisible(true);
    }

    public void mediumgame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
        gameGrid = new Tile[16][16];
        gameGrid = addTiles(gameGrid, 1);
        GameFrame.setSize(600, 600);
        GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
        GameFrame.setVisible(true);
    }

    public void hardgame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
        gameGrid = new Tile[16][30];
        gameGrid = addTiles(gameGrid, 2);
        GameFrame.setSize(600, 600);
        GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
        GameFrame.setVisible(true);
    }
    private Tile[][] addTiles(Tile[][] inputGrid, int difficulty) {
        int bombQuantity = 0;
        switch(difficulty) {
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
