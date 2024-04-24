public abstract class UnoCard {
    protected Color color;


      // Construktor
    public UnoCard(Color color) {
        this.color = color;
    }

    //Getter
    public Color getColor() {
        return color;
    }

    //methode Play
    public abstract void play();
}