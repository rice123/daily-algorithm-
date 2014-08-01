package org.whut.choumiaoer.sort;
/**
 * ���ֲ���
 * @author Administrator
 *
 */
public class Search {
	public static void main(String [] args){
		Integer [] list={1,2,3,4,5,6,7,8,9};
		int a=search(list,6);
		System.out.println(a);
	}
	public static int search(Integer[] list,int data){
		int len=list.length;
		if(data<list[0]||data>list[len-1]){
			return -1;
		}
		int begin=0;
		int end=len-1;
		int mid=(begin+end)/2;
		while(begin<=end){
			mid=(begin+end)/2;
			if(data>list[mid]){
				begin=mid+1;
			}else if(data<list[mid]){
				end=mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}
}
