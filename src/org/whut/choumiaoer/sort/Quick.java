package org.whut.choumiaoer.sort;
/**
 * ��������
 * @author Administrator
 *
 */
public class Quick {
	public static void main(String args[]){
		Integer [] list={34,3,53,2,23,7,14,10};
		_quick(list,0,list.length-1);
		//quick(list,0,list.length-1);
		for(int i:list){
			System.out.println(i);
		}
	}
	public static int getList(Integer[] list,int low,int high){
		int temp=list[low];
		while(low<high){				
			while(low<high&&list[high]>temp){
				high--;
			}
			list[low]=list[high];
			while(low<high&&list[low]<temp){
				low++;
			}
			list[high]=list[low];
		}
		list[low]=temp;	
		return low;
	}
	public static void _quick(Integer[] list,int low,int high){
		if(low<high){
			int middle=getList(list,low,high);
			_quick(list,low,middle-1);
			_quick(list,middle+1,high);
		}
	}
}
