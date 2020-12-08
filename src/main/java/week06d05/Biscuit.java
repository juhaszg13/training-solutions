package week06d05;

public class Biscuit {
    private BiscuitType biscuitType;
    private int grammAmount;

    private Biscuit(BiscuitType biscuitType, int grammAmount) {
        if (biscuitType == null) {
            throw new IllegalArgumentException("Invalid type.");
        }
        if (grammAmount <= 0) {
            throw new IllegalArgumentException("Amount should bigger than 0.");
        }

        this.biscuitType = biscuitType;
        this.grammAmount = grammAmount;
    }

    public static Biscuit of(BiscuitType biscuitT, int grammA) {
        return new Biscuit(biscuitT, grammA);
    }

    public BiscuitType getBiscuitType() {
        return biscuitType;
    }

    public int getGrammAmount() {
        return grammAmount;
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "biscuitType=" + biscuitType +
                ", grammAmount=" + grammAmount +
                '}';
    }
}
