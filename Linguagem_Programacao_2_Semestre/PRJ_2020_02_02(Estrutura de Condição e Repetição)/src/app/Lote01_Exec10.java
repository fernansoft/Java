/*
Objetivo   : Exercício 10 - Receba 2 números reais. Calcule e mostre a diferença desses valores.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec10
{
    public static void main(String[] args)
    {
        double n1, n2, diferenca;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número real qualquer: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro número real qualquer: "));
        diferenca = n1 - n2;
        System.out.println("A diferença do primeiro valor para o segundo é de: " + diferenca);
    }
}