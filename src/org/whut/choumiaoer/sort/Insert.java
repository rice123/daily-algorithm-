package org.whut.choumiaoer.sort;

import java.util.Random;

/**
 * ֱ�Ӳ�������
 * @author Administrator
 *
 */
public class Insert {
	public static void main(String [] args){
		Random ran=new Random();
		Integer [] list=new Integer[10];
		for(int i=0;i<10;i++){
			list[i]=ran.nextInt(10);
		}
		for(int b:list){
			System.out.print(b+" ");
		}
		System.out.println();
		insert(list);
		for(int b:list){
			System.out.print(b+" ");
		}
	}
	public static void insert(Integer[] list){
		int len=list.length;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j>0;j--){
				if(list[j]<list[j-1]){
					int temp=list[j];
					list[j]=list[j-1];
					list[j-1]=temp;
				}
			}
		}
	}
}
