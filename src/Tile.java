
import javax.swing.JButton;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public abstract class Tile extends JButton {

    int x, y, numOfBombs = 0;
    boolean hasBeenClicked = false;

    public abstract void selected();
    public abstract void checkNeighbor();
    public abstract String showMe();
}
