package colorcoder;

import java.util.*;

public class MajorColor extends Color {
    private static final HashMap<MajorColors, Color> sColors =
            new LinkedHashMap<MajorColors, Color>() {{
                put(MajorColors.WHITE, new MajorColor(0, "White"));
                put(MajorColors.RED, new MajorColor(1, "Red"));
                put(MajorColors.BLACK, new MajorColor(2, "Black"));
                put(MajorColors.YELLOW, new MajorColor(3, "Yellow"));
                put(MajorColors.VIOLET, new MajorColor(4, "Violet"));
            }};

    public enum MajorColors {
        WHITE,
        RED,
        BLACK,
        YELLOW,
        VIOLET
    }

    private MajorColor(int index, String color) {
        super(index, color);
    }

    public static MajorColor getColor(MajorColors majorColor) {
        return (MajorColor) sColors.get(majorColor);
    }

    public static List<Color> getColors() {
        return new ArrayList<>(sColors.values());
    }

}
