import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {
    @Test
    public void shouldReturnTrueWhenCompareTwoEqualLengthInFeetAndInches() {
        Measurement twelveInch = Measurement.inch(12);
        Measurement oneFeet = Measurement.feet(1);

        assertEquals(oneFeet,twelveInch);
    }

    @Test
    public void shouldReturnFalseWhenCompareTwoUnEqualLengthInFeetAndInches() {
        Measurement twelveInch = Measurement.inch(12);
        Measurement oneFeet = Measurement.feet(2);

        assertNotEquals(oneFeet,twelveInch);
    }

    @Test
    public void shouldReturnTrueWhenCompareTwoEqualLengthInCentimeterAndInches() {
        Measurement twoInch = Measurement.inch(2);
        Measurement fiveCentimeter = Measurement.centimeter(5);

        assertEquals(fiveCentimeter,twoInch);
    }

    @Test
    public void returnTrueWhenTwoEqualVolumeInGallonAndLiterIsGiven() {
        Measurement oneGallon = Measurement.gallon(1);
        Measurement threePointSevenEightLiter = Measurement.liter(3.78);

        assertEquals(oneGallon,threePointSevenEightLiter);
    }

    @Test
    public void expectExceptionWhenTwoDifferentTypesCompared() {
        Measurement twelveInch = Measurement.inch(12);
        Measurement oneGallon = Measurement.gallon(1);

        assertNotEquals(twelveInch,oneGallon);
    }
}
