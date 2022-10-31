import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        //Elaborar um alg que le o conjunto de 30 num e os coloca em 2 vetores.
        int num, recebePar, recebeImpar, a =0,b=0;
        int acmid [] = new int[30];

        int i =0;
        int [] Impar = new int[30];
        int [] Par = new int[30];
        do {
            System.out.println("Preencha");
            num = ent.nextInt();
            i++;
            if (num%2 ==0){
                recebePar = num;
                Par[a] = recebePar;
                System.out.println("Esse numero: "+ Par[a] + " É par \n");
                a++;
            }
            else {
                recebeImpar = num;
                Impar[b] = recebeImpar;
                System.out.println("Esse numero: "+ Impar[b] + " É impar \n");
                b++;
            }
        }
        while (i < 3);
    }
}
