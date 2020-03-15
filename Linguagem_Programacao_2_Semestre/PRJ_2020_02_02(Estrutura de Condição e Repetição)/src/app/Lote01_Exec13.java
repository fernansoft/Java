/*
Objetivo   : Exercício 13 - Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
             durará esse alimento sabendo que a pessoa consome 50g ao dia.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec13
{
    public static void main(String[] args)
    {
        double qtdealimento, dias;
        qtdealimento = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de alimento (em Kg):"));
        dias = qtdealimento / 0.05;
        System.out.println("Considerando um consumo diário de 50g. O alimento irá durar por " + dias + "dias!");
    }
}