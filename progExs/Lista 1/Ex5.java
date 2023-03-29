import java.util.Scanner;
import java.util.Arrays;

public class Ex5 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vet;
        vet = new int[15];

        for(int i=0; i<15; i++) {
            System.out.println("Digite um numero de posicao " + i);
            vet[i] = in.nextInt();
        }
        Arrays.sort(vet);
        System.out.printf("Os dois maiores numeros sao %d e %d ",vet[13],vet[14]);

        in.close();
    }
}

