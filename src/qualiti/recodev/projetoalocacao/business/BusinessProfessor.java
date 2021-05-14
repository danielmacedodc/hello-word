package qualiti.recodev.projetoalocacao.business;

import qualiti.recodev.projetoalocacao.repository.ProfessorRepository;
import qualiti.recodev.projetoalocacao.model.*;

public class BusinessProfessor 
{
	private ProfessorRepository data;
	private Professor teacher;
	private Professor[] list;
	
	public BusinessProfessor()
	{
		data = new ProfessorRepository();
	}
	
	boolean thereIsThisTeacher(String name, String cpf, String depto)
	{
		teacher = new Professor(name, cpf, depto);
		list = data.fullList();
		
		for(int i = 0; i < list.length; i++)
		{
			if(teacher == list[i])
			{
				return true;
			}
		}
		
		return false;
	}

}
