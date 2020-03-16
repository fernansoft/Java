/*
Objetivo   : Receber valores em um vetor e classificar (ordem crescente);
Programador: Fernando Oliveira da Costa
Data       : 14/03/2020
*/
package app;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class OrdenarVetor
{
    public static void main(String[] args)
    {
        //Vetor que recebe os valores a serem classificados.
        int vetorPrincipal[] = new int[5];
        int auxiliar;
        SecureRandom random = new SecureRandom();

        for(int i=0; i<5; i++)
        //for: preenche o vetor com valores aleatórios usando SecureRandom.
        {
            vetorPrincipal[i] = random.nextInt(100) + 1;
        }
        JOptionPane.showMessageDialog(null, "Vetor gerado sem classifcação: "+ Arrays.toString(vetorPrincipal));

        for(int numAnterior=0; numAnterior< vetorPrincipal.length - 1; numAnterior++)
        //for: classifica o vetor em ordem crescente.
        {
            for(int numPosterior = (numAnterior + 1); numPosterior < vetorPrincipal.length; numPosterior++)
            {
                if(vetorPrincipal[numAnterior] > vetorPrincipal[numPosterior])
                {
                    auxiliar = vetorPrincipal[numAnterior];
                    vetorPrincipal[numAnterior] = vetorPrincipal[numPosterior];
                    vetorPrincipal[numPosterior] = auxiliar;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Vetor Classificado: "+ Arrays.toString(vetorPrincipal));
    }
}