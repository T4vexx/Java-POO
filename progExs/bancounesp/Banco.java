package progExs.bancounesp;

import java.util.Scanner;

public class Banco {

    private String name;
    private String cpf;
    private double balance;
    private double overdraft=0;
    private int accountId;
    private String agency;
    private static int count = 0;

    public Banco(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
        balance = 0;
        count++;
        accountId = count;
        agency = "0001";
    }

    public Banco(String name, String cpf, Double balance) {
        this.name = name;
        this.cpf = cpf;
        this.balance = balance;
        count++;
        accountId = count;
        agency = "0001";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAgency() {
        return agency;
    }

    public int getNumberOfAccounts() {
        return count;
    }

    public void getAccountInfos() {
        System.out.printf("Olá %s \nSeu cpf: %s\nSeu conta: %d\nSua agencia: %s\nSaldo em conta: %.2f\nCheque especial: %.2f\n",name,cpf,accountId,agency,balance,overdraft);
    }
 
    public void depositAmount(Double depositAmount) {
        if(overdraft>0) {
            if(depositAmount>overdraft) {
                depositAmount -= overdraft;
                overdraft=0;
                balance += depositAmount;
                System.out.printf("O seu debito do cheque especial foi quitado!\nO seu novo saldo é: %.2f\n",balance);
            } else {
                overdraft -= depositAmount;
                System.out.printf("Valor abatido no cheque especial, voce ainda tem %.2f de debito\n",overdraft);
            }
        } else {    
            balance += depositAmount;
            System.out.printf("O seu novo saldo é: %.2f\n",balance);
        }   
    }

    public void withdrawAmount(Double withdrawAmount, Scanner input) {
        if(withdrawAmount > balance) {
            System.out.println("Voce nao tem saldo - deseja solicitar o cheque especial? (0-nao | 1-sim)");
            int n;
            double aux;
            n = input.nextInt();
            if(n==1) {
                aux = withdrawAmount - balance;
                if(aux + overdraft <= 1000) {
                    overdraft += aux;
                    balance = 0;
                    System.out.printf("Voce tem 0 reais na conta e possui %.2f negativado em cheque especial\n",overdraft);
                } else {
                    System.out.println("Voce excedeu o limite de 1000 reais do cheque especial - operação cancelada");
                }  
            }
        } else {
            balance -= withdrawAmount;
            System.out.printf("O seu novo saldo é: %.2f\n",balance);
        }
    }
}
