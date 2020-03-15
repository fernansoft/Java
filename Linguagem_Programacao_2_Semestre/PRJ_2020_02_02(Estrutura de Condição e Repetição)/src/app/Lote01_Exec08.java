/*
Objetivo   : Exercício 08 - Receba o valor de um depósito em poupança. Calcule e mostre o valor após
             1 mês de aplicação sabendo que rende 1,3% a. m.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec08
{
    public static void main(String[] args)
    {
        double deposito, resgate;
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado:"));
        resgate = deposito * 1.013;
        System.out.println("O valor depositado foi de: " + deposito);
        System.out.println("O tempo de rendimento foi de: Um mês");
        System.out.println("O valor com os rendimentos é de: " + resgate);
    }
}