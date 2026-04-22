

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double sb, vp, lp;
        sb = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário bruto: "));
        vp = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da parcela: "));
        lp = sb * 0.3;
        if (vp<=lp){
            JOptionPane.showMessageDialog(null,"Empréstimo CONCEDIDO");
        }else{
            JOptionPane.showMessageDialog(null,"Empréstimo NEGADO");
        }
    }
}
