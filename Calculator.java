public class Calculator {

    // TODO: 
    // Fügen Sie Doxygen-kompatible Kommentare zu dieser Klasse hinzu.
    // Dokumentieren Sie:
    // - Die Klasse selbst
    // - Alle Methoden (Parameter, Rückgabewerte, Ausnahmen)
    // - Die Instanzvariable operationCount
    // Verwenden Sie @brief, @param, @return und @throws wenn passend.

    private int operationCount;

    public Calculator() {
        this.operationCount = 0;
    }

    public double add(double a, double b) {
        operationCount++;
        return a + b;
    }

    public double subtract(double a, double b) {
        operationCount++;
        return a - b;
    }

    public double multiply(double a, double b) {
        operationCount++;
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        operationCount++;
        return a / b;
    }

    public int getOperationCount() {
        return operationCount;
    }
}
