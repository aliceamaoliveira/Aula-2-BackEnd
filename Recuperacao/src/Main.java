//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Cadastro");
        janela.setSize(500, 400);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelProduto = new JLabel("Produto:");
        labelProduto.setBounds(20, 20, 100, 30);
        janela.add(labelProduto);

        JTextField inputProduto = new JTextField();
        inputProduto.setBounds(20, 50, 200, 30);
        janela.add(inputProduto);

        JLabel labelPreco = new JLabel("Preço:");
        labelPreco.setBounds(20, 90, 100, 30);
        janela.add(labelPreco);

        JTextField inputPreco = new JTextField();
        inputPreco.setBounds(20, 120, 200, 30);
        janela.add(inputPreco);

        JLabel labelQuantidade = new JLabel("Quantidade:");
        labelQuantidade.setBounds(20, 160, 100, 30);
        janela.add(labelQuantidade);

        JTextField inputQuantidade = new JTextField();
        inputQuantidade.setBounds(20, 190, 200, 30);
        janela.add(inputQuantidade);

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(20, 250, 120, 40);
        janela.add(botaoCadastrar);

        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(160, 250, 120, 40);
        janela.add(botaoLimpar);

        botaoCadastrar.addActionListener((ActionEvent e) -> {

            String produto = inputProduto.getText();
            String preco = inputPreco.getText();
            String quantidade = inputQuantidade.getText();

            if (produto.equals("") || preco.equals("") || quantidade.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
            } else {

                if (produto.equals("Mouse") && preco.equals("50") && quantidade.equals("2")) {

                    String infoCadastro = "Produto cadastrado com sucesso!\n" +
                            "Nome: " + produto + "\n" +
                            "Preço: R$ " + preco + "\n" +
                            "Quantidade: " + quantidade + "\n" +
                            "Valor total em estoque: R$ 100";

                    JOptionPane.showMessageDialog(null, infoCadastro, "Cadastrado", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Informações inválidas.");
                }
            }
        });
        botaoLimpar.addActionListener((ActionEvent e) -> {
            inputProduto.setText("");
            inputPreco.setText("");
            inputQuantidade.setText("");
        });

        janela.setVisible(true);
    }
}