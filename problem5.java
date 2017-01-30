package inforetrieval;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class problem5 {
	public static void main(String[] args) throws FileNotFoundException
	{
		NodeList hash = new NodeList();
		//problem5 dumb = new problem5();
		System.out.println("Please enter name of file: ");
		//System.out.println();
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		File text = new File(name);
		scan = new Scanner(text);
		List<String> result;
		
		while (scan.hasNextLine())
		{
			String line = scan.nextLine();
			List<String> list = new ArrayList<String>(Arrays.asList(line.split(" ")));
			String doc = list.get(0);
			for(int i = 1; i < list.size(); i++)
			{
					hash.add(list.get(i), doc);
				
			}
			
			
		}
		//System.out.println(hash.getVals("drug"));
		scan = new Scanner(System.in);
		System.out.println("Insert your query in the format key1 AND key2 :");
		//System.out.println();
		String bool = scan.nextLine();
		scan.close();
		List<String> vals = new ArrayList<String>(Arrays.asList(bool.split(" ")));
		int place1 = hash.isNode(vals.get(0));
		int place2 = hash.isNode(vals.get(2));
		if(((hash.isNode(vals.get(0)))!=-1) && (hash.isNode(vals.get(2)))!=-1){
			String key1 = vals.get(0);
			String key2 = vals.get(2);
			
			List<String> keyList1 = hash.getVals(key1);
			List<String> keyList2 = hash.getVals(key2);
			
			result = keyAndkey(keyList1, keyList2);	
			System.out.println("Result: "+ result);
		}
		else
		{
			System.out.println("One or more of the keys provided do not exist.");
		}
		//Set<E> set = hash.entrySet();
		//Iterator iterator = set.iterator();
		
		
	}
	
	static List<String> keyAndkey(List<String> list1, List<String> list2)
	{
		List<String> res = new ArrayList<String>();
		int place1 = 0;
		int place2 = 0;
		//int least;
		if(list1.size()<list2.size())
		{
			//least = list1.size();
			while(place1 < list1.size())
			{
				if (list2.contains(list1.get(place1)))
				{
					res.add(list1.get(place1));
					
				}
				place1++;
			}
		}
		else
		{
			//least = list2.size();
			while(place1 < list1.size())
			{
				if (list1.contains(list2.get(place2)))
				{
					res.add(list2.get(place2));
					
				}
				place2++;
			}
		}
		
		return res;
		
	}
	
	
}
