import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest {

    @Test
    public void returnTrueWhenTwoEqualVolumeInGallonAndLiterIsGiven() {
        Measurement oneGallon = Measurement.gallon(1);
        Measurement threePointSevenEightLiter = Measurement.liter(3.78);

        assertEquals(oneGallon,threePointSevenEightLiter);
    }
}
