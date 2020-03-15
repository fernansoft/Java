/*
Objetivo   : Exercício 31 - Calcule e mostre o quadrado dos números entre 10 e 150.
Programador: Fernando Oliveira da Costa
Data       : 23/02/2020
*/

package app;
public class Lote01_Exec31
{
    public static void main(String[] args)
    {
        int base = 10;
        while (base <= 150)
        {
            double resultado = Math.pow(base, 2);
            System.out.println(base + " ^ 2 = " + resultado);
            base = base + 1;
        }
    }
}
