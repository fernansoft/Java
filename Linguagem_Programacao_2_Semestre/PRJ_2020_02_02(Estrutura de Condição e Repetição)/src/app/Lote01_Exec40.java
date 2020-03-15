/*
Objetivo   : Exercício 40 - Receba 2 números inteiros. Verifique e mostre todos os números primos
             existentes entre eles. 
Programador: Fernando Oliveira da Costa
Data       : 03/03/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec40
{
    public static void main(final String[] args)
    {
        double numA = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor inicial do intervalo:"));
        double numB = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor final do intervalo:"));
        double qtdeDivisores;
        System.out.println("A lista de números primos contidos no intervalo inserido é:\n" + "Número: 2");
        for(double i=numA; i<=numB; i++)
        {
            qtdeDivisores = 0;
            for(double x=1; x<=i; x++)
            {
                if(i % 2 != 0 && qtdeDivisores < 3)
                {
                    if(i % x == 0)
                    {qtdeDivisores = qtdeDivisores + 1;}
                }
            }
            if(qtdeDivisores == 2)
            {System.out.println("Número: " + i);}
        }
    }
}