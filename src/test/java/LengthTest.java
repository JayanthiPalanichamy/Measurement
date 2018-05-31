import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {
    @Test
    public void shouldReturnTrueWhenCompareTwoEqualLengthInFeetAndInches() {
        AddableMeasurement twelveInch = AddableMeasurement.inch(12);
        AddableMeasurement oneFeet = AddableMeasurement.feet(1);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    public void shouldReturnFalseWhenCompareTwoUnEqualLengthInFeetAndInches() {
        AddableMeasurement twelveInch = AddableMeasurement.inch(12);
        AddableMeasurement oneFeet = AddableMeasurement.feet(2);

        assertNotEquals(oneFeet, twelveInch);
    }

    @Test
    public void shouldReturnTrueWhenCompareTwoEqualLengthInCentimeterAndInches() {
        AddableMeasurement twoInch = AddableMeasurement.inch(2);
        AddableMeasurement fiveCentimeter = AddableMeasurement.centimeter(5);

        assertEquals(fiveCentimeter, twoInch);
    }

    @Test
    public void returnTrueWhenTwoEqualVolumeInGallonAndLiterIsGiven() {
        AddableMeasurement oneGallon = AddableMeasurement.gallon(1);
        AddableMeasurement threePointSevenEightLiter = AddableMeasurement.liter(3.78);

        assertEquals(oneGallon, threePointSevenEightLiter);
    }

    @Test
    public void expectExceptionWhenTwoDifferentTypesCompared() {
        AddableMeasurement twelveInch = AddableMeasurement.inch(12);
        AddableMeasurement oneGallon = AddableMeasurement.gallon(1);

        assertNotEquals(twelveInch, oneGallon);
    }

    @Test
    public void returnFourInchWhenTwoLengthsAreTwoInches() {
        AddableMeasurement twoInch1 = AddableMeasurement.inch(2);
        AddableMeasurement twoInch2 = AddableMeasurement.inch(2);
        AddableMeasurement fourInch = AddableMeasurement.inch(4);

        assertEquals(fourInch, twoInch1.add(twoInch2));
    }

    @Test
    public void returnThreeInchWhenOneInchAndTwoInchIsAdded() {
        AddableMeasurement oneInch = AddableMeasurement.inch(1);
        AddableMeasurement twoInch = AddableMeasurement.inch(2);
        AddableMeasurement threeInch = AddableMeasurement.inch(3);

        assertEquals(threeInch, oneInch.add(twoInch));
    }

    @Test
    public void returnThreeInchWhenOneInchAndTwoPointFiveCMIsAdded() {
        AddableMeasurement twoInch = AddableMeasurement.inch(2);
        AddableMeasurement twoPointFiveCentimeter = AddableMeasurement.centimeter(2.5);
        AddableMeasurement threeInch = AddableMeasurement.inch(3);

        assertEquals(threeInch, twoInch.add(twoPointFiveCentimeter));
    }

    @Test
    public void returnFourPointSevenEightLiterWhenOneLiterAndOneGallonIsAdded() {
        AddableMeasurement oneLiter = AddableMeasurement.liter(1.0);
        AddableMeasurement oneGallon = AddableMeasurement.gallon(1.0);
        AddableMeasurement fourPointSevenEightLiter = AddableMeasurement.liter(4.779999999999999);

        assertEquals(fourPointSevenEightLiter, oneLiter.add(oneGallon));
    }

    @Test(expected = MeasurementTypeIncompatible.class)
    public void shouldThrowAnExceptionIfLengthAndVolumeIsAdded() {
        AddableMeasurement twoInch = AddableMeasurement.inch(2);
        AddableMeasurement oneGallon = AddableMeasurement.gallon(1.0);

        twoInch.add(oneGallon);
    }

    @Test
    public void compare100CelsiusAnd212Fahrenheit() {
        Measurement celsius1 = Measurement.celsius(100);
        Measurement fahrenheit = Measurement.fahrenheit(212);

        assertEquals(celsius1, fahrenheit);
    }
}