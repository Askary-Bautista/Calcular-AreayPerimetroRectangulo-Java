/*Elaborar un programa que solicite la base y la altura de un rectangulo para
calcular el area y su perimetro, mstrando los resultados por pantalla
perimetro=2(base+altura)
area = base * altura
*/
package ejercicio_2;

import javax.swing.JOptionPane;

public class Ejercicio_2 {


    public static void main(String[] args) {
        float base,altura;
        float perimetro,area;
        
        base = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la base del rectangulo"));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la altura del rectangulo"));

        perimetro = (base + altura) * 2;
        area = base * altura;
        
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: " + perimetro + "\n" + "El Area del rectangulo es: "  + area);
    }
    
}
