package colorcoder;

import java.sql.Statement;
import java.util.List;

public class ColorUtilityTest {

    static void testNumberToPair(int pairNumber,
                                 MajorColor expectedMajor,
                                 MinorColor expectedMinor) {
        ColorPair colorPair = ColorUtility.GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert (colorPair.getMajor() == expectedMajor);
        assert (colorPair.getMinor() == expectedMinor);
    }

    static void testPairToNumber(
            MajorColor major,
            MinorColor minor,
            int expectedPairNumber) {
        int pairNumber = ColorUtility.GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert (pairNumber == expectedPairNumber);
    }

    static void runColorUtilityTests()
    {
        testNumberToPair(4, MajorColor.getColor(MajorColor.MajorColors.WHITE), MinorColor.getColor(MinorColor.MinorColors.BROWN));
        testNumberToPair(5, MajorColor.getColor(MajorColor.MajorColors.WHITE), MinorColor.getColor(MinorColor.MinorColors.SLATE));
        testPairToNumber(MajorColor.getColor(MajorColor.MajorColors.BLACK), MinorColor.getColor(MinorColor.MinorColors.ORANGE), 12);
        testPairToNumber(MajorColor.getColor(MajorColor.MajorColors.VIOLET), MinorColor.getColor(MinorColor.MinorColors.SLATE), 25);
    }
}
