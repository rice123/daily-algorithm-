package sunHui.IO流装饰者模式Mybatis中的装饰者模式.文件读写;

import java.io.FileOutputStream;

public class 写文件 {
	public static void main(String[] args) {
		try {
			FileOutputStream out=new FileOutputStream("e:/in.txt");
			out.write("字符串写入文件".getBytes());
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
