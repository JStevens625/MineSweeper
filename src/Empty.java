
import javax.swing.JOptionPane;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class Empty extends Tile {

    private boolean isSelected = false;

    public void selected() {
        isSelected = true;
        JOptionPane.showMessageDialog(null, "This tile was empty.");
    }

    public boolean getIsSelected() {
        return isSelected;
    }
}//check if bombs around it, if empty needs to check until it finds bomb
