package qualiti.recodev.projetoalocacao.repository;

import java.util.ArrayList;
import qualiti.recodev.projetoalocacao.model.Professor;

public class ProfessorRepository 
{
	private ArrayList<Professor> items;
	
	public ProfessorRepository() 
	{
		items = new ArrayList<Professor>();		
	}
	
	
	void addItem(Professor item)
	{
		items.add(item);		
	}
	
	void removeItem(Professor item)
	{
		items.remove(item);
	}
	
	public Professor[] fullList()
	{
		Professor[] teachers = items.toArray(new Professor[items.size()]);
		
		return teachers;
	}
	
	public Professor findTeacher(String cpf)
	{
		Professor finded = null;
		
		for(Professor item : items)
		{
			if(item.getcpf().equals(cpf))
			{
				finded = item;
				break;
			}
		}
		
		return finded;
	}
}
