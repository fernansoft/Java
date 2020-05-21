/*
Objetivo   : Exec04. Criar e coletar em um vetor [30] real e calcular e exibir:
             a. A média do grupo;
             b. A quantidade de notas acima do grupo;
             c. As posições dos valores abaixo da média do grupo.
Programador: Fernando Oliveira da Costa
Data       : 20/05/2020
*/
package app;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Lote1dot3_Exec04
{
    public static void main(String[] args)
    {
        double VetorNotas[] = new double [10];
        int qtdeNotasAbaixoDaMedia = 0, ciclo = 0;
        double auxiliar, media=0,valoresAcima=0;
        for(int i=0; i<(VetorNotas.length); i++)
        //For: recebe as notas do grupo.
        {
            do
            //do while: Limita a input de 0 a 10.
            {
                auxiliar = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a "+ (i+1)+ "ª nota do grupo: "));
            }
            while(auxiliar<0 || auxiliar>10);
            VetorNotas[i] = auxiliar; media += auxiliar;
        }
        media /= VetorNotas.length;
        //obtém a média dos valores no vetor.
        for(int i=0; i<VetorNotas.length; i++)
        //for: verifica quantos valores estão acima e abaixo da média.
        {
            if(VetorNotas[i]>media){valoresAcima += 1;}
            else if(VetorNotas[i]<media){qtdeNotasAbaixoDaMedia += 1;}
        }
        double vNotasAbaixoDaMedia[] = new double [qtdeNotasAbaixoDaMedia];
        //Cria um vetor com a quantidade de notas abaixo da média.
        for(int i=0; i<VetorNotas.length; i++)
        {if(VetorNotas[i]<media){vNotasAbaixoDaMedia[ciclo] = i; ciclo += 1;}}
        JOptionPane.showMessageDialog(null, "A média do grupo foi de: "+ (media)+ "\nQuantidade de notas acima da média: "+ valoresAcima+ "\nPosições das notas abaixo da média: "+ Arrays.toString(vNotasAbaixoDaMedia));
    }
}