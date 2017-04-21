
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public abstract class Tile extends JButton implements ActionListener {

    int x, y, numOfBombs = 0;
    boolean hasBeenClicked = false;

    public abstract void selected();

    public abstract void checkNeighbor(Tile[][] myTiles, int inputX, int inputY);

    public abstract String showMe();

    public abstract void setXAndY(int inputX, int inputY);
}
