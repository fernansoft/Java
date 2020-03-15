/*
Objetivo   : Exercício 14 - Recebe 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec14
{
    public static void main(String[] args)
    {
        int ang1, ang2;
        ang1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro ângulo do triangulo:"));
        ang2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo ângulo do triangulo:"));
        System.out.println("O valor do terceiro ângulo é de: " + (180 - (ang1 + ang2)) + "º");
    }
}