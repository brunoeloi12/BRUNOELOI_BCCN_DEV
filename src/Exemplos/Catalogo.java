package Exemplos;

public class Catalogo {

    public static void main(String[] args){
        int a = 10,b = 90,c = -100;
        if(c > a){
            c = a;
        }else{
            c = b;
        }
        System.out.println(c);


        int op = 3;
        int v = 0;
        switch (op){
            case 1:
                v = 1;
            break;
            case 2:
                v = 2;
            break;
            default:
                v = -1;
        }
        System.out.println(v);

        for(int i = 20; i >= 0; i--){
            System.out.println(i);
        }
    }
}
