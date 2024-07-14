package colorcoder;
public enum MajorColor implements IColor {
    WHITE(0, "White"),
    RED(1, "Red"),
    BLACK(2, "Black"),
    YELLOW(3, "Yellow"),
    VIOLET(4, "Violet");
    private final int index;
    private final String color;

    MajorColor(int index, String color) {
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


    public static MajorColor getColorFromIndex(int index) {
        MajorColor selectedColor = null;
        for (MajorColor color : MajorColor.values()) {
            if (color.getIndex() == index) {
                selectedColor = color;
                break;
            }
        }
        return selectedColor;
    }
}
