
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class RunGame {

    public static void main(String[] args) {
        JFrame mode = new JFrame();
        mode.setSize(600, 600);
        Font myfont = new Font("Serif", 0, 20);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        mode.setLocation(dim.width / 2 - mode.getSize().width / 2, dim.height / 2 - mode.getSize().height / 2);
        mode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mode.setLayout(new GridLayout(3, 1, 0, 0));
        JTextArea jt = new JTextArea("Minesweeper is a single-player game where you try to make it through a mine field with out hitting any bombs. If you hit a bomb you lose. If you hit a space without a bomb it will give you a number, the number symbolizes how many bombs are directly around it. To begin click on one of the difficulties below to start. Beginner will start with a 9X9 Board and have 10 bombs. Intermediate will have a 16X16 Board and have 40 bombs. And Advanced will have a 16X30 Board with 99 bombs.", 20, 20);
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
        jp.add(easy);
        jp.add(medium);
        jp.add(hard);

        mode.add(new JLabel(new ImageIcon("src/Pictures/Intro.jpg")), BorderLayout.NORTH);
        mode.add(jt, BorderLayout.CENTER);
        mode.add(jp, BorderLayout.SOUTH);

        mode.setVisible(true);

        MineSweeperGame MSG = new MineSweeperGame();
    }
}
