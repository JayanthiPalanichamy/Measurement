import java.util.Objects;

public class Length {
    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static Length inch(double value) {
        return new Length(Unit.inch(value), value);
    }

    public static Length feet(double value) {
        return new Length(Unit.feet(value), value);
    }

    public static Length centimeter(double value) {
        return new Length(Unit.centimeter(value), value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Objects.equals(unit, length.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }
}
