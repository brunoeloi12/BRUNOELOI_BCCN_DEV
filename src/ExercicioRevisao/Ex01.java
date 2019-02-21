package ExercicioRevisao;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        a = sc.nextInt();

        b = a * 2;
        System.out.println("O numero é: "+ b);
    }
}
