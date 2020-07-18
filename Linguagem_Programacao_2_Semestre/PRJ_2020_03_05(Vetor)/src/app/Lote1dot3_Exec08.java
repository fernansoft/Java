/*
Objetivo   : Exec08. Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos
             vendidos em 4 semanas. Calcular e exibir:
             a. A quantidade de cada produto vendido no mês;
             b. A quantidade de produtos vendidos por semana;
             c. O total de produtos vendidos no mês.
Programador: Fernando Oliveira da Costa
Data       : 17/07/2020
*/
package app;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lote1dot3_Exec08
{
    public static void main(String[] args)
    {
        int MatrizExec08[][] = new int [4][3];
        for(int linha=0; linha<MatrizExec08.length; linha++)
        {
            for(int coluna=0; coluna<MatrizExec08[0].length; coluna++)
            //for: Preencher a matriz [4][3] com valores aleatórios.
            {
                SecureRandom random = new SecureRandom();
                MatrizExec08[linha][coluna] = random.nextInt(90)+10;
                //random: gera valores aleatórios de 10 à 99.
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz gerada:\n"+ Arrays.deepToString(MatrizExec08).replace("], ", "]\n "));
        //JOptionpane: Imprime a Matriz gerada em formato de tabela.
        System.out.println("Matriz gerada:\n"+ Arrays.deepToString(MatrizExec08).replace("], ", "]\n "));
        //sysout: Mostra a matriz gerada no console para conferência dos cálculos posteriores.
        A_qtdeVendMes(MatrizExec08);
        B_qtdeVendSemana(MatrizExec08);
        C_qtdeVendMes(MatrizExec08);
    }

    public static void A_qtdeVendMes(int Matriz[][])
    {
        int VetorA[] = new int [Matriz[0].length];
        //Vetor com a quantidade de colunas da matriz instanciada.
        int somaPorColuna, posicaoVetor = 0;
        for(int coluna=0; coluna<Matriz[0].length; coluna++)
        {
            somaPorColuna = 0;
            for(int linha=0; linha<Matriz.length; linha++)
            {
                somaPorColuna += Matriz[linha][coluna];
            }
            posicaoVetor += 1;
            VetorA[posicaoVetor-1] = somaPorColuna;
        }
        JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos por mês é de: \n1º produto: "+ VetorA[0]+ "\n2º produto: "+ VetorA[1]+ "\n3º produto: "+ VetorA[2]);
    }

    public static void B_qtdeVendSemana (int Matriz[][])
    {
        int VetorB[] = new int [Matriz.length];
        //Vetor com a quantidade de colunas da matriz instanciada.
        int somaPorLinha, posicaoVetor = 0;
        for(int linha=0; linha<Matriz.length; linha++)
        {
            somaPorLinha = 0;
            for(int coluna=0; coluna<Matriz[0].length; coluna++)
            {
                somaPorLinha += Matriz[linha][coluna];
            }
            posicaoVetor += 1;
            VetorB[posicaoVetor-1] = somaPorLinha;
        }
        JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos por semana é de: \n1ª semana: "+ VetorB[0]+ "\n2ª semana: "+ VetorB[1]+ "\n3ª semana: "+ VetorB[2]+ "\n4ª semana: "+ VetorB[3]);
    }

    public static void C_qtdeVendMes (int Matriz[][])
    {
        int soma = 0;
        for(int linha=0; linha<Matriz.length; linha++)
        {
            for(int coluna=0; coluna<Matriz[0].length; coluna++)
            {
                soma += Matriz[linha][coluna];
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos no mês é de: "+ soma);
    }
}