package Ex6Vendedor;

public class Vendedor {
    
    private String nome;
    private double venda=0;
    private double comissao=0.09;
    private double salarioBase=0;

    public Vendedor(String nome,double salarioBase) {
        this.salarioBase = salarioBase;
        this.nome = nome;
    }

    public void setVenda(double venda) {
        this.venda += venda;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void getSalario() {
        double salario;
        salario = salarioBase + (venda*comissao);
        System.out.printf("O vendedor %s vendeu %.2f, e com a comissao recebera %.2f de salario essa semana",nome,venda,salario);
    }

}
