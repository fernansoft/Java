/*
Objetivo   : Exercício 26 - Receba 2 números inteiros. Verifique e mostre se o maior número é 
             múltiplo do menor.
Programador: Fernando Oliveira da Costa
Data       : 15/02/2020
*/

package app;
import javax.swing.JOptionPane;

public class Lote01_Exec26
{
    public static void main (String[] args)
    {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor inteiro:"));
        if (num1 > num2)
        {
            if (num1 % num2 == 0)
            {
                System.out.println("O maior número é múltiplo do menor.");
                System.out.println("Maior = " + num1);
                System.out.println("Menor = " + num2);
            }
                else
                {
                    System.out.println("O maior número é múltiplo do menor.");
                    System.out.println("Maior = " + num1);
                    System.out.println("Menor = " + num2);
                }
        }
        else
        {
            if (num2 % num1 == 0)
            {
                System.out.println("O maior número é múltiplo do menor.");
                System.out.println("Maior = " + num2);
                System.out.println("Menor = " + num1);
            }
                else
                {
                    System.out.println("Ops, o número maior não é múltiplo do menor.");
                    System.out.println("Maior = " + num2);
                    System.out.println("Menor = " + num1);
                }
        }
    }
    
}