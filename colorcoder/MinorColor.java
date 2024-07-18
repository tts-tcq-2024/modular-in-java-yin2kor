package colorcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinorColor extends Color {


    private static final HashMap<MinorColors, Color> sColors =
            new HashMap<>() {{
                put(MinorColors.BLUE, new MinorColor(0, "Blue"));
                put(MinorColors.ORANGE, new MinorColor(1, "Orange"));
                put(MinorColors.GREEN, new MinorColor(2, "Green"));
                put(MinorColors.BROWN, new MinorColor(3, "Brown"));
                put(MinorColors.SLATE, new MinorColor(4, "Slate"));
            }};

    public enum MinorColors {
        BLUE,
        ORANGE,
        GREEN,
        BROWN,
        SLATE
    }

    private MinorColor(int index, String color) {
        super(index, color);
    }


    public static MinorColor getColor(MinorColors minorColors) {
        return (MinorColor) sColors.get(minorColors);
    }

    public static List<Color> getColors() {
        return sColors.values().stream().toList();
    }
}
