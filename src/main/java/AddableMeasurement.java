

public class AddableMeasurement extends Measurement {


    public AddableMeasurement(Unit unit, double value) {
       super(unit, value);

    }

    public static AddableMeasurement inch(double value) {
        return new AddableMeasurement(Unit.inch(), value);
    }

    public static AddableMeasurement feet(double value) {
        return new AddableMeasurement(Unit.feet(), value);
    }

    public static AddableMeasurement centimeter(double value) {
        return new AddableMeasurement(Unit.centimeter(), value);
    }

    public static AddableMeasurement gallon(double value) {
        return new AddableMeasurement(Unit.gallon(), value);
    }

    public static AddableMeasurement liter(double value) {
        return new AddableMeasurement(Unit.liter(), value);
    }

    public AddableMeasurement add(AddableMeasurement otherLength) throws MeasurementTypeIncompatible {
        if (!unit.isCompatibleWith(otherLength.unit)) {
            throw new MeasurementTypeIncompatible("You cannot add volume and length");
        }
        return new AddableMeasurement(unit.giveBaseUnit(), unit.getInBaseUnits(value) + otherLength.unit.getInBaseUnits(otherLength.value));
    }
}
