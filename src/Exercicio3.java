import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia que vc nasceu");
        int dia = sc.nextInt();
        System.out.println("Digite o mês que voce nasceu de 1 a 12");
        int mes = sc.nextInt();

        String cavaleiro = (dia >= 21 && mes == 3 || dia <= 20 && mes == 4) ? "Mu de Áries" :
                (dia >= 21 && mes == 4 || dia <= 20 && mes == 5) ? "Aldebaran de Touro" :
                (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) ? "Saga de Gêmeos" :
                (dia >= 21 && mes == 6 || dia <= 22 && mes == 7) ? "Máscara da Morte de Câncer" :
                (dia >= 23 && mes == 7 || dia <= 22 && mes == 8) ? "Aiolia de Leão" :
                (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) ? "Shaka de Virgem" :
                (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) ? "Dohko de Libra" :
                (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) ? "Milo de Escorpião" :
                (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) ? "Aiolos de Sagitário" :
                (dia >= 22 && mes == 12 || dia <= 20 && mes == 1) ? "Shura de Capricórnio" :
                (dia >= 21 && mes == 1 || dia <= 18 && mes == 2) ? "Camus de Aquário" :
                (dia >= 19 && dia <= 29 && mes == 2 || dia <= 20 && mes == 3) ? "Afrodite de Peixes" : "Data nao existe";

        System.out.printf(cavaleiro);
    }
}
