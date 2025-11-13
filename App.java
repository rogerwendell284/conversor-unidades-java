import java.util.Scanner;
public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int opcao = -1;

        do { // Loop principal do menu

        System.out.println("\n--- Conversor de Unidades ---");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.println("3. Quilômetros para Milhas");
        System.out.println("4. Milhas para Quilômetros");
        System.out.println("5. Quilogramas para Libras");
        System.out.println("6. Libras para Quilogramas");
        System.out.println("0. Sair");
        System.out.println("-----------------------------");

        System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

        switch (opcao) { // Chama o método apropriado com base na escolha do usuário
            case 1 -> ConversorUnidades.converterCelsiusParaFahrenheit();
            case 2 -> ConversorUnidades.converterFahrenheitParaCelsius();
            case 3 -> ConversorUnidades.converterKmParaMilhas();
            case 4 -> ConversorUnidades.converterMilhasParaKm();
            case 5 -> ConversorUnidades.converterQuilogramasParaLibras();
            case 6 -> ConversorUnidades.converterLibrasParaQuilogramas();
            case 0 -> System.out.println("Saindo do programa...");
            default -> System.out.println("Opção inválida. Tente novamente.");
        }
       
        } while(opcao != 0); // Fim do loop principal do menu

        scanner.close();
    }
}
