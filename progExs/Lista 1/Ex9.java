import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vet;
        int menor8=0,maior10=0;
        double test1,test2;
        vet = new int[12];

        for(int i=0; i<12; i++) {
            System.out.println("Digite um numero de posicao " + i);
            vet[i] = in.nextInt();
        }

        for(int i=0; i<12; i++) {
            if(vet[i] < 8) {
                menor8++;
            }
            if(vet[i] > 10) {
                maior10++;
            }
        }
        test1 = (Double.valueOf(menor8)/12.00)*100.00;
        test2 = (Double.valueOf(maior10)/12.00)*100.00;
        System.out.printf("A porcentagem de numero maior que 8 é: %.2f%n e maior que 10 é: %.2f%n",test1,test2);

        in.close(); 
    }
}
