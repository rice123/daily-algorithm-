package sunHui.IO流装饰者模式Mybatis中的装饰者模式.文件读写;

import java.io.File;
import java.io.FileInputStream;

public class 读文件 {

	public static void main(String[] args) {
		int b;
		byte tom[]=new byte[25];   //每25个一读，假设定义成  byte tom[]=new byte[200]
		try {
			File f=new File("e:/思想汇报","你懂得.txt");
			FileInputStream readfile=new FileInputStream(f);
			while((b=readfile.read(tom, 0, 25))!=-1)  //对应的应该改成  readfile.read(tom)
			{
				//readfile.read(tom, 0, 25)读输入字节流，存进tom数组中，从0位置开始，长度为25
				String s=new String(tom, 0, b);
				System.out.println(s);
				System.out.println(b);
			}
			readfile.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally
		{
		
		}
	}
}
