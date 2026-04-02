public class Pix implements Pagamento {

    @Override
    public void processar(double valor) {
        System.out.println("Enviando Pix...");
        System.out.println("Pix no valor de R$ " + valor);
    }
}
