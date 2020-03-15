/*
Objetivo   : Exercício 36 - Receba um número N. Calcule e mostre a série:
             1 + 1/1! + 1/2! + ... + 1/N!
Programador: Fernando Oliveira da Costa
Data       : 28/02/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec36
{
    public static void main(String[] args)
    {
        double numberN = Double.parseDouble(JOptionPane.showInputDialog("Insira o enésimo termo da série:"));
        while (numberN < 1)
        {
            System.out.println("O campo aceita apenas números maiores que 0.");
            numberN = Double.parseDouble(JOptionPane.showInputDialog("Insira outro número para ser o enésimo termo da série:"));
        }
        double fatorial, serie = 1;
        for (double i=numberN; i>=1; i--)
        {
            fatorial = 1;
            for (double f=i; f>1; f--)
            {
                fatorial = fatorial * f;
            }
            System.out.println(fatorial);
            serie = serie + (1/fatorial);
        }
        System.out.println("O resultado da série é de: " + (serie));
    }
}
