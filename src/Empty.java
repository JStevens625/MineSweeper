
import javax.swing.JOptionPane;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class Empty extends Tile {

    private boolean isSelected = false;
    private String whatAmI = "Empty";
    private int numOfBombs = 0;

    public void selected() {
        isSelected = true;
        JOptionPane.showMessageDialog(null, "This tile was empty.");
    }

    public String showMe() {
        return whatAmI;
    }

    public boolean getIsSelected() {
        return isSelected;
    }

    public void checkNeighbor(Tile[][] myTiles) {
        //use ints x and y from tile class
        int xMax = 0;
        int yMax = 0;
        for (int i = 0; i < myTiles.length; i++) {
            xMax += 1;
            for (int j = 0; j < myTiles.length; j++) {
                yMax += 1;
            }
        }
        xMax -= 1;
        yMax -= 1;
        if (y != yMax) {
            if (myTiles[x][y + 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            }
        }
        if (y != 0) {
            if (myTiles[x][y - 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            }
        }
        if (x != xMax) {
            if (myTiles[x + 1][y].showMe().equals("Bomb")) {
                numOfBombs += 1;
            }
        }
        if (x != 0) { //out of bounds check
            if (myTiles[x - 1][y].showMe().equals("Bomb")) {
                numOfBombs += 1;
            }
        }
        if (x != xMax && y != yMax) {
            if (myTiles[x + 1][y + 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            }
        }
        if (x != xMax && y != 0) {
            if (myTiles[x + 1][y - 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            }
        }
        if (x != 0 && y != yMax) { //out of bounds check
            if (myTiles[x - 1][y + 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            }
        }
        if (x != 0 && y != 0) { //out of bounds check
            if (myTiles[x - 1][y - 1].showMe().equals("Bomb")) {
                numOfBombs += 1;
            }
        }
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
