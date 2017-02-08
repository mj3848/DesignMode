package cn.majian.danli;

public class SingleLanStaticInner {
	
	/**
	 * 	原理是类加载机制，只加载一次。所以不存在多线程并发问题
	 * 
	 */
	
	private SingleLanStaticInner(){}
	
	private static class Inner{
		
		private static SingleLanStaticInner single = new SingleLanStaticInner() ;
	}
	
	public static SingleLanStaticInner NewInstance(){
		 return Inner.single ;
	}
}
