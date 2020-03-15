/*
Objetivo   : Exercício 44 - Receba o número da base e do expoente.
             Calcule e mostre o valor da potência.
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec44
{
    public static void main(String[] args)
    {
        double base, expoente;
        base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base:"));
        expoente = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do expoente:"));
        JOptionPane.showMessageDialog(null, "O valor de "+ base+ " elevado a "+ expoente+ " é igual à: "+ Math.pow(base, expoente));
    }
}