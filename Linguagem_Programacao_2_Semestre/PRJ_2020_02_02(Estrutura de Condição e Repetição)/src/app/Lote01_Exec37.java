/*
Objetivo   : Exercício 37 - Receba um número inteiro. Calcule e mostre a série
             de Fibonacci até o seu N’nésimo termo.
Programador: Fernando Oliveira da Costa
Data       : 29/02/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec37
{
    public static void main(final String[] args)
    {
        double numN = Double.parseDouble(JOptionPane.showInputDialog("Insira o enésimo termo da série (apenas valores inteiros):"));
        double numMenosUm = 0, numMenosDois = 1, somaNums;
        while(numN < 0)
        {numN = Integer.parseInt(JOptionPane.showInputDialog("Ops, favor inserir apenas valores positivos.\n" + "Insira o enésimo termo da série (apenas valores inteiros):"));}
        for (int i=1; i<=numN; i++)
        {
            somaNums = numMenosUm + numMenosDois;
            //Obs: Essas conversões em String são apenas para questão visual do println, pois quando i=50 os números se apresentam "negativos".
            String stringSomaNums = String.format("%.0f", somaNums);
            String stringNumMenosUm = String.format("%.0f", numMenosUm);
            String stringNumMenosDois = String.format("%.0f", numMenosDois);
            //JOptionPane.showMessageDialog(null, "Para N = " + i + " temos:\n" + stringNumMenosDois + " + " + stringNumMenosUm + " = " + stringSomaNums + "\n");
            System.out.println("Para N = " + i + " temos:\n" + stringNumMenosDois + " + " + stringNumMenosUm + " = " + stringSomaNums + "\n");
            numMenosDois = numMenosUm;
            numMenosUm = somaNums;
        }
    }
}
