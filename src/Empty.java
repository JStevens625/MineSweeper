import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Stevens
 */
public class Empty extends Tile
{
    public void selected() {
        JOptionPane.showMessageDialog(null, "This tile was empty.");
    }
}
