import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número de 1 a 7: ");
            int numero = scanner.nextInt();

            switch (numero) {
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Segunda-feira");
                case 3 -> System.out.println("Terça-feira");
                case 4 -> System.out.println("Quarta-feira");
                case 5 -> System.out.println("Quinta-feira");
                case 6 -> System.out.println("Sexta-feira");
                case 7 -> System.out.println("Sábado");
                default -> System.out.println("Dia inválido");
            }
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida. Digite apenas números!");
        } finally {
            scanner.close();
        }
    }
}
