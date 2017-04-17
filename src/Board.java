
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class Board
{

    JFrame GameFrame = new JFrame();
    JPanel buttonboard = new JPanel();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    JButton easybuttons[][] = new JButton[9][9];
    JButton mediumbuttons[][] = new JButton[16][16];
    JButton hardbuttons[][] = new JButton[30][16];

    private ActionListener easyButtonClick = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            for (int i = 0; i < easybuttons.length; i++) {
                for (int j = 0; j < easybuttons.length; j++) {
                    if (e.getSource() == easybuttons[i][j]) {
                        easybuttons[i][j].setEnabled(false);
                    }

                }
            };
        }
    };
    
    private ActionListener mediumButtonClick = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            for (int i = 0; i < mediumbuttons.length; i++) {
                for (int j = 0; j < mediumbuttons.length; j++) {
                    if (e.getSource() == mediumbuttons[i][j]) {
                        mediumbuttons[i][j].setEnabled(false);
                    }

                }
            };
        }
    };
    
    private ActionListener hardButtonClick = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            for (int i = 0; i < hardbuttons.length; i++) {
                for (int j = 0; j < hardbuttons.length; j++) {
                    if (e.getSource() == hardbuttons[i][j]) {
                        hardbuttons[i][j].setEnabled(false);
                    }

                }
            };
        }
    };

    public void easygame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
        buttonboard.setLayout(new GridLayout(9, 9));
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                easybuttons[i][k] = new JButton();
                easybuttons[i][k].addActionListener(easyButtonClick);
                buttonboard.add(easybuttons[i][k]);
            }
        }
        GameFrame.add(buttonboard);

        GameFrame.setSize(600, 600);
        GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
        GameFrame.setVisible(true);
    }

    public void mediumgame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
        buttonboard.setLayout(new GridLayout(16, 16));
        for (int i = 0; i < 16; i++) {
            for (int k = 0; k < 16; k++) {
                mediumbuttons[i][k] = new JButton();
                mediumbuttons[i][k].addActionListener(mediumButtonClick);
                buttonboard.add(mediumbuttons[i][k]);
            }
        }
        GameFrame.add(buttonboard);
        GameFrame.setSize(600, 600);
        GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
        GameFrame.setVisible(true);
    }

    public void hardgame()
    {
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameFrame.setResizable(false);
        buttonboard.setLayout(new GridLayout(16, 30));
        for (int i = 0; i < 30; i++) {
            for (int k = 0; k < 16; k++) {
                hardbuttons[i][k] = new JButton();
                hardbuttons[i][k].addActionListener(hardButtonClick);
                buttonboard.add(hardbuttons[i][k]);
            }
        }
        GameFrame.add(buttonboard);
        GameFrame.setSize(600, 600);
        GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
        GameFrame.setVisible(true);
    }

    private Tile[][] addTiles(Tile[][] inputGrid, int difficulty)
    {
        int bombQuantity = 0;
        switch (difficulty) {
            case 0:
                bombQuantity = 10;
                break;
            case 1:
                bombQuantity = 40;
                break;
            case 2:
                bombQuantity = 99;
                break;
        }
        return inputGrid;
    }
}
