import javax.swing.JOptionPane;

public class Triangulo {
    float base;
    float altura;

    public Triangulo(){

    }

    public Triangulo (float b, float a){
        base = b;
        altura = a;
    }

    public float calculaArea(){
        float area;
        area = base*altura/2;
        return area;
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Base: " + base + "\nAltura: " + altura + "\nA área é: " + calculaArea());
    }
}