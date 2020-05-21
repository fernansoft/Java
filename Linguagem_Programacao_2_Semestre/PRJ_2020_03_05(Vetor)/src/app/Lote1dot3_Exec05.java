/*
Objetivo   : Exec05. Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
             10
             ∑ (A[1] – A[21–1])
             i = 1
Programador: Fernando Oliveira da Costa
Data       : 20/05/2020
*/
package app;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lote1dot3_Exec05
{
    public static void main(String[] args)
    {
        int Vetor01[] = new int [20], somatoria = 0;
        SecureRandom random = new SecureRandom();
        for(int i=0; i<Vetor01.length; i++)
        //for: Gera valores aleatórios inteiros de 1 a 100 e insere no Vetor01.
        {Vetor01[i] = random.nextInt(100)+1;}
        for(int i=0; i<(Vetor01.length/2); i++)
        //for: calcular a somatória sugerida.
        {somatoria += (Vetor01[i] - (Vetor01[Vetor01.length - (i+1)]));}
        JOptionPane.showMessageDialog(null, "O vetor é: "+ Arrays.toString(Vetor01)+ "\nO resultado da somatória é: "+ somatoria);
    }
}