/*
Objetivo   : Exercício 03 - Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
Programador: Fernando Oliveira da Costa
Data       : 06/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec03 
{
    public static void main(String[] args) 
    {
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base do triangulo (em metros):"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura do triangulo (em metros):"));
        area = (base * altura) / 2;
        System.out.println("O valor da área do triangulo é de: " + area + "m");
    }
}