
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reter
 */
class BackGroundClass extends JFrame
    {

    public BackGroundClass()
    {
        setTitle("Background Color for JFrame");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        /*
        One way
        -----------------
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png"));
        add(background);
        background.setLayout(new FlowLayout());
        l1=new JLabel("Here is a button");
        b1=new JButton("I am a button");
        background.add(l1);
        background.add(b1);
        */

        // Another way
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\reter\\OneDrive\\Desktop\\hostel1.png")));
        setLayout(new FlowLayout());
        
        // Just for refresh :) Not optional!
        setSize(399,399);
        setSize(400,400);
    }
}