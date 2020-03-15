/*
Objetivo   : Série 05 - Usando recursividade, faça um algoritmo que calcule a série:
             (N)! + (N-1)! + (N-2)! + ... + (1)!
Programador: Fernando Oliveira da Costa
Data       : 14/03/2020
*/
package app;

import javax.swing.JOptionPane;

public class Recursividade_05
{
    public static void main(String[] args)
    {
        //Recebe input da variável "N" da série.
        int enesimoTermoSerie05 = Integer.parseInt(JOptionPane.showInputDialog("Insira o enésimo termo da série: \nSérie: (N)! + (N-1)! + (N-2)! + ... + (1)!"));
        JOptionPane.showMessageDialog(null, "O resultado da série para o valor inserido ("+ enesimoTermoSerie05+ ") é de: "+ fCalcSerie05(enesimoTermoSerie05));
    }
    
    //Função fCalcSerie05: Calcula o valor da série para o enésimo termo inserido na variável "enesimoTermoSerie05".
    public static int fCalcSerie05(int n)
    {
        int recebeSomaSerie05 = 0;
        if(n > 0)
        {
            recebeSomaSerie05 = fCalcFatorial(n) + fCalcSerie05(n-1);
            return recebeSomaSerie05;
        }
        else {return n;}
    }


    //Função: Calcula o valor do fatorial para o enésimo termo inserido na variável "enesimoTermoSerie05" (usada dentro da função (fCalcSerie05).
    public static int fCalcFatorial(int n)
    {
        int recebeFatorial = 0;
        if(n > 1)
        {
            recebeFatorial = n * fCalcFatorial(n - 1);
            return recebeFatorial;
        }
        else {return n;}
    }
}