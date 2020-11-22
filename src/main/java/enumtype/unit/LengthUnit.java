package enumtype.unit;

public enum LengthUnit {
    MILLIMETER(1,true),
    CENTIMETER(10,true),
    METER(1000,true),
    YARD(914,false),
    FOOT(305,false),
    INCH(25,false);

    private final int inMillimeter;
    private final boolean siUnit;

    LengthUnit(int inMillimeter, boolean siUnit) {
        this.inMillimeter = inMillimeter;
        this.siUnit = siUnit;
    }

    public int getInMillimeter() {
        return inMillimeter;
    }

    public boolean isSiUnit() {
        return siUnit;
    }
}
