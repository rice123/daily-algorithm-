package sunHui.IO流装饰者模式Mybatis中的装饰者模式.文件读写;

import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result{
	void print(int d)
	{
		System.out.println(d+"的平方"+d*d);
		System.out.println(d+"的立方"+d*d*d);
	}
}
class InputData
{
static private String s="";
static public void input()
{
	BufferedReader bu=new BufferedReader(
			new InputStreamReader(System.in)
			);
	try 
	{
		s=bu.readLine();
	}
	catch(IOException e) 
	{
		
	}
}
static public int getInt()
{
	input();
	return Integer.parseInt(s);
}
}

public class 从键盘输入两个数输出对应的平方立方 {

	public static void main(String[] args) {
		Result result=new Result();
		System.out.println("请输入一个整数");
        int a=InputData.getInt();
        result.print(a);
	}
}




