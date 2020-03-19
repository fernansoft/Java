/*
Objetivo   : Exec02. Criar e coletar um vetor [100] inteiro e exibir: 
             a. O maior e o menor valor;
             b. A média dos valores.
Programador: Fernando Oliveira da Costa
Data       : 18/03/2020
*/
package app;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lote1dot3_Exec02
{
    public static void main(String[] args)
    {
        int vetorExec02[] = new int [100];
        SecureRandom random = new SecureRandom();

        for(int i=0; i<(vetorExec02.length); i++)
        //for: Insere valores aleatórios de 1 a 200 no vetor criado.
        {
            vetorExec02[i] = random.nextInt(200) + 1;
        }
        System.out.println(Arrays.toString(vetorExec02));
        fVerificaMaiorEMenor(vetorExec02);
        fVerificaMedia(vetorExec02);
    }


    public static void fVerificaMaiorEMenor(int n[])
    //fVerificaMaiorEMenor: Verifica e mostra o maior e o menor valor dentro do vetor.
    //n: Vetor a ser verificado.
    {
        int maior = n[0], menor = n[0];
        for(int i=0; i<(n.length); i++)
        {
            if(n[i] > maior)
            {maior = n[i];}
            else if(n[i] < menor)
            {menor = n[i];}
        }
        JOptionPane.showMessageDialog(null, "O maior valor do vetor é: "+ maior+ "\nO menor valor do vetor é: "+ menor);
    }

    public static void fVerificaMedia(int n[])
    //fVerificaMedia: Verifica e mostra a média dos valores dentro do vetor.
    //n: Vetor a ser verificado.
    {
        double recebeSoma = 0;
        for(int i=0; i<(n.length); i++)
        {
            recebeSoma += n[i];
        }
        JOptionPane.showMessageDialog(null, "O valor médio do vetor é de: "+ (recebeSoma/(n.length)));
    }
}