package cn.majian.danli;

public class SingleLanStaticInner {
	
	/**
	 * 	ԭ��������ػ��ƣ�ֻ����һ�Ρ����Բ����ڶ��̲߳�������
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
