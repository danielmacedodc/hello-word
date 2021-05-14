package qualiti.recodev.projetoalocacao.model;

public class Professor
{
	private String nomeProfessor, cpf;
	private String depto;
	
	public Professor(String nomeProf, String cpf, String depto)
	{
		this.nomeProfessor = nomeProf;
		this.cpf = cpf;
		this.depto = depto;
	}
	
	public void setCPF(String cpf)
	{
		this.cpf = cpf;
	}
	
	public void setCPF(long cpf)
	{	
		String cpfcorrigido = String.valueOf(cpf);
		this.setCPF(corrigirFormatoDoCPF(cpfcorrigido));
	}
	
	public String getcpf()
	{
		return cpf;
	}
	
	public String getnomeProfessor()
	{
		return nomeProfessor;
	}
	
	public void setnomeProfessor(String nomeProfessor)
	{
		this.nomeProfessor = nomeProfessor;
	}
	
	private String corrigirFormatoDoCPF(String cpf)
	{
		while (cpf.length() < 11)
		{
			cpf = "0" + cpf;
		}
		
		return cpf;
	}
	
	private boolean validarCPF(String cpf)
	{
		if(cpf.length() == 11)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
