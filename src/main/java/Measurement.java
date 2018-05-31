import java.util.Objects;

public class Measurement {
    private final Unit unit;
    private final double value;

    public Measurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public static Measurement inch(double value) {
        return new Measurement(Unit.inch(), value);
    }

    public static Measurement feet(double value) {
        return new Measurement(Unit.feet(), value);
    }

    public static Measurement centimeter(double value) {
        return new Measurement(Unit.centimeter(), value);
    }

    public static Measurement gallon(double value) {
        return new Measurement(Unit.gallon(), value);
    }

    public static Measurement liter(double value) {
        return new Measurement(Unit.liter(), value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement that = (Measurement) o;
        return unit.isCompatibleWith(that.unit) && Double.compare(that.unit.getInBaseUnits(that.value), unit.getInBaseUnits(value)) == 0;
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

    public Measurement add(Measurement otherLength) {
        return new Measurement(Unit.inch(),
                unit.getInBaseUnits(value) + otherLength.unit.getInBaseUnits(otherLength.value));
    }
}
