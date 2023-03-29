import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;

        System.out.println("Digite o raio do circulo: ");
        n1 = in.nextInt();

        System.out.printf("O diametro do circulo e: %d%n",2*n1);
        System.out.printf("O perimetro do circulo e: %.2f%n",(float)(2*n1*Math.PI));
        System.out.printf("A area do circulo e: %.2f%n",(float)(Math.PI*Math.pow(n1, 2)));

        in.close();
    }
}
