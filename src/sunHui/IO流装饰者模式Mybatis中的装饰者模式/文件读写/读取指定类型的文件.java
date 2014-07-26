package sunHui.IO流装饰者模式Mybatis中的装饰者模式.文件读写;

import java.io.File;
import java.io.FilenameFilter;
//首先实现接口FilenameFilter,在类的构造方法中制定需要过滤的类型
import javax.xml.soap.SAAJResult;
class FileAccept implements FilenameFilter
{
	String str=null;
	public FileAccept(String s) {
		// TODO Auto-generated constructor stub
		str="."+s;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(str);
	}
	
}
public class 读取指定类型的文件 {

    public static void main(String[] args) {
		File dir = new File("e:/思想汇报");
		System.out.println(dir.list(new FileAccept("txt"))[0]);
	}
}
