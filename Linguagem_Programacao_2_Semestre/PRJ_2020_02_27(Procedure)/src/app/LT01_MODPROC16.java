/*
Objetivo   : Exercício 16 - Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
             de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas
             x o valor por hora.
             Calcule o salário líquido (= Salário Bruto – desconto).
             A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
Programador: Fernando Oliveira da Costa
Data       : 04/03/2020
*/
package app;
import javax.swing.JOptionPane;
public class LT01_MODPROC16
{
  static double horastrabalhadas, valporhora, percentdesconto, numdescedentes, salario, salarioliquido;
  public static void main(String[] args)
  {
      
  horastrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas (em decimal):"));
  valporhora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora:"));
  percentdesconto = Double.parseDouble(JOptionPane.showInputDialog("Insira o percentual de desconto:"));
      numdescedentes = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de descendentes:"));
      calcSalarioLiquido();
  }

  
    public static void calcSalarioLiquido()
    {
		salario = horastrabalhadas * valporhora;
		salarioliquido = (salario - (salario * (percentdesconto/100))) + (numdescedentes * 100);
		System.out.println("O salário líquido a receber é: R$" + salarioliquido);
    }
}