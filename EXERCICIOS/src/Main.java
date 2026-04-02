//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Servico processador = new Servico();

        Pagamento cartao = new Credito();
        Pagamento boleto = new Boleto();
        Pagamento pix = new Pix();

        processador.executar(cartao, 100);
        processador.executar(boleto, 200);
        processador.executar(pix, 300);
        }
    }
