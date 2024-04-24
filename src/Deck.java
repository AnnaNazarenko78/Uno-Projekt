
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<UnoCard> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() { //Створити колоду
        for (Color color : Color.values()) {

            cards.add(new NumberCard(color, 0));

            for (int i = 1; i <= 9; i++) {
                cards.add(new NumberCard(color, i));
                cards.add(new NumberCard(color, i));

            }
            for (int special = 0; special < 2; special++) {
                cards.add(new SpecialCard(color, SpecialCardType.SKIP));
                cards.add(new SpecialCard(color, SpecialCardType.REVERSE));
                cards.add(new SpecialCard(color, SpecialCardType.DRAW_TWO));
            }

        }
        // добавляем специальные карты без цвета
        for (int w = 0; w < 4; w++) {
            cards.add(new SpecialCard(null, SpecialCardType.WILD));
            cards.add(new SpecialCard(null, SpecialCardType.WILD_DRAW_FOUR));

        }

        // тщательное перемешивание колоды
//        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public UnoCard drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("The deck is empty");
        }
        return cards.remove(0);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public String toString() {
        int counter = 1;
        String returnString = null;
        for (UnoCard x : cards) {

            System.out.println("card #" + counter + " " + x);

            counter++;
        }
        return "End";
    }
}