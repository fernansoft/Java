/*
Objetivo   : Exercício 17 - Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel 
             faz 12 km/l. Receber o tempo de percurso e a velocidade média. 
Programador: Fernando Oliveira da Costa
Data       : 10/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec17
{
    public static void main(String[] args)
    {
        double tempopercurso, velmedia;
        tempopercurso = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo do percurso em decimal:"));
        velmedia = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade média:"));
        System.out.println("A quantidade de litros de combustível gastos no percurso foi de: " + (tempopercurso * velmedia / 12) + "L.");
    }
}