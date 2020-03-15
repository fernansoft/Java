/*
Objetivo   : Exercício 26 - Receba 2 números inteiros. Verifique e mostre se o maior número é 
múltiplo do menor.
Programador: Fernando Oliveira da Costa
Data       : 05/03/2020
*/

package app;
import javax.swing.JOptionPane;

public class LT01_MODPROC26
{
    static int num1, num2;
    public static void main (String[] args)
    {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor inteiro:"));
        verifMultiplos();
    }


    public static void verifMultiplos()
    {        
        if (num1 > num2)
        {
            if (num1 % num2 == 0)
            {
                JOptionPane.showMessageDialog(null, "O maior número é múltiplo do menor.\n"+ "Maior = " + num1+ "\n"+ "Menor = " + num2);
            }
                else
                {
                    JOptionPane.showMessageDialog(null, "O maior número é múltiplo do menor.\n"+ "Maior = " + num1+ "\n"+ "Menor = " + num2);
                }
        }
        else
        {
            if (num2 % num1 == 0)
            {
                JOptionPane.showMessageDialog(null, "O maior número é múltiplo do menor.\n"+ "Maior = " + num2+ "\n"+ "Menor = " + num1);
            }
                else
                {
                    JOptionPane.showMessageDialog(null, "Ops, o número maior não é múltiplo do menor.\n"+ "Maior = " + num2+ "\n"+ "Menor = " + num1);
                }
        }
    }
    
}