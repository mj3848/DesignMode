package cn.majian.danli;

public class SingleLan {
	
	/**
	 * 	����ʽ�Ľ����̲߳����޸�����
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
