/*
Objetivo   : Exec01. Criar e coletar um vetor [50] inteiro.
             Calcular e exibir:
             a. A média dos valores entre 10 e 200;
             b. A soma dos números ímpares. 
Programador: Fernando Oliveira da Costa
Data       : 15/03/2020
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
        fMediaValores(vetorExec01);
    }


    public static void fMediaValores(int n[])
    //fMediaValores: Calcula a média dos valores entre 10 e 200 do vetor.
    {
        int recebeSoma = 0, recebeQuantidade = 0;
        for(int i=0; i<(n.length); i++)
        {
            if(n[i]>10 && n[i]<200)
            {
                recebeSoma += n[i];
                recebeQuantidade += 1;
            }
        }
        JOptionPane.showMessageDialog(null, "A média dos valores entre 10 e 200 do vetor é de: "+ (recebeSoma/recebeQuantidade));
    }
}