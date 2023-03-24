import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Account myAcc = new Account("Otávio Augusto",10.20);
        Account myAcc2 = new Account("Isadora Ito", 940.00);

        System.out.printf("\nOlá %s você tem R$%f de saldo",myAcc.getName(),myAcc.getBalance());
        System.out.printf("\nOlá %s você tem R$%f de saldo",myAcc2.getName(),myAcc2.getBalance());

        myAcc.deposit(50.00);
        myAcc2.deposit(5.00);

        System.out.printf("\nOlá %s você tem R$%f de saldo",myAcc.getName(),myAcc.getBalance());
        System.out.printf("\nOlá %s você tem R$%f de saldo",myAcc2.getName(),myAcc2.getBalance());
        input.close();
    }
}
