package heShuangyuan.org.whut.sort;
/**
 * ѡ������
 * @author Administrator
 *
 */
public class Select {
	public static void main(String [] args){
		Integer [] list={34,3,53,2,23,7,14,10};
		select(list);
		for(int i:list){
			System.out.println(i);
		}
	}
	public static void select(Integer [] list){
		int len=list.length;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(list[j]<list[i]){
					 int temp=list[j];
					 list[j]=list[i];
					 list[i]=temp;
				}
			}
		}
	}
}
