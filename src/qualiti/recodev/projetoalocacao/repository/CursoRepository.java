package qualiti.recodev.projetoalocacao.repository;

import qualiti.recodev.projetoalocacao.model.Curso;
import java.util.ArrayList;

public class CursoRepository 
{
	private ArrayList<Curso> items;
	
	public CursoRepository()
	{
		items = new ArrayList<Curso>();
	}
	
	void addItem(Curso item)
	{
		items.add(item);
	}
	
	void removeItem(Curso item)
	{
		items.remove(item);
	}
	
	public Curso[] fullList()
	{
		Curso[] courses = items.toArray(new Curso[items.size()]);
		
		return courses;
	}
	
	public Curso findCourse(String course)
	{
		Curso finded = null;
		
		for(Curso item : items)
		{
			if(item.getNomeCurso().equals(course))
			{
				finded = item;
				break;
			}
		}
		
		return finded;		
	}
	
}
