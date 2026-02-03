package aula2;

import java.util.Scanner;

public class SoliciteUsuario {
    static  void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("DIgite o seu nome:");
        String nome = sc.next();
        IO.println("DIgite sua idade:");
        int idade = sc.nextInt();
        IO.println("DIgite seu peso:");
        double peso = sc.nextDouble();
        IO.println("DIgite seu altura:");
        double altura = sc.nextDouble();

        Double imc = peso / (altura * altura);
        IO.println(imc);

    }
}
