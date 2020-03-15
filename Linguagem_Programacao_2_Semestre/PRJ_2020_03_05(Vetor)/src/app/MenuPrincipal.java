/*
Objetivo   : Criar um menu com campos:
             1 - Carregar Vetor (inputs do vetor);
             2 - Classificar Vetor (ordena o vetor em ordem crescente);
             3 - Mostra Vetor (mostra o vetor classificado na tela);
             9 - Finalizar (finaliza o código).
Programador: Fernando Oliveira da Costa
Data       : 14/03/2020
*/
package app;
import javax.swing.JOptionPane;
public class MenuPrincipal
{
    public static void main (String args[])
    {
        int v[] = new  int[5];
        int opc = 0;
        do
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar vetor\n2 - Classificar vetor \n3 - Mostrar vetor\n9 - Finalizar"));
            switch (opc)
            {
                case 1: v = FunçãoCarregarVetor(v);
                    break;
                case 2: v = FunçãoClassifica(v);
                    break;
                case 3: ProcedimentoMostra(v);
                    break;
                case 9: JOptionPane.showMessageDialog(null,"Finalizado.");
                    break;
                default: JOptionPane.showMessageDialog(null,"Opção inválida");
            }
        }
        while(opc != 9);
    }
    
    static int[] FunçãoCarregarVetor(int v[])
    {
        int  i;
        for(i=0; i<5; i++)
        {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i+1) + "o elemento do vetor."));
        }
        return v;
    }
    
    static int[] FunçãoClassifica(int v[])
    {
        int i, j, aux;
        for(i=0; i<4; i++)
        {
            for(j=i+1; j<5; j++)
            {
                if(v[i]>v[j])
                {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        return v;
    }
    
    static void ProcedimentoMostra(int v[])
    {
        System.out.println("O vetor eh:\n");
        String mostra="";
        for (int i=0; i<5; i++)
        { 
            //System.out.println(v[i]);
            mostra += ("\t "+v[i]);
        }
        JOptionPane.showMessageDialog(null,mostra);
    }
}
