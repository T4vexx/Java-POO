package progExs.bancounesp;

import java.util.Scanner;

public class SysBank {
    
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int opt=-1,aux;        
        // Banco myAcc=null;
        // String cpf,name;
        // Double balance;

        // System.out.println("Sistema do banco inicializado");
        // System.out.println("CTRL<z>: exit");
        // System.out.println("1: Criar Conta");
        // System.out.println("2: Depositar");
        // System.out.println("3: Sacar");
        // System.out.println("4: Extrato");
        // while(input.hasNext()) {
        //     opt = input.nextInt();
            
        //     switch (opt){
        //         case 1: 
        //             System.out.print("Digite seu nome: \n");
        //             input.nextLine();
        //             name = input.nextLine();
        //             System.out.print("Digite seu cpf: \n");
        //             cpf = input.nextLine();
        //             System.out.println("Deseja inserir uma quantia ao criar a conta? 1-sim 0-nao");
        //             aux=input.nextInt();
        //             if(aux==1){;
        //                 System.out.println("Digite a quantia que deseja depositar: ");
        //                 balance=input.nextDouble();
        //                 myAcc = new Banco(name,cpf,balance);
        //             } else {
        //                 myAcc = new Banco(name,cpf);
        //             }
        //             break;
        //         case 2: 
        //             if(myAcc!=null) {
        //                 System.out.println("Digite a quantia que deseja depositar: ");
        //                 balance=input.nextDouble();
        //                 myAcc.depositAmount(balance);
        //             } else {
        //                 System.out.println("Voce precisa criar uma conta");
        //             }
        //             break;
        //         case 3: 
        //             if(myAcc!=null) {
        //                 System.out.println("Digite a quantia que deseja sacar: ");
        //                 balance=input.nextDouble();
        //                 myAcc.withdrawAmount(balance,input);
        //             } else {
        //                 System.out.println("Voce precisa criar uma conta");
        //             }
        //             break;
        //         case 4:
        //             if(myAcc!=null) {
        //                 myAcc.getAccountInfos();
        //             } else {
        //                 System.out.println("Voce precisa criar uma conta");
        //             }
        //             break;
        //         default:
        //             break;
        //     }
        // }
        //input.close();
    }
}
