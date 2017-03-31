
import javax.swing.JOptionPane;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class Bomb extends Tile {

    public void selected() {
        JOptionPane.showMessageDialog(null, "This tile was a bomb.");
    }
}
