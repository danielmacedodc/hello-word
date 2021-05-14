package qualiti.recodev.projetoalocacao.model;

public class Departamento {
	
	private String nomeDepto;
	
	public Departamento(String nomeDepto)
	{
		this.nomeDepto = nomeDepto;
	}
	
	public String getnomeDepto()
	{
		return nomeDepto;
	}
	
	public void setnomeDepto(String nomeDepto)
	{
		this.nomeDepto = nomeDepto;
	}
}
