import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {

    static Scanner scanner1 = new Scanner(System.in);
    protected String name;
    List<Deck> cardInHand;

    public Player(String name) {
        this.name = name;
        this.cardInHand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public static  void inputName() {
        int counterName=0;
        while (counterName < 4) {
            System.out.println("Please type your name: ");
            String playerName = scanner1.next();
            counterName++;
            System.out.println("Welcome Player Nr"+counterName +" "+playerName);
        }
    }

    public int getNumberOfCards() {
        return cardInHand.size();
    }

        // add.cardInHand
        public static void addCardInHand(){
            Deck deck = new Deck();
            Random random = new Random();// Annahme, dass du ein Deck-Objekt erstellst
            //    Извлекаем и выводим первые 7 карт из колоды
            System.out.println("Drawing 7 cards:");
            for (int i = 0; i < 7; i++) {
                int randomIndex = random.nextInt(1,108);
                UnoCard card = deck.drawCard();
                System.out.println("Drawn card: " + card);
            }


        }

}
