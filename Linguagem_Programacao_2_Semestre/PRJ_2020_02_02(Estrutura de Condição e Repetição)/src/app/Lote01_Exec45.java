/*
Objetivo   : Exercício 45 - Calcule e mostre a série:
             1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec45
{
    public static void main(String[] args)
    {
        double valorDaSequencia = 0;
        for(double i=1; i<=15; i++)
        {
            if(i % 2 != 0)
            {
                valorDaSequencia = valorDaSequencia + (i/(i*i));
            }
            else if(i % 2 == 0)
            {
                valorDaSequencia = valorDaSequencia - (i/(i*i));
            }
        }
        JOptionPane.showMessageDialog(null, "O resultado da série é: "+ valorDaSequencia);
    }
}