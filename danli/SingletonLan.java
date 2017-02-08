package cn.majian.danli;

public class SingletonLan {
	
	/**
	 *   懒汉式    (会引发多线程并发修改问题)
	 * 		就是延迟加载
	 */
	
	private static SingletonLan single ;
	
	private SingletonLan(){}
	
	public static SingletonLan getSingle(){
		
		if(single == null){
			single = new SingletonLan() ;
		}
		return single ;
	}
	

}
