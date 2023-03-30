package progExs.bancounesp;

import java.util.ArrayList;

public class Banco {
    private String name;
    private long cnpj;
    private int allDeposit = 0;
    private int bankNumber;
    private ArrayList<Agencia> agencias = new ArrayList<Agencia>();

    public Banco(String name, long cnpj, ArrayList<Agencia> agencias) {
        this.name = name;
        this.cnpj = cnpj;
        this.agencias = agencias;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public long getCnpj() {
        return cnpj;
    }
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public int getAllDeposit() {
        return allDeposit;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }
    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    
}
