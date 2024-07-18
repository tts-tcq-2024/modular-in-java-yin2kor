package colorcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MajorColor extends Color {
    private static final HashMap<MajorColors, Color> sColors =
            new HashMap<>() {{
                put(MajorColors.WHITE, new MajorColor(0, "White"));
                put(MajorColors.BLACK, new MajorColor(1, "Black"));
                put(MajorColors.YELLOW, new MajorColor(2, "Yellow"));
                put(MajorColors.VIOLET, new MajorColor(3, "Violet"));
            }};

    public enum MajorColors {
        WHITE,
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
        return sColors.values().stream().toList();
    }

}
