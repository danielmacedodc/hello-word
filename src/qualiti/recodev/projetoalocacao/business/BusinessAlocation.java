package qualiti.recodev.projetoalocacao.business;

import java.sql.Time;
import java.time.DayOfWeek;
import java.util.ArrayList;

import qualiti.recodev.projetoalocacao.repository.AlocacaoRepository;
import qualiti.recodev.projetoalocacao.model.*;

public class BusinessAlocation 
{
	private AlocacaoRepository data;
	private Alocacao allocation;
	private Alocacao[] list;
	
	public BusinessAlocation()
	{
		data = new AlocacaoRepository();
	}
	
	boolean isTeacherFree(Professor teacher, DayOfWeek day, Time time)
	{
		allocation = new Alocacao(teacher, day, time);
		list = data.fullList();
		for(int i = 0; i < list.length; i++)
		{
			if(this.allocation == this.list[i])
			{
				return false;
			}
		}
		
		return true;
	}
	
	void allocateTeacher(Professor teacher, Curso course, DayOfWeek day, Time time)
	{
		if(this.isTeacherFree(teacher, day, time))
		{
			allocation = new Alocacao(teacher, course, day, time);
			data.addAlocacao(allocation);
		}
	}
	
	//boolean thereIsThisTeacher()
}
