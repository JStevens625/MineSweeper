
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import sun.nio.cs.ext.MS874;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public abstract class Tile extends JButton implements ActionListener
{

    MineSweeperGame ms = new MineSweeperGame();
    Tile easytile[][];
    Tile mediumtile[][];
    Tile hardtile[][];

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (ms.getDifficultsetter() == 1) {
            for (int i = 0; i < easytile.length; i++) {
                for (int j = 0; j < easytile.length; j++) {
                    if (e.getSource() == easytile[i][j]) {
                        easytile[i][j].setEnabled(false);
                    }
                }
            };
        }
        if (ms.getDifficultsetter() == 2) {
            for (int i = 0; i < mediumtile.length; i++) {
                for (int j = 0; j < mediumtile.length; j++) {
                    if (e.getSource() == mediumtile[i][j]) {
                        mediumtile[i][j].setEnabled(false);
                    }
                }
            };
        }
        if (ms.getDifficultsetter() == 3) {
            for (int i = 0; i < hardtile.length; i++) {
                for (int j = 0; j < hardtile.length; j++) {
                    if (e.getSource() == hardtile[i][j]) {
                        hardtile[i][j].setEnabled(false);
                    }
                }
            };
        }
    }
    
    public abstract

    int x, y, numOfBombs = 0;
    boolean hasBeenClicked = false;

    public abstract void selected();

    public abstract void checkNeighbor(Tile[][] myTiles, int inputX, int inputY);

    public abstract String showMe();

    public abstract void setXAndY(int inputX, int inputY);
}
