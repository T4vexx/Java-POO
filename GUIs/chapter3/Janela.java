import javax.swing.JOptionPane;

public class Janela {
    
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog(null, "Digite 1 numero da conta");
        String n2 = JOptionPane.showInputDialog(null, "Digite 2 numero da conta");
        int conta = Integer.parseInt(n2) * Integer.parseInt(n1);
        JOptionPane.showMessageDialog(null, String.format("O resultado de %s * %s = %d",n1,n2,conta),"Teste de mensagem", 1);
    }
}
