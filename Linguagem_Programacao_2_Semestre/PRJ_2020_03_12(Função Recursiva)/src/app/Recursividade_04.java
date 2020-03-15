/*
Objetivo   : Série 04 - Usando recursividade, faça um algoritmo que calcule a série:
             (N/1) + ((N-1)/2) + ((N-2)/3) + .... + (1/N).
Programador: Fernando Oliveira da Costa
Data       : 14/03/2020
*/
package app;

import javax.swing.JOptionPane;

public class Recursividade_04
{
    public static void main(String[] args)
    {
        //Recebe input da variável "N" da série.
        double enesimoTermoSerie04 = Double.parseDouble(JOptionPane.showInputDialog("Insira o enésimo termo da série: \nSérie: (N/1) + ((N-1)/2) + ((N-2)/3) + .... + (1/N)"));
        double denominadorSerie04 = 1;
        JOptionPane.showMessageDialog(null, "O resultado da série para o enésimo valor inserido ("+ enesimoTermoSerie04+ ") é: "+ fCalcSerie04(denominadorSerie04, enesimoTermoSerie04));
    }
    
    //Função: Calcula a série para o enésimo termo inserido na variável "enesimoTermo".
    public static double fCalcSerie04(double m, double n)
    {
        double recebeSomaSerie04 = 0;
        if(n > 0)
        {
            recebeSomaSerie04 = n/m + fCalcSerie04(m + 1, n - 1);
            return recebeSomaSerie04;
        }
        else {return n;}
    }
}