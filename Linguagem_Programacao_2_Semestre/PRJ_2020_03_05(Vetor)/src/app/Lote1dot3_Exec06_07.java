/*
Objetivo   : Exec06 e 07. Criar e coletar em um vetor [20] com números aleatórios.
             Classificar este vetor em ordem crescente e mostre os dados.
             07. A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e
             verificar a sua existência no vetor (utilizar pesquisa binária).
Programador: Fernando Oliveira da Costa
Data       : 27/05/2020
*/
package app;

import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lote1dot3_Exec06_07
{
    public static void main(String[] args)
    {
        int VetorAleatório[] = new int [20];
        int VetorOrdenado[] = new int [VetorAleatório.length];
        int opcoesMenuPrincipal;
        do
        {
            opcoesMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções:\n1 - Gerar vetor aleatório;\n2 - Ordenar vetor gerado;\n3 - Mostrar vetor aleatório e ordenado;\n4 - Buscar um valor dentro do vetor;\n9 - Finalizar."));
            switch(opcoesMenuPrincipal)
            {
                case 1:VetorAleatório = GerarVetorAleatorio(VetorAleatório);
                    break;
                case 2:VetorOrdenado = CriarVetorCrescente(VetorAleatório).clone();
                    break;
                case 3:JOptionPane.showMessageDialog(null, "Vetor de 20 índices gerado aleatóriamente: \n"+ Arrays.toString(VetorAleatório)+ "\nO vetor em ordem crescente é: \n"+ Arrays.toString(VetorOrdenado));
                    break;
                case 4:PesquisaBinaria(VetorOrdenado);

            }
        }
        while(opcoesMenuPrincipal != 9);
    }

    public static int [] GerarVetorAleatorio(int vetor[])
    {
        SecureRandom random = new SecureRandom();
        for(int i=0; i<vetor.length; i++)
        {vetor[i] = random.nextInt(100)+1;}
        return vetor;
    }

    public static int [] CriarVetorCrescente(int vetor[])
    {
        int auxiliar = 0;
        int vetorCrescente[] = vetor.clone();
        for(int i=0; i<((vetorCrescente.length)-1); i++)
        {
            for(int j=0; j<((vetorCrescente.length)-1); j++)
            {
                if(vetorCrescente[j]>vetorCrescente[j+1])
                {
                    auxiliar = vetorCrescente[j+1];
                    vetorCrescente[j+1] = vetorCrescente[j];
                    vetorCrescente[j] = auxiliar;
                }
            }
        }
        return vetorCrescente;
    }

    public static void PesquisaBinaria(int vetor[])
    {
        int inicio = 0, fim = vetor.length, meio, valorProcurado, foiEncontrado = 0;
        valorProcurado = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor a ser procurado dentro do vetor: "));
        while(inicio<=fim && foiEncontrado == 0)
        {
            meio = (inicio+fim)/2;
            if(vetor[meio]==valorProcurado)
            {
                JOptionPane.showMessageDialog(null, "Vetor: "+ Arrays.toString(vetor)+ "\nO valor procurado ("+ valorProcurado+ ") foi encontrado na posição "+ meio+ "do vetor.");
                foiEncontrado = 1;
            }
            else if(fim==inicio)
            {JOptionPane.showMessageDialog(null, "Ops, valor não encontrado!"); foiEncontrado = 1;}
            else if(vetor[meio]<valorProcurado)
            {inicio = meio+1;}
            else if(vetor[meio]>valorProcurado)
            {fim = meio - 1;}
        }
    }
}