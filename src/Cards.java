import javax.swing.*;

public class Cards {
    private int value;
    private ImageIcon cardImage;
    private ImageIcon backOfCard;

    public Cards(int x, ImageIcon y){
        value = x;
        cardImage = y;
        backOfCard = new ImageIcon("Images/deckOfCards/backOfCard.png");
    }

    public ImageIcon getFront(){
        return cardImage;
    }

    public ImageIcon getBack(){
        return backOfCard;
    }

    public int getValue(){
        return value;
    }

}
