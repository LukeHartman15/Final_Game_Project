import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(1500, 1000);

        frame.setBackground(new Color(9, 138, 0));
//Add a shoe to the side
//Get rid of the chip rack for now


        //Panel is blocking background color
JPanel panel = new JPanel();
panel.setBackground(new Color(9, 138, 0));
panel.setSize(1500, 1000);
ImageIcon icon = new ImageIcon("Images/Shoe2.png");
icon.setImage(icon.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);
        ImageIcon icon1 = new ImageIcon("Images/chipHolder-removebg-preview.png");
        icon1.setImage(icon1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));
        JLabel picLabel1 = new JLabel(icon1);
        ImageIcon icon2 = new ImageIcon("Images/transparent.png");
        icon2.setImage(icon2.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));
        JLabel picLabel2 = new JLabel(icon2);
        JButton hitButton = new JButton("Hit");
        hitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton standButton = new JButton("Stand");
        standButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        hitButton.setSize(200, 200);
        hitButton.setLocation(300, 600);
        standButton.setSize(200, 200);
        standButton.setLocation(1000, 600);

    panel.add(picLabel);
    panel.add(picLabel1);
    panel.add(picLabel2);
    frame.add(hitButton);
    frame.add(standButton);









frame.add(panel);



        frame.setVisible(true);
    }
}