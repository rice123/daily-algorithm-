package sunHui.IO流装饰者模式Mybatis中的装饰者模式.文件读写;
//IO流选择标准
//第一，考虑最原始的数据格式是什么（字节还是字符）
//
//第二，是输入还是输出
//
//第三，是否需要转换流
//
//第四，数据来源（去向）是什么（文件还是控制台）
//
//第五，是否要缓冲
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class 输入输出流 {
	public static void main(String[] args) throws Exception{
		
//	Reader reader=null ;
//	reader=new FileReader("e:/in.txt");
    InputStream inputStream=null;
    inputStream=new FileInputStream("e:/in.txt");
//    Reader reader=new Reader();Reader是一个抽象类，无法实例化，InputStream同理
    int ch=0;
    while((ch=inputStream.read())!=-1)
    {
    	System.out.println((char)ch);
    }
	}
}
