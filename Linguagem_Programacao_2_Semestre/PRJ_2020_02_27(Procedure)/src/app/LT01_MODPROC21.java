/*
Objetivo   : Exercício 21 - Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
             Mostre a mensagem de acordo com a média:
             a. Se a média for >= 6,0 exibir “APROVADO”;
             b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
             c. Se a média for < 3,0 exibir “RETIDO”.
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/
package app;
import javax.swing.JOptionPane;
public class LT01_MODPROC21
{
    static double bimestre1, bimestre2, bimestre3, bimestre4, media;
    public static void main(String[] args)
    {
        bimestre1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a sua nota do segundo bimestre:"));
        bimestre2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a sua nota do terceiro bimestre:"));
        bimestre3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a sua nota do primeiro bimestre:"));
        bimestre4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a sua nota do quarto bimestre:"));
        verificarMedia();
    }

    
    public static void verificarMedia()
    {
        media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
        if (media >= 6)
        {
            System.out.println("APROVADO");
        }
            else if (media >= 3 && media < 6)
            {
                System.out.println("EXAME");
            }
                else
                {
                    System.out.println("RETIDO");
                }
    }
}