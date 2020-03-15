/*
Objetivo   : Exercício 27 - Receba o número de voltas, a extensão do circuito (em metros) e o tempo
             de duração (minutos). Calcule e mostre a velocidade média em km/h.
Programador: Fernando Oliveira da Costa
Data       : 05/03/2020
*/
package app;
import javax.swing.JOptionPane;
public class LT01_MODPROC27
{
    static double voltas, extcircuito, tempoduracao;
    public static void main(String[] args)
    {
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de voltas:"));
        extcircuito = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do circuito (em metros):"));
        tempoduracao = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração do percurso (em minutos apenas):"));
        calcVelocidadeMedia();
    }

    
    public static void calcVelocidadeMedia()
    {
        JOptionPane.showMessageDialog(null, "A velocidade média percorrida foi de:\n"+ (((extcircuito / 1000) * voltas) / (tempoduracao / 60)) + "Km/h");
    }
}