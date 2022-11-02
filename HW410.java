/**
 * Created by DELL on 09/25/2022.
 */


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HW410 {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(400,400);
        JLabel label =new JLabel("Hello,Saba");
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }






}
