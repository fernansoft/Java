/*
Objetivo   : Exercício 35 - Receba 2 números inteiros, verifique qual o maior entre eles.
             Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
Programador: Fernando Oliveira da Costa
Data       : 28/02/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec35
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número do intervalo:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número do intervalo:"));
        int maior, menor;
        if (num1 > num2)
        {
            maior = num1;
            menor = num2;
        }
        else
        {
            maior = num2;
            menor = num1;
        }
        int somaImpares = 0;
        if (menor % 2 != 0)
        {
            while (menor <= maior)
            {
                somaImpares = somaImpares + menor;
                menor = menor + 2;
            }
        }
        else
        {
            menor = menor + 1;
            while (menor <= maior)
            {
                somaImpares = somaImpares + menor;
                menor = menor + 2;
            }
        }
        System.out.println("O resultado da soma dos números ímpares no intervalo inserido é de: " + somaImpares);
    }
}