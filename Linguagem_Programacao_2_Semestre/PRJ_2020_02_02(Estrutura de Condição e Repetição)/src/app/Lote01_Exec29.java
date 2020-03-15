/*
Objetivo   : Exercício 29 - Receba o tipo de investimento (1 = poupança e 2 = renda fixa)
             e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo
             que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
Programador: Fernando Oliveira da Costa
Data       : 15/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec29
{
    public static void main(String[] args)
    {
        int tipoinvestimento;
        double saldo;
        System.out.println("Tipos de investimento:");
        System.out.println("1 - Poupança;");
        System.out.println("2 - Renda Fixa.");
        tipoinvestimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de conta:"));
        while (tipoinvestimento != 1 && tipoinvestimento != 2)
        {
            System.out.println("Ops, tipo de investimento inválido! Insira um existente.");
            System.out.println("Tipos de investimento:");
            System.out.println("1 - Poupança;");
            System.out.println("2 - Renda Fixa.");
            tipoinvestimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de conta:"));            
        }
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser investido:"));
        if (tipoinvestimento == 1)
        {
            for (int i = 0; i<=30 ; i++)
            {
                saldo = saldo * 1.000083333333333333;
                //O valor acima é o correspondente a um rendimento de 3% ao ano.
            }
            System.out.println("Você escolheu a Poupança.");
            System.out.println("O valor a receber investido por um período de 30 dias é de: " + (saldo));
        }
        if (tipoinvestimento == 2)
        {
            for (int i = 0; i<=30 ; i++)
            {
                saldo = saldo * 1.000138888888888889;
                //O valor acima é o correspondente a um rendimento de 5% ao ano.
            }
            System.out.println("Você escolheu a Renda Fixa.");
            System.out.println("O valor a receber investido por um período de 30 dias é de: " + (saldo));
        }
    }
}