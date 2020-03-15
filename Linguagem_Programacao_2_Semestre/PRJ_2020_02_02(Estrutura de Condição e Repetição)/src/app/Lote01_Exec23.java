/*
Objetivo   : Exercício 23 - Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor
             não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Programador: Fernando Oliveira da Costa
Data       : 13/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec23
{
    public static void main(String[] args)
    {
        double val1, val2, val3, val4;
        val1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor:"));
        val2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor:"));
        while (val2 < val1)
        {
            System.out.println("O segundo valor deve ser maior que o primeiro.");
            val2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor:"));
        }
        val3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro valor:"));
        while (val3 < val2)
        {
            System.out.println("O terceiro valor deve ser maior que o segundo.");
            val3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro valor:"));
        }
        val4 = Double.parseDouble(JOptionPane.showInputDialog("Insira um quarto valor qualquer (não é necessário que seja maior que o terceiro):"));
        if (val4 > val3)
        {
            System.out.println("Segue abaixo os valores dispostos em ordem crescente:");
            System.out.println("1º = " + val1);
            System.out.println("2º = " + val2);
            System.out.println("3º = " + val3);
            System.out.println("4º = " + val4);
        }
            else if (val4 > val2)
            {
                System.out.println("Segue abaixo os valores dispostos em ordem crescente:");
                System.out.println("1º = " + val1);
                System.out.println("2º = " + val2);
                System.out.println("3º = " + val4);
                System.out.println("4º = " + val3);
            }
                else if (val4 > val1)
                {
                    System.out.println("Segue abaixo os valores dispostos em ordem crescente:");
                    System.out.println("1º = " + val1);
                    System.out.println("2º = " + val4);
                    System.out.println("3º = " + val2);
                    System.out.println("4º = " + val3);
                }
                    else
                    {
                        System.out.println("Segue abaixo os valores dispostos em ordem crescente:");
                        System.out.println("1º = " + val4);
                        System.out.println("2º = " + val1);
                        System.out.println("3º = " + val2);
                        System.out.println("4º = " + val3);
                    }
    }
}