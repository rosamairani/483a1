package inforetrieval;

import java.util.ArrayList;
import java.util.List;

public class Node 
{
	String name;
	String value;
	ArrayList<String> docs;
	
	public Node (String kname)
	{
		docs = new ArrayList<String>();
		name = kname;
	}
	public Node (String kname, String nval)
	{
		docs = new ArrayList<String>();
		name = kname;
		add(nval);
	}
	
	void add(String val)
	{
		docs.add(val);
	}
	
	String getName()
	{
		return name;
	}
	
	List<String> getList()
	{
		return docs;
	}
	

}
