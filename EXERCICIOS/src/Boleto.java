public class Boleto implements Pagamento{

    @Override
    public void processar(double valor) {
        System.out.println("Gerando boleto...");
        System.out.println("Boleto no valor de R$ " + valor);
    }
}
