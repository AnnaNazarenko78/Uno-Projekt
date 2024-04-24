
public class NumberCard extends UnoCard {
    private int value;
// Constructor
    public NumberCard(Color color, int value) {
        super(color);
        this.value = value;
    }


    //Getter
    public int getValue() {
        return value;
    }

    @Override
    public void play() {
        // Логика для игры карты с числом
    }

    @Override
    public String toString() {
        return "NumberCard " +
                "color=" + color +
                ", value=" + value;
    }
}

