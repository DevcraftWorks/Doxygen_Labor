
public class ScientificCalculator {

    // TODO:
    // - Lassen Sie diese Klasse von Calculator erben: public class ScientificCalculator extends Calculator
    // - Fügen Sie Doxygen-kompatible Kommentare für die Klasse und alle Methoden hinzu
    // - Verwenden Sie @brief, @param, @return, @throws (wenn sinnvoll)

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot take square root of negative number.");
        }
        return Math.sqrt(value);
    }

    public double sin(double radians) {
        return Math.sin(radians);
    }

    public double cos(double radians) {
        return Math.cos(radians);
    }

    public double tan(double radians) {
        return Math.tan(radians);
    }
}
