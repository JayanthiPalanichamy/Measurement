import java.util.Objects;


public class Unit {
    public static final int FEET_TO_INCH = 12;
    public static final double CENTIMETER_TO_INCH = 0.4;
    public static final double GALLON_TO_LITRE = 3.78;
    private final double conversionFactor;
    private final Type type;

    public Unit(double conversionFactor, Type type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    public static Unit inch() {
        return new Unit(1, Type.LENGTH);
    }

    public static Unit feet() {
        return new Unit(FEET_TO_INCH, Type.LENGTH);
    }

    public static Unit centimeter() {
        return new Unit(CENTIMETER_TO_INCH, Type.LENGTH);
    }

    public static Unit gallon() {
        return new Unit(GALLON_TO_LITRE, Type.VOLUME);
    }

    public static Unit liter() {
        return new Unit(1, Type.VOLUME);
    }

    public double getInBaseUnits(double value) {

            return value *conversionFactor;

    }

    public boolean isCompatibleWith(Unit unit) {
        return  (unit.type == type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(conversionFactor);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "conversionFactor=" + conversionFactor +
                ", type=" + type +
                '}';
    }


}
