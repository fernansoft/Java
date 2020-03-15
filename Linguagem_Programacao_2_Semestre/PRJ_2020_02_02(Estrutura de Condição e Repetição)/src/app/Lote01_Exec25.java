/*
Objetivo   : Exercício 25 - Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo
             do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode 
             começar num dia e terminar noutro.
Programador: Fernando Oliveira da Costa
Data       : 15/02/2020
*/
package app;
import javax.swing.JOptionPane;
public class Lote01_Exec25
{
    public static void main(String[] args)
    {
        double hrinicial, minutoinicial, hrfinal, minutofinal, tempodejogo;
        System.out.println("Obs.: Insira a hora em uma caixa e os minutos na próxima.");
        hrinicial = Double.parseDouble(JOptionPane.showInputDialog("Insira a hora inicial (apenas a hora):"));
        while (hrinicial < 0 || hrinicial > 23 || hrinicial % 1 != 0)
        //Obriga o usuário a inputar um valor de hora válido (inteiro de 0 a 23)
        {
            System.out.println("Ops, insira apenas a hora (valor inteiro do 0 a 23)!");
            hrinicial = Double.parseDouble(JOptionPane.showInputDialog("Insira a hora inicial (apenas a hora):"));
        }
        minutoinicial = Double.parseDouble(JOptionPane.showInputDialog("Insira o minuto inicial (apenas os minutos):"));
        while (minutoinicial < 0 || minutoinicial > 59 || minutoinicial % 1 != 0)
        //Obriga o usuário a inputar um valor de minuto válido (inteiro de 0 a 59)
        {
            System.out.println("Ops, insira apenas os minutos (valor inteiro do 0 a 59)!");
            minutoinicial = Double.parseDouble(JOptionPane.showInputDialog("Insira o minuto inicial (apenas os minutos):"));
        }
        hrfinal = Double.parseDouble(JOptionPane.showInputDialog("Insira a hora final (apenas a hora):"));
        while (hrfinal < 0 || hrfinal > 23 || hrfinal % 1 != 0)
        //Obriga o usuário a inputar um valor de hora válido (inteiro de 0 a 23)
        {
            System.out.println("Ops, insira apenas a hora (valor inteiro do 0 a 23)!");
            hrfinal = Double.parseDouble(JOptionPane.showInputDialog("Insira a hora final (apenas a hora):"));
        }
        minutofinal = Double.parseDouble(JOptionPane.showInputDialog("Insira o minuto final (apenas os minutos):"));
        while (minutofinal < 0 || minutofinal > 59 || minutofinal % 1 != 0)
        //Obriga o usuário a inputar um valor de minuto válido (inteiro de 0 a 59)
        {
            System.out.println("Ops, insira apenas os minutos (valor inteiro do 0 a 59)!");
            minutofinal = Double.parseDouble(JOptionPane.showInputDialog("Insira o minuto final (apenas os minutos):"));
        }
        if (hrfinal < hrinicial)
        {
            hrfinal = hrfinal + 24;
        }
        hrinicial = hrinicial * 60;
        hrfinal = hrfinal * 60;
        minutoinicial = minutoinicial + hrinicial;
        minutofinal = minutofinal + hrfinal;
        if (minutofinal < minutoinicial)
        {
            tempodejogo = (minutoinicial - minutofinal);
        }
            else
            {
                tempodejogo = (minutofinal - minutoinicial);
            }
        System.out.println("O tempo de duração do jogo foi de:");
        System.out.println((Math.floor(tempodejogo / 60)) + " hora(s) e " + (tempodejogo % 60) + " minutos.");
    }
}