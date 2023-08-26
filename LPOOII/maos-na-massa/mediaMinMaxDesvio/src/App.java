import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        String entrada;
        List<Double> numeros = new ArrayList<>();

        while (true) {

            System.out.print("Digite um número ou S para sair: ");
            entrada = s.next();

            if (entrada.equalsIgnoreCase("s"))
                break;

            double valor = Double.parseDouble(entrada);

            numeros.add(valor);

            double media = numeros.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            System.out.printf("Média = %.1f\n", media);

            double minimo = numeros.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
            System.out.printf("Mínimo = %.1f\n", minimo);

            double maximo = numeros.stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
            System.out.printf("Máximo = %.1f\n", maximo);

            double somaQuadrados = numeros.stream().mapToDouble(num -> Math.pow(num - media, 2)).sum();
            if (numeros.size() == 1) {
                System.out.printf("Desv. Pad = NA\n");
            } else {
                double desvioPadrao = Math.sqrt(somaQuadrados / (numeros.size() - 1));
                System.out.printf("Desv. Pad = %.5f\n", desvioPadrao);
            }

            System.out.println("------------------------------------");
        }

        s.close();
    }
}
