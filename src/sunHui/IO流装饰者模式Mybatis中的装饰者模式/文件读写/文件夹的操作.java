package sunHui.IO流装饰者模式Mybatis中的装饰者模式.文件读写;

import java.io.File;

public class 文件夹的操作 {
	public static void main(String[] args) {
		File file=new File("e:/思想汇报");
		File dir=new File("e:/思想汇报备份");
		System.out.println(dir.mkdir());
		if(file.isDirectory())
		{
			System.out.println("是文件夹");
			String[]  list=new String[file.list().length];
			System.out.println(file.list().length);
			list=file.list();
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getParent());
			System.out.println(file.lastModified());
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}			
		}
	}

}
