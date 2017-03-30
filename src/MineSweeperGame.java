
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Jacob Stevens and Scott Shriver
 */
public class MineSweeperGame extends JFrame {

    Clip music;
    AudioInputStream ais;

    public MineSweeperGame() {
        //Full MainFrame
        setTitle("SpaceBalls MineSweeper");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Aligns window to center of screen. Found it here: http://stackoverflow.com/questions/2442599/how-to-set-jframe-to-appear-centered-regardless-of-monitor-resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        //Adding all panels to frame
        //Music
        try {
            music = AudioSystem.getClip();
            ais = AudioSystem.getAudioInputStream(getClass().getResource("Music/SpaceballsTheme.wav"));
            music.open(ais);
            music.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
        }

        // Beginning of Colors
        //End of Colors
        setVisible(false);
        setResizable(false);
    }
}
