/*
Objetivo   : Exercício 19 - Receba 2 valores reais. Calcule e mostre o maior deles.
Programador: Fernando Oliveira da Costa
Data       : 13/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec19
{
    public static void main(String[] args)
    {
        double valor1, valor2;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
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