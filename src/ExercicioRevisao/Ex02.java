package ExercicioRevisao;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Totalvenda,Comissao;

        System.out.println("Digite o total de vendas: ");
        Totalvenda = sc.nextInt();

        Comissao = Totalvenda * 10/100;

        System.out.println("A comissão é : " + Comissao);

    }
}
