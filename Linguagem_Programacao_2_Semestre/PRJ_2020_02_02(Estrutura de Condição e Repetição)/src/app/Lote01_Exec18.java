/*
Objetivo   : Exercício 18 - Receber 2 valores inteiros. Calcular e mostrar o resultado da diferença 
             do maior pelo menor. 
Programador: Fernando Oliveira da Costa
Data       : 13/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec18
{
    public static void main(String[] args)
    {
        int valor1, valor2;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor inteiro:"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor inteiro:"));
        if (valor1 > valor2)
        {
            System.out.println("A diferença do maior pelo menor é de: " + (valor1 - valor2));
        }
            else
            {
                System.out.println("A diferença do maior pelo menor é de: " + (valor2 - valor1));
            }
    }
}