import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7");
        int dia = sc.nextInt();
        String diaDaSemana = (dia == 1) ? "Domingo" : (dia == 2) ? "Segunda" : (dia == 3) ? "Terça"
                : (dia == 4) ? "Quarta" : (dia == 5) ? "Quinta" : (dia == 6) ? "Sexta" : (dia == 7) ? "Sabado" : "Dia nao existe";

        if(dia < 1 || dia > 7)
        {
            System.out.println(diaDaSemana);
        } else {
            System.out.println("Hoje é " + diaDaSemana);
        }
    }
}
