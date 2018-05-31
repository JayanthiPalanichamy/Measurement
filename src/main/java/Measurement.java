import java.util.Objects;

public class Measurement {
    private final Unit unit;
    private final double value;

    public Measurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static Measurement inch(double value) {
        return new Measurement(Unit.inch(value), value);
    }

    public static Measurement feet(double value) {
        return new Measurement(Unit.feet(value), value);
    }

    public static Measurement centimeter(double value) {
        return new Measurement(Unit.centimeter(value), value);
    }

    public static Measurement gallon(double value) {
        return new Measurement(Unit.gallon(value), value);
    }

    public static Measurement liter(double value) {
        return new Measurement(Unit.liter(value), value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement length = (Measurement) o;
        return Objects.equals(unit, length.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }

    public Measurement add(Measurement length2) {
        return unit.add(length2.unit);
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "unit=" + unit +
                ", value=" + value +
                '}';
    }
}
