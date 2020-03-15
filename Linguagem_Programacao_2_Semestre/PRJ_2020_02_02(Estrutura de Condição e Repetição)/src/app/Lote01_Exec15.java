/*
Objetivo   : Exercício 15 - Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec15
{
    public static void main(String[] args)
    {
        double cateto1, cateto2, hipotenusa;
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro cateto:"));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo cateto:"));
        hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        System.out.println("Os dados do triângulo são:");
        System.out.println("Cateto 01 = " + cateto1);
        System.out.println("Cateto 02 = " + cateto2);
        System.out.println("Hipotenusa = " + hipotenusa);
    }
}