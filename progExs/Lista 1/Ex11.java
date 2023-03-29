import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test;
        int flag=0;

        System.out.println("Digite uma string: ");
        test = input.nextLine();

        for(int i=0; i<test.length(); i++) {
            for(int j=i+1; j<test.length(); j++) {
                if(test.charAt(i) == test.charAt(j)) {
                    flag = 1;
                }                   
            }   
        }

        if(flag==0) {
            System.out.println("A string possui apenas caracteres unicos");
        } else {
            System.out.println("A string possui caracteres repetidos");
        }

        input.close();
    }
}
