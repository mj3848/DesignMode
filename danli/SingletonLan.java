package cn.majian.danli;

public class SingletonLan {
	
	/**
	 *   ����ʽ    (���������̲߳����޸�����)
	 * 		�����ӳټ���
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
