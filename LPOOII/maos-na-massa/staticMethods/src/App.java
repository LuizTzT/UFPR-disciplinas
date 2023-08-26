import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        double arranjo[] = { 177, 200, 181, 180, 173, 185 };

        System.out.printf("Média -> %.3f\n", media(arranjo));
        System.out.printf("DesvPad -> %.3f\n", desvPad(arranjo));
        System.out.printf("Mínimo -> %.0f\n", minimo(arranjo));
        System.out.printf("Máximo -> %.0f\n", maximo(arranjo));
        
    }

    public static double minimo(double[] valores) {
        return Arrays.stream(valores).min().orElse(0.0);
    }

    public static double maximo(double[] valores) {
        return Arrays.stream(valores).max().orElse(0.0);
    }

    public static double media(double[] valores) {
        return Arrays.stream(valores).average().orElse(0.0);
    }

    public static double desvPad(double[] valores) {
        double media = media(valores);
        double somaQuadrados = Arrays.stream(valores).map(num -> Math.pow((num - media), 2)).sum();

        double desvioPadrao = Math.sqrt(somaQuadrados / (valores.length - 1));

        return desvioPadrao;
    }
}
