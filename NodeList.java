//package inforetrieval;

import java.util.ArrayList;
import java.util.List;

public class NodeList {
	List<Node> keys ;
	int length;
	
	public NodeList()
	{
		keys = new ArrayList<Node>();
		length = keys.size();
	}
	
	void add(String key, String value)
	{
		int place = isNode(key);
		if(place==-1)
		{
			keys.add(new Node(key, value));
			length = keys.size();
		}
		else
		{
			keys.get(place).add(value);
		}
	}
	
	int isNode(String key)
	{
		for(int i = 0; i < keys.size(); i++)
		{
			if (keys.get(i).getName().equals(key))
			{
				return i;
			}
		}
		return -1;
		
	}
	
	List<String> getVals(String key)
	{
		int place = isNode(key);
		if(place!=-1)
		{
			return keys.get(place).getList();
		}
		return null;
		
	}
	
}
