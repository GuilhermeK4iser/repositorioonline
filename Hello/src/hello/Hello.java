package hello;

import javax.swing.JOptionPane;

public class Hello {

    public static void main(String[] args) {
        int idade;
        String nome;
        String dado;
        dado = JOptionPane.showInputDialog("Digite a idade:");
        idade = Integer.parseInt(dado);
        nome = JOptionPane.showInputDialog("Digite o nome:");
        JOptionPane.showMessageDialog(null, "Hello World - Nome: " + nome + " Idade: " + idade);
    }
}
