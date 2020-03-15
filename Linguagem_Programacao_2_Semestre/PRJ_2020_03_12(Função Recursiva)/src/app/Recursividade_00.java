/*
Objetivo   : Série 00 - Colete um nº inteiro, calcule (seu fatorial a partir de uma função recursiva) e mostre o resultado.
Programador: Fernando Oliveira da Costa
Data       : 12/03/2020
*/
package app;

import javax.swing.JOptionPane;

public class Recursividade_00
{
    public static void main(String[] args)
    {
        //nFatorial: Recebe o número a ser calculado seu fatorial.
        int nFatorial = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a ter seu fatorial calculado: "));
        JOptionPane.showMessageDialog(null, "O resultado do fatorial do número "+ nFatorial+ " é: "+ fCalcFatorial(nFatorial));
    }

    //Função: calcula o fatorial do input na variável "nFatorial".
    public static int fCalcFatorial(int n)
    {
        int fatVal = 0;
        if(n>1)
        {
            fatVal = n * fCalcFatorial(n-1);
            return fatVal;
        }
        else
        {
            return n;
        }
    }
}