public class Unit {
    public static final int FEET_TO_INCH = 12;
    public static final double CENTIMETER_TO_INCH = 0.4;
    public static final double GALLON_TO_LITRE = 3.78;
    public static final double FAHRENHEIT_TO_CELSIUS = 0.5556;
    private final double conversionFactor;
    private final Type type;
    private final double additiveConstant;

    public Unit(double additiveConstant, double conversionFactor, Type type) {
        this.additiveConstant = additiveConstant;
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    public Unit( double conversionFactor, Type type) {
        this.additiveConstant = 0;
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    public static Unit inch() {
        return new Unit(1, Type.LENGTH);
    }

    public static Unit feet() {
        return new Unit( FEET_TO_INCH, Type.LENGTH);
    }

    public static Unit centimeter() {
        return new Unit(CENTIMETER_TO_INCH, Type.LENGTH);
    }

    public static Unit gallon() {
        return new Unit( GALLON_TO_LITRE, Type.VOLUME);
    }

    public static Unit liter() {
        return new Unit(1, Type.VOLUME);
    }

    public static Unit celsius() {
        return new Unit(1, Type.TEMPERATURE);
    }

    public static Unit fahrenheit() {
        return new Unit(-32,FAHRENHEIT_TO_CELSIUS, Type.TEMPERATURE);
    }

    public double getInBaseUnits(double value) {

        return (value + additiveConstant) * conversionFactor;
    }

    public boolean isCompatibleWith(Unit unit) {
        return (unit.type == type);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "conversionFactor=" + conversionFactor +
                ", type=" + type +
                ", additiveConstant=" + additiveConstant +
                '}';
    }

    public boolean isType(Type type) {
        return this.type == type;
    }

    public Unit giveBaseUnit() {
        switch (type) {
            case LENGTH: return Unit.inch();
            case VOLUME: return Unit.liter();
            case TEMPERATURE: return Unit.celsius();
        }
        return null;
    }
}
