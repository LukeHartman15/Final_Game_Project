import javax.swing.*;

public class DeckOfCards {

    private Cards[] deck;

    public DeckOfCards(){
        Cards[] spare = new Cards[52];

        spare[0] = new Cards(1, (new ImageIcon("Images/deckOfCards/AC.png")));
        spare[1] = new Cards(2, (new ImageIcon("Images/deckOfCards/2C.png")));
        spare[2] = new Cards(3, (new ImageIcon("Images/deckOfCards/3C.png")));
        spare[3] = new Cards(4, (new ImageIcon("Images/deckOfCards/4C.png")));
        spare[4] = new Cards(5, (new ImageIcon("Images/deckOfCards/5C.png")));
        spare[5] = new Cards(6, (new ImageIcon("Images/deckOfCards/6C.png")));
        spare[6] = new Cards(7, (new ImageIcon("Images/deckOfCards/7C.png")));
        spare[7] = new Cards(8, (new ImageIcon("Images/deckOfCards/8C.png")));
        spare[8] = new Cards(9, (new ImageIcon("Images/deckOfCards/9C.png")));
        spare[9] = new Cards(10, (new ImageIcon("Images/deckOfCards/10C.png")));
        spare[10] = new Cards(10, (new ImageIcon("Images/deckOfCards/JC.png")));
        spare[11] = new Cards(10, (new ImageIcon("Images/deckOfCards/QC.png")));
        spare[12] = new Cards(10, (new ImageIcon("Images/deckOfCards/KC.png")));

        spare[13] = new Cards(1, (new ImageIcon("Images/deckOfCards/AD.png")));
        spare[14] = new Cards(2, (new ImageIcon("Images/deckOfCards/2D.png")));
        spare[15] = new Cards(3, (new ImageIcon("Images/deckOfCards/3D.png")));
        spare[16] = new Cards(4, (new ImageIcon("Images/deckOfCards/4D.png")));
        spare[17] = new Cards(5, (new ImageIcon("Images/deckOfCards/5D.png")));
        spare[18] = new Cards(6, (new ImageIcon("Images/deckOfCards/6D.png")));
        spare[19] = new Cards(7, (new ImageIcon("Images/deckOfCards/7D.png")));
        spare[20] = new Cards(8, (new ImageIcon("Images/deckOfCards/8D.png")));
        spare[21] = new Cards(9, (new ImageIcon("Images/deckOfCards/9D.png")));
        spare[22] = new Cards(10, (new ImageIcon("Images/deckOfCards/10D.png")));
        spare[23] = new Cards(10, (new ImageIcon("Images/deckOfCards/JD.png")));
        spare[24] = new Cards(10, (new ImageIcon("Images/deckOfCards/QD.png")));
        spare[25] = new Cards(10, (new ImageIcon("Images/deckOfCards/KD.png")));

        spare[26] = new Cards(1, (new ImageIcon("Images/deckOfCards/AH.png")));
        spare[27] = new Cards(2, (new ImageIcon("Images/deckOfCards/2H.png")));
        spare[28] = new Cards(3, (new ImageIcon("Images/deckOfCards/3H.png")));
        spare[29] = new Cards(4, (new ImageIcon("Images/deckOfCards/4H.png")));
        spare[30] = new Cards(5, (new ImageIcon("Images/deckOfCards/5H.png")));
        spare[31] = new Cards(6, (new ImageIcon("Images/deckOfCards/6H.png")));
        spare[32] = new Cards(7, (new ImageIcon("Images/deckOfCards/7H.png")));
        spare[33] = new Cards(8, (new ImageIcon("Images/deckOfCards/8H.png")));
        spare[34] = new Cards(9, (new ImageIcon("Images/deckOfCards/9H.png")));
        spare[35] = new Cards(10, (new ImageIcon("Images/deckOfCards/10H.png")));
        spare[36] = new Cards(10, (new ImageIcon("Images/deckOfCards/JH.png")));
        spare[37] = new Cards(10, (new ImageIcon("Images/deckOfCards/QH.png")));
        spare[38] = new Cards(10, (new ImageIcon("Images/deckOfCards/KH.png")));

        spare[39] = new Cards(1, (new ImageIcon("Images/deckOfCards/AS.png")));
        spare[40] = new Cards(2, (new ImageIcon("Images/deckOfCards/2S.png")));
        spare[41] = new Cards(3, (new ImageIcon("Images/deckOfCards/3S.png")));
        spare[42] = new Cards(4, (new ImageIcon("Images/deckOfCards/4S.png")));
        spare[43] = new Cards(5, (new ImageIcon("Images/deckOfCards/5S.png")));
        spare[44] = new Cards(6, (new ImageIcon("Images/deckOfCards/6S.png")));
        spare[45] = new Cards(7, (new ImageIcon("Images/deckOfCards/7S.png")));
        spare[46] = new Cards(8, (new ImageIcon("Images/deckOfCards/8S.png")));
        spare[47] = new Cards(9, (new ImageIcon("Images/deckOfCards/9S.png")));
        spare[48] = new Cards(10, (new ImageIcon("Images/deckOfCards/10S.png")));
        spare[49] = new Cards(10, (new ImageIcon("Images/deckOfCards/JS.png")));
        spare[50] = new Cards(10, (new ImageIcon("Images/deckOfCards/QS.png")));
        spare[51] = new Cards(10, (new ImageIcon("Images/deckOfCards/KS.png")));

        deck = spare;
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
        for (int i = 0, j = 0; i < spareDeck.length; i++, j++){
            if (deck[i] != null){

            }
        }
        return temp;
    }

}
