package cn.majian.danli;
	
public class Singleton {
	
	/**
	 * 		¶öººÊ½
	 * 
	 */
	private static Singleton single = new Singleton() ;
	
	private Singleton(){}
	
	public static Singleton getSingle(){
		return single ;
	}

}
