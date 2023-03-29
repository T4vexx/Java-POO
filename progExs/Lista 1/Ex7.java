import java.util.Scanner;

public class Ex7 {

    public static int factorial(int n) {
        if(n==1 || n==0) 
            return 1;
        else
            return (n * factorial(n -1)); //desmontando o numero 
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aux;
        double e=0;

        System.out.println("Digite o tanto de casa de precisao que vc quer para o numero e: ");
        aux = in.nextInt();

        for(int i=0; i<aux; i++) {
            e += (1/Double.valueOf(factorial(i)));
        }

        System.out.printf("O numero de euler para %d casas é %.10f",aux,e);

        in.close();   
    }
}
