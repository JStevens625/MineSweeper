

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob Stevens and Scott Stewart Shriver
 */
public class RunGame
{
    public static void main(String[] args)
    {
        JFrame mode = new JFrame();
        JTextArea jt = new JTextArea("Minesweeper is a single-player game where you try to make it through a mine field with out hitting any bombs. If you hit a bomb you lose. If you hit a space without a bomb it will give you a number, the number symbolizes how many bombs are directly around it. To begin click on one of the difficulties below to start. Beginner will start with a 9X9 Board and have 10 bombs. Intermediate will have a 16X16 Board and have 40 bombs. And Advanced will have a 16X30 Board with 99 bombs.");
        JButton easy = new JButton();
        JButton medium = new JButton();
        JButton hard = new JButton();
        easy.setIcon(new ImageIcon("src/Difficulties/EasyModedone.jpg"));
        medium.setIcon(new ImageIcon("src/Difficulties/MediumModedone.jpg"));
        hard.setIcon(new ImageIcon("src/Difficulties/HardModedone.jpg"));
        
        mode.add(new JLabel(new ImageIcon("src/Pictures/Intro.jpg")), BorderLayout.NORTH);
        mode.add(jt, BorderLayout.CENTER);
        
        mode.setVisible(true);
        
        MineSweeperGame MSG = new MineSweeperGame();
    }
}
