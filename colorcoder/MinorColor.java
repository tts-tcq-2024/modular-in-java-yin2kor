package colorcoder;

public enum MinorColor implements IColor{
    BLUE(0, "Blue"),
    ORANGE(1, "Orange"),
    GREEN(2, "Green"),
    BROWN(3, "Brown"),
    SLATE(4, "Slate");
    private final int index;
    private final String color;

    MinorColor(int index, String color) {
        this.index = index;
        this.color = color;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getString() {
        return color;
    }

    public static MinorColor getColorFromIndex(int index) {
        MinorColor selectedColor = null;
        for (MinorColor color : MinorColor.values()) {
            if (color.getIndex() == index) {
                selectedColor = color;
                break;
            }
        }
        return selectedColor;
    }
}
