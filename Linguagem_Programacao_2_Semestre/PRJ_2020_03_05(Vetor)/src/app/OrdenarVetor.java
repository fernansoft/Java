package app;

import java.security.SecureRandom;
import java.util.Arrays;

public class OrdenarVetor
{
    public static void main(String[] args)
    {
        int vet[] = new int[5];
        int aux;
        SecureRandom random = new SecureRandom();

        for(int i=0; i<20; i++)
        {
            vet[i] = random.nextInt(100) + 1;
            System.out.println(vet[i]);
        }

        for(int numAnterior=0; numAnterior< vet.length - 1; numAnterior++)
        {
            for(int numPosterior = (numAnterior + 1); numPosterior < vet.length; numPosterior++)
            {
                if(vet[numAnterior] > vet[numPosterior])
                {
                    aux = vet[numAnterior];
                    vet[numAnterior] = vet[numPosterior];
                    vet[numPosterior] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vet));
    }
}
