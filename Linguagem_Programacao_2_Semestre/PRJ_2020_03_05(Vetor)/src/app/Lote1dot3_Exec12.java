/*
Objetivo   : Exec12. Carregar códigos das peças em um tabuleiro de xadrez, onde:
             Código:  1     2     3     4      5     6    7
             Peça:   Peão Torre Bispo Cavalo Rainha Rei Vazio
             Calcular e mostrar a soma das peças do tabuleiro.
             (Não pode utilizar estrutura de decisão e switch case na contagem das peças)
Programador: Fernando Oliveira da Costa
Data       : 20/07/2020
*/
package app;

import java.security.SecureRandom;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Lote1dot3_Exec12
{
    public static void main(String[] args)
    {
        int MatrizExec12[][] = new int [8][8];
        int VetorExec12[] = new int [7];
        SecureRandom random = new SecureRandom();
        for(int linha=0; linha<MatrizExec12.length; linha++)
        {
            for(int coluna=0; coluna<MatrizExec12[0].length; coluna++)
            {
                MatrizExec12[linha][coluna] = random.nextInt(7)+1;
                VetorExec12[MatrizExec12[linha][coluna]-1] += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz gerada aleatóriamente: \n"+ Arrays.deepToString(MatrizExec12).replace("], ", "]\n ")+ "\n\nQuantidade por peça:\nPeão: "+ VetorExec12[0]+ "\nTorre: "+ VetorExec12[1]+ "\nBispo: "+ VetorExec12[2]+ "\nCavalo: "+ VetorExec12[3]+ "\nRainha: "+ VetorExec12[4]+ "\nRei: "+ VetorExec12[5]+ "\nVazio: "+ VetorExec12[6]);
    }
}