import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        int faixa;

        if (idade >= 0 && idade <= 12) {
            faixa = 1; // criança
        } else if (idade >= 13 && idade <= 17) {
            faixa = 2; // adolescente
        } else if (idade >= 18 && idade <= 59) {
            faixa = 3; // adulto
        } else if (idade >= 60) {
            faixa = 4; // idoso
        } else {
            faixa = -1; // idade inválida
        }

        switch (faixa) {
            case 1:
                System.out.println("Você é uma CRIANÇA.");
                break;
            case 2:
                System.out.println("Você é um ADOLESCENTE.");
                break;
            case 3:
                System.out.println("Você é um ADULTO.");
                break;
            case 4:
                System.out.println("Você é um IDOSO.");
                break;
            default:
                System.out.println("Idade inválida!");
        }
    }
}