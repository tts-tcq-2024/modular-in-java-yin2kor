package colorcoder;

public class ColorPair {
    private final MajorColor majorColor;
    private final MinorColor minorColor;
    private static final int numberOfMinorColors = MinorColor.values().length;

    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    String ToString() {
        String colorPairStr = majorColor.getString();
        colorPairStr += " ";
        colorPairStr += minorColor.getString();
        return colorPairStr;
    }
    static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor =
                MajorColor.getColorFromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor =
                MinorColor.getColorFromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }
};

