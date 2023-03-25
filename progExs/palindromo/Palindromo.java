package progExs.palindromo;

import java.util.Scanner;

public class Palindromo {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase,fraseIn="";

        System.out.printf("Digite uma palavra ou uma frase: \n");
        frase = in.nextLine();

        frase = frase.replaceAll(" ", "").toLowerCase();

        for(int i=frase.length() - 1; i>=0;i--) {
            fraseIn += frase.charAt(i);
        }

        if (frase.equals(fraseIn)) {
            System.out.printf("A string e um palindromo.\n") ;
        } else {
            System.out.printf("A string nao e um palindromo.\n") ;
        }

        in.close();
    }
}
