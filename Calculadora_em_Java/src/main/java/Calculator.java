import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        Operation op = null;

        switch (operation) {
            case '+':
                op = new Addition(num1, num2);
                break;
            case '-':
                op = new Subtraction(num1, num2);
                break;
            case '*':
                op = new Multiplication(num1, num2);
                break;
            case '/':
                op = new Division(num1, num2);
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        try {
            double result = op.calculate();
            System.out.println("O resultado é: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
