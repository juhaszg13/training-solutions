package exceptions.polinom;

public class Polynomial {
    private double[] coefficients;


    public Polynomial(double[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficientStrs) {
        if (coefficientStrs == null) {
            throw new NullPointerException("coefficientStrs is null");
        }
        try {
            this.coefficients = convertCoefficientStrs(coefficientStrs);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", ex);
        }

    }

    public double evaluate(double x) {
        double sum = 0.0;
        int n=coefficients.length-1;
        for (int i = coefficients.length-1; i >=0; i--) {
            sum += Math.pow(x,(double)n-i)*coefficients[i];
        }
        return sum;
    }

    private double[] convertCoefficientStrs(String[] coefficientStrs) {
        double[] coefficients = new double[coefficientStrs.length];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = Integer.parseInt(coefficientStrs[i]);
        }
        return coefficients;
    }

    public double[] getCoefficients() {
        return coefficients;
    }
}
