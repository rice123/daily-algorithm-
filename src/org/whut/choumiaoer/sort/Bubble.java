package org.whut.choumiaoer.sort;
/**
 * ð������
 * @author Administrator
 *
 */
public class Bubble {
	public static void main(String [] args){
		Integer [] list={34,3,53,2,23,7,14,10};
		bubble(list);
		for(int i:list){
			System.out.println(i);
		}
	}
	public static void bubble(Integer[] list){
		int len=list.length;
		Boolean b=true;
		for(int i=0;i<len-1;i++){
			b=true;
			for(int j=0;j<len-1-i;j++){
				if(list[j]>list[j+1]){
					int temp=list[j+1];
					list[j+1]=list[j];
					list[j]=temp;
					b=false;
				}
			}
			if(b)break;
		}
	}
}
