package edu.jaspiders.heca48.abstrack;

public class Operation
{
	public void getDetails(String s)
	{
		if(s.equalsIgnoreCase("lenovo"))
		{
			Lenovo l=new Lenovo();
			System.out.println(l.name());
			System.out.println(l.price());		
			System.out.println(l.colour());
		}
		else if(s.equalsIgnoreCase("HP"))
		{
			HP h=new HP();
			System.out.println(h.name());
			System.out.println(h.price());		
			System.out.println(h.colour());
		}
		else if(s.equalsIgnoreCase("Dell"))
		{
			Dell d=new Dell();
			System.out.println(d.name());
			System.out.println(d.price());		
			System.out.println(d.colour());
		}
		else {
			System.exit(0);
		}
	}
}

