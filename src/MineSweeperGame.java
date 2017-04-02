import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */

public class MineSweeperGame
{
    JFrame mode = new JFrame();
    JFrame GameFrame = new JFrame();
    Clip music;
    AudioInputStream ais;
    private static int Boardpick = 0;
    Tile[][] gameGrid;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();


    public static void setBoardpick(int Boardpick)
    {
        MineSweeperGame.Boardpick = Boardpick;
    }

    public int getBoardpick()
    {
        return Boardpick;
    }
    
    private ActionListener easygame = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            MineSweeperGame.setBoardpick(1);
            System.out.println(Boardpick);
            mode.dispose();
            GameFrame.setSize(600, 600);
            gameGrid = new Tile[9][9];
            gameGrid = addTiles(gameGrid, 0);
            GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
            GameFrame.setVisible(true);
        }
    };
    
    private ActionListener mediumgame = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            MineSweeperGame.setBoardpick(2);
            System.out.println(Boardpick);
            mode.dispose();
            GameFrame.setSize(600, 600);
            gameGrid = new Tile[16][16];
            gameGrid = addTiles(gameGrid, 1);
            GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
            GameFrame.setVisible(true);
        }
    };
    
    private ActionListener hardgame = new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            MineSweeperGame.setBoardpick(3);
            System.out.println(Boardpick);
            mode.dispose();
            GameFrame.setSize(600, 600);
            gameGrid = new Tile[16][30];
            gameGrid = addTiles(gameGrid, 2);
            GameFrame.setLocation(dim.width / 2 - GameFrame.getSize().width / 2, dim.height / 2 - GameFrame.getSize().height / 2);
            GameFrame.setVisible(true);
        }
    };
    


    public MineSweeperGame() {
        //Music
        try {
            music = AudioSystem.getClip();
            ais = AudioSystem.getAudioInputStream(getClass().getResource("Music/SpaceballsTheme.wav"));
            music.open(ais);
            music.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {}
        
        //Instructions Screen and mode chooser
        
        mode.setSize(600, 600);
        Font myfont = new Font("Serif", 0, 20);
        mode.setLocation(dim.width / 2 - mode.getSize().width / 2, dim.height / 2 - mode.getSize().height / 2);
        mode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mode.setLayout(new GridLayout(3,1,0,0));
        JTextArea jt = new JTextArea("Minesweeper is a single-player game where you try to make it through a mine field with out hitting any bombs. If you hit a bomb you lose. If you hit a space without a bomb it will give you a number, the number symbolizes how many bombs are directly around it. To begin click on one of the difficulties below to start. Beginner will start with a 9X9 Board and have 10 bombs. Intermediate will have a 16X16 Board and have 40 bombs. And Advanced will have a 16X30 Board with 99 bombs.",20,20);
        JPanel jp = new JPanel(new GridLayout(1, 3));
        jt.setLineWrap(true);
        jt.setWrapStyleWord(true);
        jt.setFont(myfont);
        jt.setEditable(false);
        JButton easy = new JButton();
        JButton medium = new JButton();
        JButton hard = new JButton();
        easy.setIcon(new ImageIcon("src/Difficulties/EasyModedone.jpg"));
        medium.setIcon(new ImageIcon("src/Difficulties/MediumModedone.jpg"));
        hard.setIcon(new ImageIcon("src/Difficulties/HardModefixdone.jpg"));
        easy.addActionListener(easygame);
        medium.addActionListener(mediumgame);
        hard.addActionListener(hardgame);
        jp.add(easy);
        jp.add(medium);
        jp.add(hard);
        mode.add(new JLabel(new ImageIcon("src/Pictures/Intro.jpg")), BorderLayout.NORTH);
        mode.add(jt, BorderLayout.CENTER);
        mode.add(jp, BorderLayout.SOUTH);
        mode.setVisible(true); 
        //end of instructions screen and mode chooser
        
        
        
        //Game MainFrame
        
        GameFrame.setTitle("SpaceBalls MineSweeper");
        GameFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Aligns window to center of screen. Found it here: http://stackoverflow.com/questions/2442599/how-to-set-jframe-to-appear-centered-regardless-of-monitor-resolution
        
        
        GameFrame.setResizable(false);
    }
    
    private Tile[][] addTiles(Tile[][] inputGrid, int difficulty) {
        int bombQuantity = 0;
        switch(difficulty) {
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