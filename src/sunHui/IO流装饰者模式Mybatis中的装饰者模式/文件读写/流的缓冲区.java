package sunHui.IO流装饰者模式Mybatis中的装饰者模式.文件读写;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class 流的缓冲区 {
	public static void main(String[] args) {
		       try {
		    	   File f1=new File("e:/思想汇报/你懂得.txt");
		    	   File f2=new File("e:/思想汇报/各种学习网站.txt");
				   FileReader input=new FileReader(f1);
				   BufferedReader br=new BufferedReader(input);
				   FileWriter output = new FileWriter(f2);
				   BufferedWriter bw =new BufferedWriter(output);
				   String s=br.readLine();
				   while(s!=null)
				   {
					   bw.write(s);
					   bw.newLine();
					   s=br.readLine();
				   }
				   br.close();
				   bw.close();
			} catch (Exception e) {
				// TODO: handle exception
			}

	}
}
