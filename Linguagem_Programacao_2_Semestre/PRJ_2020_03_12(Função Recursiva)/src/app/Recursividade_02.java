/*
Objetivo   : Série 02 - Usando recursividade, faça um algoritmo que calcule a série: (N)+(N-1)+(N-2)+ ... +(1).
Programador: Fernando Oliveira da Costa
Data       : 12/03/2020
*/
package app;

import javax.swing.JOptionPane;

public class Recursividade_02
{
    public static void main(String[] args)
    {
        int enesimoTermoSerie02 = Integer.parseInt(JOptionPane.showInputDialog("Insira o enésimo termo da série: "));
        JOptionPane.showMessageDialog(null, "O resultado da série para o valor limite inserido ("+ enesimoTermoSerie02+ ") é de: "+ fCalcSerie02(enesimoTermoSerie02));

    }

    //Função: Calcula a série para o enésimo termo inserido na variável "enesimo".
    public static int fCalcSerie02(int n)
    {
        int recebeSomaSerie02 = 0;
        if(n > 0)
        {
            recebeSomaSerie02 = n + fCalcSerie02(n-1);
            return recebeSomaSerie02;
        }
        else
        {
            return n;
        }
    }
}