import javax.swing.*;

public class DeckOfCards {

    private Cards[] deck = new Cards[52];

    public DeckOfCards(){


        deck[0] = new Cards(1, (new ImageIcon("Images/deckOfCards/AC.png")));
        deck[1] = new Cards(2, (new ImageIcon("Images/deckOfCards/2C.png")));
        deck[2] = new Cards(3, (new ImageIcon("Images/deckOfCards/3C.png")));
        deck[3] = new Cards(4, (new ImageIcon("Images/deckOfCards/4C.png")));
        deck[4] = new Cards(5, (new ImageIcon("Images/deckOfCards/5C.png")));
        deck[5] = new Cards(6, (new ImageIcon("Images/deckOfCards/6C.png")));
        deck[6] = new Cards(7, (new ImageIcon("Images/deckOfCards/7C.png")));
        deck[7] = new Cards(8, (new ImageIcon("Images/deckOfCards/8C.png")));
        deck[8] = new Cards(9, (new ImageIcon("Images/deckOfCards/9C.png")));
        deck[9] = new Cards(10, (new ImageIcon("Images/deckOfCards/10C.png")));
        deck[10] = new Cards(10, (new ImageIcon("Images/deckOfCards/JC.png")));
        deck[11] = new Cards(10, (new ImageIcon("Images/deckOfCards/QC.png")));
        deck[12] = new Cards(10, (new ImageIcon("Images/deckOfCards/KC.png")));

        deck[13] = new Cards(1, (new ImageIcon("Images/deckOfCards/AD.png")));
        deck[14] = new Cards(2, (new ImageIcon("Images/deckOfCards/2D.png")));
        deck[15] = new Cards(3, (new ImageIcon("Images/deckOfCards/3D.png")));
        deck[16] = new Cards(4, (new ImageIcon("Images/deckOfCards/4D.png")));
        deck[17] = new Cards(5, (new ImageIcon("Images/deckOfCards/5D.png")));
        deck[18] = new Cards(6, (new ImageIcon("Images/deckOfCards/6D.png")));
        deck[19] = new Cards(7, (new ImageIcon("Images/deckOfCards/7D.png")));
        deck[20] = new Cards(8, (new ImageIcon("Images/deckOfCards/8D.png")));
        deck[21] = new Cards(9, (new ImageIcon("Images/deckOfCards/9D.png")));
        deck[22] = new Cards(10, (new ImageIcon("Images/deckOfCards/10D.png")));
        deck[23] = new Cards(10, (new ImageIcon("Images/deckOfCards/JD.png")));
        deck[24] = new Cards(10, (new ImageIcon("Images/deckOfCards/QD.png")));
        deck[25] = new Cards(10, (new ImageIcon("Images/deckOfCards/KD.png")));

        deck[26] = new Cards(1, (new ImageIcon("Images/deckOfCards/AH.png")));
        deck[27] = new Cards(2, (new ImageIcon("Images/deckOfCards/2H.png")));
        deck[28] = new Cards(3, (new ImageIcon("Images/deckOfCards/3H.png")));
        deck[29] = new Cards(4, (new ImageIcon("Images/deckOfCards/4H.png")));
        deck[30] = new Cards(5, (new ImageIcon("Images/deckOfCards/5H.png")));
        deck[31] = new Cards(6, (new ImageIcon("Images/deckOfCards/6H.png")));
        deck[32] = new Cards(7, (new ImageIcon("Images/deckOfCards/7H.png")));
        deck[33] = new Cards(8, (new ImageIcon("Images/deckOfCards/8H.png")));
        deck[34] = new Cards(9, (new ImageIcon("Images/deckOfCards/9H.png")));
        deck[35] = new Cards(10, (new ImageIcon("Images/deckOfCards/10H.png")));
        deck[36] = new Cards(10, (new ImageIcon("Images/deckOfCards/JH.png")));
        deck[37] = new Cards(10, (new ImageIcon("Images/deckOfCards/QH.png")));
        deck[38] = new Cards(10, (new ImageIcon("Images/deckOfCards/KH.png")));

        deck[39] = new Cards(1, (new ImageIcon("Images/deckOfCards/AS.png")));
        deck[40] = new Cards(2, (new ImageIcon("Images/deckOfCards/2S.png")));
        deck[41] = new Cards(3, (new ImageIcon("Images/deckOfCards/3S.png")));
        deck[42] = new Cards(4, (new ImageIcon("Images/deckOfCards/4S.png")));
        deck[43] = new Cards(5, (new ImageIcon("Images/deckOfCards/5S.png")));
        deck[44] = new Cards(6, (new ImageIcon("Images/deckOfCards/6S.png")));
        deck[45] = new Cards(7, (new ImageIcon("Images/deckOfCards/7S.png")));
        deck[46] = new Cards(8, (new ImageIcon("Images/deckOfCards/8S.png")));
        deck[47] = new Cards(9, (new ImageIcon("Images/deckOfCards/9S.png")));
        deck[48] = new Cards(10, (new ImageIcon("Images/deckOfCards/10S.png")));
        deck[49] = new Cards(10, (new ImageIcon("Images/deckOfCards/JS.png")));
        deck[50] = new Cards(10, (new ImageIcon("Images/deckOfCards/QS.png")));
        deck[51] = new Cards(10, (new ImageIcon("Images/deckOfCards/KS.png")));

    }

    public void shuffle(){

        int goat = 0;
        for(int i = 0; i < deck.length; i++){
            if(deck[i] != null){
                goat++;
            }
        }
        Cards[] deckOfCards2 = new Cards[goat];
        for (int i = 0; i < goat; i++){
            int j = (int)(Math.random() * goat);
            while (deckOfCards2[j] != null){
                j = (int)(Math.random() * goat);
            }
            deckOfCards2[j] = deck[i];

        }
        deck = deckOfCards2;

    }


    public Cards drawFromDeck(){
        int rand = (int)(Math.random()*(deck.length));
        Cards temp = deck[rand];
        deck[rand] = null;
        Cards[] spareDeck = new Cards[deck.length - 1];
        for (int i = 0, j = 0; j < spareDeck.length; i++, j++){
            if (i == rand){
           i++;
            }
            spareDeck[j] = deck[i];
        }
        deck = spareDeck;


        return temp;
    }

}
