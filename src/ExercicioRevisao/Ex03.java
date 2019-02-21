package ExercicioRevisao;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double TotalValor;
        int Folhas,VolumeFolha;

        System.out.println("infomer a Quantidade de folhas: ");
        VolumeFolha = sc.nextInt();

        if (VolumeFolha <= 100){
            TotalValor = VolumeFolha * 0.25;
        }else{
            TotalValor = VolumeFolha * 0.20;
        }
        System.out.println("O total é: " + TotalValor);
    }
}
