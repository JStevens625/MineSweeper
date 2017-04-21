
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class Bomb extends Tile {

    private boolean isSelected = false;
    private String whatAmI = "Bomb";

    @Override
    public void selected() {
        JOptionPane.showMessageDialog(null, "This tile was a bomb.");
    }

    @Override
    public void checkNeighbor(Tile[][] myTiles, int inputX, int inputY) {
        //not necessary for Bomb class
    }

    @Override
    public void setXAndY(int inputX, int inputY) {
        x = inputX;
        y = inputY;
    }

    @Override
    public String showMe() {
        return whatAmI;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
