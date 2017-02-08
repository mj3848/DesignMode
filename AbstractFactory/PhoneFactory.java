package cn.majian.b;

public interface PhoneFactory {
	
	/**
	 * 	创建不同手机的工厂
	 * 
	 */
	public abstract Phone CreatPhone() ;
	
	/**
	 *  代售耳机
	 */
	
	ProErji create() ;

}
