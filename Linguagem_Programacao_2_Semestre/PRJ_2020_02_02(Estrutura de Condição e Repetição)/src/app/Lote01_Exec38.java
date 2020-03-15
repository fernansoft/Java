/*
Objetivo   : Exercício 38 - Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor.
             Obs.: somente valores positivos.
Programador: Fernando Oliveira da Costa
Data       : 29/02/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec38
{
    public static void main(final String[] args)
    {
        int numerosInt, maior = 0, menor = 0;
        for(int i=1; i<=5; i++)
        {
            numerosInt = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + i + "º valor a ser verificado:"));
            while(numerosInt < 0)
            {numerosInt = Integer.parseInt(JOptionPane.showInputDialog("Ops, só serão aceitos valores positivos!\n" + "Insira o " + i + "º valor a ser verificado:"));}
            if(i != 1)
            {
                if(numerosInt > maior)
                {maior = numerosInt;}
                if(numerosInt < menor)
                {menor = numerosInt;}
            }
            else if(i == 1)
            {
                maior = numerosInt;
                menor = numerosInt;
            }
        }
        System.out.println(" # O maior valor inserido foi: " + maior + "\n # O menor valor inserido foi: " + menor);
    }
}