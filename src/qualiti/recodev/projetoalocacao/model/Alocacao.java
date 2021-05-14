package qualiti.recodev.projetoalocacao.model;
import java.sql.Time;
import java.time.DayOfWeek;

public class Alocacao
{
	private Professor professor;
	private Curso curso; 
	private DayOfWeek diaSemana;
	private Time horario;
		
	public Alocacao(Professor professor, Curso curso, DayOfWeek diasemana, Time horario)
	{
		this.professor = professor;
		this.curso = curso;
		this.diaSemana = diasemana;
		this.horario = horario;
	}
	
	public Alocacao(Professor professor, DayOfWeek diasemana, Time horario)
	{
		this.professor = professor;
		this.diaSemana = diasemana;
		this.horario = horario;
	}
	
	public Professor getProfessor()
	{
		return professor;
	}
	
	public void setProfessor(Professor professor)
	{
		this.professor = professor;
	}
	
	public Curso getCurso()
	{
		return curso;
	}
	
	public void setCurso(Curso curso)
	{
		this.curso = curso;
	}
	
	public DayOfWeek getDiaSemana()
	{
		return diaSemana;
	}
	
	public void setDiaSemana(DayOfWeek diaSemana)
	{
		this.diaSemana = diaSemana;
	}
	
	public Time getTime()
	{
		return horario;
	}
	
	public void setTime(Time time)
	{
		this.horario = time;
	}
	
}
