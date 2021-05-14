package qualiti.recodev.projetoalocacao.model;

public class Curso extends Departamento
{
	private String nomeCurso;
	
	public Curso(String depto, String curso)
	{
		super(depto);
		this.nomeCurso = curso;
	}
	
	public String getNomeCurso()
	{
		return nomeCurso;
	}
	
	public void setNomeCurso(String curso)
	{
		this.nomeCurso = curso;
	}
}
