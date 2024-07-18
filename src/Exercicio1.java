import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int primo = 0;
        String ePrimo = " ";
        for(int i = 1; i <= Math.sqrt(num); i++){
            primo = (num % i == 0) ? primo+2 : primo;
        }

        ePrimo = (num >= 2 && primo == 2) ? "é primo" : "não é primo";
        System.out.println(num + " "+ ePrimo);
    }
}