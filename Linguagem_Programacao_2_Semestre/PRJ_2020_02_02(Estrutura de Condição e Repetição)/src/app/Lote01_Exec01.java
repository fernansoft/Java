/*
Objetivo   : Exercício 01 - Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
Programador: Fernando Oliveira da Costa
Data       : 06/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec01
{
    public static void main(String[] args)
    {
        double lado;
        lado = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do lado:"));
        System.out.println("O valor da área do quadrado é de: " + (lado * lado));
    }
}