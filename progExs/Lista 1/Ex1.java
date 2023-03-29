import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2,n3;

        System.out.println("Digite 3 inteiro: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        System.out.printf("A soma dos 3 é: %d%n",n1+n2+n3);
        System.out.printf("A media dos 3 é: %.2f%n",(float)(n1+n2+n3)/3);
        System.out.printf("O produto dos 3 é: %d%n",n1*n2*n3);
        System.out.printf("O maior dos 3 é: %d%n",Math.max(n1,Math.max(n2,n3)));
        System.out.printf("O menor dos 3 é: %d%n",Math.min(n1,Math.min(n2,n3)));

        in.close();
    }
}