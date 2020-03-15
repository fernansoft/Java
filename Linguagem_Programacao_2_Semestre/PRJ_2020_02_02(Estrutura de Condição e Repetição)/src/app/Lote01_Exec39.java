/*
Objetivo   : Exercício 39 - Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
             Casa:  1 2 3 4 ... 64
             Qdte:  1 2 4 8 ... N 
Programador: Fernando Oliveira da Costa
Data       : 29/02/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec39
{
    public static void main(final String[] args)
    {
        double qtdeGraos = 1;
        for(int i=2; i<=64; i++)
        {
            qtdeGraos = qtdeGraos * 2;
        }
        String stringQtdeGraos = String.format("%.0f", qtdeGraos);
        JOptionPane.showMessageDialog(null, "Seguindo esse padrão lógico, teremos na casa 64, um total de " + stringQtdeGraos + " grãos.");
    }
}