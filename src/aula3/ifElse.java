package aula3;

import java.util.Scanner;

public class ifElse {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite uma nota:");
        double nota1 = sc.nextDouble();

        IO.println("Digite sua segunda nota:");
        double nota2 = sc.nextDouble();

        IO.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = nota1 + nota2 + nota3 / 3;

        if (media < 4) {
            IO.println("Você foi reprovado");

        } else if (media <= 6) {
            IO.println("Recuperação");
        } else {
            IO.println("Aprovado");

        }
    }
}
