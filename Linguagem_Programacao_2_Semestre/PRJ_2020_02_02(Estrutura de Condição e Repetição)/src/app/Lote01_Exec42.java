/*
Objetivo   : Exercício 42 - Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99.
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/

package app;
public class Lote01_Exec42
{
    public static void main(String[] args)
    {
        double recebeSoma = 0;
        for(double i=1; i<=50; i++)
        {
            recebeSoma = (recebeSoma + (i/((i*2)-1)));
            String copiaI = String.format("%.0f", i);
            System.out.println(copiaI+"º"+ " ciclo "+ copiaI +"/"+ ((i*2)-1)+ " = "+ recebeSoma);
        }
    }
}