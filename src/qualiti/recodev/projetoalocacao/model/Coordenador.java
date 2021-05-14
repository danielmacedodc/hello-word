package qualiti.recodev.projetoalocacao.model;

public class Coordenador extends Professor
{
	private Curso cursoCoordenado;
	
	public Coordenador(String nomeProf, String cpf, Departamento dpto, Curso cursoCoordenado)
	{
		super(nomeProf, cpf, dpto);
		this.cursoCoordenado = cursoCoordenado;
	}
	
	public Curso getCursoCoordenado()
	{
		return cursoCoordenado;
	}
	
	public void setCursoCoordenado(Curso cursoCoordenado)
	{
		this.cursoCoordenado = cursoCoordenado;
	}
}
