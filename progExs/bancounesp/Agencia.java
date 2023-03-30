package progExs.bancounesp;

import java.util.ArrayList;

public class Agencia {
    private String name;
    private int agencyNumber;
    private int bankNumber;
    private ArrayList<Conta> accounts = new ArrayList<Conta>();

    public Agencia(String name, int bankNumber, ArrayList<Conta> accounts) {
        this.name = name;
        this.bankNumber = bankNumber;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public int getBankNumber() {
        return bankNumber;
    }
    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public ArrayList<Conta> getAccounts() {
        return accounts;
    }
    public void setAccounts(ArrayList<Conta> accounts) {
        this.accounts = accounts;
    }

}
