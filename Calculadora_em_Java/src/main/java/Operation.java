abstract class Operation {
    double num1;
    double num2;

    public Operation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método abstrato para ser implementado pelas subclasses
    public abstract double calculate() throws ArithmeticException;
}

class Addition extends Operation {
    public Addition(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calculate() {
        return num1 + num2;
    }
}

class Subtraction extends Operation {
    public Subtraction(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calculate() {
        return num1 - num2;
    }
}

class Multiplication extends Operation {
    public Multiplication(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calculate() {
        return num1 * num2;
    }
}

class Division extends Operation {
    public Division(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calculate() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return num1 / num2;
    }
}
