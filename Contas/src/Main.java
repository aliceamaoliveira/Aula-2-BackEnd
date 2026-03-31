//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("1", "001", "Alice", 1000);
        Conta cp = new ContaPoupanca("2", "001", "Bruno", 2000);
        Conta pj = new ContaPJ("3", "001", "Empresa", 5000);


        System.out.println("\n Conta Corrente");
        cc.depositar(200);
        cc.sacar(100);
        cc.exibirSaldo();
        System.out.println("Tarifa mensal: R$ " + cc.calcularTarifaMensal());


        System.out.println("\n Conta Poupança");
        cp.depositar(300);
        cp.sacar(150);
        cp.exibirSaldo();
        System.out.println("Tarifa mensal: R$ " + cp.calcularTarifaMensal());


        System.out.println("\n Conta PJ");
        pj.depositar(500);
        pj.sacar(200);
        pj.exibirSaldo();
        System.out.println("Tarifa mensal: R$ " + pj.calcularTarifaMensal());
    }
}