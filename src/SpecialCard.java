public class SpecialCard extends UnoCard {
    private SpecialCardType specialCardType;

    public SpecialCard(Color color, SpecialCardType specialCardType) {
        super(color);
        this.specialCardType = specialCardType;
    }

    public SpecialCardType getSpecialCardType() {
        return specialCardType;
    }

    @Override
    public void play() {
        // Логика для игры специальной карты
    }

    @Override
    public String toString() {
        return "SpecialCard " +
                "color=" + color +
                ", specialCardType=" + specialCardType ;
    }
}