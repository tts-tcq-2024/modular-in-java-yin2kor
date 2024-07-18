package colorcoder;


public abstract class Color {

    private final int index;
    private final String color;

    Color(int index, String color) {
        this.index = index;
        this.color = color;
    }
    public int getIndex() {
        return index;
    }

    public String getString() {
        return color;
    }
}
