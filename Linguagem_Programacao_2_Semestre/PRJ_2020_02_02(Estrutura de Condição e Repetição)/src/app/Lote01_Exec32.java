/*
Objetivo   : Exercício 32 - Receba um número inteiro. Calcule e mostre o seu fatorial.
Programador: Fernando Oliveira da Costa
Data       : 28/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec32
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro:"));
        while (num % 1 != 0)
        {
            System.out.println("Ops, só é possível receber valores inteiros.");
            num = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro:"));
        }
        if (num == 1)
        {
            System.out.println("O fatorial do número 1 é: 1");
        }
        else
        {
            int resultado = num * (num-1);
            for (int i=(num-1); i>2; i--)
            {
                resultado = resultado * (i-1);
            }
            System.out.println("O fatorial do número " + num + " é: " + resultado);
        }
    }
}
