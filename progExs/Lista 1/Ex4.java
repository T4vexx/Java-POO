import java.util.Scanner;

public class Ex4 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c;

        System.out.println("Digite um caracter: ");
        c = in.next().charAt(0);
    
        System.out.printf("O char %c em ASCII fica: %d%n",c,(int)c);

        in.close();
    }
}
