import java.util.Objects;

public class Measurement {
    protected final Unit unit;
    protected final double value;

    public Measurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static Measurement celsius(double value) {
        return new Measurement(Unit.celsius(), value);
    }

    public static Measurement fahrenheit(double value) {
        return new Measurement(Unit.fahrenheit(), value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        return unit.isCompatibleWith(that.unit) && compare(that.unit.getInBaseUnits(that.value), unit.getInBaseUnits(value));
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "unit=" + unit +
                ", value=" + value +
                '}';
    }

    public boolean compare(double a, double b) {
        double EPSILON = 0.01;
        return Math.abs(a - b) < EPSILON;
    }
}