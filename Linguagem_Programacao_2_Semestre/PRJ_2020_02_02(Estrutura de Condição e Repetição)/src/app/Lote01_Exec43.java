/*
Objetivo   : Exercício 43 - Calcule e mostre quantos anos serão necessários
para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e 
cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec43
{
    public static void main(String[] args)
    {
        double ana = 1.1, maria = 1.5;
        int anos = 0;
        while(ana<=maria)
        {
            ana = ana + 0.03;
            maria = maria + 0.02;
            anos = anos + 1;
        }
        JOptionPane.showMessageDialog(null, "A quantidade de anos necessários para que Ana seja maior que Maria é de: "+ anos+ " anos.");
    }
}