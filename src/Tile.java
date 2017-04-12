
/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public abstract class Tile {

    int x, y;
    boolean hasBeenClicked = false;
    private String whatAmI;

    public abstract void selected();

    public String showMe() {
        return whatAmI;
    }
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
}
