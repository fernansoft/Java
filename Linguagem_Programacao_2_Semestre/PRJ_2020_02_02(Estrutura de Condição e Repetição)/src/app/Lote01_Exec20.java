/*
Objetivo   : Exercício 20 - Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
             AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
Programador: Fernando Oliveira da Costa
Data       : 13/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec20
{
    public static void main(String[] args)
    {
        double a, b, c, delta, x1, x2;
        a = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de C:"));
        delta = (b * b) - (4 * a * c);
        if (delta < 0)
        {
            System.out.println("Valor de delta negativo, não existe solução dentro dos números reais para esta equação.");
        }
            else
            {
                x1 = (- b + (Math.sqrt(delta))) / (2 * a);
                x2 = (- b - (Math.sqrt(delta))) / (2 * a);
                if (x1 == x2)
                {
                    System.out.println("Delta é igual a zero, sendo assim, a equação tem apenas uma raiz, sendo esta:");
                    System.out.println("X = " + x1);
                }
                    else
                    {
                        System.out.println("Delta é maior que zero, sendo assim, a equação tem duas raizes, sendo estas:");
                        System.out.println("X1 = " + x1);
                        System.out.println("X2 = " + x2);
                    }
            }
    }
}