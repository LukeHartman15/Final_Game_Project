import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.util.ArrayList;
import java.lang.*;


public class Main extends JPanel{

    public static void main(String[] args) {
        JFrame frame = new JFrame("BlackJack");
        boolean[] playAgain = new boolean[1];
        playAgain[0] = true;
        frame.setSize(1500, 1000);
        frame.setVisible(true);
        while (playAgain[0]) {
            String[] resultText = new String[1];
            resultText[0] = "";
            boolean[] play = new boolean[1];
            boolean[] win = new boolean[1];
            play[0] = true;


            frame.setBackground(new Color(9, 138, 0));


            ArrayList<JLabel> hitTempLabel = new ArrayList<JLabel>();
            ArrayList<JLabel> dealerTempLabel = new ArrayList<JLabel>();
            ArrayList<java.lang.Integer> playerValue = new ArrayList<Integer>();
            ArrayList<java.lang.Integer> dealerValue = new ArrayList<Integer>();


            int newXLoc = 0;
            int newYLoc = 0;
            int[] extra = new int[2];

            int hitNum = 1;
            extra[0] = hitNum;
            extra[1] = hitNum;
            DeckOfCards deck = new DeckOfCards();


            Cards tempIcon3Card = deck.drawFromDeck();
            int tempIcon3Val = tempIcon3Card.getValue();
            ImageIcon icon3 = tempIcon3Card.getFront();
            icon3.setImage(icon3.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
            JLabel picLabel3 = new JLabel(icon3);
            Cards tempIcon4Card = deck.drawFromDeck();
            int tempIcon4Val = tempIcon4Card.getValue();
            ImageIcon temp = tempIcon4Card.getFront();
            temp.setImage(temp.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
            ImageIcon icon4 = new ImageIcon("Images/deckOfCards/backOfCard.png");
            icon4.setImage(icon4.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
            JLabel picLabel4 = new JLabel(icon4);
            Cards tempIcon5Card = deck.drawFromDeck();
            int tempIcon5Val = tempIcon5Card.getValue();
            ImageIcon icon5 = tempIcon5Card.getFront();
            icon5.setImage(icon5.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
            JLabel picLabel5 = new JLabel(icon5);
            Cards tempIcon6Card = deck.drawFromDeck();
            int tempIcon6Val = tempIcon6Card.getValue();
            ImageIcon icon6 = tempIcon6Card.getFront();
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


            //Preset the hit images to blanks with positions and sizes
            //Then make the image visible in the button
            hitTempLabel.add(new JLabel());

            for (int i = 1; i < 20; i++) {
                hitTempLabel.add(new JLabel());
                hitTempLabel.get(i).setSize(150, 300);
                hitTempLabel.get(i).setLocation((650 + (50 * extra[0])), (550 - (50 * extra[0])));
                frame.add(hitTempLabel.get(i));
                extra[0]++;
            }

            dealerTempLabel.add(new JLabel());
            for (int i = 1; i < 10; i++) {
                dealerTempLabel.add(new JLabel());
                dealerTempLabel.get(i).setSize(150, 300);
                dealerTempLabel.get(i).setLocation((650 + (50 * i)), (200 - (50 * i)));
                frame.add(dealerTempLabel.get(i));
                extra[1]++;
            }


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

            ImageIcon standIcon = new ImageIcon("Images/stand.png");
            standIcon.setImage(standIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
            JButton standButton = new JButton(standIcon);
            dealerValue.add(tempIcon4Val);
            dealerValue.add(tempIcon6Val);

            extra[1] = 1;
            standButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (play[0]) {

                        play[0] = false;


                        icon4.setImage(temp.getImage());
                        frame.repaint();

                        while (getTotalValue(dealerValue) < 17) {

                            frame.repaint();
                           try {
                               wait(100);
                           } catch(Exception p){
                               System.out.println(p);
                           }

                            Cards cpuTempCard = deck.drawFromDeck();
                            int cpuTempVal = cpuTempCard.getValue();
                            ImageIcon cpuTempIcon = cpuTempCard.getFront();
                            cpuTempIcon.setImage(cpuTempIcon.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                            dealerTempLabel.get(extra[1]).setIcon(cpuTempIcon);

                            dealerValue.add(cpuTempVal);


                            dealerTempLabel.get(extra[1]).setSize(150, 300);

                            dealerTempLabel.get(extra[1]).setLocation((650 + (50 * extra[1])), (200 - (50 * extra[1])));


                            extra[1]++;


                            frame.repaint();
                        }

                        if (!play[0]) {

                            int blah = JOptionPane.showConfirmDialog(null, "Play Again?");


                            if (blah == JOptionPane.YES_OPTION) {
                                String[] resultText = new String[1];
                                resultText[0] = "";
                                boolean[] play = new boolean[1];
                                boolean[] win = new boolean[1];
                                play[0] = true;


                                frame.setBackground(new Color(9, 138, 0));


                                ArrayList<JLabel> hitTempLabel = new ArrayList<JLabel>();
                                ArrayList<JLabel> dealerTempLabel = new ArrayList<JLabel>();
                                ArrayList<java.lang.Integer> playerValue = new ArrayList<Integer>();
                                ArrayList<java.lang.Integer> dealerValue = new ArrayList<Integer>();


                                int newXLoc = 0;
                                int newYLoc = 0;
                                int[] extra = new int[2];

                                int hitNum = 1;
                                extra[0] = hitNum;
                                extra[1] = hitNum;
                                DeckOfCards deck = new DeckOfCards();


                                Cards tempIcon3Card = deck.drawFromDeck();
                                int tempIcon3Val = tempIcon3Card.getValue();
                                ImageIcon icon3 = tempIcon3Card.getFront();
                                icon3.setImage(icon3.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                                JLabel picLabel3 = new JLabel(icon3);
                                Cards tempIcon4Card = deck.drawFromDeck();
                                int tempIcon4Val = tempIcon4Card.getValue();
                                ImageIcon temp = tempIcon4Card.getFront();
                                temp.setImage(temp.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                                ImageIcon icon4 = new ImageIcon("Images/deckOfCards/backOfCard.png");
                                icon4.setImage(icon4.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                                JLabel picLabel4 = new JLabel(icon4);
                                Cards tempIcon5Card = deck.drawFromDeck();
                                int tempIcon5Val = tempIcon5Card.getValue();
                                ImageIcon icon5 = tempIcon5Card.getFront();
                                icon5.setImage(icon5.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                                JLabel picLabel5 = new JLabel(icon5);
                                Cards tempIcon6Card = deck.drawFromDeck();
                                int tempIcon6Val = tempIcon6Card.getValue();
                                ImageIcon icon6 = tempIcon6Card.getFront();
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


                                //Preset the hit images to blanks with positions and sizes
                                //Then make the image visible in the button
                                hitTempLabel.add(new JLabel());

                                for (int i = 1; i < 20; i++) {
                                    hitTempLabel.add(new JLabel());
                                    hitTempLabel.get(i).setSize(150, 300);
                                    hitTempLabel.get(i).setLocation((650 + (50 * extra[0])), (550 - (50 * extra[0])));
                                    frame.add(hitTempLabel.get(i));
                                    extra[0]++;
                                }

                                dealerTempLabel.add(new JLabel());
                                for (int i = 1; i < 10; i++) {
                                    dealerTempLabel.add(new JLabel());
                                    dealerTempLabel.get(i).setSize(150, 300);
                                    dealerTempLabel.get(i).setLocation((650 + (50 * i)), (200 - (50 * i)));
                                    frame.add(dealerTempLabel.get(i));
                                    extra[1]++;
                                }


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

                                ImageIcon standIcon = new ImageIcon("Images/stand.png");
                                standIcon.setImage(standIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
                                JButton standButton = new JButton(standIcon);
                                dealerValue.add(tempIcon4Val);
                                dealerValue.add(tempIcon6Val);

                                extra[1] = 1;
                                frame.repaint();
                            }
                            if (blah == JOptionPane.NO_OPTION) {

                            }


                        }
                    }
                }
            });
            hitButton.setSize(200, 200);
            hitButton.setLocation(300, 600);
            standButton.setSize(200, 200);
            standButton.setLocation(1000, 600);


            extra[0] = 1;
            playerValue.add(tempIcon3Val);
            playerValue.add(tempIcon5Val);
            if (getTotalValue(playerValue) == 21) {
                if (getTotalValue(dealerValue) == 21) {
                    win[0] = false;
                    resultText[0] = "Draw!";
                } else {
                    win[0] = true;
                    resultText[0] = "Blackjack! You Win!";
                }
            }
            hitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (play[0]) {
                        Cards tempCard = deck.drawFromDeck();
                        int tempVal = tempCard.getValue();
                        ImageIcon tempIcon = tempCard.getFront();
                        tempIcon.setImage(tempIcon.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                        hitTempLabel.get(extra[0]).setIcon(tempIcon);

                        playerValue.add(tempVal);


                        hitTempLabel.get(extra[0]).setSize(150, 300);

                        hitTempLabel.get(extra[0]).setLocation((650 + (50 * extra[0])), (550 - (50 * extra[0])));

                        extra[0]++;
                        if (getTotalValue(playerValue) > 21) {
                            icon4.setImage(temp.getImage());
                            win[0] = false;
                            resultText[0] = "Busted! You Lose.";
                            play[0] = false;
                            frame.repaint();
                        }

                        frame.repaint();

//
//
//
                    }
                    if (!play[0]) {

                        int blah = JOptionPane.showConfirmDialog(null, "Play Again?");


                        if (blah == JOptionPane.YES_OPTION) {
                            playAgain[0] = true;
                            String[] resultText = new String[1];
                            resultText[0] = "";
                            boolean[] play = new boolean[1];
                            boolean[] win = new boolean[1];
                            play[0] = true;


                            frame.setBackground(new Color(9, 138, 0));


                            ArrayList<JLabel> hitTempLabel = new ArrayList<JLabel>();
                            ArrayList<JLabel> dealerTempLabel = new ArrayList<JLabel>();
                            ArrayList<java.lang.Integer> playerValue = new ArrayList<Integer>();
                            ArrayList<java.lang.Integer> dealerValue = new ArrayList<Integer>();


                            int newXLoc = 0;
                            int newYLoc = 0;
                            int[] extra = new int[2];

                            int hitNum = 1;
                            extra[0] = hitNum;
                            extra[1] = hitNum;
                            DeckOfCards deck = new DeckOfCards();


                            Cards tempIcon3Card = deck.drawFromDeck();
                            int tempIcon3Val = tempIcon3Card.getValue();
                            ImageIcon icon3 = tempIcon3Card.getFront();
                            icon3.setImage(icon3.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                            JLabel picLabel3 = new JLabel(icon3);
                            Cards tempIcon4Card = deck.drawFromDeck();
                            int tempIcon4Val = tempIcon4Card.getValue();
                            ImageIcon temp = tempIcon4Card.getFront();
                            temp.setImage(temp.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                            ImageIcon icon4 = new ImageIcon("Images/deckOfCards/backOfCard.png");
                            icon4.setImage(icon4.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                            JLabel picLabel4 = new JLabel(icon4);
                            Cards tempIcon5Card = deck.drawFromDeck();
                            int tempIcon5Val = tempIcon5Card.getValue();
                            ImageIcon icon5 = tempIcon5Card.getFront();
                            icon5.setImage(icon5.getImage().getScaledInstance(100, 200, Image.SCALE_DEFAULT));
                            JLabel picLabel5 = new JLabel(icon5);
                            Cards tempIcon6Card = deck.drawFromDeck();
                            int tempIcon6Val = tempIcon6Card.getValue();
                            ImageIcon icon6 = tempIcon6Card.getFront();
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


                            //Preset the hit images to blanks with positions and sizes
                            //Then make the image visible in the button
                            hitTempLabel.add(new JLabel());

                            for (int i = 1; i < 20; i++) {
                                hitTempLabel.add(new JLabel());
                                hitTempLabel.get(i).setSize(150, 300);
                                hitTempLabel.get(i).setLocation((650 + (50 * extra[0])), (550 - (50 * extra[0])));
                                frame.add(hitTempLabel.get(i));
                                extra[0]++;
                            }

                            dealerTempLabel.add(new JLabel());
                            for (int i = 1; i < 10; i++) {
                                dealerTempLabel.add(new JLabel());
                                dealerTempLabel.get(i).setSize(150, 300);
                                dealerTempLabel.get(i).setLocation((650 + (50 * i)), (200 - (50 * i)));
                                frame.add(dealerTempLabel.get(i));
                                extra[1]++;
                            }


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

                            ImageIcon standIcon = new ImageIcon("Images/stand.png");
                            standIcon.setImage(standIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
                            JButton standButton = new JButton(standIcon);
                            dealerValue.add(tempIcon4Val);
                            dealerValue.add(tempIcon6Val);

                            extra[1] = 1;
                            panel.add(picLabel);
                            panel.add(picLabel1);
                            panel.add(picLabel2);
                            frame.add(hitButton);
                            frame.add(picLabel5);
                            frame.add(picLabel3);
                            frame.add(picLabel6);
                            frame.add(picLabel4);
                            frame.repaint();

                        }
                        if (blah == JOptionPane.NO_OPTION) {
                            playAgain[0] = false;
                        }


                    }

                    frame.repaint();
                }
            });

            frame.repaint();


            panel.add(picLabel);
            panel.add(picLabel1);
            panel.add(picLabel2);
            frame.add(hitButton);
            frame.add(picLabel5);
            frame.add(picLabel3);
            frame.add(picLabel6);
            frame.add(picLabel4);


            frame.repaint();
            frame.add(standButton);

            frame.add(panel);


        }

/*
Add an option pane to tell if you won or not and if they want to play again
 */





    }
    public void playGame(){

    }

    public static int getTotalValue(ArrayList<Integer> t){
        int total = 0;
        for (int x : t){

            total += x;
        }
        for (int x : t) {
        if (total > 21) {

                if (x == 11) {
                    total = total - 10;
                }

            }

        }
        return total;
    }
    public static int getAceValue(ArrayList<Integer> t, Cards j){
        if (getTotalValue(t) > 21){
            j.setValue(1);

        }
        return j.getValue();
    }

}