/*
Objetivo   : Exec01. Criar e coletar um vetor [50] inteiro.
             Calcular e exibir:
             a. A média dos valores entre 10 e 200;
             b. A soma dos números ímpares. 
Programador: Fernando Oliveira da Costa
Data       : 18/03/2020
*/
package app;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lote1dot3_Exec01
{
    public static void main(String[] args)
    {
        int vetorExec01[] = new int[50];
        SecureRandom random = new SecureRandom();

        for(int i=0; i<(vetorExec01.length); i++)
        //for: recebe valores aleatórios entre 1 e 500 no vetor.
        {
            vetorExec01[i] = random.nextInt(500) + 1;
        }
        System.out.println("Vetor gerado com valores aleatórios:\n"+ Arrays.toString(vetorExec01));
        fMediaValoresF1(vetorExec01);
        fSomaImpares(vetorExec01);
    }


    public static void fMediaValoresF1(int n[])
    //fMediaValores: Calcula e mostra a média dos valores entre 10 e 200 do vetor.
    {
        double recebeSomaF1 = 0, recebeQuantidadeF1 = 0;
        for(int i=0; i<(n.length); i++)
        {
            if(n[i]>10 && n[i]<200)
            {
                recebeSomaF1 += n[i];
                recebeQuantidadeF1 += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "A média dos valores entre 10 e 200 do vetor é de: "+ (recebeSomaF1/recebeQuantidadeF1));
    }

    public static void fSomaImpares(int n[])
    //fSomaImpares: Soma e mostra os valores de todos os números ímpares do vetor.
    {
        int recebeSomaF2 = 0;
        for(int i=0; i<(n.length); i++)
        {
            if(n[i] % 2 != 0)
            {recebeSomaF2 += n[i];}
        }
        JOptionPane.showMessageDialog(null, "A soma dos valores ímpares dentro do vetor gerado é: "+ recebeSomaF2);
    }
}