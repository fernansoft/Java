/*
Objetivo   : Exercício 12 - Receba o ano de nascimento e o ano atual. Calcule e mostre a sua 
             idade e quantos anos terá daqui a 17 anos.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec12
{
    public static void main(String[] args)
    {
        double anodenascimento, anoatual, idade;
        anodenascimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu ano de nascimento:"));
        anoatual = Double.parseDouble(JOptionPane.showInputDialog("Insira o ano atual:"));
        idade = anoatual - anodenascimento;
        System.out.println("A sua idade atual é: " + idade + " anos");
        System.out.println("Sua idade daqui a 17 anos será: " + (idade + 17));
    }
}