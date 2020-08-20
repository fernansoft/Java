package Controller;

public class Operacoes_Controller
{
	public Operacoes_Controller()
	{
		super();
	}
	public void concatenaString()
	//Concatena 32768 caracteres, 1 a 1, em uma var. String
	{
		String cadeia = "";
		double tempoInicial = System.nanoTime();
		for(int i=0; i<32768; i++)
		{
			cadeia = cadeia + "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String ==> "+ tempoTotal+ "s.");
	}
	
	public void concatenaBuffer()
//	Concatena 32768 caracteres, 1 a 1, em um buffer de Strings
	{
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int i=0; i<32768; i++)
		{
			buffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Buffer ==> "+ tempoTotal+ "s.");
	}
	
	public void divideFrase(String frase)
//	Recebe uma frase, divide em palavras, imprime cada palavra
	{
		String vetorPalavras[] = frase.split(" ");
		for(String palavra : vetorPalavras)
		{
			System.out.println(palavra);
		}
	}
}