
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class Empty extends Tile {

    private boolean isSelected = false;
    private String whatAmI = "Empty";
    private int numOfBombs = 0;

    @Override
    public void selected() {
        isSelected = true;
        JOptionPane.showMessageDialog(null, "This tile was empty.");
    }

    @Override
    public String showMe() {
        return whatAmI;
    }

    public boolean getIsSelected() {
        return isSelected;
    }

    @Override
    public void setXAndY(int inputX, int inputY) {
        x = inputX;
        y = inputY;
    }

    @Override
    public void checkNeighbor(Tile[][] myTiles, int inputX, int inputY) {
        //use ints x and y from tile class
        x = inputX;
        y = inputY;
        int xMax = myTiles.length;
        int yMax = myTiles[0].length;
        xMax -= 1;
        yMax -= 1;
        if (y != yMax) {
            if (myTiles[x][y + 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            } else if (numOfBombs == 0) {
                checkNeighbor(myTiles, x, y + 1);
            }
        }
        if (y != 0) {
            if (myTiles[x][y - 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            } else {
                checkNeighbor(myTiles, x, y - 1);
            }
        }
        if (x != xMax) {
            if (myTiles[x + 1][y].showMe().equals("Bomb")) {
                numOfBombs += 1;
            } else {
                checkNeighbor(myTiles, x + 1, y);
            }
        }
        if (x != 0) { //out of bounds check
            if (myTiles[x - 1][y].showMe().equals("Bomb")) {
                numOfBombs += 1;
            } else {
                checkNeighbor(myTiles, x - 1, y);
            }
        }
        if (x != xMax && y != yMax) {
            if (myTiles[x + 1][y + 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            } else {
                checkNeighbor(myTiles, x + 1, y + 1);
            }
        }
        if (x != xMax && y != 0) {
            if (myTiles[x + 1][y - 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            } else {
                checkNeighbor(myTiles, x + 1, y - 1);
            }
        }
        if (x != 0 && y != yMax) { //out of bounds check
            if (myTiles[x - 1][y + 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            } else {
                checkNeighbor(myTiles, x - 1, y + 1);
            }
        }
        if (x != 0 && y != 0) { //out of bounds check
            if (myTiles[x - 1][y - 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            } else {
                checkNeighbor(myTiles, x - 1, y - 1);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//check if bombs around it, if empty needs to check until it finds bomb
/*checkNeighbor method
    var numberOfBombs 0
    check x-1,y-1
    check x, y-1
    check x+1, y-1
    check x-1, y
    check all eight surrounding tiles, add to numberOfBombs for each bomb
    if numberOfBombs is still 0, have each neighbor do checkNeighbor
    DON'T GO OUT OF BOUNDS
    if x=0, don't do x-1 checks
    if y=0, don't do y-1 checks
    if x=MAX, don't do x+1 checks
    if y=MAX, don't do y+1 checks
 */
