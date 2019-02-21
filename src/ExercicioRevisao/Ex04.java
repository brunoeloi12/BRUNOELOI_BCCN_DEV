package ExercicioRevisao;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double media,soma = 0;
        double[]notas = new double[4];

        for (int i = 0 ;i < 4 ; i++) {
            System.out.println("Digite a nota: " + (i + 1));
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        media = soma/4;

        System.out.println("A media do aluno é: " + media);
    }
}
