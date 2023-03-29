import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2;

        System.out.println("Digite 2 numeros: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        System.out.printf("O numero %d %s de %d%n",n1,n1%n2 == 0 ? "e multiplo" : "nao e multiplo",n2);
        System.out.printf("O numero %d %s de %d%n",n2,n2%n1 == 0 ? "e multiplo" : "nao e multiplo",n1);

        in.close();
    }
}
