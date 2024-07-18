package colorcoder;

import java.util.List;

public class ColorUtility {

    private static final int NUMBER_OF_MINOR_COLORS = MinorColor.getColors().size();

    static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        int numberOfMinorColors = MinorColor.MinorColors.values().length;
        MajorColor majorColor = (MajorColor) getColorFromList(MajorColor.getColors(), zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor = (MinorColor) getColorFromList(MinorColor.getColors(), zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }

    // gets the color from the list using the index else returns null
    private static Color getColorFromList(List<Color> colors, int index) {
        return colors.stream().filter(color -> color.getIndex() == index).findFirst().orElse(null);
    }

    static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
    }
}
