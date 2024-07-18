import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));

        int maior = num1;

        maior = (num2 > maior) ? num2 : maior;
        maior = (num3 > maior) ? num3 : maior;

        System.out.println("o maior número é: " + maior);
    }
}