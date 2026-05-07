import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {

    private JTextField campoEmail;
    private JPasswordField campoSenha;
    private JButton botaoLogin;
    private JButton botaoLimpar;

    public TelaLogin() {
        setTitle("Tela de Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel labelEmail = new JLabel("E-mail:");
        campoEmail = new JTextField();

        JLabel labelSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField();

        botaoLogin = new JButton("Login");
        botaoLimpar = new JButton("Limpar");

        add(labelEmail);
        add(campoEmail);
        add(labelSenha);
        add(campoSenha);
        add(botaoLogin);
        add(botaoLimpar);

        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = campoEmail.getText();
                String senha = new String(campoSenha.getPassword());

                if (email.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                } else if (email.equals("admin@senai.com") && senha.equals("123456")) {
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos!");
                }
            }
        });

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoEmail.setText("");
                campoSenha.setText("");
            }
        });

        setVisible(true);
    }
}