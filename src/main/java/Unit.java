import java.util.Objects;


public class Unit {
    public static final int FEET_TO_INCH = 12;
    public static final double CENTIMETER_TO_INCH = 0.4;
    private final double baseUnit;

    public Unit(double baseUnit) {
        this.baseUnit = baseUnit;
    }

    public static Unit inch(double value) {
        return new Unit(value);
    }

    public static Unit feet(double value) {
        return new Unit(value * FEET_TO_INCH);
    }

    public static Unit centimeter(double value) {
        return new Unit(value * CENTIMETER_TO_INCH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Double.compare(unit.baseUnit, baseUnit) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(baseUnit);
    }
}
