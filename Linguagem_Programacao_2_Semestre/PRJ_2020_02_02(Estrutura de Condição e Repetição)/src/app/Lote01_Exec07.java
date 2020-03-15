/*
Objetivo   : Exercício 07 - Recebe os valores do comprimento, largura e altura de um paralelepípedo.
             Calcula e mostra seu volume.
Programador: Fernando Oliveira da Costa
Data       : 07/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec07 
{
    public static void main(String[] args) 
    {
        double comprimento, largura, altura, volume;
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do comprimento (em metros):"));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da largura (em metros):"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura (em metros):"));
        volume = comprimento * largura * altura;
        System.out.println("O valor do volume do paralelepípedo é de: " + volume + "m³");
    }
}