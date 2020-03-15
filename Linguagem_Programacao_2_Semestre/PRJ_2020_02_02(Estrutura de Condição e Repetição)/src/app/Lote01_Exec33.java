/*
Objetivo   : Exercício 33 - Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador: Fernando Oliveira da Costa
Data       : 28/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec33
{
    public static void main(String[] args)
    {
        double num = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser calculado:"));
        double fracao, soma = 0;
        for (double i=1; i<=num; i++)
        {
            fracao = 1/i;
            soma = soma + fracao;
        }
        System.out.println("A soma da sequência para o número " + num + " é de: " + soma);
    }
}