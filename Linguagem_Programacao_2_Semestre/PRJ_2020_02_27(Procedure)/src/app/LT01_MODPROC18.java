/*
Objetivo   : Exercício 18 - Receber 2 valores inteiros. Calcular e mostrar o resultado da diferença 
             do maior pelo menor. 
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/
package app;
import javax.swing.JOptionPane;
public class LT01_MODPROC18
{
    static int valor1, valor2;
    public static void main(String[] args)
    {
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor inteiro:"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor inteiro:"));
        difMenorMaior();
    }

    
    public static void difMenorMaior()
    {
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