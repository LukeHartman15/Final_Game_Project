import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main{

    public static void main(String[] args) {
        boolean play = true;
        JFrame frame = new JFrame();
        frame.setSize(1500, 1000);

        frame.setBackground(new Color(9, 138, 0));

            int newXLoc = 0;
            int newYLoc = 0;
            int[] extra = new int[1];
            int hitNum = 1;
            extra[0] = hitNum;
            DeckOfCards deck = new DeckOfCards();
            ImageIcon icon3 = deck.drawFromDeck().getFront();
            icon3.setImage(icon3.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
            JLabel picLabel3 = new JLabel(icon3);
            ImageIcon icon4 = deck.drawFromDeck().getBack();
            icon4.setImage(icon4.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
            JLabel picLabel4 = new JLabel(icon4);
            ImageIcon icon5 = deck.drawFromDeck().getFront();
            icon5.setImage(icon5.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
            JLabel picLabel5 = new JLabel(icon5);
            ImageIcon icon6 = deck.drawFromDeck().getFront();
            icon6.setImage(icon6.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
            JLabel picLabel6 = new JLabel(icon6);
            picLabel3.setSize(150, 300);
            picLabel3.setLocation(600, 600);
            picLabel4.setSize(150, 300);
            picLabel4.setLocation(600, 200);
            picLabel5.setSize(150, 300);
            picLabel5.setLocation(650, 550);
            picLabel6.setSize(150, 300);
            picLabel6.setLocation(650, 200);






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
            ImageIcon hitIcon = new ImageIcon("Images/hit.png");
            hitIcon.setImage(hitIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
            JButton hitButton = new JButton(hitIcon);
            hitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ImageIcon hitCardIcon = deck.drawFromDeck().getFront();
                    hitCardIcon.setImage(hitCardIcon.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                    JLabel hitLabel = new JLabel(hitCardIcon);
                    hitLabel.setLocation((650 + (50 * extra[0])), (550 + (50 * extra[0])));
                    hitLabel.setSize(150, 300);
                    frame.add(hitLabel);
                    extra[0] = extra[0] + 1;
                }
            });
            ImageIcon standIcon = new ImageIcon("Images/stand.png");
            standIcon.setImage(standIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
            JButton standButton = new JButton(standIcon);
            standButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            hitButton.setSize(200, 200);
            hitButton.setLocation(300, 600);
            standButton.setSize(200, 200);
            standButton.setLocation(1000, 600);





            //Idea
        /*
For the hit button make a switch for the location.
Use an int variable that when it equals a certain number, it sets the location where it stops
         */

            panel.add(picLabel);
            panel.add(picLabel1);
            panel.add(picLabel2);
            frame.add(hitButton);
            frame.add(picLabel5);
            frame.add(picLabel3);
            frame.add(picLabel6);
            frame.add(picLabel4);

            frame.add(standButton);

            frame.add(panel);
            frame.setVisible(true);

/*
Add an option pane to tell if you won or not and if they want to play again
 */



    }
}