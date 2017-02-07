package cn.majian.danli;

public class SingleLan {
	
	/**
	 * 	懒汉式改进多线程并发修改问题
	 * 
	 */
	
    private static SingleLan single = null ;
	
	private SingleLan(){}
	
	public static SingleLan getSingle(){
		if(single == null){			
			synchronized (SingleLan.class) {
				
				if(single == null){
					single = new SingleLan() ;
				}
			}
		}
		  return single ;
	}
	
}
