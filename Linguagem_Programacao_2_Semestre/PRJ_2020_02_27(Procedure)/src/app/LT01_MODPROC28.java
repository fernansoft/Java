/*
Objetivo   : Exercício 28 - Receba o preço atual e a média mensal de um produto. Calcule e mostre o
             novo preço sabendo que:
             Venda Mensal        Preço Atual         Preço Novo
             < 500                < 30                 + 10%
             >= 500 e < 1000      >= 30 e < 80         +15%
             >= 1000              >= 80                -5%
             Obs.: para outras condições, preço novo será igual ao preço atual.
Programador: Fernando Oliveira da Costa
Data       : 05/03/2020
*/

package app;
import javax.swing.JOptionPane;

public class LT01_MODPROC28
{
    static double precoatual, vendamensal;
    public static void main(String[] args)
    {
        precoatual = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto:"));
        vendamensal = Double.parseDouble(JOptionPane.showInputDialog("Insira a média mendal:"));
        mostraNovoPreco();
    }


    public static void mostraNovoPreco()
    {
        if (precoatual < 30 && vendamensal < 500)
        {
            JOptionPane.showMessageDialog(null, "O valor será aumentado em 10%! E o novo preço é de: R$" + (precoatual * 1.1)+ "\n"+ "Valor anterior: " + precoatual);
        }
            else if (precoatual >= 30 && precoatual < 80 && vendamensal >=500 && vendamensal < 1000)
            {
                JOptionPane.showMessageDialog(null, "O valor será aumentado em 15%! E o novo preço é de: R$" + (precoatual * 1.15));
            }
                else if (precoatual >= 80 && vendamensal >= 1000)
                {
                    JOptionPane.showMessageDialog(null, "O valor será diminuido em 5%! E o novo preço é de: R$" + (precoatual * 0.95));
                }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "O valor não terá alteração, logo, o preço se mantém em: R$" + precoatual);
                    }
    }
}