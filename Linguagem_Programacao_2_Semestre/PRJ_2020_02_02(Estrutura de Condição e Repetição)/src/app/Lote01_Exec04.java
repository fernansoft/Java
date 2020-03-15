/*
Objetivo   : Exercício 04 - Receba a temperatura em graus Celsius. Calcule e mostre a 
             sua temperatura convertida em fahrenheit F = (9*C+160) /5.
Programador: Fernando Oliveira da Costa
Data       : 06/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec04 
{
    public static void main(String[] args) 
    {
        double celsius, fahrenheit;
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de graus Celsius:"));
        fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("O valor em graus Celsius é: " + fahrenheit);
    }
}