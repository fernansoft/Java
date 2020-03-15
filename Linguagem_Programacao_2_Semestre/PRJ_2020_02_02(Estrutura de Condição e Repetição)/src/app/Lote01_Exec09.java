/*
Objetivo   : Exercício 09 - Recebe 2 números inteiros. Calcule e mostre a soma dos quadrados.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec09
{
    public static void main(String[] args)
    {
        int n1, n2, somaquadrados;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro qualquer: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor inteiro qualquer: "));
        somaquadrados = (n1*n1)+(n2*n2);
        System.out.println("O valor da soma dos quadrados dos números inputados é de: " + somaquadrados);
    }
}