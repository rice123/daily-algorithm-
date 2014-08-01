package sunHui.面试宝典;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 把一个数组的数组合全部列出来 {
	public static void main(String[] args) {
		String[] array=new String[]	{"1","2","3","4"};
		listAll(Arrays.asList(array),"");
	}
	public static void listAll(List candidate,String prefix)
	{
		if(candidate.isEmpty())
		{
			System.out.println(prefix);
		}	
		for (int i = 0; i < candidate.size(); i++) {
		  List temp=new LinkedList(candidate);
		  listAll(temp,prefix+temp.remove(i));
		}
	}

}
