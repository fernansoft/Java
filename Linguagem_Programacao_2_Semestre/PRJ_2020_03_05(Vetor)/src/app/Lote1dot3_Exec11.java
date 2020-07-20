/*
Objetivo   : Exec11. Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
             1 1 1 1 1 1 1 1
             1 2 2 2 2 2 2 1
             1 2 3 3 3 3 2 1
             1 2 3 4 4 3 2 1
             1 2 3 4 4 3 2 1
             1 2 3 3 3 3 2 1
             1 2 2 2 2 2 2 1
             1 1 1 1 1 1 1 1
Programador: Fernando Oliveira da Costa
Data       : 18/07/2020
*/
package app;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lote1dot3_Exec11
{
    public static void main(String[] args)
    {
        int MatrizExec11[][] = new int [8][8];
        int volta = 0, iniLinha = 0, fimLinha = MatrizExec11.length, iniColuna = 0, fimColuna = MatrizExec11[0].length;
        do
        {
            for(int linha=iniLinha; linha<fimLinha; linha++)
            {
                for(int coluna=iniColuna; coluna<fimColuna; coluna++)
                {
                    MatrizExec11[linha][coluna] += 1;
                }
            }
            iniLinha+=1; iniColuna+=1; fimLinha-=1; fimColuna-=1;
            volta += 1;
            JOptionPane.showMessageDialog(null, "Matriz gerada na volta "+ volta+ ":\n"+ Arrays.deepToString(MatrizExec11).replace("], ", "]\n "));
        }
        while(volta!=4);
    }
}