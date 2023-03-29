import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vet;
        vet = new int[12];

        for(int i=0; i<12; i++) {
            System.out.println("Digite um numero de posicao " + i);
            vet[i] = in.nextInt();
        }

        for(int i=0; i<12; i++) {
            System.out.printf("O numero %d e %s%n",vet[i],vet[i] % 2 == 0 ? "PAR" : "IMPAR");
        }

        in.close(); 
    }
}
