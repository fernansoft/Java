/*
Objetivo   : Exercício 24 - Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Programador: Fernando Oliveira da Costa
Data       : 13/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec24
{
    public static void main(String[] args)
    {
        int val;
        val = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro:"));
        if (val % 2 == 0 && val % 3 == 0)
        {
            System.out.println("O valor é divisível por dois e por três.");
            System.out.println("Input = " + val);
            System.out.println(val + " / 2 = " + (val / 2));
            System.out.println(val + " / 3 = " + (val / 3));
        }
            else if (val % 2 == 0)
            {
                System.out.println("O valor é divisível por dois.");
                System.out.println("Input = " + val);
                System.out.println(val + " / 2 = " + (val / 2));
            }
                else if (val % 3 == 0)
                {
                    System.out.println("O valor é divisível por três.");
                    System.out.println("Input = " + val);
                    System.out.println(val + " / 3 = " + (val / 3));
                }
                    else
                    {
                        System.out.println("O valor não é divisível nem por dois e nem por três.");
                        System.out.println("Input = " + val);
                    }
    }
}