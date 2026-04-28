import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);

        try {
            conta.sacar(150);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}