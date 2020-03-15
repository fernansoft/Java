/*
Objetivo   : Exercício 24 - Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Programador: Fernando Oliveira da Costa
Data       : 05/03/2020
*/
package app;
import javax.swing.JOptionPane;
public class LT01_MODPROC24
{
    static int val;
    public static void main(String[] args)
    {
        val = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro:"));
        verifDivisiveis();
    }
    
    
    public static void verifDivisiveis()
    {        
        if (val % 2 == 0 && val % 3 == 0)
        {
            JOptionPane.showMessageDialog(null, "O valor é divisível por dois e por três."+ "\nInput = "+ val+ "\n"+ val+ " / 2 = "+ (val / 2)+ "\n"+ val+ " / 3 = "+ (val / 3));
        }
            else if (val % 2 == 0)
            {
                JOptionPane.showMessageDialog(null, "O valor é divisível por dois.\n"+ "Input = " + val+ "\n"+ val + " / 2 = " + (val / 2));
            }
                else if (val % 3 == 0)
                {
                    JOptionPane.showMessageDialog(null, "O valor é divisível por três.\n"+ "Input = " + val+ "\n"+ val + " / 3 = " + (val / 3));
                }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "O valor não é divisível nem por dois e nem por três.\n"+ "Input = " + val);
                    }
    }
}