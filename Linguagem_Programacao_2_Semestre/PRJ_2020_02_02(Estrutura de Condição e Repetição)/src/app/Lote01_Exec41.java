/*
Objetivo   : Exercício 41 - Mostre todas as possibilidades de 2 dados de forma que a soma tenha
             como resultado 7.
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec41
{
    public static void main(String[] args)
    {
        System.out.println("Possibilidades de combinações de dois dados que somam 7:");
        for(int dado1=1; dado1<=6; dado1++)
        {
            for(int dado2=1; dado2<=6; dado2++)
            {
                if(dado1 + dado2 == 7)
                {
                    JOptionPane.showMessageDialog(null, "1º Dado = "+ dado1+ "\n2º Dado = "+ dado2+ "\nSoma = "+ (dado1 + dado2));
                }
            }
        }
    }
}