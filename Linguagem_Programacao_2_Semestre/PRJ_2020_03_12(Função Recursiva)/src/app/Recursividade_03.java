/*
Objetivo   : Série 03 - Usando recursividade, faça um algoritmo que calcule a série: (1/1)+(1/2)+(1/3)+ ...+(1/N).
Programador: Fernando Oliveira da Costa
Data       : 12/03/2020
*/
package app;

import javax.swing.JOptionPane;

public class Recursividade_03
{
    public static void main(String[] args)
    {
        double enesimoTermoSerie03 = Double.parseDouble(JOptionPane.showInputDialog("Insira o enésimo termo da série: "));
        JOptionPane.showMessageDialog(null, "O resultado da série para o valor inserido ("+ enesimoTermoSerie03+ ") é: "+ fCalcSerie03(enesimoTermoSerie03));
    }

    //Função: Calcula a série para o enésimo termo inserido na variável "enesimo".
    public static double fCalcSerie03(double n)
    {
        double recebeSomaSerie03 = 0;
        if(n > 0)
        {
            recebeSomaSerie03 = (1/n) + fCalcSerie03(n-1);
            return recebeSomaSerie03;
        }
        else {return n;}
    }
}