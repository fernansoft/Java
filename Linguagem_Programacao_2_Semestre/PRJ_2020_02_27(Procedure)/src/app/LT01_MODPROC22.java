/*
Objetivo   : Exercício 22 - Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/
package app;
import javax.swing.JOptionPane;
public class LT01_MODPROC22
{
    static int val1, val2;
    public static void main(String[] args)
    {
        val1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
        val2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
        mostraOrdemCrescente();
    }
    
    
    public static void mostraOrdemCrescente()
    {
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
                JOptionPane.showMessageDialog(null, "1º = "+ val1+ "\n2º = "+ val2);
            }
    }
}