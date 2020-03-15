/*
Objetivo   : Exercício 05 - Receber os coeficientes A, B e C de uma equação do 2º grau(AX2+BX+C=0).
             Calcular e mostrar as raízes reais (considerar que a equação possuí 2 raízes).
Programador: Fernando Oliveira da Costa
Data       : 06/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec05 
{
    public static void main(String[] args) 
    {
        double a, b, c, x1, x2, delta;
        a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C:"));
        delta = (Math.pow(b, 2)) - (4 * a * c);
        x1 = (- b + (Math.sqrt(delta)))/(2 * a);
        x2 = (- b - (Math.sqrt(delta)))/(2 * a);
        System.out.println("O valor das raízes é de: ");
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);        
    }
}