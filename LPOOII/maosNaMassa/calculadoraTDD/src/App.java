public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(calcula(3, 5, "+"));
        System.out.println(calcula(2, 5, "+"));
        System.out.println(calcula(-3.5, 5, "+"));
        System.out.println(calcula(6, 5, "/"));
        System.out.println(calcula(6, 0, "/"));
        System.out.println(calcula(3, 5, "+"));

    }

    public static double calcula(double a, double b, String op) {
        switch (op.charAt(0)) {
            case '+':
                return soma(a, b);
            case '-':
                return subtracao(a, b);
            case '*':
                return multiplicacao(a, b);
            case '/':
                return divisao(a, b);
            default:
                throw new RuntimeException("Operação não implementada");
        }
    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return Double.POSITIVE_INFINITY;
    }

}
