/*
Objetivo   : Exec10. Criar uma matriz [8][8] onde o programa irá carregar segundo:
             Índice 0 1 2 3 ...
             valor  1 2 4 8 ...
             - Exibir a soma dos valores.
Programador: Fernando Oliveira da Costa
Data       : 18/07/2020
*/
package app;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lote1dot3_Exec10
{
    public static void main(String[] args)
    {
        double MatrizExec10[][] = new double [8][8];
        double numeroCasa = 0, soma = 0;
        for(int linha=0; linha<MatrizExec10.length; linha++)
        {
            for(int coluna=0; coluna<MatrizExec10[0].length; coluna++)
            {
                MatrizExec10[linha][coluna] = Math.pow(2, numeroCasa);
                soma += MatrizExec10[linha][coluna];
                numeroCasa += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz gerada: \n"+ Arrays.deepToString(MatrizExec10).replace("], ","]\n " )+ "\n\nSoma dos termos: \n"+ soma);
    }
}