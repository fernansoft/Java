/*
Objetivo   : Série 01 - Usando recursividade, faça um algoritmo que calcule a série: (1+2+3+...+100).
Programador: Fernando Oliveira da Costa
Data       : 12/03/2020
*/
package app;

import javax.swing.JOptionPane;

public class Recursividade_01
{
    public static void main(String[] args)
    {
        int indice = 100;
        JOptionPane.showMessageDialog(null, "O resultado da série para o valor limite (100) é de: "+ fCalcSerie01(indice));
    }

    //Função: calcula a soma dos valores da série.
    public static int fCalcSerie01(int n)
    {
        int recebeSomaSerie01 = 0;
        if(n > 0)
        {
            recebeSomaSerie01 = n + fCalcSerie01(n-1);
            return recebeSomaSerie01;
        }
        else
        {
            return n;
        }
    }
}