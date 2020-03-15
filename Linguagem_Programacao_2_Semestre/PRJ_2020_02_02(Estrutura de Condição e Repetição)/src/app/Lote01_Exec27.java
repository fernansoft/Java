/*
Objetivo   : Exercício 27 - Receba o número de voltas, a extensão do circuito (em metros) e o tempo
             de duração (minutos). Calcule e mostre a velocidade média em km/h.
Programador: Fernando Oliveira da Costa
Data       : 15/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec27
{
    public static void main(String[] args)
    {
        double voltas, extcircuito, tempoduracao;
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de voltas:"));
        extcircuito = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do circuito (em metros):"));
        tempoduracao = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração do percurso (em minutos apenas):"));
        System.out.println("A velocidade média percorrida foi de:");
        System.out.println((((extcircuito / 1000) * voltas) / (tempoduracao / 60)) + "Km/h");
    }
}