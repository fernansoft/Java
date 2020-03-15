/*
Objetivo   : Exercício 11 - Receba o raio de uma circunferência. Calcule e mostre o comprimento da
             circunferência.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec11
{
    public static void main(String[] args)
    {
        double raio, comprimento;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio (em metros):"));
        comprimento = 2 * 3.14 * raio;
        System.out.println("O comprimento da circunferência do circulo é de: " + comprimento + "m");
    }
}