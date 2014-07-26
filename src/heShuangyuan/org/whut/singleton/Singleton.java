package heShuangyuan.org.whut.singleton;

public  class Singleton {
	private static Singleton instance=null;
	private Singleton(){		
	}
	public static synchronized Singleton getInstance(Singleton singleton){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}	
}
