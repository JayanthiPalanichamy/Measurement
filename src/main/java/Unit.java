import java.util.Objects;


public class Unit {
    public static final int FEET_TO_INCH = 12;
    public static final double CENTIMETER_TO_INCH = 0.4;
    public static final double GALLON_TO_LITRE = 3.78;
    private final double baseUnit;
    private final Type type;

    public Unit(double baseUnit, Type type) {
        this.baseUnit = baseUnit;
        this.type = type;
    }

    public static Unit inch(double value) {
        return new Unit(value,Type.LENGTH);
    }

    public static Unit feet(double value) {
        return new Unit(value * FEET_TO_INCH,Type.LENGTH );
    }

    public static Unit centimeter(double value) {
        return new Unit(value * CENTIMETER_TO_INCH,Type.LENGTH );
    }

    public static Unit gallon(double value) {
        return new Unit(value * GALLON_TO_LITRE, Type.VOLUME);
    }

    public static Unit liter(double value) {
        return new Unit(value,Type.VOLUME );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        if (unit.type != type) return false;
        return Double.compare(unit.baseUnit, baseUnit) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(baseUnit);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "baseUnit=" + baseUnit +
                ", type=" + type +
                '}';
    }
}
