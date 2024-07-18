import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o mes 1-12");
        int mes = sc.nextInt();
        String mesDoAno = (mes == 1) ? "Janeiro" :
                (mes == 2) ? "Fevereiro" :
                (mes == 3) ? "Março" :
                (mes == 4) ? "Abril" :
                (mes == 5) ? "Maio" :
                (mes == 6) ? "Junho" :
                (mes == 7) ? "Julho" :
                (mes == 8) ? "Agosto" :
                (mes == 9) ? "Setembro" :
                (mes == 10) ? "Outubro" :
                (mes == 11) ? "Novembro" :
                (mes == 12) ? "Dezembro" : "Mês não existe";

        System.out.print(mesDoAno);

    }
}
