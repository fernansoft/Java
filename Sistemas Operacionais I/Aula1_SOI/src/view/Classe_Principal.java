package view;

import Controller.Operacoes_Controller;

public class Classe_Principal
{
	public static void main(String[] args)
	{
		Operacoes_Controller op = new Operacoes_Controller();
		op.concatenaString();
		op.concatenaBuffer();
		op.divideFrase("Bom dia para todos os estudantes de ADS!");
	}
}
