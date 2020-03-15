/*
Objetivo   : Exercício 19 - Receba 2 valores reais. Calcule e mostre o maior deles.
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/
package app;
import javax.swing.JOptionPane;
public class LT01_MODPROC19
{
    static double valor1, valor2;
    public static void main(String[] args)
    {
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
        mostraMaior();
    }

    
    public static void mostraMaior()
    {
        if (valor1 > valor2)
        {
            System.out.println("O maior valor foi o primeiro input, com valor: " + valor1);
        }
            else
            {
                System.out.println("O maior valor foi o segundo input, com valor: " + valor2);
            }
    }
}