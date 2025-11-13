import java.util.Scanner;
public class ConversorUnidades {
    private static Scanner scanner = new Scanner(System.in);
    public static void converterCelsiusParaFahrenheit() {
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Resultado: %.2f°C é igual a %.2f°F%n%n", celsius, fahrenheit);
    }
    public static void converterFahrenheitParaCelsius() {
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Resultado: %.2f°F é igual a %.2f°C%n%n", fahrenheit, celsius);
    }
    public static void converterKmParaMilhas() {
        System.out.print("Digite a distância em Quilômetros: ");
        double km = scanner.nextDouble();
        double milhas = km / 1.609;
        System.out.printf("Resultado: %.2f km é igual a %.2f milhas%n%n", km, milhas);
    }
    public static void converterMilhasParaKm() {
        System.out.print("Digite a distância em Milhas: ");
        double milhas = scanner.nextDouble();
        double km = milhas * 1.609;
        System.out.printf("Resultado: %.2f milhas é igual a %.2f km%n%n", milhas, km);
    }
    public static void converterQuilogramasParaLibras() {
        System.out.print("Digite o peso em Quilogramas: ");
        double kg = scanner.nextDouble();
        double libras = kg * 2.20462;
        System.out.printf("Resultado: %.2f kg é igual a %.2f libras%n%n", kg, libras);
    }
    public static void converterLibrasParaQuilogramas() {
        System.out.print("Digite o peso em Libras: ");
        double libras = scanner.nextDouble();
        double kg = libras / 2.20462;
        System.out.printf("Resultado: %.2f libras é igual a %.2f kg%n%n", libras, kg);
    }
}
