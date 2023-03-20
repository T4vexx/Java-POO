import java.util.Scanner;

public class Ex217 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        int litro;
        int kmtotal=0;
        int litrototal=0;
        int opt=1;

        while (opt != 0) {
            System.out.printf("Digite a km do percurso atual: ");
            km = input.nextInt();

            System.out.printf("Digite os litros consumidos: ");
            litro = input.nextInt();

            kmtotal += km;
            litrototal += litro;

            System.out.printf("O percurso atual foi de %d km e foi gasto %d litros %nA media da de consumo da viagem é de %f",kmtotal,litrototal,(float)kmtotal/litrototal);

            System.out.printf("%nDigite 0 para sair e 1 para adicionar um novo percurso!");
            opt = input.nextInt();
        }

    }
}