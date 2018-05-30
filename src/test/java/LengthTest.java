import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {
    @Test
    public void shouldReturnTrueWhenCompareTwoEqualLengthInFeetAndInches() {
        Length twelveInch = Length.inch(12);
        Length oneFeet = Length.feet(1);

        assertEquals(oneFeet,twelveInch);
    }

    @Test
    public void shouldReturnFalseWhenCompareTwoUnEqualLengthInFeetAndInches() {
        Length twelveInch = Length.inch(12);
        Length oneFeet = Length.feet(2);

        assertNotEquals(oneFeet,twelveInch);
    }

    @Test
    public void shouldReturnTrueWhenCompareTwoEqualLengthInCentimeterAndInches() {
        Length twoInch = Length.inch(2);
        Length fiveCentimeter = Length.centimeter(5);

        assertEquals(fiveCentimeter,twoInch);
    }
}
