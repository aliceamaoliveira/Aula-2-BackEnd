public class Servico {

    public void executar(Pagamento pagamento, double valor) {
        pagamento.processar(valor);
    }
}
