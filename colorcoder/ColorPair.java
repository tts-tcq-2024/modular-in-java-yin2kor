package colorcoder;

public class ColorPair {
    private final MajorColor majorColor;
    private final MinorColor minorColor;

    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public Color getMajor() {
        return majorColor;
    }
    public Color getMinor() {
        return minorColor;
    }
    String ToString() {
        String colorPairStr = majorColor.getString();
        colorPairStr += " ";
        colorPairStr += minorColor.getString();
        return colorPairStr;
    }

};

