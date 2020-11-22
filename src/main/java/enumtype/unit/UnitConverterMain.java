package enumtype.unit;

import java.math.BigDecimal;
import java.util.Arrays;

public class UnitConverterMain {
    public static void main(String[] args) {

        UnitConverter unitConverter= new UnitConverter();

        System.out.println(unitConverter.convert(new BigDecimal(17),LengthUnit.INCH,LengthUnit.CENTIMETER));
        System.out.println(unitConverter.convert(new BigDecimal(4),LengthUnit.MILLIMETER,LengthUnit.METER));

        System.out.println(Arrays.toString(LengthUnit.values()));

        System.out.println(unitConverter.siUnits());


    }
}
