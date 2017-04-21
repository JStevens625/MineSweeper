
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class Bomb extends Tile {

    @Override
    public void selected() {
        JOptionPane.showMessageDialog(null, "This tile was a bomb.");
    }

    @Override
    public void checkNeighbor(Tile[][] myTiles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String showMe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
