/*
Objetivo   : Exercício 34 - Receba um número. Calcule e mostre os resultados da tabuada desse número.
Programador: Fernando Oliveira da Costa
Data       : 28/02/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec34
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Insira o número que deseja ver a tabuada:"));
        while (num % 1 != 0)
        {
            System.out.println("Ops, apenas números inteiros são bem vindos aqui.");
            num = Integer.parseInt(JOptionPane.showInputDialog("Insira o número que deseja ver a tabuada:"));
        }
        for (int i=0; i<=10; i++)
        {
            System.out.println(num + "*" + i + " = " + (num*i));
        }
    }
}