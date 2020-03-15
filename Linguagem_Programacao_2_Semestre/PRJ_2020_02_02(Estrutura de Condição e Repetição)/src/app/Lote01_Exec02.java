/*
Objetivo   : Exercício 02 - Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
Programador: Fernando Oliveira da Costa
Data       : 06/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec02 
{
    public static void main(String[] args) 
    {
        double salario, reajuste, novosalario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário atual:"));
        reajuste = 1.15;
        novosalario = salario * reajuste;
        System.out.println("O valor do novo salário é de: " + novosalario);
    }
}
