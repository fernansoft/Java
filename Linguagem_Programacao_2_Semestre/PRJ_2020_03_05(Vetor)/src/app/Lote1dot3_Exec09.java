/*
Objetivo   : Exec09. Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que
             a diagonal principal terá seus dados carregados no programa segundo:
             1  -   -   -
             -  4   -   -
             -  -   16  -
             -  -   -   64
Programador: Fernando Oliveira da Costa
Data       : 17/07/2020
*/
package app;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lote1dot3_Exec09
{
    public static void main(String[] args)
    {
        int MatrizExec09[][] = new int [4][4];
        int valorDiagonal = 1;
        for(int linha=0; linha<MatrizExec09.length; linha++)
        {
            for(int coluna=0; coluna<MatrizExec09[0].length; coluna++)
            {
                if(linha==coluna)
                {
                    MatrizExec09[linha][coluna] = valorDiagonal*valorDiagonal;
                    valorDiagonal *= 2;
                }
                else
                {
                    SecureRandom random = new SecureRandom();
                    MatrizExec09[linha][coluna] = random.nextInt(41)+10;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz gerada: \n"+ Arrays.deepToString(MatrizExec09).replace("], ", "]\n "));
    }
}