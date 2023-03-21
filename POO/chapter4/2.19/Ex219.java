import java.util.Scanner;

public class Ex219 {

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Benedito Armani",200);
        Scanner input = new Scanner(System.in);
        double aux=0;

        while(aux!=-1) {
            System.out.printf("%nDigite o preço da venda efetuada ou digite -1 para sair: ");
            aux = input.nextDouble();
            if(aux>0) {
                vendedor1.setVenda(aux);
            }
        }

        vendedor1.getSalario();
    }
}