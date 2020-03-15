/*
Objetivo   : Exercício 28 - Receba o preço atual e a média mensal de um produto. Calcule e mostre o
             novo preço sabendo que:
             Venda Mensal        Preço Atual         Preço Novo
             < 500                < 30                 + 10%
             >= 500 e < 1000      >= 30 e < 80         +15%
             >= 1000              >= 80                -5%
             Obs.: para outras condições, preço novo será igual ao preço atual.
Programador: Fernando Oliveira da Costa
Data       : 15/02/2020
*/
package app;
import javax.swing.JOptionPane;

public class Lote01_Exec28
{
    public static void main(String[] args)
    {
        double precoatual, vendamensal;
        precoatual = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto:"));
        vendamensal = Double.parseDouble(JOptionPane.showInputDialog("Insira a média mendal:"));
        if (precoatual < 30 && vendamensal < 500)
        {
            System.out.println("O valor será aumentado em 10%! E o novo preço é de: R$" + (precoatual * 1.1));
            System.out.println("Valor anterior: " + precoatual);
        }
            else if (precoatual >= 30 && precoatual < 80 && vendamensal >=500 && vendamensal < 1000)
            {
                System.out.println("O valor será aumentado em 15%! E o novo preço é de: R$" + (precoatual * 1.15));
            }
                else if (precoatual >= 80 && vendamensal >= 1000)
                {
                    System.out.println("O valor será diminuido em 5%! E o novo preço é de: R$" + (precoatual * 0.95));
                }
                    else
                    {
                        System.out.println("O valor não terá alteração, logo, o preço se mantém em: R$" + precoatual);
                    }
    }
}