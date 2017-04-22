
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import sun.nio.cs.ext.MS874;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public abstract class Tile implements ActionListener
{

    MineSweeperGame ms = new MineSweeperGame();
    Tile easytile[][];
    Tile mediumtile[][];
    Tile hardtile[][];
    JButton easybuttons[][] = new JButton[9][9];
    JButton mediumbuttons[][] = new JButton[16][16];
    JButton hardbuttons[][] = new JButton[30][16];

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (ms.getDifficultsetter() == 1) {
            for (int i = 0; i < easybuttons.length; i++) {
                for (int j = 0; j < easybuttons.length; j++) {
                    if (e.getSource() == easybuttons[i][j]) {
                        easybuttons[i][j].setEnabled(false);
                    }
                }
            };
        }
        if (ms.getDifficultsetter() == 2) {
            for (int i = 0; i < mediumbuttons.length; i++) {
                for (int j = 0; j < mediumbuttons.length; j++) {
                    if (e.getSource() == mediumbuttons[i][j]) {
                        mediumbuttons[i][j].setEnabled(false);
                    }
                }
            };
        }
        if (ms.getDifficultsetter() == 3) {
            for (int i = 0; i < hardbuttons.length; i++) {
                for (int j = 0; j < hardbuttons.length; j++) {
                    if (e.getSource() == hardbuttons[i][j]) {
                        hardbuttons[i][j].setEnabled(false);
                    }
                }
            };
        }
    }
    public void easygame(JPanel jpanel){
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                    
                easybuttons[i][k].addActionListener(this);
                jpanel.add(easybuttons[i][k]);
            }
        }
    }
    public void mediumgame(JPanel jpanel){
        for (int i = 0; i < 16; i++) {
            for (int k = 0; k < 16; k++) {
                    
                easybuttons[i][k].addActionListener(this);
                jpanel.add(easybuttons[i][k]);
            }
        }
    }
    public void hardgame(JPanel jpanel){
        for (int i = 0; i < 30; i++) {
            for (int k = 0; k < 16; k++) {
                    
                easybuttons[i][k].addActionListener(this);
                jpanel.add(easybuttons[i][k]);
            }
        }
    }

    int x, y, numOfBombs = 0;
    boolean hasBeenClicked = false;

    public abstract void selected();

    public abstract void checkNeighbor(Tile[][] myTiles, int inputX, int inputY);

    public abstract String showMe();

    public abstract void setXAndY(int inputX, int inputY);
}
