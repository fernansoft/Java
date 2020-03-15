/*
Objetivo   : Exercício 06 - Recebe os valores em x e y. Efetua a troca de seus valores e mostre seus
             conteúdos.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec06 
{
    public static void main(String[] args) 
    {
        double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de X:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de Y:"));
        x = (x + y);
        y = x - y;
        x = x - y;
        System.out.println("O novo valor de X é: " + x);
        System.out.println("O novo valor de Y é: " + y);
    }
}