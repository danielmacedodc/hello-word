package qualiti.recodev.projetoalocacao.repository;

import qualiti.recodev.projetoalocacao.model.Alocacao;
import java.util.ArrayList;

public class AlocacaoRepository 
{
	private ArrayList<Alocacao> items;
	
	public AlocacaoRepository()
	{
		items = new ArrayList<Alocacao>();
	}
	
	public void addAlocacao(Alocacao item)
	{
		items.add(item);
	}
	
	public void removeAlocacao(Alocacao item)
	{
		items.remove(item);
	}
	
	public Alocacao[] fullList()
	{
		Alocacao[] list = items.toArray(new Alocacao[items.size()]);
		
		return list;
	}

}
