/*
Objetivo   : Exercício 30 - Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
Programador: Fernando Oliveira da Costa
Data       : 20/02/2020
*/

package app;
import javax.swing.JOptionPane;
public class Lote01_Exec30
{
    public static void main(String[] args)
    {
        int diaNascimento, mesNascimento, anoNascimento, diaAtual, mesAtual, anoAtual;
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de seu nascimento (apenas o ano e em quatro dígitos):"));
        mesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês de seu nascimento (apenas o mês):"));
        diaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia de seu nascimento (apenas o dia):"));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual (apenas o ano e em quatro dígitos):"));
        mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês atual (apenas o mês):"));
        diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia atual (apenas o dia):"));
        int qntAnosBissextos = (verifAnosBissextos(anoNascimento, anoAtual));
        int diasContados = ((contaDias(mesNascimento, 12)) + (contaDias(1, mesAtual)));
        int qntAnosx365 = (((anoAtual - 1) - (anoNascimento + 1)) * 365);
        int diasRemanescentes = (((contaDias(mesNascimento, mesNascimento)) + (contaDias(mesAtual, mesAtual))) - diaNascimento - ((contaDias(mesAtual, mesAtual)) - diaAtual));
        int totalDeDias = diasContados + qntAnosx365 + diasRemanescentes + qntAnosBissextos;
        int anos = 0;
        int meses = 0;
        while (totalDeDias > 365)
        {
            if (qntAnosBissextos > 0)
            {
                totalDeDias = totalDeDias - 366;
                qntAnosBissextos = qntAnosBissextos - 1;
                anos = anos + 1;
            }
            else
            {
                totalDeDias = totalDeDias - 365;
                anos = anos + 1;
            }
        }
        int mescaneado = 1; 
        boolean terminado = false;
        for (mescaneado=1;terminado == false;mescaneado++)
        {
            if (mescaneado == 1 || mescaneado == 3 || mescaneado == 5 || mescaneado == 7 || mescaneado == 8 || mescaneado == 10 || mescaneado == 12)
            {
                totalDeDias = totalDeDias - 31;
                meses = meses + 1;
                if (totalDeDias>=31)
                {terminado=true;}
                else
                {
                totalDeDias = totalDeDias - 31;
                meses = meses + 1;
                }
            }
            else if (mescaneado == 4 || mescaneado == 6 || mescaneado == 9 || mescaneado == 11)
            {
                if (totalDeDias>=30)
                {terminado=true;}
                else{
                totalDeDias = totalDeDias - 30;
                meses = meses + 1;
                }
            }
            else if (mescaneado == 2)
            {
                if (totalDeDias>=28)
                {terminado=true;}
                else
                {
                totalDeDias = totalDeDias - 28;
                meses = meses + 1;
                }
                
            }
            
            if (mescaneado == 12 && totalDeDias >= 31)
            {
                mescaneado = 1;
                totalDeDias=totalDeDias - 31;
                
            }
            
        System.out.println(totalDeDias);
        }
        System.out.println("Sua idade é de: " + anos + " anos, " + meses + " meses e " + totalDeDias + " dias.");
    }



    
    //Função verifica a quantidade de anos bissextos entre as datas inseridas
    public static int verifAnosBissextos(double anoA, int anoB)
    {
    int bissexto;
    bissexto = 0;

    while (anoA <= anoB)
    {
        if (anoA % 400 == 0 || anoA % 100 != 0 && anoA % 4 == 0)
        {
            bissexto = bissexto + 1;
        }
        anoA = anoA + 1;
    }
    return bissexto;
    }

    // Função Verifica quantos dias passaram do mês de nascimento até o fim do ano vigente.
    public static int contaDias(int mes, int ateMes)
    {
        int dias;
        dias = 0;
        while (mes <= ateMes)
        {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            {
                dias = dias + 31;
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                dias = dias + 30;
            }
            else if (mes == 2)
            {
                dias = dias + 28;
            }
            mes = mes + 1;
        }
        return dias;
    }
}