package list;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		list.add("sandhya");
		list.add("sushmita");
		list.add("likhitha");
		list.add("ram");
		list.add("aakash");
		list.add("anuhya");
		list.add("arjun");
		System.out.println("1:insert \n2:remove\n3:display\n4:exit\nenter option:");
		int opt=s.nextInt();
		String name;
		while(opt!=4)
		{
			switch(opt)
			{
			case 1:System.out.println("enter data to insert");
			       name=s.next();
			       list.add(name);
			       break;
			case 2: System.out.println("enter data to remove");
		            name=s.next();
		            if(list.contains(name))
		            {
		            	list.remove(name);
		            }
		            else
		            {
		            	System.out.println(name+" is not in the list");
		            }
		            break;
			case 3:System.out.println("The details are");
				   for(String n:list) {
					   System.out.println(n);
					   
				   }
				   break;
			}
			System.out.println("1:insert \n2:remove\n3:display\n4:exit\nenter option:");
			opt=s.nextInt();
			}
		s.close();
		}
	}

