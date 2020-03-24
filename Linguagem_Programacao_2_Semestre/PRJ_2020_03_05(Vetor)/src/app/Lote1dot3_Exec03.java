/*
Objetivo   : Exec03. Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3].
             Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados.
             P. ex: VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6
Programador: Fernando Oliveira da Costa
Data       : 24/03/2020
*/
package app;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lote1dot3_Exec03
{
    public static void main(String[] args)
    {
        int vetor01[] = new int [3];
        int vetor02[] = new int [3];
        for(int i=0; i<vetor01.length; i++)
        //for: Recebe os inputs para o primeiro vetor.
        {
            vetor01[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o "+ (i+1)+ "º valor do primeiro vetor."));
        }
        for(int i=0; i<vetor02.length; i++)
        //for: Recebe os inputs para o segundo vetor.
        {
            vetor02[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o "+ (i+1)+ "º valor do segundo vetor."));
        }
        fconcatenaVetores(vetor01, vetor02);
    }
    
    public static void fconcatenaVetores(int primeiroVetor[],int segundoVetor[])
    //fconcatenaVetores: Mostra o conteúdo de dois vetores (passados como parâmetro) concatenados.
    {
        int vetorConcatenado[] = new int [(primeiroVetor.length) + (segundoVetor.length)];
        for(int i=0; i<(vetorConcatenado.length); i++)
            //for: Repetição que insere os índices dos vetores passados como parâmetro no vetor "vetorConcatenado".
        {
            if(i<primeiroVetor.length)
            {
                vetorConcatenado[i] = primeiroVetor[i];
            }
            else if(i>=primeiroVetor.length)
            {
                vetorConcatenado[i] = segundoVetor[i-primeiroVetor.length];
            }
        }
        JOptionPane.showMessageDialog(null, "Vetores concatenados: \n"+ Arrays.toString(vetorConcatenado));
    }
}