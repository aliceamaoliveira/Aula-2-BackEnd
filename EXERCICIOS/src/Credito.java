public class Credito implements Pagamento{

    @Override
    public void processar(double valor) {
        System.out.println("Validando cartão...");
        System.out.println("Pagamento no cartão: R$ " + valor);
    }

}
