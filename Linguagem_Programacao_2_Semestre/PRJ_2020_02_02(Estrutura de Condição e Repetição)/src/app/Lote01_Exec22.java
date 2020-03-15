/*
Objetivo   : Exercício 22 - Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Programador: Fernando Oliveira da Costa
Data       : 13/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec22
{
    public static void main(String[] args)
    {
        int val1, val2;
        val1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
        while (val2 == val1)
        {
            System.out.println("Ops, não é possível inserir valores iguais, tente outro valor.");
            val2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor novamente:"));
        }
        if (val1 > val2)
        {
            System.out.println("A seguir, os valores apresentados em ordem crescente:");
            System.out.println("1º - " + val2);
            System.out.println("2º - " + val1);
        }
            else
            {
                System.out.println("A seguir, os valores apresentados em ordem crescente:");
                System.out.println("1º - " + val1);
                System.out.println("2º - " + val2);
            }
    }
}