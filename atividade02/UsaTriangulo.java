import javax.swing.JOptionPane;

public class UsaTriangulo {
    public static void main(String[] args) {
        float base, altura;

        Triangulo tri1;

        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura: "));

        tri1 = new Triangulo(base, altura);
        tri1.calculaArea();
        tri1.imprimeDados();


    }
}
